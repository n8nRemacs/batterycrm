package com.avito.android.rating_ui.banner;

import Y61.k;
import Y61.l;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.C35835l0;
import com.google.android.material.shape.q;
import kotlin.Metadata;
import sK0.C48063a;
import wK0.AbstractC49528c;

/* compiled from: RatingBannerItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_ui/banner/h;", "Lcom/avito/android/rating_ui/banner/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f249979b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final FrameLayout f249980c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f249981d;

    public h(@k View view) {
        super(view);
        this.f249979b = view;
        this.f249980c = (FrameLayout) view.findViewById(R.id.rating_banner_container);
        this.f249981d = (TextView) view.findViewById(R.id.rating_banner_text);
    }

    @Override // com.avito.android.rating_ui.banner.g
    public final void D7(@l UniversalColor universalColor) {
        int iD2;
        View view = this.f249979b;
        if (universalColor != null) {
            iD2 = C48063a.f437606a.a(view.getContext(), universalColor);
        } else {
            iD2 = C35835l0.d(R.attr.warmGray4, view.getContext());
        }
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iD2);
        q.b bVarF = new q().f();
        bVarF.c(com.akita.view.foundation.util.f.a(16));
        this.f249980c.setBackground(AbstractC49528c.a.b(AbstractC49528c.f441377b, bVarF.a(), 0, 0, 0, 0, colorStateListValueOf, null, null, null, 478));
    }

    @Override // com.avito.android.rating_ui.banner.g
    public final void setText(@k String str) {
        this.f249981d.setText(str);
    }
}
