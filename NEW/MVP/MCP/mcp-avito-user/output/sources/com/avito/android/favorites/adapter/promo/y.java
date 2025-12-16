package com.avito.android.favorites.adapter.promo;

import com.avito.android.R;
import com.avito.android.remote.model.vertical_main.PromoStyle;
import j.InterfaceC42150f;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PromoStyleConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorites/adapter/promo/y;", "Lcom/avito/android/favorites/adapter/promo/x;", "<init>", "()V", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class y implements x {

    /* compiled from: PromoStyleConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f156713a;

        static {
            int[] iArr = new int[PromoStyle.values().length];
            try {
                iArr[PromoStyle.WHITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PromoStyle.BLUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PromoStyle.GREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PromoStyle.RED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PromoStyle.ORANGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PromoStyle.BEIGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PromoStyle.VIOLET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PromoStyle.WARMGRAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f156713a = iArr;
        }
    }

    @Inject
    public y() {
    }

    @Override // com.avito.android.favorites.adapter.promo.x
    @InterfaceC42150f
    public final int a(@Y61.k PromoStyle promoStyle) {
        switch (a.f156713a[promoStyle.ordinal()]) {
            case 1:
                return R.attr.bannerWhite;
            case 2:
                return R.attr.bannerBlue;
            case 3:
                return R.attr.bannerGreen;
            case 4:
                return R.attr.bannerRed;
            case 5:
                return R.attr.bannerOrange;
            case 6:
                return R.attr.bannerBeige;
            case 7:
                return R.attr.bannerViolet;
            case 8:
            default:
                return R.attr.bannerWarmgray;
        }
    }
}
