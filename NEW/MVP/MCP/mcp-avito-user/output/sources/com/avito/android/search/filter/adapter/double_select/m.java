package com.avito.android.search.filter.adapter.double_select;

import com.avito.android.search.filter.InterfaceC34581l;
import com.avito.android.search.filter.converter.ParameterElement;
import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: DoubleSelectItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/double_select/m;", "Lcom/avito/android/search/filter/adapter/double_select/d;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l41.g<ParameterElement.v> f262287b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final l41.g<ParameterElement.v> f262288c;

    @Inject
    public m(@Y61.k InterfaceC34581l interfaceC34581l) {
        this.f262287b = interfaceC34581l.getF263712f();
        this.f262288c = interfaceC34581l.getF263708b();
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        p pVar = (p) eVar;
        ParameterElement.v.a aVar2 = (ParameterElement.v.a) aVar;
        com.jakewharton.rxrelay3.c cVar = new com.jakewharton.rxrelay3.c();
        com.jakewharton.rxrelay3.c cVar2 = new com.jakewharton.rxrelay3.c();
        ParameterElement.v.b bVar = aVar2.f262858d;
        String strQ0 = C43066x.q0(bVar.f262840c, ",");
        ParameterElement.v.b bVar2 = aVar2.f262859e;
        String str = bVar2.f262850m;
        pVar.setTitle(strQ0);
        pVar.PP(bVar.f262850m);
        pVar.XF(str);
        pVar.j30(new e(cVar));
        pVar.wn(new f(cVar2));
        String str2 = bVar.f262842e;
        pVar.G6(str2);
        boolean z12 = aVar2.f262860f;
        if (str2 == null || C43066x.K(str2)) {
            pVar.jy();
        } else if (!z12) {
            pVar.ct(new g(pVar, this, aVar2));
        }
        String str3 = bVar2.f262842e;
        pVar.Ec(str3);
        if (str3 == null || C43066x.K(str3)) {
            pVar.cs();
        } else if (!z12) {
            pVar.FX(new h(pVar, this, aVar2));
        }
        C41981q0 c41981q0 = new C41981q0(cVar);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        H h12 = io.reactivex.rxjava3.schedulers.b.f404942b;
        c41981q0.C0(1000L, timeUnit, h12).u0(new i(this, aVar2), j.f262283b);
        new C41981q0(cVar2).C0(1000L, timeUnit, h12).u0(new k(this, aVar2), l.f262286b);
    }
}
