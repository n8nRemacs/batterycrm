package com.avito.android.crm_candidates.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: JobCrmCandidatesInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.crm_candidates.domain.JobCrmCandidatesInteractor", f = "JobCrmCandidatesInteractor.kt", i = {0}, l = {238}, m = "getCounter", n = {"this"}, s = {"L$0"})
/* loaded from: classes12.dex */
final class h extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public l f129375q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f129376r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f129377s;

    /* renamed from: t, reason: collision with root package name */
    public int f129378t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f129377s = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f129376r = obj;
        this.f129378t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f129377s.a(this);
    }
}
