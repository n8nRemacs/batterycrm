package com.avito.android.messenger.channels.adapter.konveyor.notifications_banner;

import android.net.Uri;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35755b0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42770s0;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ChannelsNotificationsBannerRemoteImage.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_messenger_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f187030a = C42727D.c(a.f187031l);

    /* compiled from: ChannelsNotificationsBannerRemoteImage.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/UniversalImage;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<UniversalImage> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f187031l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final UniversalImage invoke() {
            return UniversalImageKt.universalImageOf(v.a(P0.g(new Q("160x160", "https://avito.st/static/ims/195002d4-fe98-4057-8800-4d321a2d9a5c_bell_on_notification_light_160x160.png"), new Q("240x240", "https://avito.st/static/ims/195002d4-fe98-4057-8800-4d321a2d9a5c_bell_on_notification_light_240x240.png"), new Q("320x320", "https://avito.st/static/ims/195002d4-fe98-4057-8800-4d321a2d9a5c_bell_on_notification_light_320x320.png"), new Q("480x480", "https://avito.st/static/ims/195002d4-fe98-4057-8800-4d321a2d9a5c_bell_on_notification_light_480x480.png"), new Q("640x640", "https://avito.st/static/ims/195002d4-fe98-4057-8800-4d321a2d9a5c_bell_on_notification_light_640x640.png"))), v.a(P0.g(new Q("160x160", "https://avito.st/static/ims/195002d4-fe98-4057-8800-4d321a2d9a5c_bell_on_notification_dark_160x160.png"), new Q("240x240", "https://avito.st/static/ims/195002d4-fe98-4057-8800-4d321a2d9a5c_bell_on_notification_dark_240x240.png"), new Q("320x320", "https://avito.st/static/ims/195002d4-fe98-4057-8800-4d321a2d9a5c_bell_on_notification_dark_320x320.png"), new Q("480x480", "https://avito.st/static/ims/195002d4-fe98-4057-8800-4d321a2d9a5c_bell_on_notification_dark_480x480.png"), new Q("640x640", "https://avito.st/static/ims/195002d4-fe98-4057-8800-4d321a2d9a5c_bell_on_notification_dark_640x640.png"))));
        }
    }

    public static final Image a(Map map) {
        Integer numY0;
        C42770s0 c42770s0B = P0.b(map);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = c42770s0B.f406743a.iterator();
        while (true) {
            Size size = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            List listF0 = C43066x.f0((String) entry.getKey(), new String[]{"x"}, 0, 4);
            if (listF0.size() == 2 && (numY0 = C43066x.y0((String) listF0.get(0))) != null) {
                int iIntValue = numY0.intValue();
                Integer numY02 = C43066x.y0((String) listF0.get(1));
                if (numY02 != null) {
                    size = new Size(iIntValue, numY02.intValue());
                }
            }
            linkedHashMap.put(size, Uri.parse((String) entry.getValue()));
        }
        LinkedHashMap linkedHashMapB = C35755b0.b(linkedHashMap);
        if (linkedHashMapB.isEmpty()) {
            return null;
        }
        return new Image(linkedHashMapB);
    }
}
