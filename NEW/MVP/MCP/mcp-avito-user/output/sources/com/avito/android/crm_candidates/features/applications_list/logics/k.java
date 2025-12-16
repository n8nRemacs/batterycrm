package com.avito.android.crm_candidates.features.applications_list.logics;

import Os.InterfaceC14731a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.crm_candidates.view.list_items.applications_list.application_item.JobCrmApplicationItem;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: JobCrmApplicationsListLoader.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.crm_candidates.features.applications_list.logics.JobCrmApplicationsListLoader", f = "JobCrmApplicationsListLoader.kt", i = {0, 0, 0, 1}, l = {47, 48, 49, 50}, m = "makeViewed$_avito_job_crm_candidates_impl", n = {"$this$makeViewed", "interactor", "item", "$this$makeViewed"}, s = {"L$0", "L$1", "L$2", "L$0"})
/* loaded from: classes12.dex */
final class k extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43172j f129554q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC14731a f129555r;

    /* renamed from: s, reason: collision with root package name */
    public JobCrmApplicationItem f129556s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f129557t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ l f129558u;

    /* renamed from: v, reason: collision with root package name */
    public int f129559v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f129558u = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f129557t = obj;
        this.f129559v |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f129558u.b(null, null, null, this);
    }
}
