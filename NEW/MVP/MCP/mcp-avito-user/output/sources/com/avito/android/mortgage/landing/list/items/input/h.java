package com.avito.android.mortgage.landing.list.items.input;

import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.landing.list.items.input.payload.a;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import w00.InterfaceC49409a;

/* compiled from: InputPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/input/h;", "LTV0/f;", "Lcom/avito/android/mortgage/landing/list/items/input/j;", "Lcom/avito/android/mortgage/landing/list/items/input/InputItem;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h implements TV0.f<j, InputItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC49409a, G0> f199757b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public h(@Y61.k Y41.l<? super InterfaceC49409a, G0> lVar) {
        this.f199757b = lVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((j) eVar, (InputItem) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        j jVar = (j) eVar;
        InputItem inputItem = (InputItem) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof List) {
                obj = obj2;
            }
        }
        if (!(obj instanceof List)) {
            obj = null;
        }
        List<com.avito.android.mortgage.landing.list.items.input.payload.a> list2 = (List) obj;
        if (list2 == null) {
            list2 = C42784z0.f406748b;
        }
        if (list2.isEmpty()) {
            k(jVar, inputItem);
            return;
        }
        for (com.avito.android.mortgage.landing.list.items.input.payload.a aVar2 : list2) {
            if (aVar2 instanceof a.C5903a) {
                jVar.td(((a.C5903a) aVar2).f199781a);
            } else if (aVar2 instanceof a.b) {
                jVar.I(((a.b) aVar2).f199782a);
            } else if (aVar2 instanceof a.d) {
                jVar.setText(((a.d) aVar2).f199784a);
            } else if (aVar2 instanceof a.g) {
                jVar.a5(((a.g) aVar2).f199787a);
            } else if (aVar2 instanceof a.j) {
                a.j jVar2 = (a.j) aVar2;
                jVar.C8((float) jVar2.f199790a);
                if (jVar2.f199791b) {
                    jVar.uD(com.avito.android.mortgage.landing.utils.a.a(jVar2.f199790a));
                } else {
                    jVar.uD(null);
                }
            } else if (aVar2 instanceof a.e) {
                jVar.a8(((a.e) aVar2).f199785a.getLabel());
            } else if (aVar2 instanceof a.f) {
                jVar.ca(((a.f) aVar2).f199786a.getLabel());
            } else if (aVar2 instanceof a.h) {
                jVar.Ha((float) ((a.h) aVar2).f199788a);
            } else if (aVar2 instanceof a.i) {
                jVar.m8((float) ((a.i) aVar2).f199789a);
            } else if (aVar2 instanceof a.c) {
                k(jVar, inputItem);
            }
        }
    }

    public final void k(@Y61.k j jVar, @Y61.k InputItem inputItem) {
        jVar.I(inputItem.f199740m);
        jVar.setTitle(inputItem.f199730c);
        jVar.t5(inputItem.f199732e);
        Integer num = inputItem.f199731d;
        String string = num != null ? num.toString() : null;
        if (string == null) {
            string = "";
        }
        jVar.setText(string);
        double d12 = inputItem.f199737j;
        jVar.C8((float) d12);
        if (inputItem.f199739l) {
            jVar.uD(com.avito.android.mortgage.landing.utils.a.a(d12));
        } else {
            jVar.uD(null);
        }
        jVar.Ha((float) inputItem.f199736i);
        jVar.m8((float) inputItem.f199735h);
        jVar.a8(inputItem.f199734g.getLabel());
        jVar.ca(inputItem.f199733f.getLabel());
        jVar.a5(inputItem.f199738k);
        jVar.td(inputItem.f());
        jVar.Ac(new c(this, inputItem));
        jVar.Qb(new d(this, inputItem));
        jVar.E1(new e(this, inputItem));
        jVar.Z9(new f(this, inputItem));
        jVar.x9(new g(this, inputItem));
    }
}
