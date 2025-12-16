package com.avito.android.serp.adapter.map_banner;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.map_banner.MapBanner;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.screen_map_banner.ScreenMapBannerItem;
import kotlin.Metadata;

/* compiled from: MapBannerItemConverter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/map_banner/d;", "Lcom/avito/android/serp/adapter/map_banner/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements c {

    /* compiled from: MapBannerItemConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f270295a;

        static {
            int[] iArr = new int[MapBanner.MapBannerStyle.values().length];
            try {
                iArr[MapBanner.MapBannerStyle.SCREEN_MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f270295a = iArr;
        }
    }

    @Override // com.avito.android.serp.adapter.map_banner.c
    @k
    public final PersistableSerpItem a(@k MapBanner mapBanner) {
        MapBanner.MapBannerStyle style = mapBanner.getStyle();
        if ((style == null ? -1 : a.f270295a[style.ordinal()]) == 1) {
            return new ScreenMapBannerItem(6, null, mapBanner.getDeepLink(), mapBanner.getImage(), 2, null);
        }
        return new MapBannerItem(6, null, mapBanner.getButtonText(), mapBanner.getDeepLink(), mapBanner.getTitle(), mapBanner.getImage(), 2, null);
    }
}
