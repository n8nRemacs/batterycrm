package com.avito.android.advertising.ui;

import Y61.l;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.util.layout.ForegroundRelativeLayout;
import com.avito.android.lib.util.layout.RatioForegroundFrameLayout;
import com.avito.android.lib.util.v;
import com.avito.android.util.D6;
import j.InterfaceC42161q;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdViewHolder.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/avito/android/advertising/ui/e;", "Lcom/avito/android/advertising/ui/c;", "Lkotlin/G0;", "applyBorderlessGridPaddings", "()V", "applyBorderlessPaddings", "", "isList", "applyCardBg", "(Z)V", "isBig", "applyCardPaddings", "applyRichPaddings", "", "height", "setMediaViewHeight", "(I)V", "width", "setMediaViewWidth", "setUnifiedTitleSize", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface e extends c {

    /* compiled from: AdViewHolder.kt */
    @s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static void a(@Y61.k e eVar, @InterfaceC42161q int i12) {
            n(eVar, true);
            Resources resources = eVar.getF88600b().getResources();
            ViewGroup viewGroupOd = eVar.getF88605g();
            if (viewGroupOd != null) {
                D6.c(viewGroupOd, null, null, null, Integer.valueOf(resources.getDimensionPixelOffset(R.dimen.ad_card_image_bottom_margin)), 7);
            }
            TextView textViewQs = eVar.getF88606h();
            if (textViewQs != null) {
                D6.c(textViewQs, null, null, null, Integer.valueOf(resources.getDimensionPixelOffset(R.dimen.ad_borderless_title_bottom_margin)), 7);
            }
            ViewGroup viewGroupOd2 = eVar.getF88605g();
            if (viewGroupOd2 != null) {
                v.b(viewGroupOd2, i12);
            }
            ViewGroup viewGroupOd3 = eVar.getF88605g();
            RatioForegroundFrameLayout ratioForegroundFrameLayout = viewGroupOd3 instanceof RatioForegroundFrameLayout ? (RatioForegroundFrameLayout) viewGroupOd3 : null;
            if (ratioForegroundFrameLayout != null) {
                ratioForegroundFrameLayout.setRatio(1.5f);
            }
        }

        public static void c(@Y61.k e eVar) throws Resources.NotFoundException {
            n(eVar, false);
            e(eVar, false);
            f(eVar, true);
            ViewGroup viewGroupOd = eVar.getF88605g();
            RatioForegroundFrameLayout ratioForegroundFrameLayout = viewGroupOd instanceof RatioForegroundFrameLayout ? (RatioForegroundFrameLayout) viewGroupOd : null;
            if (ratioForegroundFrameLayout != null) {
                ratioForegroundFrameLayout.setRatio(1.5f);
            }
        }

        public static void d(@Y61.k e eVar) throws Resources.NotFoundException {
            n(eVar, false);
            Resources resources = eVar.getF88600b().getResources();
            ViewGroup viewGroupOd = eVar.getF88605g();
            if (viewGroupOd != null) {
                D6.c(viewGroupOd, null, null, null, Integer.valueOf(resources.getDimensionPixelOffset(R.dimen.ad_card_image_bottom_margin)), 7);
            }
            int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.ad_borderless_grid_content_vertical_margin);
            int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.ad_borderless_grid_content_horizontal_margin);
            TextView textViewQs = eVar.getF88606h();
            if (textViewQs != null) {
                D6.c(textViewQs, Integer.valueOf(dimensionPixelOffset2), null, Integer.valueOf(dimensionPixelOffset2), null, 10);
            }
            TextView textViewQw = eVar.getF88607i();
            if (textViewQw != null) {
                D6.c(textViewQw, Integer.valueOf(dimensionPixelOffset2), Integer.valueOf(dimensionPixelOffset), Integer.valueOf(dimensionPixelOffset2), null, 8);
            }
            TextView callToActionView = eVar.getF6596j();
            if (callToActionView != null) {
                D6.c(callToActionView, Integer.valueOf(dimensionPixelOffset2), Integer.valueOf(dimensionPixelOffset), Integer.valueOf(dimensionPixelOffset2), null, 8);
            }
            ViewGroup viewGroupOd2 = eVar.getF88605g();
            if (viewGroupOd2 != null) {
                v.b(viewGroupOd2, R.dimen.ad_borderless_grid_image_radius);
            }
            int dimensionPixelOffset3 = eVar.getF88600b().getResources().getDimensionPixelOffset(R.dimen.serp_card_image_height);
            ViewGroup viewGroupOd3 = eVar.getF88605g();
            ViewGroup.LayoutParams layoutParams = viewGroupOd3 != null ? viewGroupOd3.getLayoutParams() : null;
            if (layoutParams == null) {
                return;
            }
            layoutParams.height = dimensionPixelOffset3;
        }

        public static void e(e eVar, boolean z12) {
            ViewGroup viewGroupT1 = eVar.getF88604f();
            ViewGroup viewGroupOd = eVar.getF88605g();
            ForegroundRelativeLayout foregroundRelativeLayout = null;
            RatioForegroundFrameLayout ratioForegroundFrameLayout = viewGroupOd instanceof RatioForegroundFrameLayout ? (RatioForegroundFrameLayout) viewGroupOd : null;
            if (ratioForegroundFrameLayout != null) {
                h hVar = h.f88704a;
                View view = eVar.getF88600b();
                if (z12 && (viewGroupT1 instanceof ForegroundRelativeLayout)) {
                    foregroundRelativeLayout = (ForegroundRelativeLayout) viewGroupT1;
                }
                hVar.getClass();
                h.i(z12, view, ratioForegroundFrameLayout, foregroundRelativeLayout);
            }
        }

        public static void f(e eVar, boolean z12) throws Resources.NotFoundException {
            Resources resources = eVar.getF88600b().getResources();
            ViewGroup viewGroupOd = eVar.getF88605g();
            if (viewGroupOd != null) {
                D6.c(viewGroupOd, null, null, null, Integer.valueOf(resources.getDimensionPixelOffset(z12 ? R.dimen.ad_card_big_image_bottom_margin : R.dimen.ad_card_image_bottom_margin)), 7);
            }
            int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.ad_card_title_horizontal_margin);
            TextView textViewQs = eVar.getF88606h();
            if (textViewQs != null) {
                D6.c(textViewQs, Integer.valueOf(dimensionPixelOffset), null, Integer.valueOf(dimensionPixelOffset), null, 10);
            }
            TextView textViewQw = eVar.getF88607i();
            if (textViewQw != null) {
                D6.c(textViewQw, Integer.valueOf(dimensionPixelOffset), null, Integer.valueOf(dimensionPixelOffset), null, 10);
            }
            TextView callToActionView = eVar.getF6596j();
            if (callToActionView != null) {
                D6.c(callToActionView, Integer.valueOf(dimensionPixelOffset), null, Integer.valueOf(dimensionPixelOffset), null, 10);
            }
        }

        public static void g(@Y61.k e eVar) throws Resources.NotFoundException {
            n(eVar, false);
            e(eVar, true);
            int dimensionPixelOffset = eVar.getF88600b().getResources().getDimensionPixelOffset(R.dimen.list_serp_image_width);
            ViewGroup viewGroupOd = eVar.getF88605g();
            ViewGroup.LayoutParams layoutParams = viewGroupOd != null ? viewGroupOd.getLayoutParams() : null;
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = dimensionPixelOffset;
        }

        public static void h(@Y61.k e eVar) throws Resources.NotFoundException {
            float f12 = eVar.getF88600b().getResources().getConfiguration().orientation == 2 ? 0.32f : 0.56f;
            int dimensionPixelOffset = eVar.getF88600b().getResources().getDimensionPixelOffset(R.dimen.rich_snippet_commercial_padding_top);
            int dimensionPixelOffset2 = eVar.getF88600b().getResources().getDimensionPixelOffset(R.dimen.ad_rich_bottom_padding);
            int dimensionPixelOffset3 = eVar.getF88600b().getResources().getDimensionPixelOffset(R.dimen.rich_snippet_padding_left);
            int dimensionPixelOffset4 = eVar.getF88600b().getResources().getDimensionPixelOffset(R.dimen.serp_gallery_padding);
            eVar.getF88600b().setPadding(dimensionPixelOffset3, dimensionPixelOffset, dimensionPixelOffset3, dimensionPixelOffset2);
            int paddingLeft = (int) (((eVar.getF88600b().getResources().getDisplayMetrics().widthPixels - eVar.getF88600b().getPaddingLeft()) - (eVar.getF88600b().getPaddingRight() - dimensionPixelOffset4)) * f12);
            ViewGroup viewGroupOd = eVar.getF88605g();
            ViewGroup.LayoutParams layoutParams = viewGroupOd != null ? viewGroupOd.getLayoutParams() : null;
            if (layoutParams != null) {
                layoutParams.height = paddingLeft;
            }
            eVar.e20(R.dimen.serp_gallery_item_radius);
            ViewGroup viewGroupOd2 = eVar.getF88605g();
            if (viewGroupOd2 != null) {
                D6.c(viewGroupOd2, null, null, null, Integer.valueOf(eVar.getF88600b().getResources().getDimensionPixelOffset(R.dimen.ad_image_bottom_margin)), 7);
            }
            TextView textViewQw = eVar.getF88607i();
            if (textViewQw != null) {
                D6.c(textViewQw, null, Integer.valueOf(eVar.getF88600b().getResources().getDimensionPixelOffset(R.dimen.ad_description_top_margin)), null, null, 13);
            }
            n(eVar, true);
        }

        public static void i(@Y61.k e eVar) throws Resources.NotFoundException {
            n(eVar, false);
            e(eVar, false);
            f(eVar, false);
            int dimensionPixelOffset = eVar.getF88600b().getResources().getDimensionPixelOffset(R.dimen.serp_card_image_height);
            ViewGroup viewGroupOd = eVar.getF88605g();
            ViewGroup.LayoutParams layoutParams = viewGroupOd != null ? viewGroupOd.getLayoutParams() : null;
            if (layoutParams == null) {
                return;
            }
            layoutParams.height = dimensionPixelOffset;
        }

        public static void j(@Y61.k e eVar, boolean z12, boolean z13) {
            TextView callToActionView = eVar.getF6596j();
            if (callToActionView == null) {
                return;
            }
            h.f88704a.getClass();
            h.h(callToActionView, z12);
            Resources resources = callToActionView.getResources();
            D6.c(callToActionView, null, Integer.valueOf(resources.getDimensionPixelOffset(z12 ? R.dimen.ad_install_button_top_margin : R.dimen.ad_call_to_action_top_margin)), null, Integer.valueOf(resources.getDimensionPixelOffset(z12 ? R.dimen.ad_install_button_bottom_margin : R.dimen.ad_call_to_action_bottom_margin) + (z13 ? resources.getDimensionPixelOffset(R.dimen.ad_card_bottom_padding) : 0)), 5);
        }

        public static void k(@l TextView textView, @l String str, @l String str2) {
            if (textView == null) {
                return;
            }
            boolean z12 = str == null || str.length() == 0;
            D6.G(textView, !z12);
            if (z12) {
                return;
            }
            textView.setText(h.d(h.f88704a, textView.getResources(), str, str2, 8));
        }

        public static void l(@Y61.k e eVar, @InterfaceC42161q int i12) {
            View viewUC = eVar.uC();
            if (viewUC != null) {
                v.a(viewUC, eVar.getF88600b().getResources().getDimension(i12));
            }
        }

        public static void m(@Y61.k e eVar, boolean z12) {
            D6.G(eVar.uC(), z12);
            TextView textViewWV = eVar.getF6601o();
            if (textViewWV != null) {
                D6.c(textViewWV, null, null, Integer.valueOf(textViewWV.getContext().getResources().getDimensionPixelOffset(z12 ? R.dimen.ad_with_icon_domain_right_margin : R.dimen.ad_domain_right_margin)), null, 11);
            }
        }

        public static void n(e eVar, boolean z12) {
            TextView textViewQs = eVar.getF88606h();
            if (textViewQs == null) {
                return;
            }
            h.f88704a.getClass();
            h.j(textViewQs, z12);
        }
    }

    void Ex(boolean z12, boolean z13);

    void H60(@InterfaceC42161q int i12);

    void Kw(@InterfaceC42161q int i12);

    void Oc(@l String str);

    @l
    /* renamed from: Qw */
    TextView getF88607i();

    @l
    /* renamed from: T1 */
    ViewGroup getF88604f();

    void e20(@InterfaceC42161q int i12);

    void f20(@l TextView textView, @l String str);

    void fu(boolean z12);

    @l
    /* renamed from: getCallToActionView */
    TextView getF6596j();

    @Y61.k
    /* renamed from: getView */
    View getF88600b();

    void h(@l String str);

    void j00(float f12);

    @l
    /* renamed from: j70 */
    ViewGroup getF7319x();

    @l
    /* renamed from: od */
    ViewGroup getF88605g();

    @l
    ImageView pi();

    @l
    /* renamed from: qs */
    TextView getF88606h();

    void setTitle(@l String str);

    @l
    View uC();

    @l
    /* renamed from: wV */
    TextView getF6601o();

    void y9(@l Uri uri);
}
