package com.avito.android.onboarding.dialog.view.carousel;

import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.onboarding.AdditionalAction;
import com.avito.android.remote.model.onboarding.UniversalLinearGradientColor;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: OnboardingCarouselItemView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/dialog/view/carousel/c;", "Lcom/avito/android/onboarding/dialog/view/carousel/a;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements com.avito.android.onboarding.dialog.view.carousel.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f208982a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f208983b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<C40.a, G0> f208984c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f208985d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f208986e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f208987f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f208988g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f208989h;

    /* compiled from: OnboardingCarouselItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f208990a;

        static {
            int[] iArr = new int[AdditionalAction.Style.values().length];
            try {
                iArr[AdditionalAction.Style.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdditionalAction.Style.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f208990a = iArr;
        }
    }

    public c(@Y61.k Y41.l lVar, @Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        this.f208982a = view;
        this.f208983b = aVar;
        this.f208984c = lVar;
        Context context = view.getContext();
        this.f208985d = context;
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f208986e = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f208987f = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.description);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f208988g = (TextView) viewFindViewById3;
        this.f208989h = context.getResources().getConfiguration().orientation == 2;
    }

    public final void a(UniversalImage universalImage, List<UniversalLinearGradientColor> list) {
        G0 g02;
        SimpleDraweeView simpleDraweeView = this.f208986e;
        if (universalImage != null) {
            D6.f(this.f208987f, 0, 0, 0, 0, 13);
            com.avito.android.image_loader.a aVarB = com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(this.f208985d)));
            simpleDraweeView.setAspectRatio(1.6f);
            if (list != null) {
                PaintDrawable paintDrawable = new PaintDrawable();
                paintDrawable.setShaderFactory(new d(list, this));
                paintDrawable.setShape(new RectShape());
                ClipDrawable clipDrawable = new ClipDrawable(paintDrawable, 48, 2);
                clipDrawable.setLevel(8120);
                simpleDraweeView.setBackground(clipDrawable);
            }
            C35949t5.c(this.f208986e, aVarB, null, null, null, 14);
            D6.H(simpleDraweeView);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            View view = this.f208982a;
            D6.f(this.f208987f, 0, view.getResources().getDimensionPixelOffset(R.dimen.onboarding_carousel_title_margin_top), view.getResources().getDimensionPixelOffset(R.dimen.onboarding_carousel_cross_width) + this.f208987f.getPaddingRight(), 0, 9);
            D6.w(simpleDraweeView);
        }
    }
}
