package com.avito.android.job.interview.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: InterviewInvitationInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.job.interview.domain.InterviewInvitationInteractorImpl", f = "InterviewInvitationInteractor.kt", i = {}, l = {21}, m = "loadInterviewInvitation", n = {}, s = {})
/* loaded from: classes14.dex */
final class f extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public g f174550q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f174551r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f174552s;

    /* renamed from: t, reason: collision with root package name */
    public int f174553t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f174552s = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f174551r = obj;
        this.f174553t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f174552s.a(this);
    }
}
