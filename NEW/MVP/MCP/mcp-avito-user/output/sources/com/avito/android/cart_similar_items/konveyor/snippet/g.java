package com.avito.android.cart_similar_items.konveyor.snippet;

import Y41.l;
import Y61.k;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kn.InterfaceC42716a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import mn.InterfaceC44101a;

/* compiled from: SnippetItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_similar_items/konveyor/snippet/g;", "LTV0/f;", "Lcom/avito/android/cart_similar_items/konveyor/snippet/i;", "Lcom/avito/android/cart_similar_items/konveyor/snippet/c;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements TV0.f<i, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.cart_similar_items.formatter.a f115891b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<InterfaceC44101a, G0> f115892c;

    /* compiled from: SnippetItemPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/cart_similar_items/konveyor/snippet/i;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/cart_similar_items/konveyor/snippet/i;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<i, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC42716a f115894m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC42716a interfaceC42716a) {
            super(1);
            this.f115894m = interfaceC42716a;
        }

        @Override // Y41.l
        public final G0 invoke(i iVar) {
            i iVar2 = iVar;
            iVar2.Qr();
            Stepper stepper = ((InterfaceC42716a.d) this.f115894m).f406590b;
            g.this.getClass();
            iVar2.setStepperMaxValue(stepper.f116272c);
            iVar2.setStepperValue(stepper.f116271b);
            PrintableText printableText = stepper.f116274e;
            iVar2.Hf(printableText != null ? printableText.k0(iVar2.f115906k) : null, false);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@k com.avito.android.cart_similar_items.formatter.a aVar, @k l<? super InterfaceC44101a, G0> lVar) {
        this.f115891b = aVar;
        this.f115892c = lVar;
    }

    public static InterfaceC42716a k(String str, Stepper stepper) {
        if (stepper != null) {
            int i12 = stepper.f116272c;
            int i13 = stepper.f116271b;
            if (i13 != 0 || i12 != 0) {
                return i13 > 0 ? new InterfaceC42716a.d(str, stepper) : new InterfaceC42716a.C11626a(str, i12);
            }
        }
        return InterfaceC42716a.b.f406587a;
    }

    public final void O(i iVar, InterfaceC42716a interfaceC42716a) {
        boolean z12 = interfaceC42716a instanceof InterfaceC42716a.d;
        if (z12) {
            InterfaceC42716a.d dVar = (InterfaceC42716a.d) interfaceC42716a;
            String str = dVar.f406589a;
            Stepper stepper = dVar.f406590b;
            int i12 = stepper.f116271b;
            a aVar = new a(interfaceC42716a);
            iVar.setStepperValueChangedListener(e.f115886l);
            aVar.invoke(iVar);
            iVar.setStepperValueChangedListener(new f(this, str, i12, stepper.f116272c));
        } else if (interfaceC42716a instanceof InterfaceC42716a.C11626a) {
            iVar.setOnAddToCartClickListener(new com.avito.android.body_condition.h(10, this, interfaceC42716a));
        } else if (!L.f(interfaceC42716a, InterfaceC42716a.b.f406587a)) {
            L.f(interfaceC42716a, InterfaceC42716a.c.f406588a);
        }
        iVar.setStepperVisible(z12);
        iVar.setAddToCartButtonVisible(interfaceC42716a instanceof InterfaceC42716a.C11626a);
        iVar.setVisible(((interfaceC42716a instanceof InterfaceC42716a.b) || (interfaceC42716a instanceof InterfaceC42716a.c)) ? false : true);
        D6.G(iVar.f115905j, interfaceC42716a instanceof InterfaceC42716a.c);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        final c cVar = (c) aVar;
        ViewGroup viewGroup = iVar.f115897b;
        String str = cVar.f115873b;
        viewGroup.setTag(str);
        com.avito.android.advert.item.delivery_suggests.l.w(cVar.f115875d, C35949t5.a(iVar.f115900e));
        iVar.f115901f.setText(this.f115891b.a(Double.valueOf(cVar.f115877f)));
        final int i13 = 0;
        iVar.f115902g.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.cart_similar_items.konveyor.snippet.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g f115884c;

            {
                this.f115884c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        c cVar2 = cVar;
                        this.f115884c.f115892c.invoke(new InterfaceC44101a.j(cVar2.f115873b, cVar2.f115879h));
                        break;
                    default:
                        c cVar3 = cVar;
                        Double dValueOf = Double.valueOf(cVar3.f115877f);
                        g gVar = this.f115884c;
                        gVar.f115892c.invoke(new InterfaceC44101a.b(cVar3.f115873b, cVar3.f115876e, gVar.f115891b.a(dValueOf), cVar3.f115875d, SystemClock.elapsedRealtime()));
                        break;
                }
            }
        });
        iVar.setFavorite(cVar.f115879h);
        iVar.f115903h.setText(cVar.f115876e);
        O(iVar, k(str, cVar.f115878g));
        final int i14 = 1;
        viewGroup.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.cart_similar_items.konveyor.snippet.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ g f115884c;

            {
                this.f115884c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        c cVar2 = cVar;
                        this.f115884c.f115892c.invoke(new InterfaceC44101a.j(cVar2.f115873b, cVar2.f115879h));
                        break;
                    default:
                        c cVar3 = cVar;
                        Double dValueOf = Double.valueOf(cVar3.f115877f);
                        g gVar = this.f115884c;
                        gVar.f115892c.invoke(new InterfaceC44101a.b(cVar3.f115873b, cVar3.f115876e, gVar.f115891b.a(dValueOf), cVar3.f115875d, SystemClock.elapsedRealtime()));
                        break;
                }
            }
        });
        com.avito.android.beduin_shared.common.component.adapter.b bVar = iVar.f115898c;
        List<AbstractC40112a<BeduinModel, InterfaceC40116e>> list = cVar.f115882k;
        bVar.k(list);
        iVar.f115904i.setVisibility(!list.isEmpty() ? 0 : 8);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        i iVar = (i) eVar;
        c cVar = (c) aVar;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof com.avito.android.cart_similar_items.konveyor.payloads.c) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.avito.android.cart_similar_items.konveyor.payloads.c cVar2 = (com.avito.android.cart_similar_items.konveyor.payloads.c) it.next();
            Boolean bool = cVar2.f115865a;
            if (bool != null) {
                iVar.setFavorite(bool.booleanValue());
            }
            Stepper stepper = cVar2.f115866b;
            if (stepper != null) {
                O(iVar, k(cVar.f115873b, stepper));
            }
        }
    }
}
