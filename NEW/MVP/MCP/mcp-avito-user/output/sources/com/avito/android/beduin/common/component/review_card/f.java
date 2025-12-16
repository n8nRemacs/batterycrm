package com.avito.android.beduin.common.component.review_card;

import Y61.k;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.rating.RatingBar;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinReviewCardView.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/component/review_card/f;", "Landroid/widget/LinearLayout;", "Lkotlin/Function0;", "Lkotlin/G0;", "listener", "setExpandClickListener", "(LY41/a;)V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f extends LinearLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f102369h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f102370b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f102371c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f102372d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f102373e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f102374f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final RatingBar f102375g;

    public f(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        LayoutInflater.from(context).inflate(R.layout.beduin_component_review_card, (ViewGroup) this, true);
        setOrientation(1);
        setClipToPadding(false);
        View viewFindViewById = findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f102370b = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f102371c = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.details);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f102372d = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.footerDescription);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f102373e = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.expandView);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f102374f = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.rating);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.rating.RatingBar");
        }
        this.f102375g = (RatingBar) viewFindViewById6;
    }

    public final void setExpandClickListener(@k Y41.a<G0> listener) {
        this.f102374f.setOnClickListener(new com.avito.android.advertising.ui.buzzoola.premium.a(27, listener));
    }
}
