package com.avito.android.crm_candidates.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: JobCrmCandidatesInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.crm_candidates.domain.JobCrmCandidatesInteractor", f = "JobCrmCandidatesInteractor.kt", i = {0}, l = {WebSocketProtocol.PAYLOAD_SHORT}, m = "changeResponseStatus", n = {"this"}, s = {"L$0"})
/* loaded from: classes12.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public l f129363q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f129364r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f129365s;

    /* renamed from: t, reason: collision with root package name */
    public int f129366t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l lVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f129365s = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f129364r = obj;
        this.f129366t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f129365s.g(null, null, this);
    }
}
