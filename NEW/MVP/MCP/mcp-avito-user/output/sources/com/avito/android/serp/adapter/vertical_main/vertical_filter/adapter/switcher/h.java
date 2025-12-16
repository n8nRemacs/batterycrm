package com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.switcher;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.switcher.Switcher;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VerticalFilterSwitcherItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/adapter/switcher/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/adapter/switcher/g;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f273523b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Switcher f273524c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f273525d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Y41.l<? super Boolean, G0> f273526e;

    public h(@k View view) {
        super(view);
        view.setOnClickListener(new com.avito.android.review_gallery.g(this, 24));
        this.f273523b = view;
        View viewFindViewById = view.findViewById(R.id.switcher);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.switcher.Switcher");
        }
        Switcher switcher = (Switcher) viewFindViewById;
        switcher.setOnCheckedChangeListener(new com.avito.android.advert.item.short_term_rent.payment_toggles.toggle.h(this, 7));
        this.f273524c = switcher;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f273525d = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.switcher.g
    public final void I(boolean z12) {
        this.f273523b.setEnabled(z12);
        this.f273524c.setClickable(z12);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.switcher.g
    public final void K0(@k String str, boolean z12) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (z12) {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append("[pro]", new ImageSpan(this.f273523b.getContext(), R.drawable.badge_pro_16x30, 2), 17);
        }
        I5.a(this.f273525d, spannableStringBuilder, false);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.switcher.g
    public final void MM(@k Y41.l<? super Boolean, G0> lVar) {
        this.f273526e = lVar;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.switcher.g
    public final void Z1(boolean z12) throws Resources.NotFoundException {
        this.f273524c.setChecked(z12);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f273526e = null;
    }
}
