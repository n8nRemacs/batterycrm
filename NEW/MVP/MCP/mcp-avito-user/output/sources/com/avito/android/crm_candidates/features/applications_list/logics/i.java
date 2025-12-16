package com.avito.android.crm_candidates.features.applications_list.logics;

import Os.InterfaceC14731a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: JobCrmApplicationsListLoader.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.crm_candidates.features.applications_list.logics.JobCrmApplicationsListLoader", f = "JobCrmApplicationsListLoader.kt", i = {0, 0, 0, 0, 1}, l = {59, 60, 61, 62}, m = "changeStatus$_avito_job_crm_candidates_impl", n = {"$this$changeStatus", "interactor", "itemId", "status", "$this$changeStatus"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0"})
/* loaded from: classes12.dex */
final class i extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43172j f129536q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC14731a f129537r;

    /* renamed from: s, reason: collision with root package name */
    public String f129538s;

    /* renamed from: t, reason: collision with root package name */
    public String f129539t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f129540u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ l f129541v;

    /* renamed from: w, reason: collision with root package name */
    public int f129542w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f129541v = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f129540u = obj;
        this.f129542w |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f129541v.a(null, null, null, null, this);
    }
}
