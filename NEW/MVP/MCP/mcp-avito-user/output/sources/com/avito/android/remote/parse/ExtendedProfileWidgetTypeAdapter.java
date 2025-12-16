package com.avito.android.remote.parse;

import Y61.k;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.extended.BannerWidget;
import com.avito.android.remote.model.extended.BasicInfoV2Widget;
import com.avito.android.remote.model.extended.CarouselEditWidget;
import com.avito.android.remote.model.extended.CountWidget;
import com.avito.android.remote.model.extended.ExtendedSettingsWidget;
import com.avito.android.remote.model.extended.GalleryWidget;
import com.avito.android.remote.model.extended.GeoV2Widget;
import com.avito.android.remote.model.extended.GeoWidget;
import com.avito.android.remote.model.extended.LinkEditWidget;
import com.avito.android.remote.model.extended.PhonesWidget;
import com.avito.android.remote.model.extended.PremiumBannerWidget;
import com.avito.android.remote.model.extended.ProfileBadgesWidget;
import com.avito.android.remote.model.extended.ProfileBannerPrivate;
import com.avito.android.remote.model.extended.ProfileViewPrivate;
import com.avito.android.remote.model.extended.SelectWidget;
import com.avito.android.remote.model.extended.SelectionsWidget;
import com.avito.android.remote.model.extended.TextWidget;
import com.avito.android.remote.model.extended.ToggleWidget;
import com.avito.android.remote.model.extended.UniversalWidget;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapter;
import com.my.tracker.ads.AdFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ExtendedProfileWidgetTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/ExtendedProfileWidgetTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/remote/model/extended/ExtendedSettingsWidget;", "<init>", "()V", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ExtendedProfileWidgetTypeAdapter extends RuntimeTypeAdapter<ExtendedSettingsWidget> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LinkedHashMap f254142a;

    public ExtendedProfileWidgetTypeAdapter() {
        super(null, null, null, 7, null);
        this.f254142a = P0.j(new Q("select", SelectWidget.class), new Q("count", CountWidget.class), new Q("about", TextWidget.class), new Q(AdvertDetailsBlockIdKt.GALLERY_BLOCK, GalleryWidget.class), new Q(AdFormat.BANNER, BannerWidget.class), new Q("premium_banner", PremiumBannerWidget.class), new Q("phones", PhonesWidget.class), new Q("geo", GeoWidget.class), new Q("geo_v2", GeoV2Widget.class), new Q("window_carousel", CarouselEditWidget.class), new Q("toggle", ToggleWidget.class), new Q("personal_link", LinkEditWidget.class), new Q("item_selections", SelectionsWidget.class), new Q("profile_view_private", ProfileViewPrivate.class), new Q("profile_banner_private", ProfileBannerPrivate.class), new Q("profile_badges", ProfileBadgesWidget.class), new Q("basic_info_v2", BasicInfoV2Widget.class), new Q("universal_widget_private", UniversalWidget.class));
    }

    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @k
    public final Map<String, Class<? extends ExtendedSettingsWidget>> getMapping() {
        return this.f254142a;
    }
}
