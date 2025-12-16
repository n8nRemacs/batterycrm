package com.avito.android.job.interview.mvi.logics;

import com.avito.android.job.interview.mvi.entity.InternalAction;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: JobInterviewInvitationReducer.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/job/interview/domain/a;", "entry", "invoke", "(Lcom/avito/android/job/interview/domain/a;)Lcom/avito/android/job/interview/domain/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class n extends N implements Y41.l<com.avito.android.job.interview.domain.a, com.avito.android.job.interview.domain.a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InternalAction f174631l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(InternalAction internalAction) {
        super(1);
        this.f174631l = internalAction;
    }

    @Override // Y41.l
    public final com.avito.android.job.interview.domain.a invoke(com.avito.android.job.interview.domain.a aVar) {
        com.avito.android.job.interview.domain.a aVar2 = aVar;
        InternalAction.ChangeDate changeDate = (InternalAction.ChangeDate) this.f174631l;
        return com.avito.android.job.interview.domain.a.a(aVar2, changeDate.f174568c, changeDate.f174570e, changeDate.f174569d, null, null, null, false, 120);
    }
}
