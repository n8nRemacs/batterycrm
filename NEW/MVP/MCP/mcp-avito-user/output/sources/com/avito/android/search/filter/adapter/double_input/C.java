package com.avito.android.search.filter.adapter.double_input;

import androidx.compose.runtime.C22026a;
import com.avito.android.search.filter.InterfaceC34581l;
import com.avito.android.search.filter.converter.ParameterElement;
import com.avito.android.search.filter.di.o;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: DoubleInputPayloadItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/double_input/C;", "Lcom/avito/android/search/filter/adapter/double_input/u;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class C implements u {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Boolean> f262215b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<ParameterElement.g> f262216c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final l41.g<ParameterElement.o> f262217d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f262218e = new LinkedHashMap();

    @Inject
    public C(@o.e @Y61.k io.reactivex.rxjava3.core.z<Boolean> zVar, @Y61.k InterfaceC34581l interfaceC34581l) {
        this.f262215b = zVar;
        this.f262216c = interfaceC34581l.getF263706F();
        this.f262217d = interfaceC34581l.getF263711e();
    }

    public static final void k(s sVar, C c12, ParameterElement.g gVar) {
        c12.getClass();
        String strC = C22026a.c(new StringBuilder(), gVar.f262753e.f262785d, ' ');
        StringBuilder sb2 = new StringBuilder();
        ParameterElement.o oVar = gVar.f262754f;
        String strC2 = C22026a.c(sb2, oVar.f262785d, ' ');
        ParameterElement.o oVar2 = gVar.f262753e;
        String str = oVar2.f262791j;
        String strAl = sVar.Al();
        String strBJ = sVar.BJ();
        String string = C43066x.W(C43066x.T(new StringBuilder(strAl), strC), String.valueOf(str)).toString();
        if (string.length() <= 0) {
            string = null;
        }
        String string2 = C43066x.W(C43066x.T(new StringBuilder(strBJ), strC2), String.valueOf(str)).toString();
        String str2 = string2.length() > 0 ? string2 : null;
        String str3 = oVar2.f262785d;
        String str4 = gVar.f262752d;
        if (str4 != null) {
            StringBuilder sbZ = androidx.appcompat.app.r.z(str4, ", ");
            sbZ.append(str3.toLowerCase(Locale.ROOT));
            String string3 = sbZ.toString();
            if (string3 != null) {
                str3 = string3;
            }
        }
        String str5 = oVar.f262785d;
        if (str4 != null) {
            StringBuilder sbZ2 = androidx.appcompat.app.r.z(str4, ", ");
            sbZ2.append(str5.toLowerCase(Locale.ROOT));
            String string4 = sbZ2.toString();
            if (string4 != null) {
                str5 = string4;
            }
        }
        ParameterElement.g gVar2 = new ParameterElement.g(gVar.f262751c, gVar.f262752d, ParameterElement.o.a(oVar2, str3, string, 262137), ParameterElement.o.a(oVar, str5, str2, 262137), gVar.f262755g);
        String str6 = gVar2.f262753e.f262786e;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = oVar2.f262786e;
        if (str7 == null) {
            str7 = "";
        }
        if (str6.equals(str7)) {
            String str8 = gVar2.f262754f.f262786e;
            if (str8 == null) {
                str8 = "";
            }
            String str9 = oVar.f262786e;
            if (str8.equals(str9 != null ? str9 : "")) {
                return;
            }
        }
        c12.f262216c.accept(gVar2);
    }

    public final void O(@Y61.k s sVar, @Y61.k ParameterElement.g gVar, @Y61.k List list) {
        G0 g02 = null;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof com.avito.android.search.filter.adapter.a) {
                obj = obj2;
            }
        }
        if (!(obj instanceof com.avito.android.search.filter.adapter.a)) {
            obj = null;
        }
        com.avito.android.search.filter.adapter.a aVar = (com.avito.android.search.filter.adapter.a) obj;
        ParameterElement.o oVar = gVar.f262753e;
        String str = oVar.f262785d;
        ParameterElement.o oVar2 = gVar.f262754f;
        String str2 = oVar2.f262785d;
        sVar.eC();
        sVar.kE("");
        sVar.qA("");
        sVar.T2("");
        sVar.b(gVar.f262752d);
        sVar.Qt(str);
        sVar.vC(str2);
        sVar.kE(str + ' ');
        sVar.qA(str2 + ' ');
        String str3 = oVar.f262791j;
        if (str3 != null) {
            sVar.T2(str3);
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            sVar.T2("");
        }
        sVar.A6(oVar.f262788g);
        sVar.v3(oVar.f262798q);
        sVar.w5(oVar.f262789h);
        sVar.I0(12);
        if (aVar != null) {
            String str4 = oVar.f262786e;
            if (str4 == null) {
                str4 = "";
            }
            sVar.V20(str4);
            String str5 = oVar2.f262786e;
            sVar.xh(str5 != null ? str5 : "");
        } else {
            String str6 = oVar.f262786e;
            if (str6 == null) {
                str6 = "";
            }
            sVar.G6(str6);
            String str7 = oVar2.f262786e;
            sVar.Ec(str7 != null ? str7 : "");
        }
        sVar.bl(new v(sVar, sVar, this, gVar));
        sVar.ZG(new w(sVar, sVar, this, gVar));
        sVar.hW(new x(sVar, this, gVar));
        sVar.J10(new y(sVar, this, gVar));
        LinkedHashMap linkedHashMap = this.f262218e;
        String str8 = gVar.f262689b;
        Object iVar = linkedHashMap.get(str8);
        if (iVar == null) {
            iVar = new io.reactivex.rxjava3.disposables.i(0);
            linkedHashMap.put(str8, iVar);
        }
        io.reactivex.rxjava3.disposables.i iVar2 = (io.reactivex.rxjava3.disposables.i) iVar;
        z zVar = new z(sVar, sVar, this, gVar);
        l41.g<? super Throwable> gVar2 = A.f262213b;
        io.reactivex.rxjava3.core.z<Boolean> zVar2 = this.f262215b;
        zVar2.getClass();
        iVar2.a(zVar2.v0(zVar, gVar2, io.reactivex.rxjava3.internal.functions.a.f401993c));
        sVar.d(new B(iVar2));
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        O((s) eVar, (ParameterElement.g) aVar, C42784z0.f406748b);
    }

    @Override // TV0.f
    public final /* bridge */ /* synthetic */ void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        O((s) eVar, (ParameterElement.g) aVar, list);
    }

    @Override // com.avito.android.search.filter.adapter.double_input.u
    public final void onCleared() {
        Iterator it = this.f262218e.entrySet().iterator();
        while (it.hasNext()) {
            ((io.reactivex.rxjava3.disposables.i) ((Map.Entry) it.next()).getValue()).a(null);
        }
    }
}
