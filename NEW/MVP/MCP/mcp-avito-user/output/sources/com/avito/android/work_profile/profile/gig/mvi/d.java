package com.avito.android.work_profile.profile.gig.mvi;

import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;
import oQ0.InterfaceC44680b;

/* compiled from: GigBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/work_profile/profile/gig/mvi/d;", "Lcom/avito/android/arch/mvi/b;", "LoQ0/b;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements com.avito.android.arch.mvi.b<InterfaceC44680b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.work_profile.domain.d f331132a;

    @Inject
    public d(@Y61.k com.avito.android.work_profile.domain.d dVar) {
        this.f331132a = dVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<InterfaceC44680b> a() {
        return this.f331132a.a();
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
