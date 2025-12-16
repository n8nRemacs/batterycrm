package com.avito.android.remote.model.adverts;

import Y61.k;
import Y61.l;
import com.avito.android.N2;
import com.avito.android.remote.model.feature_teaser.AdvertDetailsFeaturesTeasers;
import com.avito.android.remote.model.feature_teaser.ApartmentFeature;
import java.util.List;
import kotlin.Metadata;
import kotlin.reflect.n;

/* compiled from: MyAdvertDetailsApiExtensions.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/adverts/MyAdvertDetails;", "Lcom/avito/android/N2;", "features", "", "Lcom/avito/android/remote/model/feature_teaser/ApartmentFeature;", "getApartmentFeatures", "(Lcom/avito/android/remote/model/adverts/MyAdvertDetails;Lcom/avito/android/N2;)Ljava/util/List;", "Lcom/avito/android/remote/model/feature_teaser/AdvertDetailsFeaturesTeasers;", "getTeasers", "(Lcom/avito/android/remote/model/adverts/MyAdvertDetails;Lcom/avito/android/N2;)Lcom/avito/android/remote/model/feature_teaser/AdvertDetailsFeaturesTeasers;", "_avito-discouraged_avito-api_user-advert"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MyAdvertDetailsApiExtensionsKt {
    @l
    public static final List<ApartmentFeature> getApartmentFeatures(@k MyAdvertDetails myAdvertDetails, @k N2 n22) {
        n22.getClass();
        n<Object> nVar = N2.f67352m[10];
        if (((Boolean) n22.f67363l.a().invoke()).booleanValue()) {
            return null;
        }
        return myAdvertDetails.getApartmentFeatures$_avito_discouraged_avito_api_user_advert();
    }

    @l
    public static final AdvertDetailsFeaturesTeasers getTeasers(@k MyAdvertDetails myAdvertDetails, @k N2 n22) {
        n22.getClass();
        n<Object> nVar = N2.f67352m[10];
        if (((Boolean) n22.f67363l.a().invoke()).booleanValue()) {
            return null;
        }
        return myAdvertDetails.getTeasers();
    }
}
