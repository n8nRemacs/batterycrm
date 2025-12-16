package com.avito.android.crm_candidates.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.crm_candidates.view.list_items.applications_list.application_item.JobCrmApplicationItem;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: JobCrmCandidatesInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.crm_candidates.domain.JobCrmCandidatesInteractor", f = "JobCrmCandidatesInteractor.kt", i = {0, 0}, l = {115}, m = "makeResponseViewed", n = {"this", "responseItem"}, s = {"L$0", "L$1"})
/* loaded from: classes12.dex */
final class j extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public l f129383q;

    /* renamed from: r, reason: collision with root package name */
    public JobCrmApplicationItem f129384r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f129385s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l f129386t;

    /* renamed from: u, reason: collision with root package name */
    public int f129387u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f129386t = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f129385s = obj;
        this.f129387u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f129386t.q(null, this);
    }
}
