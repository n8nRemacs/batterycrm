package com.avito.android.gig_shift_action.mvi;

import com.avito.android.gig.shift_action_impl.generated.api.qr_scan_v_2.Reason;
import kotlin.Metadata;

/* compiled from: GigShiftActionActor.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_gig_shift-action_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j {

    /* compiled from: GigShiftActionActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f160484a;

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
            f160484a = iArr;
        }
    }
}
