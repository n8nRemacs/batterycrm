package com.avito.android.advert.item.leasing_calculator;

import Fc1.G3;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.O2;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsLeasingCalculatorItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/leasing_calculator/q;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/leasing_calculator/p;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class q extends com.avito.konveyor.adapter.b implements p {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f77441p = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f77442b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f77443c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f77444d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Input f77445e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f77446f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Input f77447g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f77448h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Button f77449i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final TextView f77450j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f77451k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final TextView f77452l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public T5.b f77453m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public T5.b f77454n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f77455o;

    public q(@Y61.k View view) {
        super(view);
        this.f77442b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f77443c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.down_payment_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f77444d = (ComponentContainer) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.down_payment_input);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f77445e = (Input) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.period_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f77446f = (ComponentContainer) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.period_input);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f77447g = (Input) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.terms_container);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f77448h = (LinearLayout) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.application_button);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f77449i = (Button) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.benefits_title);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f77450j = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.benefits_container);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f77451k = (LinearLayout) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.details_link);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f77452l = (TextView) viewFindViewById10;
        this.itemView.post(new G3(this, 22));
    }

    @Override // com.avito.android.advert.item.leasing_calculator.p
    public final void GR(@Y61.l Y41.a<G0> aVar) {
        this.f77455o = aVar;
    }

    @Override // com.avito.android.advert.item.leasing_calculator.p
    public final void LF() {
        D6.w(this.f77444d);
    }

    @Override // com.avito.android.advert.item.leasing_calculator.p
    public final void b(@Y61.l String str) {
        I5.a(this.f77443c, str, false);
    }

    @Override // com.avito.android.advert.item.leasing_calculator.p
    public final void b7(@Y61.l String str, @Y61.l Y41.a<G0> aVar) {
        Button button = this.f77449i;
        com.avito.android.lib.design.button.b.a(button, str, false);
        D6.k(button);
        button.setOnClickListener(new com.avito.android.active_orders_common.items.order.n(21, aVar));
    }

    @Override // com.avito.android.advert.item.leasing_calculator.p
    public final void d20(@Y61.l ArrayList arrayList) {
        LinearLayout linearLayout = this.f77448h;
        linearLayout.removeAllViews();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.itemView.getContext());
        if (arrayList == null || arrayList.isEmpty()) {
            layoutInflaterFrom.inflate(R.layout.advert_details_leasing_term_stub, (ViewGroup) linearLayout, true);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            T5.c cVar = (T5.c) it.next();
            View viewInflate = layoutInflaterFrom.inflate(R.layout.advert_details_leasing_calculator_term, (ViewGroup) linearLayout, false);
            T5.e eVar = new T5.e(viewInflate);
            eVar.f15359a.setText(cVar.f15356a);
            eVar.f15360b.setText(cVar.f15357b);
            if (cVar.f15358c != null) {
                ImageView imageView = eVar.f15361c;
                D6.H(imageView);
                imageView.setOnClickListener(new A91.p(cVar, 12));
            }
            linearLayout.addView(viewInflate);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.advert.item.leasing_calculator.p
    public final void g70(@Y61.l String str, @Y61.l Long l12, @Y61.l Y41.l<? super String, G0> lVar) {
        ComponentContainer componentContainer = this.f77446f;
        D6.H(componentContainer);
        Input input = this.f77447g;
        T5.b bVar = new T5.b(componentContainer, input);
        componentContainer.setTitle(str);
        Input.t(input, String.valueOf(l12), false, 6);
        bVar.f15353c = (N) lVar;
        input.b(bVar.f15354d);
        this.f77454n = bVar;
    }

    @Override // com.avito.android.advert.item.leasing_calculator.p
    @Y61.k
    public final Context getContext() {
        return this.itemView.getContext();
    }

    @Override // com.avito.android.advert.item.leasing_calculator.p
    public final void ik(@Y61.l String str, @Y61.l Y41.a<G0> aVar) {
        TextView textView = this.f77452l;
        I5.a(textView, str, false);
        I5.c(textView, aVar);
    }

    @Override // com.avito.android.advert.item.leasing_calculator.p
    public final void j40(@Y61.l String str) {
        T5.b bVar = this.f77453m;
        if (bVar != null) {
            bVar.a(str);
        }
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        T5.b bVar = this.f77453m;
        if (bVar != null) {
            bVar.b();
        }
        T5.b bVar2 = this.f77454n;
        if (bVar2 != null) {
            bVar2.b();
        }
        this.f77453m = null;
        this.f77454n = null;
        this.f77455o = null;
    }

    @Override // com.avito.android.advert.item.leasing_calculator.p
    public final void p50(@Y61.l String str) {
        T5.b bVar = this.f77454n;
        if (bVar != null) {
            bVar.a(str);
        }
    }

    @Override // com.avito.android.advert.item.leasing_calculator.p
    public final void pU() {
        D6.w(this.f77446f);
    }

    @Override // com.avito.android.advert.item.leasing_calculator.p
    public final void qR(@Y61.l String str, @Y61.l ArrayList arrayList) {
        I5.a(this.f77450j, str, false);
        LinearLayout linearLayout = this.f77451k;
        linearLayout.removeAllViews();
        D6.G(linearLayout, O2.a(arrayList));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.itemView.getContext());
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                TextView textView = (TextView) layoutInflaterFrom.inflate(R.layout.advert_details_leasing_calculator_benefit, (ViewGroup) linearLayout, false);
                I5.a(textView, str2, false);
                linearLayout.addView(textView);
            }
        }
    }

    @Override // com.avito.android.advert.item.leasing_calculator.p
    public final void setVisible(boolean z12) {
        D6.G(this.f77442b, z12);
    }

    @Override // com.avito.android.advert.item.leasing_calculator.p
    public final void sj(boolean z12) {
        this.f77449i.setEnabled(z12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.advert.item.leasing_calculator.p
    public final void xW(@Y61.l String str, @Y61.l Long l12, @Y61.l Y41.l<? super String, G0> lVar) {
        ComponentContainer componentContainer = this.f77444d;
        D6.H(componentContainer);
        Input input = this.f77445e;
        T5.b bVar = new T5.b(componentContainer, input);
        componentContainer.setTitle(str);
        Input.t(input, String.valueOf(l12), false, 6);
        bVar.f15353c = (N) lVar;
        input.b(bVar.f15354d);
        this.f77453m = bVar;
    }
}
