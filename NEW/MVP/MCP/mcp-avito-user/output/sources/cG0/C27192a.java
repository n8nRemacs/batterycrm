package cg0;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PushReceivedEvent2617.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcg0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "a", "_avito_push_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cg0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C27192a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Map<String, String> f58088b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f58089c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f58090d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f58091e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f58092f;

    /* compiled from: PushReceivedEvent2617.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcg0/a$a;", "", "<init>", "()V", "", "ERROR_NOTIFICATIONS_ARE_DISABLED", "Ljava/lang/String;", "ERROR_NOTIFICATION_CHANNEL_DEFAULT_IS_DISABLED", "ERROR_NOTIFICATION_CHANNEL_MESSENGER_IS_DISABLED", "_avito_push_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cg0.a$a, reason: collision with other inner class name */
    public static final class C2056a {
        public /* synthetic */ C2056a(C42822w c42822w) {
            this();
        }

        public C2056a() {
        }
    }

    static {
        new C2056a(null);
    }

    public C27192a(@k Map<String, String> map, @k String str, @l String str2, boolean z12) {
        this.f58088b = map;
        this.f58089c = str;
        this.f58090d = str2;
        this.f58091e = z12;
        LinkedHashMap linkedHashMapW = c.w("notification_provider", str);
        linkedHashMapW.put("app_is_closed", Boolean.valueOf(!z12));
        if (str2 != null) {
            linkedHashMapW.put("errors_detailed", str2);
        }
        linkedHashMapW.putAll(map);
        G0 g02 = G0.f406611a;
        this.f58092f = new ParametrizedClickStreamEvent(2617, 17, linkedHashMapW, null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27192a)) {
            return false;
        }
        C27192a c27192a = (C27192a) obj;
        return L.f(this.f58088b, c27192a.f58088b) && L.f(this.f58089c, c27192a.f58089c) && L.f(this.f58090d, c27192a.f58090d) && this.f58091e == c27192a.f58091e;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f58092f.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f58092f.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f58092f.f90248c;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f58088b.hashCode() * 31, 31, this.f58089c);
        String str = this.f58090d;
        return Boolean.hashCode(this.f58091e) + ((iD2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PushReceivedEvent2617(mapParams=");
        sb2.append(this.f58088b);
        sb2.append(", pushProvider=");
        sb2.append(this.f58089c);
        sb2.append(", errorsDetailed=");
        sb2.append(this.f58090d);
        sb2.append(", isAppForeground=");
        return r.x(sb2, this.f58091e, ')');
    }

    public /* synthetic */ C27192a(Map map, String str, String str2, boolean z12, int i12, C42822w c42822w) {
        this(map, str, (i12 & 4) != 0 ? null : str2, z12);
    }
}
