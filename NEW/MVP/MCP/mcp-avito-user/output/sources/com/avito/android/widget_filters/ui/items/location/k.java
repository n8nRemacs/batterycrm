package com.avito.android.widget_filters.ui.items.location;

import NP0.n;
import NP0.o;
import Y41.p;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.s;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.widget_filters.analytics.LocationSelectMethod;
import com.avito.android.widget_filters.analytics.a;
import com.avito.android.widget_filters.model.SuggestedLocation;
import com.avito.android.widget_filters.ui.items.location.g;
import com.google.android.flexbox.FlexboxLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: WidgetFiltersLocationWidgetView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/widget_filters/ui/items/location/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/widget_filters/ui/items/location/i;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f330507A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f330508B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Boolean, G0> f330509C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final s f330510D;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f330511b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f330512c;

    /* renamed from: d, reason: collision with root package name */
    public final int f330513d;

    /* renamed from: e, reason: collision with root package name */
    public final int f330514e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Drawable f330515f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Drawable f330516g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final View f330517h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f330518i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final TextView f330519j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final View f330520k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final TextView f330521l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Input f330522m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final FlexboxLayout f330523n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f330524o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final ShimmerLayout f330525p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final ScrollView f330526q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f330527r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super String, G0> f330528s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Boolean, G0> f330529t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public p<? super NP0.l, ? super LocationSelectMethod, G0> f330530u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public p<? super NP0.l, ? super LocationSelectMethod, G0> f330531v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super com.avito.android.widget_filters.analytics.a, G0> f330532w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public p<? super n, ? super com.avito.android.widget_filters.analytics.a, G0> f330533x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Integer, G0> f330534y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f330535z;

    /* compiled from: WidgetFiltersLocationWidgetView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            Y41.a<G0> aVar = k.this.f330535z;
            if (aVar != null) {
                aVar.invoke();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: WidgetFiltersLocationWidgetView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[SuggestedLocation.SuggestType.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SuggestedLocation.SuggestType suggestType = SuggestedLocation.SuggestType.f329935c;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: WidgetFiltersLocationWidgetView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<String, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            String str2 = str;
            Y41.l<? super String, G0> lVar = k.this.f330528s;
            if (lVar != null) {
                lVar.invoke(str2);
            }
            return G0.f406611a;
        }
    }

    public k(@Y61.k View view) {
        super(view);
        this.f330511b = view;
        Context context = view.getContext();
        this.f330512c = context;
        this.f330513d = C35835l0.d(R.attr.black, context);
        this.f330514e = C35835l0.d(R.attr.gray48, context);
        Drawable drawableH = C35835l0.h(R.attr.ic_pin16, context);
        this.f330515f = drawableH;
        Drawable drawableH2 = C35835l0.h(R.attr.ic_history16, context);
        this.f330516g = drawableH2;
        int iD2 = C35835l0.d(R.attr.black, context);
        this.f330517h = view.findViewById(R.id.location_widget_collapsed_layout);
        this.f330518i = (TextView) view.findViewById(R.id.widget_collapsed_title_tv);
        this.f330519j = (TextView) view.findViewById(R.id.widget_collapsed_placeholder_tv);
        this.f330520k = view.findViewById(R.id.location_widget_expandable_content);
        this.f330521l = (TextView) view.findViewById(R.id.location_widget_title_tv);
        Input input = (Input) view.findViewById(R.id.location_widget_search_input);
        this.f330522m = input;
        this.f330523n = (FlexboxLayout) view.findViewById(R.id.location_widget_popular_locations_container);
        this.f330524o = (LinearLayout) view.findViewById(R.id.fast_recent_searches_container);
        this.f330525p = (ShimmerLayout) view.findViewById(R.id.location_widget_suggested_locations_skeletons);
        this.f330526q = (ScrollView) view.findViewById(R.id.location_widget_suggested_locations_scroll_view);
        this.f330527r = (LinearLayout) view.findViewById(R.id.location_widget_suggested_locations_container);
        s sVar = new s("", new c());
        this.f330510D = sVar;
        input.setOnFocusChangeListener(new com.avito.android.advert.item.fmp.calculator.l(this, 19));
        input.b(sVar);
        input.setClearButtonListener(new a());
        view.setOnClickListener(new com.avito.android.user_adverts.root_screen.adverts_host.host_view.g(this, 22));
        if (drawableH != null) {
            drawableH.setTint(iD2);
        }
        if (drawableH2 != null) {
            drawableH2.setTint(iD2);
        }
    }

    public final View B80(n nVar, com.avito.android.widget_filters.analytics.a aVar) {
        View viewInflate = LayoutInflater.from(this.f330512c).inflate(R.layout.widget_filters_recent_search_location_item, (ViewGroup) null);
        I5.a((TextView) viewInflate.findViewById(R.id.recent_search_location_name_tv), nVar.f11505a, false);
        I5.a((TextView) viewInflate.findViewById(R.id.recent_search_title_info_tv), nVar.f11506b, false);
        ((ImageView) viewInflate.findViewById(R.id.recent_search_icon)).setImageDrawable(this.f330516g);
        viewInflate.setOnClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.g(this, nVar, aVar, 23));
        return viewInflate;
    }

    @Override // com.avito.android.widget_filters.ui.items.location.i
    public final void BL(boolean z12) {
        D6.G(this.f330523n, z12);
    }

    @Override // com.avito.android.widget_filters.ui.items.location.i
    public final void Ej(@Y61.l String str) {
        this.f330522m.setHint(str);
    }

    @Override // com.avito.android.widget_filters.ui.items.location.i
    public final void HT(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        this.f330509C = lVar;
    }

    @Override // com.avito.android.widget_filters.ui.items.location.i
    public final void I20(@Y61.k p<? super NP0.l, ? super LocationSelectMethod, G0> pVar) {
        this.f330531v = pVar;
    }

    @Override // com.avito.android.widget_filters.ui.items.location.i
    public final void Kh(@Y61.k Y41.a<G0> aVar) {
        this.f330535z = aVar;
    }

    @Override // com.avito.android.widget_filters.ui.items.location.i
    public final void Tx(@Y61.l com.avito.android.widget_filters.ui.items.location.a aVar) {
        if (aVar != null) {
            boolean z12 = aVar.f330469c;
            int iD2 = C35835l0.d(z12 ? R.attr.gray54 : R.attr.black, this.f330512c);
            TextView textView = this.f330519j;
            textView.setTextColor(iD2);
            I5.a(textView, z12 ? aVar.f330468b : aVar.f330467a, false);
        }
    }

    @Override // com.avito.android.widget_filters.ui.items.location.i
    public final void VX(@Y61.k Y41.l<? super com.avito.android.widget_filters.analytics.a, G0> lVar) {
        this.f330532w = lVar;
    }

    @Override // com.avito.android.widget_filters.ui.items.location.i
    public final void W3(boolean z12) {
        if (z12) {
            Y41.a<G0> aVar = this.f330508B;
            if (aVar != null) {
                aVar.invoke();
            }
        } else {
            Y41.a<G0> aVar2 = this.f330507A;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        }
        D6.G(this.f330517h, !z12);
        D6.G(this.f330520k, z12);
    }

    @Override // com.avito.android.widget_filters.ui.items.e
    public final void ZD(@Y61.k Y41.l<? super Integer, G0> lVar) {
        this.f330534y = lVar;
    }

    @Override // com.avito.android.widget_filters.ui.items.location.i
    public final void bf(@Y61.k p<? super n, ? super com.avito.android.widget_filters.analytics.a, G0> pVar) {
        this.f330533x = pVar;
    }

    @Override // com.avito.android.widget_filters.ui.items.location.i
    public final void bm(boolean z12) {
        D6.G(this.f330525p, z12);
    }

    @Override // com.avito.android.widget_filters.ui.items.location.i
    public final void gB(@Y61.k List<n> list) {
        LinearLayout linearLayout = this.f330524o;
        linearLayout.removeAllViews();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            linearLayout.addView(B80((n) it.next(), a.b.f329705a));
        }
    }

    @Override // com.avito.android.widget_filters.ui.items.location.i
    public final void hO(boolean z12) {
        D6.G(this.f330527r, z12);
        D6.G(this.f330526q, z12);
    }

    @Override // com.avito.android.widget_filters.ui.items.location.i
    public final void ic(@Y61.k Y41.a<G0> aVar) {
        this.f330508B = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f330528s = null;
        this.f330529t = null;
        this.f330530u = null;
        this.f330534y = null;
        this.f330535z = null;
        this.f330531v = null;
        this.f330532w = null;
        this.f330533x = null;
        this.f330509C = null;
        this.f330508B = null;
        this.f330507A = null;
        this.f330522m.h(this.f330510D);
    }

    @Override // com.avito.android.widget_filters.ui.items.location.i
    public final void js(boolean z12) {
        View view = this.f330511b;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = z12 ? -1 : -2;
        view.setLayoutParams(layoutParams);
        Y41.l<? super Boolean, G0> lVar = this.f330509C;
        if (lVar != null) {
            ((g.i) lVar).invoke(Boolean.valueOf(z12));
        }
    }

    @Override // com.avito.android.widget_filters.ui.items.location.i
    public final void o0(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        this.f330529t = lVar;
    }

    @Override // com.avito.android.widget_filters.ui.items.location.i
    public final void oy(@Y61.k p<? super NP0.l, ? super LocationSelectMethod, G0> pVar) {
        this.f330530u = pVar;
    }

    @Override // com.avito.android.widget_filters.ui.items.location.i
    public final void p6(@Y61.k Y41.a<G0> aVar) {
        this.f330507A = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.widget_filters.ui.items.location.i
    public final void ph(@Y61.k List<? extends o> list, boolean z12) {
        Y41.l<? super com.avito.android.widget_filters.analytics.a, G0> lVar;
        LinearLayout linearLayout = this.f330527r;
        linearLayout.removeAllViews();
        for (o oVar : list) {
            if (oVar instanceof SuggestedLocation) {
                SuggestedLocation suggestedLocation = (SuggestedLocation) oVar;
                SpannableString spannableString = null;
                View viewInflate = LayoutInflater.from(this.f330512c).inflate(R.layout.widget_filters_suggested_location_item, (ViewGroup) null);
                TextView textView = (TextView) viewInflate.findViewById(R.id.suggested_location_name_tv);
                ImageView imageView = (ImageView) viewInflate.findViewById(R.id.suggested_location_icon);
                String str = suggestedLocation.f329932c;
                if (str.length() <= 0) {
                    str = null;
                }
                Q q12 = str != null ? new Q(str, Integer.valueOf(this.f330513d)) : null;
                String str2 = suggestedLocation.f329933d;
                if (str2.length() <= 0) {
                    str2 = null;
                }
                ArrayList arrayListB = C42756l.B(new Q[]{q12, str2 != null ? new Q(str2, Integer.valueOf(this.f330514e)) : null});
                if (!arrayListB.isEmpty()) {
                    SpannableString spannableString2 = new SpannableString(C42745f0.O(arrayListB, ", ", null, null, l.f330538l, 30));
                    Iterator it = arrayListB.iterator();
                    int i12 = 0;
                    int i13 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i14 = i12 + 1;
                        if (i12 < 0) {
                            C42745f0.H0();
                            throw null;
                        }
                        Q q13 = (Q) next;
                        String str3 = (String) q13.f406619b;
                        int iIntValue = ((Number) q13.f406620c).intValue();
                        int length = str3.length() + i13;
                        spannableString2.setSpan(new ForegroundColorSpan(iIntValue), i13, length, 33);
                        i13 = length + (i12 < arrayListB.size() - 1 ? 2 : 0);
                        i12 = i14;
                    }
                    spannableString = spannableString2;
                }
                I5.a(textView, spannableString, false);
                int iOrdinal = suggestedLocation.f329934e.ordinal();
                if (iOrdinal == 0) {
                    imageView.setImageDrawable(this.f330516g);
                    viewInflate.setOnClickListener(new j(this, suggestedLocation, 1));
                } else if (iOrdinal == 1) {
                    imageView.setImageDrawable(this.f330515f);
                    viewInflate.setOnClickListener(new j(this, suggestedLocation, 0));
                }
                linearLayout.addView(viewInflate);
            } else if (oVar instanceof n) {
                linearLayout.addView(B80((n) oVar, a.C10241a.f329704a));
            }
        }
        if (!z12 || (lVar = this.f330532w) == null) {
            return;
        }
        ((g.e) lVar).invoke(a.C10241a.f329704a);
    }

    @Override // com.avito.android.widget_filters.ui.items.location.i
    public final void tZ(boolean z12) {
        Y41.l<? super com.avito.android.widget_filters.analytics.a, G0> lVar;
        D6.G(this.f330524o, z12);
        if (z12 && this.f330520k.getVisibility() == 0 && (lVar = this.f330532w) != null) {
            lVar.invoke(a.b.f329705a);
        }
    }

    @Override // com.avito.android.widget_filters.ui.items.location.i
    public final void u0(@Y61.l Y41.l<? super String, G0> lVar) {
        this.f330528s = lVar;
    }

    @Override // com.avito.android.widget_filters.ui.items.location.i
    public final void v2(@Y61.l com.avito.android.widget_filters.ui.items.d dVar) {
        Context context = this.f330512c;
        com.avito.android.widget_filters.utils.e.a(this.f330521l, dVar, context);
        com.avito.android.widget_filters.utils.e.a(this.f330518i, dVar, context);
    }

    @Override // com.avito.android.widget_filters.ui.items.location.i
    public final void y0(@Y61.l String str) {
        Input input = this.f330522m;
        if (L.f(input.getDeformattedText(), str)) {
            return;
        }
        Input.t(input, str, false, 4);
    }

    @Override // com.avito.android.widget_filters.ui.items.location.i
    public final void y70(@Y61.k ArrayList arrayList) {
        FlexboxLayout flexboxLayout = this.f330523n;
        flexboxLayout.removeAllViews();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            NP0.l lVar = (NP0.l) it.next();
            View viewInflate = LayoutInflater.from(this.f330512c).inflate(R.layout.widget_filters_popular_location_item, (ViewGroup) null);
            I5.a((TextView) viewInflate.findViewById(R.id.popular_location_name_tv), lVar.f11491b, false);
            viewInflate.setOnClickListener(new j(this, lVar, 2));
            flexboxLayout.addView(viewInflate);
        }
    }
}
