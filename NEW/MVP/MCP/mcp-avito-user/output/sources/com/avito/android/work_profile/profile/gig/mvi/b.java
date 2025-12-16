package com.avito.android.work_profile.profile.gig.mvi;

import com.avito.android.arch.mvi.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import oQ0.AbstractC44679a;
import oQ0.C44681c;
import oQ0.InterfaceC44680b;

/* compiled from: GigActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/work_profile/profile/gig/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LoQ0/a;", "LoQ0/b;", "LoQ0/c;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.android.arch.mvi.a<AbstractC44679a, InterfaceC44680b, C44681c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.work_profile.domain.d f331128a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f331129b;

    @Inject
    public b(@Y61.k com.avito.android.work_profile.domain.d dVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f331128a = dVar;
        this.f331129b = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC44680b> b(AbstractC44679a abstractC44679a, C44681c c44681c) {
        AbstractC44679a abstractC44679a2 = abstractC44679a;
        if (abstractC44679a2 instanceof AbstractC44679a.b) {
            return this.f331128a.a();
        }
        if (abstractC44679a2 instanceof AbstractC44679a.C12187a) {
            return C43175k.G(new a(this, abstractC44679a2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
