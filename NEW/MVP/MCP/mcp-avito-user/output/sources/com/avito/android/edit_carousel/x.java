package com.avito.android.edit_carousel;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile_settings_extended.entity.ExtendedProfileSettingsAdvert;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.extended.ExtendedProfileAdvertModel;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ExtendedProfileAdvertConverter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/edit_carousel/x;", "Lcom/avito/android/edit_carousel/w;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class x implements w {
    @Inject
    public x() {
    }

    @Override // com.avito.android.edit_carousel.w
    @Y61.k
    public final ExtendedProfileSettingsAdvert a(@Y61.k ExtendedProfileAdvertModel extendedProfileAdvertModel) {
        long jMax = Math.max(Duration.between(Instant.ofEpochMilli(System.currentTimeMillis()).minus(1L, (TemporalUnit) ChronoUnit.DAYS), Instant.ofEpochSecond(extendedProfileAdvertModel.getFinishTime())).toDays(), 0L);
        long id2 = extendedProfileAdvertModel.getId();
        String title = extendedProfileAdvertModel.getTitle();
        long favoritesCount = extendedProfileAdvertModel.getFavoritesCount();
        long viewsCount = extendedProfileAdvertModel.getViewsCount();
        String price = extendedProfileAdvertModel.getPrice();
        Image image = extendedProfileAdvertModel.getImage();
        DeepLink deepLink = extendedProfileAdvertModel.getDeepLink();
        String description = extendedProfileAdvertModel.getDescription();
        float expirationPercent = extendedProfileAdvertModel.getExpirationPercent();
        ExtendedProfileSettingsAdvert extendedProfileSettingsAdvert = new ExtendedProfileSettingsAdvert(id2, title, price, image, deepLink, description, new ExtendedProfileSettingsAdvert.Status(extendedProfileAdvertModel.getStatus().getId(), extendedProfileAdvertModel.getStatus().getDescription(), extendedProfileAdvertModel.getStatus().getDisabled()));
        extendedProfileSettingsAdvert.f230274i = viewsCount;
        extendedProfileSettingsAdvert.f230275j = favoritesCount;
        extendedProfileSettingsAdvert.f230276k = jMax;
        extendedProfileSettingsAdvert.f230277l = expirationPercent;
        return extendedProfileSettingsAdvert;
    }
}
