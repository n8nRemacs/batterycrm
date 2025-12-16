package com.avito.android.search.filter.adapter.inline_multiselect;

import Y41.p;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.Badge;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: InlineMultiselectItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/adapter/inline_multiselect/n;", "Lcom/avito/android/search/filter/adapter/inline_multiselect/k;", "Lcom/avito/konveyor/adapter/b;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f262381i = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f262382b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f262383c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f262384d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ImageView f262385e;

    /* renamed from: f, reason: collision with root package name */
    public final LayoutInflater f262386f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f262387g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ArrayList f262388h;

    public n(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f262382b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.header_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f262383c = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f262384d = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.question_badge);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f262385e = (ImageView) viewFindViewById4;
        this.f262386f = LayoutInflater.from(view.getContext());
        com.avito.android.lib.design.tooltip.k kVar = new com.avito.android.lib.design.tooltip.k(view.getContext(), 0, 0, 6, null);
        r.a aVar = new r.a(new i.c(new b.C5327b()));
        View viewFindViewById5 = view.findViewById(R.id.inline_filters_hint_text);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f262387g = (TextView) viewFindViewById5;
        this.f262388h = new ArrayList();
        int i12 = kVar.f181229o;
        kVar.f181228n = -2;
        kVar.f181229o = i12;
        kVar.f181224j = aVar;
    }

    @Override // com.avito.android.search.filter.adapter.inline_multiselect.k
    public final void B6(@Y61.k String str, @Y61.k Badge badge) {
        com.avito.android.lib.design.badge.e.a(this.f262382b, str, badge.getTitle(), " ", R.style.Re23_Badge_TextRedS, badge.getTitleColor(), badge.getBackgroundColor());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.search.filter.adapter.inline_multiselect.k
    public final void Jx(@Y61.k p pVar, @Y61.k List list) {
        Image imageQ;
        ArrayList arrayList = this.f262388h;
        if (arrayList.size() != list.size()) {
            arrayList.clear();
            LinearLayout linearLayout = this.f262384d;
            linearLayout.removeAllViews();
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                View viewInflate = this.f262386f.inflate(R.layout.filters_checkbox, (ViewGroup) null);
                linearLayout.addView(viewInflate);
                arrayList.add(new com.avito.android.search.filter.adapter.checkbox.j(viewInflate));
            }
        }
        Iterator it = C42745f0.T0(list, arrayList).iterator();
        while (it.hasNext()) {
            Q q12 = (Q) it.next();
            Cp0.e eVar = (Cp0.e) q12.f406619b;
            com.avito.android.search.filter.adapter.checkbox.i iVar = (com.avito.android.search.filter.adapter.checkbox.i) q12.f406620c;
            UniversalImage universalImage = eVar.f2707l;
            if (universalImage == null || (imageQ = com.avito.android.actions_sheet.a.q(this.itemView, universalImage)) == null) {
                imageQ = eVar.f2706k;
            }
            iVar.S1(l.f262378l);
            iVar.setText(eVar.f2698c);
            iVar.setChecked(eVar.f2700e);
            iVar.c3(!eVar.f2705j);
            iVar.S1(new m(pVar, eVar));
            iVar.dn(imageQ, eVar.f2708m);
        }
    }

    @Override // com.avito.android.search.filter.adapter.inline_multiselect.k
    public final void K0(@Y61.k String str, boolean z12) {
        D6.G(this.f262383c, !C43066x.K(str));
        TextView textView = this.f262382b;
        textView.setEnabled(z12);
        I5.a(textView, str, false);
    }

    @Override // com.avito.android.search.filter.adapter.inline_multiselect.k
    public final void Vr(@Y61.l Y41.a aVar, boolean z12) {
        ImageView imageView = this.f262385e;
        if (z12) {
            imageView.setOnClickListener(new com.avito.android.saved_searches.presentation.items.switcher.l(14, aVar));
            D6.H(imageView);
        } else {
            imageView.setOnClickListener(null);
            D6.w(imageView);
        }
    }

    @Override // com.avito.android.search.filter.adapter.inline_multiselect.k
    public final void fn(@Y61.l String str, @Y61.k Y41.l<? super View, G0> lVar) {
        if (str == null) {
            str = "";
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        TextView textView = this.f262387g;
        I5.a(textView, spannableString, false);
        textView.setOnClickListener(new com.avito.android.profile_settings_extended.adapter.phones.l(lVar));
    }
}
