package com.avito.android.str_calendar.seller.calandar_parameters.items.variable_length.add_button;

import Gy0.InterfaceC13931a;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.category_parameters.ParameterElement;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AddButtonPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/variable_length/add_button/d;", "LTV0/d;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/items/variable_length/add_button/f;", "Lcom/avito/android/category_parameters/ParameterElement$VariableLengthParameter$a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements TV0.d<f, ParameterElement.VariableLengthParameter.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC13931a, G0> f287290b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super InterfaceC13931a, G0> lVar) {
        this.f287290b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        ParameterElement.VariableLengthParameter.a aVar2 = (ParameterElement.VariableLengthParameter.a) aVar;
        String str = aVar2.f117379e;
        if (str == null || str.length() == 0) {
            str = null;
        }
        fVar.y(str != null ? com.avito.android.printable_text.b.f(str) : com.avito.android.printable_text.b.c(R.string.add_button_title, new Serializable[0]));
        fVar.a(new c(this, aVar2));
    }
}
