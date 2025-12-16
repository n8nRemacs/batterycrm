package com.avito.android.messenger;

import android.content.Intent;
import com.avito.android.remote.model.messenger.geo.GeoMarker;
import com.avito.android.remote.model.messenger.geo.GeoPoint;
import com.avito.android.remote.model.messenger.geo.MarkersRequest;
import com.avito.android.remote.model.messenger.message.MessageBody;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: MessengerIntentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/F;", "", "_avito_messenger_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface F {

    /* compiled from: MessengerIntentFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ Intent b(F f12, String str, int i12) {
            if ((i12 & 1) != 0) {
                str = null;
            }
            return f12.f(null, str);
        }
    }

    @Y61.k
    Intent a();

    @Y61.k
    Intent b(@Y61.k String str);

    @Y61.k
    Intent c(@Y61.l Integer num, @Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, boolean z12);

    @Y61.k
    Intent d(@Y61.l Long l12, @Y61.l String str, @Y61.l String str2, @Y61.l String str3);

    @Y61.k
    Intent e();

    @Y61.k
    Intent f(@Y61.l Boolean bool, @Y61.l String str);

    @Y61.k
    Intent g(@Y61.k String str, @Y61.k GeoMarker[] geoMarkerArr, @Y61.l MarkersRequest markersRequest, boolean z12);

    @Y61.k
    Intent h(@Y61.k String str, @Y61.k String str2, @Y61.l String str3);

    @Y61.k
    Intent i(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, boolean z12, @Y61.l String str4, @Y61.l String str5, @Y61.l Long l12);

    @Y61.k
    Intent j(int i12);

    @Y61.k
    Intent k(@Y61.k String str, @Y61.l MessageBody.Location location);

    @Y61.k
    Intent l(@Y61.k String str, @Y61.k String str2, @Y61.l GeoPoint geoPoint, @Y61.l GeoPoint geoPoint2);

    @Y61.k
    Intent m(@Y61.l Long l12, @Y61.k String str, @Y61.l String str2);

    @Y61.k
    Intent n(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l Map map);
}
