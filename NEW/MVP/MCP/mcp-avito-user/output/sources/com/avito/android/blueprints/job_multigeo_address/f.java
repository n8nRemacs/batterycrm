package com.avito.android.blueprints.job_multigeo_address;

import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.multigeo_flow.links.JobMultiGeoLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: JobMultiGeoPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f106003l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.q f106004m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, ParameterElement.q qVar) {
        super(0);
        this.f106003l = kVar;
        this.f106004m = qVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        k kVar = this.f106003l;
        kVar.getClass();
        ParameterElement.q qVar = this.f106004m;
        kVar.f106014e.accept(new JobMultiGeoLink.AddAddress(qVar.f117518t, qVar.f117520v));
        return G0.f406611a;
    }
}
