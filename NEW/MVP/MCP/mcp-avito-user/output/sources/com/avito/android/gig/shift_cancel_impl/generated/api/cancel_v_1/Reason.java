package com.avito.android.gig.shift_cancel_impl.generated.api.cancel_v_1;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CancelV1Request.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/gig/shift_cancel_impl/generated/api/cancel_v_1/Reason;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "NoWork", "Personal", "FinishEarly", "_avito_gig_shift-cancel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Reason {

    @c("finish_early")
    public static final Reason FinishEarly;

    @c("no_work")
    public static final Reason NoWork;

    @c("personal")
    public static final Reason Personal;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Reason[] f159459c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f159460d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f159461b;

    static {
        Reason reason = new Reason("NoWork", 0, "no_work");
        NoWork = reason;
        Reason reason2 = new Reason("Personal", 1, "personal");
        Personal = reason2;
        Reason reason3 = new Reason("FinishEarly", 2, "finish_early");
        FinishEarly = reason3;
        Reason[] reasonArr = {reason, reason2, reason3};
        f159459c = reasonArr;
        f159460d = kotlin.enums.c.a(reasonArr);
    }

    private Reason(String str, int i12, String str2) {
        this.f159461b = str2;
    }

    public static Reason valueOf(String str) {
        return (Reason) Enum.valueOf(Reason.class, str);
    }

    public static Reason[] values() {
        return (Reason[]) f159459c.clone();
    }

    @Override // java.lang.Enum
    @k
    public final String toString() {
        return this.f159461b.toString();
    }
}
