package com.avito.android.blueprints.job_multigeo_address;

import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.multigeo_flow.links.JobMultiGeoLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: JobMultiGeoPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$q$a;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/category_parameters/ParameterElement$q$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class g extends N implements Y41.l<ParameterElement.q.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f106005l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.q f106006m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, ParameterElement.q qVar) {
        super(1);
        this.f106005l = kVar;
        this.f106006m = qVar;
    }

    @Override // Y41.l
    public final G0 invoke(ParameterElement.q.a aVar) {
        ParameterElement.q.a aVar2 = aVar;
        k kVar = this.f106005l;
        ParameterElement.q qVar = this.f106006m;
        kVar.f106014e.accept(new JobMultiGeoLink.EditAddress(qVar.f117518t, new JobMultiGeoLink.Address(aVar2.f117524c, aVar2.f117522a, aVar2.f117523b, aVar2.f117525d, aVar2.f117526e), qVar.f117520v));
        return G0.f406611a;
    }
}
