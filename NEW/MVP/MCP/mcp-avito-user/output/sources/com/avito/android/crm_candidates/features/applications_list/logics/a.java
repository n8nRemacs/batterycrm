package com.avito.android.crm_candidates.features.applications_list.logics;

import Os.InterfaceC14731a;
import Ps.InterfaceC14833a;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListInternalAction;
import com.avito.android.crm_candidates.features.applications_list.entity.JobCrmApplicationsListState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: JobCrmApplicationsListActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/crm_candidates/features/applications_list/logics/a;", "Lcom/avito/android/arch/mvi/a;", "LPs/a;", "Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListInternalAction;", "Lcom/avito/android/crm_candidates/features/applications_list/entity/JobCrmApplicationsListState;", "a", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC14833a, JobCrmApplicationsListInternalAction, JobCrmApplicationsListState> {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f129507e = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14731a f129508a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f129509b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f129510c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final E f129511d;

    /* compiled from: JobCrmApplicationsListActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/crm_candidates/features/applications_list/logics/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.crm_candidates.features.applications_list.logics.a$a, reason: collision with other inner class name */
    public static final class C3845a {
        public /* synthetic */ C3845a(C42822w c42822w) {
            this();
        }

        public C3845a() {
        }
    }

    static {
        new C3845a(null);
    }

    @Inject
    public a(@Y61.k InterfaceC14731a interfaceC14731a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k E e12) {
        this.f129508a = interfaceC14731a;
        this.f129509b = aVar;
        this.f129510c = interfaceC28373a;
        this.f129511d = e12;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<JobCrmApplicationsListInternalAction> b(InterfaceC14833a interfaceC14833a, JobCrmApplicationsListState jobCrmApplicationsListState) {
        return C43175k.G(new b(interfaceC14833a, this, jobCrmApplicationsListState, null));
    }
}
