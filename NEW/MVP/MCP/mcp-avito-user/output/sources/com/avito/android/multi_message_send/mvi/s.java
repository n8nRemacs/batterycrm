package com.avito.android.multi_message_send.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.multi_message_send.mvi.entity.MultiMessageSendInternalAction;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.text.C43066x;

/* compiled from: MultiMessageSendReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/multi_message_send/mvi/s;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/multi_message_send/mvi/entity/MultiMessageSendInternalAction;", "LG20/d;", "<init>", "()V", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class s implements com.avito.android.arch.mvi.u<MultiMessageSendInternalAction, G20.d> {
    @Inject
    public s() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final G20.d a(MultiMessageSendInternalAction multiMessageSendInternalAction, G20.d dVar) {
        MultiMessageSendInternalAction multiMessageSendInternalAction2 = multiMessageSendInternalAction;
        G20.d dVar2 = dVar;
        if (multiMessageSendInternalAction2.equals(MultiMessageSendInternalAction.ContentLoading.f206755b)) {
            return G20.d.a(dVar2, null, true, false, null, false, null, null, false, null, 504);
        }
        if (multiMessageSendInternalAction2 instanceof MultiMessageSendInternalAction.ContentDataLoaded) {
            ArrayList arrayList = ((MultiMessageSendInternalAction.ContentDataLoaded) multiMessageSendInternalAction2).f206754b;
            F20.c cVar = (F20.c) C42745f0.G(arrayList);
            return G20.d.a(dVar2, arrayList, false, false, cVar != null ? cVar.f4497a.f4494a : null, false, null, null, false, null, 496);
        }
        if (multiMessageSendInternalAction2.equals(MultiMessageSendInternalAction.Error.f206756b)) {
            return G20.d.a(dVar2, null, false, true, null, false, null, null, false, null, 504);
        }
        if (multiMessageSendInternalAction2 instanceof MultiMessageSendInternalAction.ItemClicked) {
            long j12 = ((MultiMessageSendInternalAction.ItemClicked) multiMessageSendInternalAction2).f206758b;
            Long lValueOf = Long.valueOf(j12);
            List<Long> list = dVar2.f6254h;
            if (list.contains(lValueOf)) {
                return G20.d.a(dVar2, null, false, false, null, false, null, C42745f0.c0(list, Long.valueOf(j12)), false, null, 447);
            }
            if (dVar2.f6257k) {
                return dVar2;
            }
            return G20.d.a(dVar2, null, false, false, null, false, null, C42745f0.i0(Long.valueOf(j12), list), false, null, 447);
        }
        if (multiMessageSendInternalAction2.equals(MultiMessageSendInternalAction.OnResetClicked.f206766b)) {
            return G20.d.a(dVar2, null, false, false, null, false, null, C42784z0.f406748b, false, null, 447);
        }
        if (multiMessageSendInternalAction2 instanceof MultiMessageSendInternalAction.KeyboardStateChangedInternal) {
            return G20.d.a(dVar2, null, false, false, null, false, null, null, ((MultiMessageSendInternalAction.KeyboardStateChangedInternal) multiMessageSendInternalAction2).f206761b, null, 383);
        }
        if (multiMessageSendInternalAction2 instanceof MultiMessageSendInternalAction.InputChangedInternal) {
            return G20.d.a(dVar2, null, false, false, null, false, C43066x.t0(1000, ((MultiMessageSendInternalAction.InputChangedInternal) multiMessageSendInternalAction2).f206757b), null, false, null, 479);
        }
        if (multiMessageSendInternalAction2 instanceof MultiMessageSendInternalAction.OnListScrolled) {
            return G20.d.a(dVar2, null, false, false, ((MultiMessageSendInternalAction.OnListScrolled) multiMessageSendInternalAction2).f206765b, false, null, null, false, null, 503);
        }
        if (multiMessageSendInternalAction2 instanceof MultiMessageSendInternalAction.OnListDrawn) {
            return G20.d.a(dVar2, null, false, false, null, false, null, null, false, Boolean.valueOf(((MultiMessageSendInternalAction.OnListDrawn) multiMessageSendInternalAction2).f206764b), 255);
        }
        if (multiMessageSendInternalAction2.equals(MultiMessageSendInternalAction.OnSendStarted.f206767b)) {
            return G20.d.a(dVar2, null, false, false, null, true, null, null, false, null, 495);
        }
        if (multiMessageSendInternalAction2.equals(MultiMessageSendInternalAction.SendError.f206768b) ? true : multiMessageSendInternalAction2.equals(MultiMessageSendInternalAction.SendSuccess.f206769b) ? true : multiMessageSendInternalAction2.equals(MultiMessageSendInternalAction.UserOnCooldown.f206770b)) {
            return G20.d.a(dVar2, null, false, false, null, false, null, null, false, null, 495);
        }
        if (multiMessageSendInternalAction2.equals(MultiMessageSendInternalAction.OnCloseClicked.f206763b) ? true : multiMessageSendInternalAction2.equals(MultiMessageSendInternalAction.ItemsForSendingNotChosen.f206760b) ? true : multiMessageSendInternalAction2 instanceof MultiMessageSendInternalAction.OnAnchorClicked) {
            return dVar2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
