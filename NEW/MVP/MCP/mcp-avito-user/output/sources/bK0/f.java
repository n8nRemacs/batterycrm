package Bk0;

import Y61.k;
import Y61.l;
import cg0.C27192a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.notification.K;
import com.avito.android.remote.notification.TrackingInfo;
import com.avito.android.remote.notification.analytics.NotificationEvent;
import com.avito.android.util.C;
import com.avito.android.util.C35755b0;
import com.avito.android.util.V2;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.reflect.n;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* compiled from: PushDeliveryTracker.kt */
@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBk0/f;", "", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC13158a f1670a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<OkHttpClient> f1671b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C f1672c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.notification.features.a f1673d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC28373a f1674e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final h31.e<Gson> f1675f;

    /* compiled from: PushDeliveryTracker.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Bk0/f$a", "Lokhttp3/Callback;", "_avito_notification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Callback {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Map<String, Object> f1677c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f1678d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f1679e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f1680f;

        public a(Map<String, ? extends Object> map, String str, String str2, boolean z12) {
            this.f1677c = map;
            this.f1678d = str;
            this.f1679e = str2;
            this.f1680f = z12;
        }

        @Override // okhttp3.Callback
        public final void onFailure(@k Call call, @k IOException iOException) {
            V2.f318762a.a("PushDeliveryTracker", "Failed to track push delivery", iOException);
            f.this.b(this.f1677c, this.f1678d, this.f1679e, this.f1680f);
        }

        @Override // okhttp3.Callback
        public final void onResponse(@k Call call, @k Response response) {
            if (response.isSuccessful()) {
                V2.f318762a.g("PushDeliveryTracker", "Push delivery successfully tracked");
                return;
            }
            V2.f318762a.d("PushDeliveryTracker", "Failed to track push delivery: httpCode = " + response.code());
            f.this.b(this.f1677c, this.f1678d, this.f1679e, this.f1680f);
        }
    }

    @Inject
    public f(@k InterfaceC13158a interfaceC13158a, @k h31.e<OkHttpClient> eVar, @k C c12, @k com.avito.android.notification.features.a aVar, @k InterfaceC28373a interfaceC28373a, @k h31.e<Gson> eVar2) {
        this.f1670a = interfaceC13158a;
        this.f1671b = eVar;
        this.f1672c = c12;
        this.f1673d = aVar;
        this.f1674e = interfaceC28373a;
        this.f1675f = eVar2;
    }

    public final void a(@k Map<String, ? extends Object> map, @l TrackingInfo trackingInfo, @k String str, @l String str2, boolean z12) {
        com.avito.android.notification.features.a aVar = this.f1673d;
        aVar.getClass();
        n<Object> nVar = com.avito.android.notification.features.a.f207430d[0];
        if (!((Boolean) aVar.f207431b.a().invoke()).booleanValue() || trackingInfo == null) {
            this.f1674e.c(new C27192a(K.a(map), str, str2, z12));
            return;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C35755b0.c(map));
            linkedHashMap.put("notification_provider", str);
            linkedHashMap.put("app_is_closed", Boolean.valueOf(!z12));
            if (str2 != null) {
                linkedHashMap.put("errors_detailed", str2);
            }
            HttpUrl.Builder builderNewBuilder = HttpUrl.INSTANCE.get(trackingInfo.getUrl()).newBuilder();
            this.f1672c.getClass();
            this.f1671b.get().newCall(new Request.Builder().get().addHeader("Accept", "application/json; charset=utf-8").addHeader("Content-Type", "application/json; charset=utf-8").post(RequestBody.Companion.create$default(RequestBody.INSTANCE, this.f1675f.get().l(linkedHashMap), (MediaType) null, 1, (Object) null)).url(builderNewBuilder.addQueryParameter("key", "Aewei8yaf0deeGho4eetos6cohQuoodooy2Ohmie").build()).build()).enqueue(new a(map, str, str2, z12));
        } catch (Throwable th2) {
            V2.f318762a.a("PushDeliveryTracker", "Error during push delivery tracking preparation", th2);
            b(map, str, str2, z12);
        }
    }

    public final void b(Map<String, ? extends Object> map, String str, String str2, boolean z12) {
        this.f1670a.d(NotificationEvent.f254018r);
        com.avito.android.notification.features.a aVar = this.f1673d;
        aVar.getClass();
        n<Object> nVar = com.avito.android.notification.features.a.f207430d[1];
        if (((Boolean) aVar.f207432c.a().invoke()).booleanValue()) {
            this.f1674e.c(new C27192a(K.a(map), str, str2, z12));
        }
    }
}
