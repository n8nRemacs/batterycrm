package com.avito.android.gig_shift_cancel.mvi;

import com.avito.android.gig.shift_cancel_impl.generated.api.cancel_info_v_1.Reason;
import kotlin.Metadata;

/* compiled from: GigShiftCancelActor.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_gig_shift-cancel_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j {

    /* compiled from: GigShiftCancelActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f160650a;

        static {
            int[] iArr = new int[Reason.ReasonName.values().length];
            try {
                iArr[Reason.ReasonName.NoWork.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Reason.ReasonName.Personal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Reason.ReasonName.FinishEarly.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f160650a = iArr;
        }
    }

    public static final com.avito.android.gig.shift_cancel_impl.generated.api.cancel_v_1.Reason a(Reason reason) {
        Reason.ReasonName reasonName = reason != null ? reason.getReasonName() : null;
        int i12 = reasonName == null ? -1 : a.f160650a[reasonName.ordinal()];
        if (i12 == 1) {
            return com.avito.android.gig.shift_cancel_impl.generated.api.cancel_v_1.Reason.NoWork;
        }
        if (i12 == 2) {
            return com.avito.android.gig.shift_cancel_impl.generated.api.cancel_v_1.Reason.Personal;
        }
        if (i12 != 3) {
            return null;
        }
        return com.avito.android.gig.shift_cancel_impl.generated.api.cancel_v_1.Reason.FinishEarly;
    }
}
