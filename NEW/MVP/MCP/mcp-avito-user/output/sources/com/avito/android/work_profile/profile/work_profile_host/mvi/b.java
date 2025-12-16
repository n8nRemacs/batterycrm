package com.avito.android.work_profile.profile.work_profile_host.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.work_profile.profile.work_profile_host.mvi.entity.WorkProfileHostInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import rQ0.AbstractC47586a;
import rQ0.C47587b;

/* compiled from: WorkProfileHostActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/work_profile/profile/work_profile_host/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LrQ0/a;", "Lcom/avito/android/work_profile/profile/work_profile_host/mvi/entity/WorkProfileHostInternalAction;", "LrQ0/b;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.android.arch.mvi.a<AbstractC47586a, WorkProfileHostInternalAction, C47587b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final YP0.d f331271a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.work_profile.domain.g f331272b;

    @Inject
    public b(@Y61.k YP0.d dVar, @Y61.k com.avito.android.work_profile.domain.g gVar) {
        this.f331271a = dVar;
        this.f331272b = gVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<WorkProfileHostInternalAction> b(AbstractC47586a abstractC47586a, C47587b c47587b) {
        AbstractC47586a abstractC47586a2 = abstractC47586a;
        if (abstractC47586a2 instanceof AbstractC47586a.b) {
            return C43175k.G(new a(this, abstractC47586a2, null));
        }
        if (abstractC47586a2.equals(AbstractC47586a.C12375a.f429808a)) {
            return this.f331272b.a();
        }
        throw new NoWhenBranchMatchedException();
    }
}
