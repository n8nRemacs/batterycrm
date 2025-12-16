package com.avito.android.publish.slots.parameters_suggest;

import com.avito.android.category_parameters.f;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.util.V2;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ParametersSuggestByAddressSlotWrapper.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/category_parameters/CategoryParameters;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f244672b;

    public d(f fVar) {
        this.f244672b = fVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        if (!(typedResult instanceof TypedResult.Success)) {
            if (typedResult instanceof TypedResult.Error) {
                V2.f318762a.e(((TypedResult.Error) typedResult).getError().getF244063c(), null);
                return;
            }
            return;
        }
        f fVar = this.f244672b;
        CategoryParameters categoryParametersC0 = fVar.f244679g.C0();
        if (categoryParametersC0 != null) {
            TypedResult.Success success = (TypedResult.Success) typedResult;
            CategoryParameters categoryParametersCloneWithNewParameters = categoryParametersC0.cloneWithNewParameters(((CategoryParameters) success.getResult()).getParameters(), ((CategoryParameters) success.getResult()).getChangedIds());
            if (categoryParametersCloneWithNewParameters != null) {
                fVar.f244677e.Ke(categoryParametersCloneWithNewParameters);
            }
        }
        fVar.f244684l.accept(new f.b(SlotType.PARAMETERS_SUGGEST_BY_ADDRESS, null));
    }
}
