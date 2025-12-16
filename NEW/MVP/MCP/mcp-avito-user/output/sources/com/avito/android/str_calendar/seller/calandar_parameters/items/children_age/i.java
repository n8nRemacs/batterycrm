package com.avito.android.str_calendar.seller.calandar_parameters.items.children_age;

import Gy0.InterfaceC13931a;
import JO.m;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ChildrenAgeSelectPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/children_age/i;", "LTV0/f;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/items/children_age/k;", "Lcom/avito/android/category_parameters/ParameterElement$c;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i implements TV0.f<k, ParameterElement.C29375c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC13931a, G0> f287075b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public i(@Y61.k Y41.l<? super InterfaceC13931a, G0> lVar) {
        this.f287075b = lVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((k) eVar, (ParameterElement.C29375c) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        k((k) eVar, (ParameterElement.C29375c) aVar);
    }

    public final void k(@Y61.k k kVar, @Y61.k ParameterElement.C29375c c29375c) {
        kVar.setTitle(c29375c.f117394e);
        kVar.Xy(c29375c.f117395f);
        kVar.Q20(new c(this, c29375c));
        ParameterElement.C.b bVar = c29375c.f117396g;
        kVar.Vq(bVar.f117208d);
        m mVar = bVar.f117212h;
        kVar.BK(mVar != null ? mVar.f8962c : null);
        kVar.YS(bVar.f117214j != null);
        kVar.M00(new d(this, bVar, c29375c));
        ParameterElement.C.b bVar2 = c29375c.f117397h;
        kVar.CY(bVar2.f117208d);
        m mVar2 = bVar2.f117212h;
        kVar.Wh(mVar2 != null ? mVar2.f8962c : null);
        kVar.ay(bVar2.f117214j != null);
        kVar.Bp(new e(this, bVar2, c29375c));
        ParameterElement.p pVar = c29375c.f117398i;
        kVar.Ou(pVar.f117483h, pVar.f117493r, pVar.f117485j, pVar.f117486k);
        kVar.y10(pVar.f117481f);
        kVar.Hl(pVar.f117480e);
        kVar.Pp(pVar.f117482g);
        kVar.nB(new f(this, pVar));
        kVar.x30(new g(this, pVar));
        kVar.t(new h(kVar));
    }
}
