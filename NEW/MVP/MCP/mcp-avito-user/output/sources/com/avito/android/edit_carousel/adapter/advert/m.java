package com.avito.android.edit_carousel.adapter.advert;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.edit_carousel.adapter.advert.a;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.progress_bar.ProgressBar;
import com.avito.android.lib.design.toggle.Checkbox;
import com.avito.android.lib.design.toggle.State;
import com.avito.android.profile_settings_extended.entity.ExtendedProfileSettingsAdvert;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.text.DecimalFormat;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EditCarouselAdvertItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/edit_carousel/adapter/advert/m;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/edit_carousel/adapter/advert/j;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class m extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f146263p = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f146264b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f146265c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f146266d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f146267e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f146268f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f146269g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ProgressBar f146270h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ImageView f146271i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final TextView f146272j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Button f146273k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f146274l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Checkbox f146275m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final View f146276n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final DecimalFormat f146277o;

    public m(@Y61.k View view) {
        super(view);
        this.f146264b = view;
        View viewFindViewById = view.findViewById(R.id.advert_search_item_price);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f146265c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.advert_search_item_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f146266d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.advert_search_item_status);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f146267e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.advert_search_item_viewed_text);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f146268f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.advert_search_item_favorites_text);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f146269g = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.advert_search_item_progress_bar);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.progress_bar.ProgressBar");
        }
        this.f146270h = (ProgressBar) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.advert_settings_drag_and_drop_icon);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f146271i = (ImageView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.advert_settings_number);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f146272j = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.advert_settings_delete_button);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f146273k = (Button) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.advert_search_item_image);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f146274l = (SimpleDraweeView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.advert_search_item_checkbox);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.toggle.Checkbox");
        }
        this.f146275m = (Checkbox) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.advert_search_advert_inactive_fill);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f146276n = viewFindViewById12;
        this.f146277o = new DecimalFormat("###,###,###");
    }

    public final void B80(ExtendedProfileSettingsAdvert extendedProfileSettingsAdvert) {
        I5.a(this.f146265c, extendedProfileSettingsAdvert.f230269d, false);
        I5.a(this.f146266d, extendedProfileSettingsAdvert.f230268c, false);
        DecimalFormat decimalFormat = this.f146277o;
        I5.a(this.f146268f, decimalFormat.format(extendedProfileSettingsAdvert.f230274i), false);
        I5.a(this.f146269g, decimalFormat.format(extendedProfileSettingsAdvert.f230275j), false);
        C35949t5.c(this.f146274l, com.avito.android.image_loader.b.b(extendedProfileSettingsAdvert.f230270e), null, null, null, 14);
        this.f146270h.setProgress(extendedProfileSettingsAdvert.f230277l);
    }

    @Override // com.avito.android.edit_carousel.adapter.advert.j
    public final void eN(@Y61.k String str) {
        D6.H(this.f146276n);
        TextView textView = this.f146267e;
        textView.setTextColor(C35835l0.d(R.attr.black, textView.getContext()));
        I5.a(textView, str, false);
        ProgressBar progressBar = this.f146270h;
        D6.H(progressBar);
        progressBar.setEmptyColor(C35835l0.d(R.attr.red200, progressBar.getContext()));
        progressBar.setProgress(0.0f);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f146264b.setOnClickListener(null);
        this.f146275m.setOnStateChangedListener(null);
        this.f146273k.setOnClickListener(null);
    }

    @Override // com.avito.android.edit_carousel.adapter.advert.j
    public final void jf(@Y61.k String str) {
        D6.w(this.f146276n);
        TextView textView = this.f146267e;
        textView.setTextColor(C35835l0.d(R.attr.black, textView.getContext()));
        I5.a(textView, str, false);
        ProgressBar progressBar = this.f146270h;
        progressBar.setFillColor(C35835l0.d(R.attr.green, progressBar.getContext()));
        progressBar.setEmptyColor(C35835l0.d(R.attr.green200, progressBar.getContext()));
        D6.H(progressBar);
    }

    @Override // com.avito.android.edit_carousel.adapter.advert.j
    public final void mA(@Y61.k final Y41.l lVar, @Y61.k final a.b bVar, final boolean z12) {
        B80(bVar.f146239b);
        final Checkbox checkbox = this.f146275m;
        checkbox.setOnStateChangedListener(null);
        D6.H(checkbox);
        boolean z13 = bVar.f146241d;
        checkbox.setChecked(z13);
        checkbox.setEnabled(z12 || z13);
        checkbox.setOnStateChangedListener(new JV.b() { // from class: com.avito.android.edit_carousel.adapter.advert.k
            @Override // JV.b
            public final void b(State state) {
                int i12 = m.f146263p;
                ((f) lVar).invoke(Boolean.valueOf(state == State.f181147b));
                if (z12) {
                    return;
                }
                checkbox.setEnabled(false);
            }
        });
        this.f146264b.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.edit_carousel.adapter.advert.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = m.f146263p;
                boolean z14 = bVar.f146241d;
                if (z12 || z14) {
                    lVar.invoke(Boolean.valueOf(!z14));
                }
            }
        });
        D6.G(this.f146273k, false);
        D6.G(this.f146271i, false);
        D6.G(this.f146272j, false);
    }

    @Override // com.avito.android.edit_carousel.adapter.advert.j
    public final void n20(@Y61.k String str) {
        D6.H(this.f146276n);
        TextView textView = this.f146267e;
        textView.setTextColor(C35835l0.d(R.attr.red600, textView.getContext()));
        I5.a(textView, str, false);
        D6.w(this.f146270h);
    }

    @Override // com.avito.android.edit_carousel.adapter.advert.j
    public final void uQ(@Y61.k a.c cVar, @Y61.k Y41.a<G0> aVar) {
        B80(cVar.f146242b);
        Button button = this.f146273k;
        D6.G(button, true);
        D6.G(this.f146271i, true);
        TextView textView = this.f146272j;
        D6.G(textView, true);
        I5.a(textView, String.valueOf(cVar.f146244d), false);
        button.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_table.h(7, aVar));
        D6.w(this.f146275m);
    }
}
