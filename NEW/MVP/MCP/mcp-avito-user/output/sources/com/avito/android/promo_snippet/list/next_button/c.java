package com.avito.android.promo_snippet.list.next_button;

import Y41.l;
import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.util.v;
import com.avito.android.profile.pro.impl.screen.item.recommendations.h;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PromoNextButtonItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/promo_snippet/list/next_button/c;", "Lcom/avito/android/promo_snippet/list/next_button/b;", "Lcom/avito/konveyor/adapter/b;", "_avito_gig_promo-snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c extends com.avito.konveyor.adapter.b implements b {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f231747d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f231748b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f231749c;

    public c(@k View view) {
        super(view);
        this.f231748b = view;
        this.f231749c = (TextView) view.findViewById(R.id.promo_snippet_next_button_title);
    }

    @Override // com.avito.android.promo_snippet.list.next_button.b
    public final void iE(@k PromoNextButtonItem promoNextButtonItem, @k l<? super DeepLink, G0> lVar) {
        boolean z12 = promoNextButtonItem.f231742d;
        View view = this.f231748b;
        if (!z12) {
            v.a(view, y6.b(16));
        }
        this.f231749c.setText(promoNextButtonItem.f231740b);
        view.setOnClickListener(new h(14, lVar, promoNextButtonItem));
    }
}
