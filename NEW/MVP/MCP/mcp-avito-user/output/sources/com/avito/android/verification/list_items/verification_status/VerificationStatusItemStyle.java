package com.avito.android.verification.list_items.verification_status;

import com.avito.android.R;
import j.InterfaceC42150f;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VerificationStatusItemStyle.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/list_items/verification_status/VerificationStatusItemStyle;", "", "_avito_verification-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VerificationStatusItemStyle {

    /* renamed from: c, reason: collision with root package name */
    public static final VerificationStatusItemStyle f324857c;

    /* renamed from: d, reason: collision with root package name */
    public static final VerificationStatusItemStyle f324858d;

    /* renamed from: e, reason: collision with root package name */
    public static final VerificationStatusItemStyle f324859e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ VerificationStatusItemStyle[] f324860f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f324861g;

    /* renamed from: b, reason: collision with root package name */
    public final int f324862b;

    static {
        VerificationStatusItemStyle verificationStatusItemStyle = new VerificationStatusItemStyle("DEFAULT", 0, R.attr.bannerWarmgray);
        f324857c = verificationStatusItemStyle;
        VerificationStatusItemStyle verificationStatusItemStyle2 = new VerificationStatusItemStyle("BLUE", 1, R.attr.bannerBlue);
        f324858d = verificationStatusItemStyle2;
        VerificationStatusItemStyle verificationStatusItemStyle3 = new VerificationStatusItemStyle("RED", 2, R.attr.bannerRed);
        f324859e = verificationStatusItemStyle3;
        VerificationStatusItemStyle[] verificationStatusItemStyleArr = {verificationStatusItemStyle, verificationStatusItemStyle2, verificationStatusItemStyle3};
        f324860f = verificationStatusItemStyleArr;
        f324861g = kotlin.enums.c.a(verificationStatusItemStyleArr);
    }

    public VerificationStatusItemStyle(@InterfaceC42150f String str, int i12, int i13) {
        this.f324862b = i13;
    }

    public static VerificationStatusItemStyle valueOf(String str) {
        return (VerificationStatusItemStyle) Enum.valueOf(VerificationStatusItemStyle.class, str);
    }

    public static VerificationStatusItemStyle[] values() {
        return (VerificationStatusItemStyle[]) f324860f.clone();
    }
}
