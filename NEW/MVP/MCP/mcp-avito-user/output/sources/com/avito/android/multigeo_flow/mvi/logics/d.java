package com.avito.android.multigeo_flow.mvi.logics;

import Y41.l;
import com.avito.android.arch.mvi.q;
import com.avito.android.multigeo_flow.mvi.entity.InternalAction;
import com.avito.android.multigeo_flow.mvi.entity.JobMultiGeoState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: JobMultiGeoFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LQ20/a;", "Lcom/avito/android/multigeo_flow/mvi/entity/InternalAction;", "Lcom/avito/android/multigeo_flow/mvi/entity/JobMultiGeoState;", "LQ20/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class d extends N implements l<q<Q20.a, InternalAction, JobMultiGeoState, Q20.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f207021l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f207022m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g f207023n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, i iVar, g gVar) {
        super(1);
        this.f207021l = bVar;
        this.f207022m = iVar;
        this.f207023n = gVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<Q20.a, InternalAction, JobMultiGeoState, Q20.b> qVar) {
        q<Q20.a, InternalAction, JobMultiGeoState, Q20.b> qVar2 = qVar;
        qVar2.f92009e = this.f207021l;
        qVar2.f92011g = this.f207022m;
        qVar2.f92010f = this.f207023n;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
