package com.avito.android.search.filter.adapter.double_input;

import com.avito.android.search.filter.InterfaceC34581l;
import com.avito.android.search.filter.converter.ParameterElement;
import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.internal.operators.observable.W;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43543a;

/* compiled from: DoubleInputItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/double_input/p;", "Lcom/avito/android/search/filter/adapter/double_input/u;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p implements u {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l41.g<ParameterElement.o> f262240b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final l41.g<ParameterElement.o> f262241c;

    @Inject
    public p(@Y61.k InterfaceC34581l interfaceC34581l) {
        this.f262240b = interfaceC34581l.getF263714h();
        this.f262241c = interfaceC34581l.getF263711e();
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((s) eVar, (ParameterElement.g) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        k((s) eVar, (ParameterElement.g) aVar);
    }

    public final void k(@Y61.k s sVar, @Y61.k ParameterElement.g gVar) {
        G0 g02;
        G0 g03;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        com.jakewharton.rxrelay3.c cVar2 = new com.jakewharton.rxrelay3.c();
        com.jakewharton.rxrelay3.c cVar3 = new com.jakewharton.rxrelay3.c();
        sVar.eC();
        sVar.kE("");
        sVar.qA("");
        sVar.T2("");
        ParameterElement.o oVar = gVar.f262753e;
        String str = oVar.f262785d;
        ParameterElement.o oVar2 = gVar.f262754f;
        String str2 = oVar2.f262785d;
        sVar.b(gVar.f262752d);
        sVar.Qt(str);
        sVar.vC(str2);
        sVar.kE(str + ' ');
        sVar.qA(str2 + ' ');
        String str3 = oVar.f262791j;
        G0 g04 = null;
        if (str3 != null) {
            sVar.T2(str3);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            sVar.T2("");
        }
        sVar.A6(oVar.f262788g);
        sVar.v3(oVar.f262798q);
        sVar.w5(oVar.f262789h);
        sVar.I0(12);
        String str4 = oVar.f262786e;
        if (str4 != null) {
            sVar.G6(str4);
            g03 = G0.f406611a;
        } else {
            g03 = null;
        }
        if (g03 == null) {
            sVar.G6("");
        }
        String str5 = oVar2.f262786e;
        if (str5 != null) {
            sVar.Ec(str5);
            g04 = G0.f406611a;
        }
        if (g04 == null) {
            sVar.Ec("");
        }
        sVar.Jz(new j(cVar2));
        sVar.PU(new k(cVar3));
        sVar.bl(new l(sVar));
        sVar.ZG(new m(sVar));
        sVar.J10(new n(gVar, this));
        W wN2 = cVar2.N(new o(gVar));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        H h12 = io.reactivex.rxjava3.schedulers.b.f404942b;
        io.reactivex.rxjava3.internal.operators.observable.E eY2 = wN2.y(800L, timeUnit, h12);
        C34545d c34545d = new C34545d(gVar, this);
        l41.g<? super Throwable> gVar2 = C34546e.f262227b;
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        cVar.b(eY2.v0(c34545d, gVar2, interfaceC43543a));
        cVar.b(cVar3.N(new f(gVar)).y(800L, timeUnit, h12).v0(new g(gVar, this), h.f262231b, interfaceC43543a));
        sVar.d(new i(cVar));
    }

    @Override // com.avito.android.search.filter.adapter.double_input.u
    public final void onCleared() {
    }
}
