package com.avito.android.str_calendar.seller.calandar_parameters.items.variable_length.header;

import Gy0.InterfaceC13931a;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VariableParameterHeaderPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/variable_length/header/f;", "LTV0/d;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/items/variable_length/header/a;", "Lcom/avito/android/category_parameters/ParameterElement$VariableLengthParameter$b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements TV0.d<a, ParameterElement.VariableLengthParameter.b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC13931a, G0> f287304b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super InterfaceC13931a, G0> lVar) {
        this.f287304b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        a aVar2 = (a) eVar;
        ParameterElement.VariableLengthParameter.b bVar = (ParameterElement.VariableLengthParameter.b) aVar;
        aVar2.setTitle(bVar.f117382e);
        aVar2.Yy(bVar.f117385h);
        aVar2.e40(bVar.f117384g != null);
        aVar2.J7(new e(bVar, this));
    }
}
