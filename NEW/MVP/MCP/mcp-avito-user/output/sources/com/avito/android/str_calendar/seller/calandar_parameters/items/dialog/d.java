package com.avito.android.str_calendar.seller.calandar_parameters.items.dialog;

import Gy0.InterfaceC13931a;
import JO.m;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.str_calendar.seller.calandar_parameters.t;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: DialogFormItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/dialog/d;", "LTV0/d;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/items/dialog/f;", "Lcom/avito/android/category_parameters/ParameterElement$C$b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements TV0.d<f, ParameterElement.C.b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC13931a, G0> f287119b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final t f287120c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super InterfaceC13931a, G0> lVar, @k t tVar) {
        this.f287119b = lVar;
        this.f287120c = tVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String str;
        f fVar = (f) eVar;
        ParameterElement.C.b bVar = (ParameterElement.C.b) aVar;
        this.f287119b.invoke(new InterfaceC13931a.m(bVar.f117181b));
        fVar.h(bVar.f117208d);
        m mVar = (m) C42745f0.G(bVar.f117236E);
        fVar.NX((mVar == null || (str = mVar.f8962c) == null) ? this.f287120c.getF287467b() : com.avito.android.printable_text.b.f(str));
        String str2 = bVar.f117214j;
        fVar.G2(str2 != null ? com.avito.android.printable_text.b.f(str2) : null);
        fVar.a(new c(this, bVar));
    }
}
