package com.avito.android.advertising.ui;

import Y61.l;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.rating.RatingBar;
import com.avito.android.util.D6;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.u0;

/* compiled from: AdAdditionalInfoViewHolder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/ui/a;", "", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface a {

    /* compiled from: AdAdditionalInfoViewHolder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advertising.ui.a$a, reason: collision with other inner class name */
    public static final class C2614a {
        public static void a(@Y61.k a aVar, @Y61.k AdStyle adStyle) throws Resources.NotFoundException {
            AdStyle adStyle2;
            if (adStyle == AdStyle.f88539d || adStyle == (adStyle2 = AdStyle.f88540e) || adStyle == AdStyle.f88537b || adStyle == adStyle2) {
                Resources resources = aVar.getView().getResources();
                int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.ad_card_title_horizontal_margin);
                if (adStyle == AdStyle.f88540e || adStyle == AdStyle.f88538c) {
                    int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.ad_borderless_grid_content_horizontal_margin);
                    LinearLayout linearLayoutHh = aVar.getF7306k();
                    if (linearLayoutHh != null) {
                        D6.c(linearLayoutHh, Integer.valueOf(dimensionPixelOffset2), null, Integer.valueOf(dimensionPixelOffset2), null, 10);
                    }
                } else {
                    LinearLayout linearLayoutHh2 = aVar.getF7306k();
                    if (linearLayoutHh2 != null) {
                        D6.c(linearLayoutHh2, Integer.valueOf(dimensionPixelOffset), null, Integer.valueOf(dimensionPixelOffset), null, 10);
                    }
                }
                TextView textViewOX = aVar.getF7309n();
                if (textViewOX != null) {
                    D6.c(textViewOX, null, null, Integer.valueOf(dimensionPixelOffset), null, 11);
                }
            }
        }

        public static void b(@Y61.k a aVar, @l Float f12, @Y61.k AdStyle adStyle) {
            int iOrdinal = adStyle.ordinal();
            aVar.IS((iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) ? 1 : 5, f12);
        }

        public static void c(@Y61.k a aVar, @l String str) {
            TextView textViewSq = aVar.getF7307l();
            if (textViewSq != null) {
                if (str == null || str.length() == 0) {
                    D6.w(textViewSq);
                    return;
                }
                Locale locale = Locale.ROOT;
                String lowerCase = str.toLowerCase(locale);
                String string = textViewSq.getContext().getString(R.string.price_free_rus);
                String string2 = textViewSq.getContext().getString(R.string.price_free_en);
                if (lowerCase.equals(string.toLowerCase(locale)) || lowerCase.equals(string2)) {
                    str = string;
                }
                textViewSq.setText(str);
                D6.H(textViewSq);
            }
        }

        public static void d(@Y61.k a aVar, @l Float f12, int i12) {
            if (f12 == null) {
                D6.w(aVar.getF7308m());
                D6.w(aVar.getF7309n());
                return;
            }
            RatingBar ratingBarIk = aVar.getF7308m();
            if (ratingBarIk != null) {
                ratingBarIk.setNumStars(i12);
                ratingBarIk.setFloatingRatingIsEnabled(true);
                ratingBarIk.setRating(f12.floatValue());
                D6.H(ratingBarIk);
            }
            u0 u0Var = u0.f406856a;
            String str = String.format("%.1f", Arrays.copyOf(new Object[]{f12}, 1));
            TextView textViewOX = aVar.getF7309n();
            if (textViewOX != null) {
                textViewOX.setText(str);
                D6.H(textViewOX);
            }
        }
    }

    /* compiled from: AdAdditionalInfoViewHolder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[AdStyle.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AdStyle adStyle = AdStyle.f88537b;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AdStyle adStyle2 = AdStyle.f88537b;
                iArr[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    void BN(@l Float f12, @Y61.k AdStyle adStyle);

    void IS(int i12, @l Float f12);

    @l
    /* renamed from: Ik */
    RatingBar getF7308m();

    void OB(@Y61.k AdStyle adStyle);

    @Y61.k
    View getView();

    @l
    /* renamed from: hh */
    LinearLayout getF7306k();

    @l
    /* renamed from: oX */
    TextView getF7309n();

    void p(@l String str);

    @l
    /* renamed from: sq */
    TextView getF7307l();
}
