package com.avito.android.compose_items.multiselect;

import JO.m;
import Y41.l;
import com.avito.android.category_parameters.ParameterElement;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MultiselectComposeItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/akita/compose/component/multiselect/d;", "Lkotlin/G0;", "invoke", "(Lcom/akita/compose/component/multiselect/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class g extends N implements l<com.akita.compose.component.multiselect.d, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.v f125410l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f125411m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ParameterElement.v vVar, i iVar) {
        super(1);
        this.f125410l = vVar;
        this.f125411m = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.akita.compose.component.multiselect.d dVar) {
        G0 g02;
        com.akita.compose.component.multiselect.d dVar2 = dVar;
        ParameterElement.v vVar = this.f125410l;
        List<m> list = vVar.f117545f;
        ArrayList arrayList = new ArrayList();
        for (m mVar : list) {
            if (mVar.f8964e) {
                dVar2.a(mVar.f8962c, true, new f(this.f125411m, vVar, mVar));
                g02 = G0.f406611a;
            } else {
                g02 = null;
            }
            if (g02 != null) {
                arrayList.add(g02);
            }
        }
        return G0.f406611a;
    }
}
