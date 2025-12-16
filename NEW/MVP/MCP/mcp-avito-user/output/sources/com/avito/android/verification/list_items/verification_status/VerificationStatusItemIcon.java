package com.avito.android.verification.list_items.verification_status;

import com.avito.android.R;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VerificationStatusItemIcon.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/list_items/verification_status/VerificationStatusItemIcon;", "", "_avito_verification-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VerificationStatusItemIcon {

    /* renamed from: c, reason: collision with root package name */
    public static final VerificationStatusItemIcon f324843c;

    /* renamed from: d, reason: collision with root package name */
    public static final VerificationStatusItemIcon f324844d;

    /* renamed from: e, reason: collision with root package name */
    public static final VerificationStatusItemIcon f324845e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ VerificationStatusItemIcon[] f324846f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f324847g;

    /* renamed from: b, reason: collision with root package name */
    public final int f324848b;

    static {
        VerificationStatusItemIcon verificationStatusItemIcon = new VerificationStatusItemIcon("IC_TIME", 0, R.drawable.ic_status_pending);
        f324843c = verificationStatusItemIcon;
        VerificationStatusItemIcon verificationStatusItemIcon2 = new VerificationStatusItemIcon("IC_FAILURE", 1, R.drawable.ic_status_failure);
        f324844d = verificationStatusItemIcon2;
        VerificationStatusItemIcon verificationStatusItemIcon3 = new VerificationStatusItemIcon("IC_SUCCESS", 2, R.drawable.ic_status_success);
        f324845e = verificationStatusItemIcon3;
        VerificationStatusItemIcon[] verificationStatusItemIconArr = {verificationStatusItemIcon, verificationStatusItemIcon2, verificationStatusItemIcon3};
        f324846f = verificationStatusItemIconArr;
        f324847g = kotlin.enums.c.a(verificationStatusItemIconArr);
    }

    public VerificationStatusItemIcon(@InterfaceC42165v String str, int i12, int i13) {
        this.f324848b = i13;
    }

    public static VerificationStatusItemIcon valueOf(String str) {
        return (VerificationStatusItemIcon) Enum.valueOf(VerificationStatusItemIcon.class, str);
    }

    public static VerificationStatusItemIcon[] values() {
        return (VerificationStatusItemIcon[]) f324846f.clone();
    }

    public /* synthetic */ VerificationStatusItemIcon(String str, int i12, int i13, int i14, C42822w c42822w) {
        this(str, i12, (i14 & 1) != 0 ? 0 : i13);
    }
}
