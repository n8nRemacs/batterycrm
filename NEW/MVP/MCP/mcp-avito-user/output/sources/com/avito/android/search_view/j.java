package com.avito.android.search_view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.avito.android.R;
import com.avito.android.inline_filters.dialog.select.ViewOnClickListenerC31042l;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: SavedSearchView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_view/j;", "Lcom/avito/android/search_view/i;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f264553a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f264554b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ProgressBar f264555c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ImageView f264556d;

    public j(@Y61.k View view, @Y61.k Y41.l<? super View, G0> lVar) {
        Context context = view.getContext();
        this.f264553a = context;
        View viewFindViewById = view.findViewById(R.id.fav_container_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        FrameLayout frameLayout = (FrameLayout) viewFindViewById;
        this.f264554b = frameLayout;
        View viewFindViewById2 = view.findViewById(R.id.fav_progress_view);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ProgressBar");
        }
        this.f264555c = (ProgressBar) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.favButton_view);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById3;
        this.f264556d = imageView;
        imageView.setClickable(false);
        frameLayout.setOnClickListener(new ViewOnClickListenerC31042l(29, lVar));
        frameLayout.setBackground(d(ColorStateList.valueOf(C35835l0.d(R.attr.warmGray12, context))));
    }

    @Override // com.avito.android.search_view.i
    public final void a(@Y61.l ColorStateList colorStateList) {
        this.f264554b.setBackground(colorStateList != null ? d(colorStateList) : null);
    }

    @Override // com.avito.android.search_view.i
    public final void b(@Y61.k ColorStateList colorStateList) {
        this.f264556d.setImageTintList(colorStateList);
        this.f264555c.setIndeterminateTintList(colorStateList);
    }

    @Override // com.avito.android.search_view.i
    public final void c() {
        this.f264556d.setTag("save_search_icon_tag");
    }

    public final RippleDrawable d(ColorStateList colorStateList) {
        float[] fArr = new float[8];
        for (int i12 = 0; i12 < 8; i12++) {
            fArr[i12] = y6.b(18);
        }
        RoundRectShape roundRectShape = new RoundRectShape(fArr, null, null);
        int iD2 = C35835l0.d(R.attr.black, this.f264553a);
        ShapeDrawable shapeDrawable = new ShapeDrawable(roundRectShape);
        shapeDrawable.getPaint().setColor(iD2);
        return new RippleDrawable(colorStateList, null, shapeDrawable);
    }

    @Override // com.avito.android.search_view.i
    public final void setIcon(int i12) {
        this.f264556d.setImageDrawable(C43852a.a(this.f264553a, i12));
    }

    @Override // com.avito.android.search_view.i
    public final void setLoading(boolean z12) {
        this.f264555c.setVisibility(z12 ? 0 : 8);
        this.f264556d.setVisibility(z12 ? 8 : 0);
    }

    @Override // com.avito.android.search_view.i
    public final void setVisible(boolean z12) {
        this.f264554b.setVisibility(z12 ? 0 : 8);
    }
}
