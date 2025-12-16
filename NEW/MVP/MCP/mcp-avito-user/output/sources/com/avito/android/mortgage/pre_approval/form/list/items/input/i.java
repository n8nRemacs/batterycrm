package com.avito.android.mortgage.pre_approval.form.list.items.input;

import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.pre_approval.form.list.items.input.payload.a;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: InputPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/form/list/items/input/i;", "LTV0/f;", "Lcom/avito/android/mortgage/pre_approval/form/list/items/input/k;", "Lcom/avito/android/mortgage/pre_approval/form/list/items/input/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements TV0.f<k, c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Q00.a, G0> f201788b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public i(@Y61.k Y41.l<? super Q00.a, G0> lVar) {
        this.f201788b = lVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((k) eVar, (c) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        k kVar = (k) eVar;
        c cVar = (c) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof List) {
                obj = obj2;
            }
        }
        if (!(obj instanceof List)) {
            obj = null;
        }
        Iterable<com.avito.android.mortgage.pre_approval.form.list.items.input.payload.a> iterable = (List) obj;
        if (iterable == null) {
            iterable = C42784z0.f406748b;
        }
        for (com.avito.android.mortgage.pre_approval.form.list.items.input.payload.a aVar2 : iterable) {
            if (aVar2 instanceof a.C5985a) {
                kVar.td(((a.C5985a) aVar2).f201813a);
            } else if (aVar2 instanceof a.b) {
                kVar.C5(((a.b) aVar2).f201814a);
            } else if (aVar2 instanceof a.d) {
                Double d12 = ((a.d) aVar2).f201816a;
                kVar.H10(d12 != null ? com.avito.android.mortgage.landing.utils.a.a(d12.doubleValue()) : null);
            } else if (aVar2 instanceof a.e) {
                kVar.setText(((a.e) aVar2).f201817a);
            } else if (aVar2 instanceof a.f) {
                Double d13 = ((a.f) aVar2).f201818a;
                if (d13 != null) {
                    kVar.C8((float) d13.doubleValue());
                }
            } else if (aVar2 instanceof a.c) {
                k(kVar, cVar);
            }
        }
    }

    public final void k(@Y61.k k kVar, @Y61.k c cVar) {
        kVar.D(cVar.f201768c);
        kVar.t5(cVar.f201770e);
        Integer num = cVar.f201771f;
        String string = num != null ? num.toString() : null;
        if (string == null) {
            string = "";
        }
        kVar.setText(string);
        kVar.c6(cVar.f201769d);
        kVar.C5(cVar.f201774i);
        O00.a aVar = cVar.f201772g;
        kVar.Pu(aVar != null);
        Double d12 = cVar.f201775j;
        kVar.H10(d12 != null ? com.avito.android.mortgage.landing.utils.a.a(d12.doubleValue()) : null);
        if (aVar != null) {
            kVar.C8((float) aVar.f11895a);
            kVar.Ha((float) 1.0d);
            kVar.m8((float) 0.0d);
            kVar.a8("100 млн ₽");
            kVar.ca("500 тыс. ₽");
        }
        kVar.a5(cVar.f201773h);
        kVar.td(cVar.a());
        kVar.r0(new d(this, cVar));
        kVar.Pw(new e(this, cVar));
        kVar.E1(new f(this, cVar));
        kVar.Z9(new g(this, cVar));
        kVar.x9(new h(this, cVar));
    }
}
