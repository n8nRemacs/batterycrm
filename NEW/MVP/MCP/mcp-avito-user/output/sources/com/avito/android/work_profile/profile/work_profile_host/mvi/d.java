package com.avito.android.work_profile.profile.work_profile_host.mvi;

import com.avito.android.work_profile.profile.work_profile_host.mvi.entity.WorkProfileHostInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: WorkProfileHostBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/work_profile/profile/work_profile_host/mvi/d;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/work_profile/profile/work_profile_host/mvi/entity/WorkProfileHostInternalAction;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements com.avito.android.arch.mvi.b<WorkProfileHostInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.work_profile.domain.g f331275a;

    @Inject
    public d(@Y61.k com.avito.android.work_profile.domain.g gVar) {
        this.f331275a = gVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<WorkProfileHostInternalAction> a() {
        return this.f331275a.a();
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
