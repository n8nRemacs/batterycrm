package com.avito.android.str_insurance.screen.mvi;

import com.avito.android.lib.design.input.Input;
import com.avito.android.str_insurance.screen.mvi.entity.StrInsuranceInternalAction;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: StrInsuranceReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_insurance/screen/mvi/v;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/str_insurance/screen/mvi/entity/StrInsuranceInternalAction;", "LZy0/c;", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class v implements com.avito.android.arch.mvi.u<StrInsuranceInternalAction, Zy0.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_insurance.converters.f f288788b;

    @Inject
    public v(@Y61.k com.avito.android.str_insurance.converters.f fVar) {
        this.f288788b = fVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final Zy0.c a(StrInsuranceInternalAction strInsuranceInternalAction, Zy0.c cVar) {
        StrInsuranceInternalAction strInsuranceInternalAction2 = strInsuranceInternalAction;
        Zy0.c cVar2 = cVar;
        if (strInsuranceInternalAction2 instanceof StrInsuranceInternalAction.ShowContent) {
            return b(Zy0.c.a(cVar2, ((StrInsuranceInternalAction.ShowContent) strInsuranceInternalAction2).f288736b, null, null, false, null, 22));
        }
        if (strInsuranceInternalAction2 instanceof StrInsuranceInternalAction.ShowFlatFormLoading) {
            return b(Zy0.c.a(cVar2, null, null, null, true, null, 23));
        }
        if (strInsuranceInternalAction2 instanceof StrInsuranceInternalAction.ShowFlatFormError) {
            return b(Zy0.c.a(cVar2, null, null, null, false, null, 23));
        }
        if (strInsuranceInternalAction2 instanceof StrInsuranceInternalAction.ShowFlatNumberContent) {
            Input.f179303W.getClass();
            return b(Zy0.c.a(cVar2, null, ((StrInsuranceInternalAction.ShowFlatNumberContent) strInsuranceInternalAction2).f288739b, C42756l.e0(Input.f179304a0), false, null, 17));
        }
        if (!(strInsuranceInternalAction2 instanceof StrInsuranceInternalAction.ShowFlatNumberError)) {
            return cVar2;
        }
        Input.f179303W.getClass();
        return b(Zy0.c.a(cVar2, null, ((StrInsuranceInternalAction.ShowFlatNumberError) strInsuranceInternalAction2).f288740b, C42756l.e0(Input.f179305b0), false, null, 17));
    }

    public final Zy0.c b(Zy0.c cVar) {
        List<com.avito.conveyor_item.a> listA = this.f288788b.a(cVar);
        cVar.f20612f.getClass();
        return Zy0.c.a(cVar, null, null, null, false, new Zy0.d(listA, cVar.f20611e), 15);
    }
}
