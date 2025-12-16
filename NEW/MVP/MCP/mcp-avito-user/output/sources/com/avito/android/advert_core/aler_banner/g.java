package com.avito.android.advert_core.aler_banner;

import Y61.k;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.lib.design.alert_banner.AlertBanner;
import com.avito.android.remote.model.BannerType;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;

/* compiled from: AlertBannerView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/aler_banner/g;", "Lcom/avito/android/advert_core/aler_banner/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f82745b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AlertBanner f82746c;

    /* compiled from: AlertBannerView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f82747a;

        static {
            int[] iArr = new int[BannerType.values().length];
            try {
                iArr[BannerType.ALERT_TYPE_HAS_PROBLEM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BannerType.ALERT_TYPE_NO_SALES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BannerType.ALERT_TYPE_HIGH_TRAFFIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BannerType.ALERT_TYPE_HOUSEHOLDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f82747a = iArr;
        }
    }

    public g(@k View view) {
        super(view);
        this.f82745b = view;
        this.f82746c = (AlertBanner) view.findViewById(R.id.dc_alert_banner);
    }

    @Override // com.avito.android.advert_core.aler_banner.f
    public final void At(@k BannerType bannerType) {
        int i12 = a.f82747a[bannerType.ordinal()];
        AlertBanner alertBanner = this.f82746c;
        View view = this.f82745b;
        if (i12 == 1) {
            view.setBackgroundTintList(C35835l0.e(R.attr.red100, view.getContext()));
            alertBanner.getContent().b(androidx.core.content.d.getDrawable(view.getContext(), R.drawable.alert_banner_status_error));
            RU.a content = alertBanner.getContent();
            ColorStateList colorStateListE = C35835l0.e(R.attr.red, view.getContext());
            content.f14460h = colorStateListE;
            content.f14461i = true;
            ImageView imageView = content.f14466n;
            if (imageView != null) {
                imageView.setImageTintList(colorStateListE);
                return;
            }
            return;
        }
        if (i12 == 2) {
            view.setBackgroundTintList(C35835l0.e(R.attr.orange50, view.getContext()));
            alertBanner.getContent().b(C35835l0.h(R.attr.ic_time24, view.getContext()));
            RU.a content2 = alertBanner.getContent();
            ColorStateList colorStateListE2 = C35835l0.e(R.attr.orange, view.getContext());
            content2.f14460h = colorStateListE2;
            content2.f14461i = true;
            ImageView imageView2 = content2.f14466n;
            if (imageView2 != null) {
                imageView2.setImageTintList(colorStateListE2);
                return;
            }
            return;
        }
        if (i12 == 3) {
            view.setBackgroundTintList(C35835l0.e(R.attr.green50, view.getContext()));
            alertBanner.getContent().b(androidx.core.content.d.getDrawable(view.getContext(), R.drawable.alert_banner_high_traffic));
            RU.a content3 = alertBanner.getContent();
            ColorStateList colorStateListE3 = C35835l0.e(R.attr.green700, view.getContext());
            content3.f14460h = colorStateListE3;
            content3.f14461i = true;
            ImageView imageView3 = content3.f14466n;
            if (imageView3 != null) {
                imageView3.setImageTintList(colorStateListE3);
                return;
            }
            return;
        }
        if (i12 != 4) {
            return;
        }
        view.setBackgroundTintList(C35835l0.e(R.attr.green50, view.getContext()));
        alertBanner.getContent().b(androidx.core.content.d.getDrawable(view.getContext(), R.drawable.alert_banner_households));
        RU.a content4 = alertBanner.getContent();
        ColorStateList colorStateListE4 = C35835l0.e(R.attr.green700, view.getContext());
        content4.f14460h = colorStateListE4;
        content4.f14461i = true;
        ImageView imageView4 = content4.f14466n;
        if (imageView4 != null) {
            imageView4.setImageTintList(colorStateListE4);
        }
    }

    @Override // com.avito.android.advert_core.aler_banner.f
    public final void setText(@k String str) {
        this.f82746c.getContent().a(str);
    }

    @Override // com.avito.android.advert_core.aler_banner.f
    public final void setTitle(@k String str) {
        this.f82746c.getContent().c(str);
    }
}
