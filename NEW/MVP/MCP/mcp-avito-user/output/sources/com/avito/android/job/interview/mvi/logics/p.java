package com.avito.android.job.interview.mvi.logics;

import com.avito.android.arch.mvi.u;
import com.avito.android.job.interview.mvi.entity.InternalAction;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import sQ.C48095e;
import vQ.C49251c;

/* compiled from: JobInterviewInvitationReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/job/interview/mvi/logics/p;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/job/interview/mvi/entity/InternalAction;", "LvQ/c;", "<init>", "()V", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class p implements u<InternalAction, C49251c> {
    @Inject
    public p() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C49251c b(p pVar, C49251c c49251c, ArrayList arrayList, C48095e c48095e, String str, boolean z12, int i12) {
        List list = arrayList;
        if ((i12 & 1) != 0) {
            list = c49251c.f440743b.f174560a;
        }
        if ((i12 & 2) != 0) {
            c48095e = c49251c.f440743b.f174561b;
        }
        if ((i12 & 4) != 0) {
            str = c49251c.f440743b.f174562c;
        }
        if ((i12 & 8) != 0) {
            z12 = c49251c.f440743b.f174563d;
        }
        pVar.getClass();
        c49251c.f440743b.getClass();
        return C49251c.a(c49251c, new com.avito.android.job.interview.domain.i(list, c48095e, str, z12), false, false, 6);
    }

    @Override // com.avito.android.arch.mvi.u
    public final C49251c a(InternalAction internalAction, C49251c c49251c) {
        InternalAction internalAction2 = internalAction;
        C49251c c49251c2 = c49251c;
        if (internalAction2 instanceof InternalAction.ChangeDate) {
            return c(c49251c2, ((InternalAction.ChangeDate) internalAction2).f174567b, new n(internalAction2));
        }
        if (internalAction2 instanceof InternalAction.ChangeTime) {
            return c(c49251c2, ((InternalAction.ChangeTime) internalAction2).f174573b, new o(this, internalAction2));
        }
        if (internalAction2 instanceof InternalAction.ChangeLocation) {
            AddressParameter.Value value = ((InternalAction.ChangeLocation) internalAction2).f174571b;
            String text = value.getText();
            if (text == null) {
                text = "";
            }
            return b(this, c49251c2, null, new C48095e(text, value.getLat(), value.getLng()), null, false, 13);
        }
        if (internalAction2 instanceof InternalAction.ChangePhone) {
            return b(this, c49251c2, null, null, ((InternalAction.ChangePhone) internalAction2).f174572b, false, 11);
        }
        if (internalAction2 instanceof InternalAction.LoadingDraft) {
            return C49251c.a(c49251c2, null, true, false, 1);
        }
        if (internalAction2 instanceof InternalAction.ErrorDraft) {
            return C49251c.a(c49251c2, null, false, true, 1);
        }
        if (internalAction2 instanceof InternalAction.LoadedDraft) {
            return C49251c.a(c49251c2, ((InternalAction.LoadedDraft) internalAction2).f174584b.f174565a, false, false, 4);
        }
        if (internalAction2 instanceof InternalAction.InvalidData) {
            InternalAction.InvalidData invalidData = (InternalAction.InvalidData) internalAction2;
            return b(this, c49251c2, invalidData.f174582b, null, null, invalidData.f174583c, 6);
        }
        if (internalAction2 instanceof InternalAction.LoadingInvitation) {
            return C49251c.a(c49251c2, null, true, false, 1);
        }
        if (internalAction2 instanceof InternalAction.ErrorInvitation) {
            return C49251c.a(c49251c2, null, false, true, 1);
        }
        if (internalAction2 instanceof InternalAction.LoadedInvitation) {
            return C49251c.a(c49251c2, null, false, false, 5);
        }
        if (!(internalAction2 instanceof InternalAction.OpenDatePicker ? true : internalAction2 instanceof InternalAction.OpenLocationPicker ? true : internalAction2 instanceof InternalAction.OpenTimePicker ? true : internalAction2 instanceof InternalAction.CloseFlow)) {
            throw new NoWhenBranchMatchedException();
        }
        List<com.avito.android.job.interview.domain.a> list = c49251c2.f440743b.f174560a;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(com.avito.android.job.interview.domain.a.a((com.avito.android.job.interview.domain.a) it.next(), null, 0, 0, null, null, null, true, 63));
        }
        return b(this, c49251c2, arrayList, null, null, true, 6);
    }

    public final C49251c c(C49251c c49251c, int i12, Y41.l<? super com.avito.android.job.interview.domain.a, com.avito.android.job.interview.domain.a> lVar) {
        ArrayList arrayList = new ArrayList(c49251c.f440743b.f174560a);
        arrayList.set(i12, lVar.invoke(arrayList.get(i12)));
        G0 g02 = G0.f406611a;
        return b(this, c49251c, arrayList, null, null, false, 14);
    }
}
