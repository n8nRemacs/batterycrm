package com.avito.android.verification.list_items.verification_status;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VerificationStatusItemState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/list_items/verification_status/VerificationStatusItemState;", "", "_avito_verification-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VerificationStatusItemState {

    /* renamed from: d, reason: collision with root package name */
    public static final VerificationStatusItemState f324849d;

    /* renamed from: e, reason: collision with root package name */
    public static final VerificationStatusItemState f324850e;

    /* renamed from: f, reason: collision with root package name */
    public static final VerificationStatusItemState f324851f;

    /* renamed from: g, reason: collision with root package name */
    public static final VerificationStatusItemState f324852g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ VerificationStatusItemState[] f324853h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f324854i;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final VerificationStatusItemIcon f324855b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final VerificationStatusItemStyle f324856c;

    static {
        VerificationStatusItemState verificationStatusItemState = new VerificationStatusItemState("DEFAULT", 0, null, null, 3, null);
        f324849d = verificationStatusItemState;
        VerificationStatusItemState verificationStatusItemState2 = new VerificationStatusItemState("PENDING", 1, VerificationStatusItemIcon.f324843c, VerificationStatusItemStyle.f324858d);
        f324850e = verificationStatusItemState2;
        VerificationStatusItemState verificationStatusItemState3 = new VerificationStatusItemState("FAILURE", 2, VerificationStatusItemIcon.f324844d, VerificationStatusItemStyle.f324859e);
        f324851f = verificationStatusItemState3;
        VerificationStatusItemState verificationStatusItemState4 = new VerificationStatusItemState("SUCCESS", 3, VerificationStatusItemIcon.f324845e, VerificationStatusItemStyle.f324857c);
        f324852g = verificationStatusItemState4;
        VerificationStatusItemState[] verificationStatusItemStateArr = {verificationStatusItemState, verificationStatusItemState2, verificationStatusItemState3, verificationStatusItemState4};
        f324853h = verificationStatusItemStateArr;
        f324854i = kotlin.enums.c.a(verificationStatusItemStateArr);
    }

    public VerificationStatusItemState(String str, int i12, VerificationStatusItemIcon verificationStatusItemIcon, VerificationStatusItemStyle verificationStatusItemStyle) {
        this.f324855b = verificationStatusItemIcon;
        this.f324856c = verificationStatusItemStyle;
    }

    public static VerificationStatusItemState valueOf(String str) {
        return (VerificationStatusItemState) Enum.valueOf(VerificationStatusItemState.class, str);
    }

    public static VerificationStatusItemState[] values() {
        return (VerificationStatusItemState[]) f324853h.clone();
    }

    public /* synthetic */ VerificationStatusItemState(String str, int i12, VerificationStatusItemIcon verificationStatusItemIcon, VerificationStatusItemStyle verificationStatusItemStyle, int i13, C42822w c42822w) {
        this(str, i12, (i13 & 1) != 0 ? null : verificationStatusItemIcon, (i13 & 2) != 0 ? VerificationStatusItemStyle.f324857c : verificationStatusItemStyle);
    }
}
