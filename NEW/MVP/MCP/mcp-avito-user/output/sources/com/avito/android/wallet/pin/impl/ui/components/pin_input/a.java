package com.avito.android.wallet.pin.impl.ui.components.pin_input;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WalletPinInput.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/pin/impl/ui/components/pin_input/a;", "", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f328977b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f328978c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f328979d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f328980e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a[] f328981f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f328982g;

    static {
        a aVar = new a("INPUT", 0);
        f328977b = aVar;
        a aVar2 = new a("ENTERED", 1);
        f328978c = aVar2;
        a aVar3 = new a("ERROR", 2);
        f328979d = aVar3;
        a aVar4 = new a("SUCCESS", 3);
        f328980e = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        f328981f = aVarArr;
        f328982g = kotlin.enums.c.a(aVarArr);
    }

    public a() {
        throw null;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f328981f.clone();
    }
}
