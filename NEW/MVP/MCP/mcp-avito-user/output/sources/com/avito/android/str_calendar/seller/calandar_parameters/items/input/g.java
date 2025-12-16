package com.avito.android.str_calendar.seller.calandar_parameters.items.input;

import Gy0.InterfaceC13931a;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.str_calendar.seller.calandar_parameters.C35093d;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RdsInputItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/input/g;", "LTV0/f;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/items/input/i;", "Lcom/avito/android/category_parameters/ParameterElement$p;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements TV0.f<i, ParameterElement.p> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC13931a, G0> f287209b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f287210c;

    @Inject
    public g() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@k l<? super InterfaceC13931a, G0> lVar, boolean z12) {
        this.f287209b = lVar;
        this.f287210c = z12;
    }

    public final void O(@k i iVar, @k ParameterElement.p pVar, @k List list) {
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof C35093d) {
                obj = obj2;
            }
        }
        if (((C35093d) (obj instanceof C35093d ? obj : null)) == null) {
            k(iVar, pVar);
            return;
        }
        iVar.o0(new d(pVar, this, iVar));
        iVar.K(new e(pVar, this, iVar));
        iVar.lB(new f(pVar, this, iVar));
        String str = pVar.f117482g;
        if (str != null) {
            iVar.v9(str);
        } else {
            iVar.G();
        }
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((i) eVar, (ParameterElement.p) aVar);
    }

    @Override // TV0.f
    public final /* bridge */ /* synthetic */ void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        O((i) eVar, (ParameterElement.p) aVar, list);
    }

    public final void k(@k i iVar, @k ParameterElement.p pVar) {
        iVar.K00(pVar.f117483h, pVar.f117485j, pVar.f117486k);
        iVar.setTitle(pVar.f117480e);
        iVar.setHint(pVar.f117490o);
        iVar.m(pVar.f117481f);
        iVar.o0(new d(pVar, this, iVar));
        iVar.K(new e(pVar, this, iVar));
        iVar.lB(new f(pVar, this, iVar));
        String str = pVar.f117482g;
        if (str != null) {
            iVar.v9(str);
        } else {
            iVar.G();
        }
        iVar.t(new c(iVar));
    }
}
