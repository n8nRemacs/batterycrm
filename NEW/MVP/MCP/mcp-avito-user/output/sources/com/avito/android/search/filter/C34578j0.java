package com.avito.android.search.filter;

import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: FiltersPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/search/filter/ParametersTreeWithAdditional;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.search.filter.j0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34578j0 extends kotlin.jvm.internal.N implements Y41.l<P2<? super ParametersTreeWithAdditional>, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34574h0 f263366l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34578j0(C34574h0 c34574h0) {
        super(1);
        this.f263366l = c34574h0;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(P2<? super ParametersTreeWithAdditional> p22) {
        P2<? super ParametersTreeWithAdditional> p23 = p22;
        if (p23 instanceof P2.b) {
            C34574h0 c34574h0 = this.f263366l;
            if (c34574h0.f263332b0 == null) {
                ParameterSlot parameterSlotFindParameter = ((ParametersTreeWithAdditional) ((P2.b) p23).f318720a).findParameter("localPriority");
                BooleanParameter booleanParameter = parameterSlotFindParameter instanceof BooleanParameter ? (BooleanParameter) parameterSlotFindParameter : null;
                c34574h0.f263332b0 = booleanParameter != null ? booleanParameter.getValue() : null;
            }
        }
        return kotlin.G0.f406611a;
    }
}
