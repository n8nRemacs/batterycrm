package com.avito.android.advert_core.advert;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.job.cv_packages.links.CvPackagesLink;
import kotlin.Metadata;

/* compiled from: AdvertCoreRouter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/advert/b;", "Lcom/avito/android/advert_core/advert/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface b extends com.avito.android.advert_core.advert.a {

    /* compiled from: AdvertCoreRouter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(b bVar, DeepLink deepLink, Bundle bundle, int i12) {
            if ((i12 & 4) != 0) {
                bundle = null;
            }
            bVar.g(bundle, deepLink, null);
        }
    }

    void g(@Y61.l Bundle bundle, @Y61.k DeepLink deepLink, @Y61.l String str);

    void r(@Y61.k CvPackagesLink cvPackagesLink);
}
