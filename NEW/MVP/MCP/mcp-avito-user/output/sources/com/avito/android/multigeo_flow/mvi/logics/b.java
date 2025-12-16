package com.avito.android.multigeo_flow.mvi.logics;

import Y61.k;
import com.avito.android.arch.mvi.a;
import com.avito.android.multigeo_flow.mvi.entity.InternalAction;
import com.avito.android.multigeo_flow.mvi.entity.JobMultiGeoState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: JobMultiGeoActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/multigeo_flow/mvi/logics/b;", "Lcom/avito/android/arch/mvi/a;", "LQ20/a;", "Lcom/avito/android/multigeo_flow/mvi/entity/InternalAction;", "Lcom/avito/android/multigeo_flow/mvi/entity/JobMultiGeoState;", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.android.arch.mvi.a<Q20.a, InternalAction, JobMultiGeoState> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.multigeo_flow.domain.b f207017a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f207018b;

    @Inject
    public b(@k com.avito.android.multigeo_flow.domain.b bVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f207017a = bVar;
        this.f207018b = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @k
    public final InterfaceC43160i a(@k C43197r1 c43197r1, @k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InternalAction> b(Q20.a aVar, JobMultiGeoState jobMultiGeoState) {
        return C43175k.G(new a(aVar, jobMultiGeoState, this, null));
    }
}
