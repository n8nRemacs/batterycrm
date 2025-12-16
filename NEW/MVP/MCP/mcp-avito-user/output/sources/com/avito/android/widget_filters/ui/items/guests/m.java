package com.avito.android.widget_filters.ui.items.guests;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.animation.AnimationView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.stepper.Stepper;
import com.avito.android.lib.design.switcher.Switcher;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.verification.verification_input_inn.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: WidgetFiltersGuestsWidgetView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/widget_filters/ui/items/guests/m;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/widget_filters/ui/items/guests/k;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class m extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: b, reason: collision with root package name */
    public final Context f330443b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f330444c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f330445d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f330446e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final View f330447f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f330448g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f330449h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f330450i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Stepper f330451j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final TextView f330452k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final TextView f330453l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Button f330454m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f330455n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final AnimationView f330456o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final TextView f330457p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final Switcher f330458q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public d f330459r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Integer, G0> f330460s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Integer, G0> f330461t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super NP0.a, G0> f330462u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super NP0.f, G0> f330463v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f330464w;

    /* compiled from: WidgetFiltersGuestsWidgetView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Integer, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            int iIntValue = num.intValue();
            Y41.l<? super Integer, G0> lVar = m.this.f330461t;
            if (lVar != null) {
                lVar.invoke(Integer.valueOf(iIntValue));
            }
            return G0.f406611a;
        }
    }

    public m(@Y61.k View view) {
        super(view);
        this.f330443b = view.getContext();
        this.f330444c = view.findViewById(R.id.guests_widget_collapsed_layout);
        this.f330445d = (TextView) view.findViewById(R.id.widget_collapsed_title_tv);
        this.f330446e = (TextView) view.findViewById(R.id.widget_collapsed_placeholder_tv);
        this.f330447f = view.findViewById(R.id.guests_widget_expanded_content);
        this.f330448g = (TextView) view.findViewById(R.id.guests_widget_title_tv);
        this.f330449h = (TextView) view.findViewById(R.id.guests_widget_adults_title);
        this.f330450i = (TextView) view.findViewById(R.id.guests_widget_adults_description);
        Stepper stepper = (Stepper) view.findViewById(R.id.guests_widget_adults_count_stepper);
        this.f330451j = stepper;
        this.f330452k = (TextView) view.findViewById(R.id.guests_widget_children_title);
        this.f330453l = (TextView) view.findViewById(R.id.guests_widget_children_description);
        this.f330454m = (Button) view.findViewById(R.id.guests_widget_children_picker_button);
        this.f330455n = (LinearLayout) view.findViewById(R.id.guests_widget_selected_children_container);
        AnimationView animationView = (AnimationView) view.findViewById(R.id.paws_animation_view);
        this.f330456o = animationView;
        this.f330457p = (TextView) view.findViewById(R.id.guests_widget_animals_title);
        Switcher switcher = (Switcher) view.findViewById(R.id.guests_widget_animals_switcher);
        this.f330458q = switcher;
        final int i12 = 0;
        view.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.widget_filters.ui.items.guests.l

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ m f330442c;

            {
                this.f330442c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        m mVar = this.f330442c;
                        Y41.l<? super Integer, G0> lVar = mVar.f330460s;
                        if (lVar != null) {
                            lVar.invoke(Integer.valueOf(mVar.getAdapterPosition()));
                            break;
                        }
                        break;
                    default:
                        m mVar2 = this.f330442c;
                        if (mVar2.f330458q.isChecked()) {
                            AnimationView animationView2 = mVar2.f330456o;
                            D6.H(animationView2);
                            animationView2.d();
                        }
                        Y41.a<G0> aVar = mVar2.f330464w;
                        if (aVar != null) {
                            aVar.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        stepper.setOnValueChangeListener(new a());
        final int i13 = 1;
        switcher.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.widget_filters.ui.items.guests.l

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ m f330442c;

            {
                this.f330442c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        m mVar = this.f330442c;
                        Y41.l<? super Integer, G0> lVar = mVar.f330460s;
                        if (lVar != null) {
                            lVar.invoke(Integer.valueOf(mVar.getAdapterPosition()));
                            break;
                        }
                        break;
                    default:
                        m mVar2 = this.f330442c;
                        if (mVar2.f330458q.isChecked()) {
                            AnimationView animationView2 = mVar2.f330456o;
                            D6.H(animationView2);
                            animationView2.d();
                        }
                        Y41.a<G0> aVar = mVar2.f330464w;
                        if (aVar != null) {
                            aVar.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        animationView.setRepeatMode(AnimationView.RepeatMode.f178282c);
        animationView.setAnimationData(new AnimationView.a.d(com.avito.android.lib.util.darkTheme.c.a(animationView.getContext()) ? R.raw.paws_animation_dark : R.raw.paws_animation_light, null, 2, null));
        D6.w(animationView);
    }

    @Override // com.avito.android.widget_filters.ui.items.guests.k
    public final void A70(@Y61.k List<NP0.f> list) {
        LinearLayout linearLayout = this.f330455n;
        linearLayout.removeAllViews();
        for (NP0.f fVar : list) {
            View viewInflate = LayoutInflater.from(this.f330443b).inflate(R.layout.widget_filters_guests_widget_child_item, (ViewGroup) linearLayout, false);
            TextView textView = (TextView) viewInflate.findViewById(R.id.guests_widget_child_title);
            I5.a(textView, fVar.f11442b.k0(textView.getContext()), false);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.guests_widget_child_description);
            PrintableText printableText = fVar.f11443c;
            I5.a(textView2, printableText != null ? printableText.k0(textView2.getContext()) : null, false);
            ((ImageView) viewInflate.findViewById(R.id.guests_widget_child_remove_btn)).setOnClickListener(new o(6, this, fVar));
            linearLayout.addView(viewInflate);
        }
    }

    @Override // com.avito.android.widget_filters.ui.items.guests.k
    public final void Bk(@Y61.k Y41.l<? super Integer, G0> lVar) {
        this.f330461t = lVar;
    }

    @Override // com.avito.android.widget_filters.ui.items.guests.k
    public final void Bl(int i12) {
        this.f330451j.setMaxValue(i12);
    }

    @Override // com.avito.android.widget_filters.ui.items.guests.k
    public final void DB(@Y61.k PrintableText printableText) {
        I5.a(this.f330449h, printableText.k0(this.f330443b), false);
    }

    @Override // com.avito.android.widget_filters.ui.items.guests.k
    public final void DV(int i12) {
        this.f330451j.setMinValue(i12);
    }

    @Override // com.avito.android.widget_filters.ui.items.guests.k
    public final void Iy(@Y61.l com.avito.android.widget_filters.ui.items.guests.a aVar) {
        PrintableText printableText;
        PrintableText printableText2;
        PrintableText printableText3;
        if (aVar != null) {
            Context context = this.f330443b;
            b bVar = aVar.f330399a;
            List listU = C42745f0.U((bVar == null || (printableText3 = bVar.f330402a) == null) ? null : printableText3.k0(context), (bVar == null || (printableText2 = bVar.f330403b) == null) ? null : printableText2.k0(context), (bVar == null || (printableText = bVar.f330404c) == null) ? null : printableText.k0(context));
            ArrayList arrayList = new ArrayList();
            for (Object obj : listU) {
                String str = (String) obj;
                if (str != null && str.length() != 0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = !arrayList.isEmpty() ? arrayList : null;
            String str2 = aVar.f330400b;
            String strO = arrayList2 != null ? C42745f0.O(arrayList2, ", ", null, null, null, 62) : str2;
            boolean z12 = aVar.f330401c;
            if (strO != null && strO.length() != 0 && !z12) {
                str2 = strO;
            }
            int iD2 = C35835l0.d(z12 ? R.attr.gray54 : R.attr.black, context);
            TextView textView = this.f330446e;
            textView.setTextColor(iD2);
            I5.a(textView, str2, false);
        }
    }

    @Override // com.avito.android.widget_filters.ui.items.guests.k
    public final void Kq(@Y61.k Y41.l<? super NP0.a, G0> lVar) {
        this.f330462u = lVar;
    }

    @Override // com.avito.android.widget_filters.ui.items.guests.k
    public final void Vf(@Y61.k PrintableText printableText) {
        I5.a(this.f330452k, printableText.k0(this.f330443b), false);
    }

    @Override // com.avito.android.widget_filters.ui.items.guests.k
    public final void W3(boolean z12) {
        D6.G(this.f330444c, !z12);
        D6.G(this.f330447f, z12);
        if (z12) {
            this.f330455n.requestLayout();
        }
    }

    @Override // com.avito.android.widget_filters.ui.items.guests.k
    public final void WA(@Y61.k PrintableText printableText, @Y61.k PrintableText printableText2, @Y61.k List<NP0.a> list, @Y61.l String str) {
        this.f330454m.setOnClickListener(new com.avito.android.advert.item.beduin.v2.favorite.a(this, printableText, printableText2, list, str));
    }

    @Override // com.avito.android.widget_filters.ui.items.guests.k
    public final void Xq(@Y61.l String str) {
        I5.a(this.f330457p, str, false);
    }

    @Override // com.avito.android.widget_filters.ui.items.guests.k
    public final void Xz(@Y61.k Y41.l<? super NP0.f, G0> lVar) {
        this.f330463v = lVar;
    }

    @Override // com.avito.android.widget_filters.ui.items.guests.k
    public final void Y60(@Y61.k Y41.a<G0> aVar) {
        this.f330464w = aVar;
    }

    @Override // com.avito.android.widget_filters.ui.items.guests.k
    public final void Z40(boolean z12) throws Resources.NotFoundException {
        this.f330458q.setChecked(z12);
    }

    @Override // com.avito.android.widget_filters.ui.items.e
    public final void ZD(@Y61.k Y41.l<? super Integer, G0> lVar) {
        this.f330460s = lVar;
    }

    @Override // com.avito.android.widget_filters.ui.items.guests.k
    public final void cI(int i12) {
        this.f330451j.setValue(i12);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f330460s = null;
        this.f330461t = null;
        this.f330462u = null;
        this.f330463v = null;
        this.f330464w = null;
        d dVar = this.f330459r;
        if (dVar != null) {
            dVar.dismiss();
        }
        this.f330459r = null;
    }

    @Override // com.avito.android.widget_filters.ui.items.guests.k
    public final void mG(@Y61.k PrintableText printableText) {
        I5.a(this.f330453l, printableText.k0(this.f330443b), false);
    }

    @Override // com.avito.android.widget_filters.ui.items.guests.k
    public final void p80(boolean z12) {
        this.f330454m.setEnabled(z12);
    }

    @Override // com.avito.android.widget_filters.ui.items.guests.k
    public final void tz(@Y61.k PrintableText printableText) {
        I5.a(this.f330450i, printableText.k0(this.f330443b), false);
    }

    @Override // com.avito.android.widget_filters.ui.items.guests.k
    public final void v2(@Y61.l com.avito.android.widget_filters.ui.items.d dVar) {
        Context context = this.f330443b;
        com.avito.android.widget_filters.utils.e.a(this.f330448g, dVar, context);
        com.avito.android.widget_filters.utils.e.a(this.f330445d, dVar, context);
    }

    @Override // com.avito.android.widget_filters.ui.items.guests.k
    public final void xu(@Y61.k PrintableText printableText) {
        com.avito.android.lib.design.button.b.a(this.f330454m, printableText.k0(this.f330443b), false);
    }
}
