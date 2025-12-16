package com.avito.android.blueprints.job_multigeo_address;

import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.multigeo_flow.links.JobMultiGeoLink;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: JobMultiGeoPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f106007l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.q f106008m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, ParameterElement.q qVar) {
        super(0);
        this.f106007l = kVar;
        this.f106008m = qVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        ArrayList arrayList;
        String str;
        k kVar = this.f106007l;
        ParameterElement.q qVar = this.f106008m;
        List<ParameterElement.q.a> list = qVar.f117519u;
        if (list != null) {
            List<ParameterElement.q.a> list2 = list;
            arrayList = new ArrayList(C42745f0.q(list2, 10));
            for (ParameterElement.q.a aVar : list2) {
                arrayList.add(new JobMultiGeoLink.Address(aVar.f117524c, aVar.f117522a, aVar.f117523b, aVar.f117525d, aVar.f117526e));
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = arrayList;
        String strA = qVar.f117508j;
        if (strA == null) {
            strA = kVar.f106013d.a();
        }
        String str2 = strA;
        if (arrayList2 != null && (str = qVar.f117511m) != null) {
            kVar.f106014e.accept(new JobMultiGeoLink.FullList(qVar.f117518t, arrayList2, str2, str, qVar.f117514p, qVar.f117520v));
        }
        return G0.f406611a;
    }
}
