package com.avito.android.screens.bbip_private_v2.ui;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BbipPrivateV2ActionGroup.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private_v2/ui/BbipPrivateV2ActionGroup;", "", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BbipPrivateV2ActionGroup {

    /* renamed from: b, reason: collision with root package name */
    public static final BbipPrivateV2ActionGroup f261113b;

    /* renamed from: c, reason: collision with root package name */
    public static final BbipPrivateV2ActionGroup f261114c;

    /* renamed from: d, reason: collision with root package name */
    public static final BbipPrivateV2ActionGroup f261115d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ BbipPrivateV2ActionGroup[] f261116e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f261117f;

    static {
        BbipPrivateV2ActionGroup bbipPrivateV2ActionGroup = new BbipPrivateV2ActionGroup("FORECAST", 0);
        f261113b = bbipPrivateV2ActionGroup;
        BbipPrivateV2ActionGroup bbipPrivateV2ActionGroup2 = new BbipPrivateV2ActionGroup("PICKER", 1);
        f261114c = bbipPrivateV2ActionGroup2;
        BbipPrivateV2ActionGroup bbipPrivateV2ActionGroup3 = new BbipPrivateV2ActionGroup("OTHER", 2);
        f261115d = bbipPrivateV2ActionGroup3;
        BbipPrivateV2ActionGroup[] bbipPrivateV2ActionGroupArr = {bbipPrivateV2ActionGroup, bbipPrivateV2ActionGroup2, bbipPrivateV2ActionGroup3};
        f261116e = bbipPrivateV2ActionGroupArr;
        f261117f = kotlin.enums.c.a(bbipPrivateV2ActionGroupArr);
    }

    public BbipPrivateV2ActionGroup() {
        throw null;
    }

    public static BbipPrivateV2ActionGroup valueOf(String str) {
        return (BbipPrivateV2ActionGroup) Enum.valueOf(BbipPrivateV2ActionGroup.class, str);
    }

    public static BbipPrivateV2ActionGroup[] values() {
        return (BbipPrivateV2ActionGroup[]) f261116e.clone();
    }
}
