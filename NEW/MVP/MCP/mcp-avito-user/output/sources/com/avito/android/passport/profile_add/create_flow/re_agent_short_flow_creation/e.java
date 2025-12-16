package com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ReAgentShortFlowCreationInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.ReAgentShortFlowCreationInteractorImpl", f = "ReAgentShortFlowCreationInteractor.kt", i = {0}, l = {AvailableCode.HMS_IS_SPOOF}, m = "createProfile", n = {"this"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public f f211564q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f211565r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f211566s;

    /* renamed from: t, reason: collision with root package name */
    public int f211567t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f211566s = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f211565r = obj;
        this.f211567t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f211566s.a(0, null, null, null, this);
    }
}
