package com.avito.android.advertising.loaders;

import android.net.Uri;
import com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ProfilePromoBanner.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advertising/loaders/D;", "Lcom/avito/android/advertising/b;", "", "getUrlContext", "()Ljava/lang/String;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface D extends com.avito.android.advertising.b {

    /* compiled from: ProfilePromoBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.l
    List<AvitoNetworkBanner.HideReason> D();

    @Y61.l
    /* renamed from: g */
    AvitoNetworkBanner.MarkInfo getF88006h();

    @Y61.k
    /* renamed from: getDescription */
    String getF88001c();

    @Y61.k
    /* renamed from: getImage */
    Uri getF88002d();

    @Y61.k
    /* renamed from: getTitle */
    String getF88000b();

    @Y61.k
    /* renamed from: getUri */
    String getF88003e();

    /* renamed from: isHidden */
    boolean getF88005g();
}
