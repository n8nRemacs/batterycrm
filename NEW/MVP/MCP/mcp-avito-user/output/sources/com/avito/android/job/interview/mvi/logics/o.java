package com.avito.android.job.interview.mvi.logics;

import com.avito.android.job.interview.mvi.entity.InternalAction;
import com.avito.android.job.interview.pickers.k;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;

/* compiled from: JobInterviewInvitationReducer.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/job/interview/domain/a;", "entry", "invoke", "(Lcom/avito/android/job/interview/domain/a;)Lcom/avito/android/job/interview/domain/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class o extends N implements Y41.l<com.avito.android.job.interview.domain.a, com.avito.android.job.interview.domain.a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f174632l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InternalAction f174633m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, InternalAction internalAction) {
        super(1);
        this.f174632l = pVar;
        this.f174633m = internalAction;
    }

    @Override // Y41.l
    public final com.avito.android.job.interview.domain.a invoke(com.avito.android.job.interview.domain.a aVar) {
        com.avito.android.job.interview.domain.a aVar2 = aVar;
        com.avito.android.job.interview.pickers.k kVar = ((InternalAction.ChangeTime) this.f174633m).f174574c;
        this.f174632l.getClass();
        if (kVar instanceof k.b) {
            String str = kVar.f174674a;
            return com.avito.android.job.interview.domain.a.a(aVar2, null, 0, 0, str, str, null, false, 103);
        }
        if (!(kVar instanceof k.a)) {
            throw new NoWhenBranchMatchedException();
        }
        k.a aVar3 = (k.a) kVar;
        return com.avito.android.job.interview.domain.a.a(aVar2, null, 0, 0, kVar.f174674a, aVar3.f174675b, aVar3.f174676c, false, 71);
    }
}
