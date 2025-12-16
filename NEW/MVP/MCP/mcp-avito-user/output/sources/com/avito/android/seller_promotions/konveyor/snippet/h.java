package com.avito.android.seller_promotions.konveyor.snippet;

import Mq0.InterfaceC14521a;
import Mq0.b;
import Oq0.d;
import Sq0.C15214a;
import Y41.l;
import Y61.k;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.r;
import androidx.constraintlayout.helper.widget.Flow;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.search.filter.adapter.select.m;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SnippetItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/seller_promotions/konveyor/snippet/h;", "LTV0/f;", "Lcom/avito/android/seller_promotions/konveyor/snippet/j;", "Lcom/avito/android/seller_promotions/konveyor/snippet/d;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements TV0.f<j, d> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.seller_promotions.formatter.a f267853b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<Oq0.d, G0> f267854c;

    /* compiled from: SnippetItemPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/seller_promotions/konveyor/snippet/j;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/seller_promotions/konveyor/snippet/j;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<j, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC14521a f267856m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC14521a interfaceC14521a) {
            super(1);
            this.f267856m = interfaceC14521a;
        }

        @Override // Y41.l
        public final G0 invoke(j jVar) {
            j jVar2 = jVar;
            jVar2.Qr();
            Stepper stepper = ((InterfaceC14521a.d) this.f267856m).f11026b;
            h.this.getClass();
            jVar2.setStepperMaxValue(stepper.f116272c);
            jVar2.setStepperValue(stepper.f116271b);
            PrintableText printableText = stepper.f116274e;
            jVar2.Hf(printableText != null ? printableText.k0(jVar2.f267871n) : null, false);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public h(@k com.avito.android.seller_promotions.formatter.a aVar, @k l<? super Oq0.d, G0> lVar) {
        this.f267853b = aVar;
        this.f267854c = lVar;
    }

    public static InterfaceC14521a k(String str, Stepper stepper) {
        InterfaceC14521a c0702a;
        if (stepper == null) {
            return InterfaceC14521a.b.f11023a;
        }
        int i12 = stepper.f116271b;
        if (i12 > 0) {
            c0702a = new InterfaceC14521a.d(str, stepper);
        } else {
            int i13 = stepper.f116272c;
            if (i12 == 0 && i13 == 0) {
                return InterfaceC14521a.c.f11024a;
            }
            c0702a = new InterfaceC14521a.C0702a(str, i13);
        }
        return c0702a;
    }

    public final void O(j jVar, InterfaceC14521a interfaceC14521a) {
        boolean z12 = interfaceC14521a instanceof InterfaceC14521a.d;
        if (z12) {
            InterfaceC14521a.d dVar = (InterfaceC14521a.d) interfaceC14521a;
            String str = dVar.f11025a;
            Stepper stepper = dVar.f11026b;
            int i12 = stepper.f116271b;
            a aVar = new a(interfaceC14521a);
            jVar.setStepperValueChangedListener(f.f267848l);
            aVar.invoke(jVar);
            jVar.setStepperValueChangedListener(new g(this, str, i12, stepper.f116272c));
        } else if (interfaceC14521a instanceof InterfaceC14521a.C0702a) {
            jVar.setOnAddToCartClickListener(new m(9, this, interfaceC14521a));
        } else if (!L.f(interfaceC14521a, InterfaceC14521a.b.f11023a)) {
            L.f(interfaceC14521a, InterfaceC14521a.c.f11024a);
        }
        jVar.setStepperVisible(z12);
        jVar.setAddToCartButtonVisible(interfaceC14521a instanceof InterfaceC14521a.C0702a);
        boolean z13 = interfaceC14521a instanceof InterfaceC14521a.c;
        jVar.setVisible(!z13);
        D6.G(jVar.f267870m, z13);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        Mq0.b c0703b;
        j jVar = (j) eVar;
        final d dVar = (d) aVar;
        ViewGroup viewGroup = jVar.f267859b;
        String str = dVar.f267834b;
        viewGroup.setTag(str);
        com.avito.android.advert.item.delivery_suggests.l.w(dVar.f267836d, C35949t5.a(jVar.f267862e));
        double d12 = dVar.f267838f;
        Double dValueOf = Double.valueOf(d12);
        com.avito.android.seller_promotions.formatter.a aVar2 = this.f267853b;
        String strA = aVar2.a(dValueOf);
        C15214a c15214a = dVar.f267839g;
        if (c15214a == null) {
            c0703b = new b.a(strA);
        } else {
            c0703b = new b.C0703b(aVar2.a(Double.valueOf(Math.floor((d12 * (100 - r5)) / 100))), r.p("–", c15214a.f15166a, '%'), strA);
        }
        boolean z12 = c0703b instanceof b.a;
        Flow flow = jVar.f267864g;
        TextView textView = jVar.f267863f;
        if (z12) {
            textView.setText(((b.a) c0703b).f11027a);
            D6.w(flow);
        } else if (c0703b instanceof b.C0703b) {
            b.C0703b c0703b2 = (b.C0703b) c0703b;
            textView.setText(c0703b2.f11028a);
            D6.H(flow);
            jVar.f267866i.setText(c0703b2.f11030c);
            jVar.f267865h.setText(c0703b2.f11029b);
        }
        final int i13 = 0;
        jVar.f267867j.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.seller_promotions.konveyor.snippet.e

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h f267846c;

            {
                this.f267846c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        d dVar2 = dVar;
                        this.f267846c.f267854c.invoke(new d.k(dVar2.f267834b, dVar2.f267841i));
                        break;
                    default:
                        d dVar3 = dVar;
                        Double dValueOf2 = Double.valueOf(dVar3.f267838f);
                        h hVar = this.f267846c;
                        String strA2 = hVar.f267853b.a(dValueOf2);
                        hVar.f267854c.invoke(new d.b(SystemClock.elapsedRealtime(), dVar3.f267836d, dVar3.f267834b, dVar3.f267837e, dVar3.f267842j, strA2));
                        break;
                }
            }
        });
        jVar.setFavorite(dVar.f267841i);
        jVar.f267868k.setText(dVar.f267837e);
        O(jVar, k(str, dVar.f267840h));
        final int i14 = 1;
        viewGroup.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.seller_promotions.konveyor.snippet.e

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h f267846c;

            {
                this.f267846c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        d dVar2 = dVar;
                        this.f267846c.f267854c.invoke(new d.k(dVar2.f267834b, dVar2.f267841i));
                        break;
                    default:
                        d dVar3 = dVar;
                        Double dValueOf2 = Double.valueOf(dVar3.f267838f);
                        h hVar = this.f267846c;
                        String strA2 = hVar.f267853b.a(dValueOf2);
                        hVar.f267854c.invoke(new d.b(SystemClock.elapsedRealtime(), dVar3.f267836d, dVar3.f267834b, dVar3.f267837e, dVar3.f267842j, strA2));
                        break;
                }
            }
        });
        com.avito.android.beduin_shared.common.component.adapter.b bVar = jVar.f267860c;
        List<AbstractC40112a<BeduinModel, InterfaceC40116e>> list = dVar.f267844l;
        bVar.k(list);
        jVar.f267869l.setVisibility(!list.isEmpty() ? 0 : 8);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        j jVar = (j) eVar;
        d dVar = (d) aVar;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof com.avito.android.seller_promotions.konveyor.payloads.c) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.avito.android.seller_promotions.konveyor.payloads.c cVar = (com.avito.android.seller_promotions.konveyor.payloads.c) it.next();
            Boolean bool = cVar.f267826a;
            if (bool != null) {
                jVar.setFavorite(bool.booleanValue());
            }
            Stepper stepper = cVar.f267827b;
            if (stepper != null) {
                O(jVar, k(dVar.f267834b, stepper));
            }
        }
    }
}
