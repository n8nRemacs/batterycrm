package com.avito.android.wallet.pin.impl.ui.components.numpad;

import com.avito.android.R;
import j.InterfaceC42165v;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WalletPinNumPad.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/pin/impl/ui/components/numpad/a;", "", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f328922c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f328923d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f328924e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a[] f328925f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f328926g;

    /* renamed from: b, reason: collision with root package name */
    public final int f328927b;

    static {
        a aVar = new a("DELETE", 0, R.drawable.ic_delete);
        f328922c = aVar;
        a aVar2 = new a("FINGERPRINT", 1, R.drawable.ic_fingerprint);
        f328923d = aVar2;
        a aVar3 = new a("NONE", 2, 0);
        f328924e = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f328925f = aVarArr;
        f328926g = kotlin.enums.c.a(aVarArr);
    }

    public a(@InterfaceC42165v String str, int i12, int i13) {
        this.f328927b = i13;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f328925f.clone();
    }
}
