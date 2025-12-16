package com.avito.android.advertising.ui.buzzoola.premium;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Parcelable;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.util.layout.RatioForegroundFrameLayout;
import com.avito.android.lib.util.v;
import com.avito.android.util.D6;
import j.InterfaceC42165v;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdBuzzoolaPremiumV1View.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/ui/buzzoola/premium/i;", "Lcom/avito/android/advertising/ui/buzzoola/c;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface i extends com.avito.android.advertising.ui.buzzoola.c {

    /* compiled from: AdBuzzoolaPremiumV1View.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static void a(q qVar, int i12) throws Resources.NotFoundException {
            int i13 = (i12 & 2) != 0 ? R.dimen.ad_image_corner_radius : R.dimen.ad_borderless_grid_image_radius;
            h hVar = qVar.f88664b;
            hVar.getClass();
            com.avito.android.advertising.ui.h.f88704a.getClass();
            com.avito.android.advertising.ui.h.j(hVar.f88638h, true);
            Resources resources = hVar.f88632b.getResources();
            D6.c(hVar.f88636f, null, null, null, Integer.valueOf(resources.getDimensionPixelOffset(R.dimen.ad_card_image_bottom_margin)), 7);
            int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.premium_ad_text_left_margin);
            D6.c(hVar.f88638h, Integer.valueOf(dimensionPixelOffset), null, null, null, 14);
            D6.c(hVar.f88639i, Integer.valueOf(dimensionPixelOffset), null, null, null, 14);
            D6.c(hVar.f88644n, Integer.valueOf(dimensionPixelOffset), null, null, null, 14);
            RatioForegroundFrameLayout ratioForegroundFrameLayout = hVar.f88636f;
            v.b(ratioForegroundFrameLayout, i13);
            hVar.f88637g.f132066a.getLayoutParams().height = -1;
            ratioForegroundFrameLayout.setRatio(1.5f);
        }
    }

    void H0();

    void H1(@Y61.l Parcelable parcelable);

    void I4(@Y61.l Uri uri);

    void P1(@Y61.l Y41.l<? super Integer, G0> lVar);

    void S3(@Y61.l View.OnClickListener onClickListener);

    void S5(@InterfaceC42165v @Y61.l Integer num);

    void a(@Y61.k Y41.a<G0> aVar);

    void h(@Y61.l String str);

    void hH(@Y61.l String str, boolean z12);

    void jV(@Y61.k ArrayList arrayList, @Y61.l com.avito.android.advertising.adapter.items.buzzoola.premium.legal.a aVar, @Y61.l com.avito.android.advertising.adapter.items.buzzoola.premium.juristic.a aVar2);

    @Y61.l
    Parcelable k2();

    void setTitle(@Y61.k String str);
}
