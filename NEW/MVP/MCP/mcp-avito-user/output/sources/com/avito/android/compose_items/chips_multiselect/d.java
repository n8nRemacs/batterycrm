package com.avito.android.compose_items.chips_multiselect;

import JO.m;
import Y41.p;
import com.akita.compose.component.chips.InterfaceC27333b;
import com.avito.android.category_parameters.ParameterElement;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ChipsMultiselectComposeItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "index", "Lcom/akita/compose/component/chips/b;", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(ILcom/akita/compose/component/chips/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class d extends N implements p<Integer, InterfaceC27333b, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.v f125367l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f125368m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ParameterElement.v vVar, f fVar) {
        super(2);
        this.f125367l = vVar;
        this.f125368m = fVar;
    }

    @Override // Y41.p
    public final G0 invoke(Integer num, InterfaceC27333b interfaceC27333b) {
        int iIntValue = num.intValue();
        if (iIntValue >= 0) {
            ParameterElement.v vVar = this.f125367l;
            if (iIntValue < vVar.f117545f.size()) {
                this.f125368m.f125374g.accept(new Ij.b(vVar.f117181b, m.a(vVar.f117545f.get(iIntValue), !r9.f8964e), null, 4, null));
            }
        }
        return G0.f406611a;
    }
}
