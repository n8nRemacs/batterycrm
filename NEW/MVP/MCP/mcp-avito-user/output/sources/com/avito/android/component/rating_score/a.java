package com.avito.android.component.rating_score;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.component.rating_score.b;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35852n1;
import com.avito.android.util.D6;
import hw.InterfaceC41177b;
import j.InterfaceC42150f;
import j.InterfaceC42156l;
import kG0.C42580a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: RatingScoreView.kt */
@InterfaceC41177b
@s0
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/component/rating_score/a;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "colorAttr", "Lkotlin/G0;", "setStarColorByAttr", "(I)V", "color", "setStarColor", "setReviewsCountColor", "", "score", "setScore", "(F)V", "setReviewsCountColorByAttr", "", "isVisible", "setRatingVisible", "(Z)V", "setReviewsCountVisible", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends ConstraintLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ContextThemeWrapper f125223b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ImageView f125224c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f125225d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f125226e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Drawable f125227f;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, AttributeSet attributeSet, int i12, C42822w c42822w) {
        attributeSet = (i12 & 2) != 0 ? null : attributeSet;
        super(context, attributeSet);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.Theme_DesignSystem_Re23);
        this.f125223b = contextThemeWrapper;
        LayoutInflater.from(contextThemeWrapper).inflate(R.layout.rating_score_view, (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(R.id.rating_score_view_star);
        this.f125224c = imageView;
        TextView textView = (TextView) findViewById(R.id.rating_score_view_rating);
        this.f125225d = textView;
        TextView textView2 = (TextView) findViewById(R.id.rating_score_view_dot_separator);
        TextView textView3 = (TextView) findViewById(R.id.rating_score_view_reviews_count);
        this.f125226e = textView3;
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(attributeSet, C42580a.o.f406219i);
        b.a aVar = b.f125228c;
        int i13 = typedArrayObtainStyledAttributes.getInt(13, 1);
        aVar.getClass();
        this.f125227f = C43852a.a(contextThemeWrapper, b.values()[i13].f125231b);
        setStarColor(typedArrayObtainStyledAttributes.getColor(12, C35835l0.d(R.attr.orange, contextThemeWrapper)));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(8, C35835l0.j(R.attr.textM20, contextThemeWrapper));
        int color = typedArrayObtainStyledAttributes.getColor(7, C35835l0.d(R.attr.black, contextThemeWrapper));
        textView.setTextAppearance(resourceId);
        textView.setTextColor(color);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(10, C35835l0.j(R.attr.textM20, contextThemeWrapper));
        int color2 = typedArrayObtainStyledAttributes.getColor(9, C35835l0.d(R.attr.black, contextThemeWrapper));
        textView3.setTextAppearance(resourceId2);
        setReviewsCountColor(color2);
        typedArrayObtainStyledAttributes.getBoolean(11, false);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(6, false);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(5, C35835l0.j(R.attr.textM20, contextThemeWrapper));
        int color3 = typedArrayObtainStyledAttributes.getColor(4, C35835l0.d(R.attr.black, contextThemeWrapper));
        textView2.setTextAppearance(resourceId3);
        textView2.setTextColor(color3);
        textView2.setVisibility(z12 ? 0 : 8);
        D6.c(imageView, null, null, Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0)), null, 11);
        if (z12) {
            D6.c(textView2, Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0)), null, Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0)), null, 10);
        } else {
            D6.c(textView, null, null, Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0)), null, 11);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void setReviewsCountColor(@InterfaceC42156l int color) {
        this.f125226e.setTextColor(color);
    }

    private final void setStarColor(@InterfaceC42156l int color) {
        Drawable drawable = this.f125227f;
        if (drawable != null) {
            drawable.setTint(color);
        }
        this.f125224c.setImageDrawable(drawable);
    }

    private final void setStarColorByAttr(@InterfaceC42150f int colorAttr) {
        setStarColor(C35835l0.d(colorAttr, this.f125223b));
    }

    public final void setRatingVisible(boolean isVisible) {
        D6.G(this.f125224c, isVisible);
        D6.G(this.f125225d, isVisible);
    }

    public final void setReviewsCountColorByAttr(@InterfaceC42150f int colorAttr) {
        setReviewsCountColor(C35835l0.d(colorAttr, this.f125223b));
    }

    public final void setReviewsCountVisible(boolean isVisible) {
        D6.G(this.f125226e, isVisible);
    }

    public final void setScore(float score) {
        this.f125225d.setText(C35852n1.a(score));
    }
}
