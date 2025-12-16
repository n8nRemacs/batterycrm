package com.avito.android.crm_candidates.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: JobCrmCandidatesInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.crm_candidates.domain.JobCrmCandidatesInteractor", f = "JobCrmCandidatesInteractor.kt", i = {0}, l = {93}, m = "getCandidates", n = {"this"}, s = {"L$0"})
/* loaded from: classes12.dex */
final class g extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public l f129371q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f129372r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f129373s;

    /* renamed from: t, reason: collision with root package name */
    public int f129374t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f129373s = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f129372r = obj;
        this.f129374t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f129373s.n(null, this);
    }
}
