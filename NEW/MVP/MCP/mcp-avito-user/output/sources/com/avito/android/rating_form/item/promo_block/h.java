package com.avito.android.rating_form.item.promo_block;

import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35821j2;
import com.avito.android.util.C35835l0;
import com.avito.android.util.V0;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PromoBlockItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/item/promo_block/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/rating_form/item/promo_block/g;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f248576b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f248577c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f248578d;

    public h(@k View view) {
        super(view);
        this.f248576b = view;
        this.f248577c = (SimpleDraweeView) view.findViewById(R.id.rating_form_promo_block_icon);
        TextView textView = (TextView) view.findViewById(R.id.rating_form_promo_block_text);
        this.f248578d = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.rating_form.item.promo_block.g
    public final void Z(@l String str) {
        Integer numA;
        View view = this.f248576b;
        Drawable drawableH = (str == null || (numA = q.a(str)) == null) ? null : C35835l0.h(numA.intValue(), view.getContext());
        if (drawableH != null) {
            V0.a(drawableH, C35835l0.d(R.attr.black, view.getContext()));
        }
        C35821j2.a(this.f248577c, drawableH);
    }

    @Override // com.avito.android.rating_form.item.promo_block.g
    public final void m0(@l AttributedText attributedText) {
        j.a(this.f248578d, attributedText, null);
    }
}
