package com.coinomi.core.coins;

import com.coinomi.core.coins.families.BitFamily;
import com.coinomi.core.coins.families.PeerFamily;

public class AsiacoinMain extends CoinType {
    private AsiacoinMain() {
        id = "asiacoin.main";

        addressHeader = 23;
        p2shHeader = 8;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 520;

        family = PeerFamily.get();
        name = "Asiacoin";
        symbol = "AC";
        uriScheme = "asiacoin";
        bip44Index = 51;
        unitExponent = 6;
        feePerKb = value(1000); // 0.001 AC
        minNonDust = value(1);
        softDustLimit = value(10000); // 0.01 AC
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
    }

    private static AsiacoinMain instance = new AsiacoinMain();
    public static synchronized AsiacoinMain get() {
        return instance;
    }
}
