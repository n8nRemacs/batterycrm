package com.avito.android.job.interview.mvi.logics;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: JobInterviewInvitationLoader.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.job.interview.mvi.logics.JobInterviewInvitationLoader", f = "JobInterviewInvitationLoader.kt", i = {0, 0, 0, 1, 2}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.ERROR_NO_ACTIVITY, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, AvailableCode.HMS_IS_SPOOF, 32}, m = "invite", n = {"$this$invite", "interactor", "draft", "$this$invite", "$this$invite"}, s = {"L$0", "L$1", "L$2", "L$0", "L$0"})
/* loaded from: classes14.dex */
final class i extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43172j f174618q;

    /* renamed from: r, reason: collision with root package name */
    public com.avito.android.job.interview.domain.e f174619r;

    /* renamed from: s, reason: collision with root package name */
    public com.avito.android.job.interview.domain.i f174620s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f174621t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k f174622u;

    /* renamed from: v, reason: collision with root package name */
    public int f174623v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f174622u = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f174621t = obj;
        this.f174623v |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f174622u.a(null, null, null, this);
    }
}
