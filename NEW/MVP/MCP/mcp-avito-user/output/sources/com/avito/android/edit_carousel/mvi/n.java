package com.avito.android.edit_carousel.mvi;

import com.avito.android.edit_carousel.entity.CarouselEditorData;
import com.avito.android.profile_settings_extended.entity.CarouselEditorSettings;
import com.avito.android.profile_settings_extended.entity.ExtendedProfileSettingsAdvert;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_profile-management_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class n {
    public static final boolean a(@Y61.k Set<ExtendedProfileSettingsAdvert> set, @Y61.k CarouselEditorData carouselEditorData) {
        int size = set.size();
        CarouselEditorSettings carouselEditorSettings = carouselEditorData.f146379d;
        return size >= carouselEditorSettings.f230260h && set.size() <= carouselEditorSettings.f230261i;
    }
}
