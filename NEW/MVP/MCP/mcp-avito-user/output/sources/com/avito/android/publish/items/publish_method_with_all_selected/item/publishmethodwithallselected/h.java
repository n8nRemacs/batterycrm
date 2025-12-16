package com.avito.android.publish.items.publish_method_with_all_selected.item.publishmethodwithallselected;

import com.avito.android.category_parameters.ParameterElement;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: PublishMethodWithAllSelectedPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/ParameterElement$A$a;", "option", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/category_parameters/ParameterElement$A$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class h extends N implements Y41.l<ParameterElement.A.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f237092l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.A f237093m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, ParameterElement.A a12) {
        super(1);
        this.f237092l = kVar;
        this.f237093m = a12;
    }

    @Override // Y41.l
    public final G0 invoke(ParameterElement.A.a aVar) {
        k kVar = this.f237092l;
        aVar.f117192f = !r9.f117192f;
        ParameterElement.A a12 = this.f237093m;
        ArrayList arrayList = a12.f117186g;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((ParameterElement.A.a) obj).f117192f) {
                arrayList2.add(obj);
            }
        }
        String str = a12.f117185f;
        if (str == null || str.length() == 0 || arrayList2.size() != a12.f117186g.size()) {
            a12.f117184e = C42745f0.O(arrayList2, null, null, null, j.f237095l, 31);
        } else {
            a12.f117184e = str;
        }
        kVar.f237097c.accept(a12);
        return G0.f406611a;
    }
}
