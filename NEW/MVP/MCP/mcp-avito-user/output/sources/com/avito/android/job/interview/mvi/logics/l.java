package com.avito.android.job.interview.mvi.logics;

import com.avito.android.arch.mvi.t;
import com.avito.android.job.interview.mvi.entity.InternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import vQ.InterfaceC49252d;

/* compiled from: JobInterviewInvitationProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/job/interview/mvi/logics/l;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/job/interview/mvi/entity/InternalAction;", "LvQ/d;", "<init>", "()V", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class l implements t<InternalAction, InterfaceC49252d> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC49252d b(InternalAction internalAction) {
        InternalAction internalAction2 = internalAction;
        if (internalAction2 instanceof InternalAction.OpenDatePicker) {
            InternalAction.OpenDatePicker openDatePicker = (InternalAction.OpenDatePicker) internalAction2;
            return new InterfaceC49252d.c(openDatePicker.f174589b, openDatePicker.f174590c);
        }
        if (internalAction2 instanceof InternalAction.OpenTimePicker) {
            return new InterfaceC49252d.e(((InternalAction.OpenTimePicker) internalAction2).f174592b);
        }
        if (internalAction2 instanceof InternalAction.OpenLocationPicker) {
            return new InterfaceC49252d.C12769d(((InternalAction.OpenLocationPicker) internalAction2).f174591b);
        }
        if (internalAction2 instanceof InternalAction.ErrorInvitation) {
            return InterfaceC49252d.f.f440752a;
        }
        if (internalAction2 instanceof InternalAction.CloseFlow) {
            return InterfaceC49252d.a.f440746a;
        }
        if (internalAction2 instanceof InternalAction.LoadedDraft) {
            return InterfaceC49252d.b.f440747a;
        }
        return null;
    }
}
