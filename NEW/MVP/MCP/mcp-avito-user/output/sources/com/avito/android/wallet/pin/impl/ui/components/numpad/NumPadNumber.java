package com.avito.android.wallet.pin.impl.ui.components.numpad;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WalletPinNumPad.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/pin/impl/ui/components/numpad/NumPadNumber;", "", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NumPadNumber {

    /* renamed from: c, reason: collision with root package name */
    public static final NumPadNumber f328909c;

    /* renamed from: d, reason: collision with root package name */
    public static final NumPadNumber f328910d;

    /* renamed from: e, reason: collision with root package name */
    public static final NumPadNumber f328911e;

    /* renamed from: f, reason: collision with root package name */
    public static final NumPadNumber f328912f;

    /* renamed from: g, reason: collision with root package name */
    public static final NumPadNumber f328913g;

    /* renamed from: h, reason: collision with root package name */
    public static final NumPadNumber f328914h;

    /* renamed from: i, reason: collision with root package name */
    public static final NumPadNumber f328915i;

    /* renamed from: j, reason: collision with root package name */
    public static final NumPadNumber f328916j;

    /* renamed from: k, reason: collision with root package name */
    public static final NumPadNumber f328917k;

    /* renamed from: l, reason: collision with root package name */
    public static final NumPadNumber f328918l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ NumPadNumber[] f328919m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f328920n;

    /* renamed from: b, reason: collision with root package name */
    public final char f328921b;

    static {
        NumPadNumber numPadNumber = new NumPadNumber("ZERO", 0, '0');
        f328909c = numPadNumber;
        NumPadNumber numPadNumber2 = new NumPadNumber("ONE", 1, '1');
        f328910d = numPadNumber2;
        NumPadNumber numPadNumber3 = new NumPadNumber("TWO", 2, '2');
        f328911e = numPadNumber3;
        NumPadNumber numPadNumber4 = new NumPadNumber("THREE", 3, '3');
        f328912f = numPadNumber4;
        NumPadNumber numPadNumber5 = new NumPadNumber("FOUR", 4, '4');
        f328913g = numPadNumber5;
        NumPadNumber numPadNumber6 = new NumPadNumber("FIVE", 5, '5');
        f328914h = numPadNumber6;
        NumPadNumber numPadNumber7 = new NumPadNumber("SIX", 6, '6');
        f328915i = numPadNumber7;
        NumPadNumber numPadNumber8 = new NumPadNumber("SEVEN", 7, '7');
        f328916j = numPadNumber8;
        NumPadNumber numPadNumber9 = new NumPadNumber("EIGHT", 8, '8');
        f328917k = numPadNumber9;
        NumPadNumber numPadNumber10 = new NumPadNumber("NINE", 9, '9');
        f328918l = numPadNumber10;
        NumPadNumber[] numPadNumberArr = {numPadNumber, numPadNumber2, numPadNumber3, numPadNumber4, numPadNumber5, numPadNumber6, numPadNumber7, numPadNumber8, numPadNumber9, numPadNumber10};
        f328919m = numPadNumberArr;
        f328920n = kotlin.enums.c.a(numPadNumberArr);
    }

    public NumPadNumber(String str, int i12, char c12) {
        this.f328921b = c12;
    }

    public static NumPadNumber valueOf(String str) {
        return (NumPadNumber) Enum.valueOf(NumPadNumber.class, str);
    }

    public static NumPadNumber[] values() {
        return (NumPadNumber[]) f328919m.clone();
    }
}
