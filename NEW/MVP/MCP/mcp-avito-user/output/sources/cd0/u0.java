package Cd0;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import yc.C50213a;

/* compiled from: PublishInputsValidationErrorEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LCd0/u0;", "Lcom/avito/android/analytics/provider/clickstream/a;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class u0 implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C50213a f2472b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f2473c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final List<Integer> f2474d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f2475e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f2476f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f2477g;

    /* compiled from: PublishInputsValidationErrorEvent.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"LCd0/u0$a;", "", "", "id", "name", "message", "rule", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getName", "getMessage", "getRule", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        @com.google.gson.annotations.c("id")
        @Y61.k
        private final String id;

        @com.google.gson.annotations.c("message")
        @Y61.k
        private final String message;

        @com.google.gson.annotations.c("name")
        @Y61.k
        private final String name;

        @com.google.gson.annotations.c("rule")
        @Y61.l
        private final String rule;

        public a(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4) {
            this.id = str;
            this.name = str2;
            this.message = str3;
            this.rule = str4;
        }
    }

    public u0(@Y61.k C50213a c50213a, @Y61.k String str, @Y61.l List<Integer> list, @Y61.l String str2, @Y61.l String str3) {
        this.f2472b = c50213a;
        this.f2473c = str;
        this.f2474d = list;
        this.f2475e = str2;
        this.f2476f = str3;
        this.f2477g = new ParametrizedClickStreamEvent(2712, 5, v0.a(c50213a, str, list, str2, str3), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF222438b() {
        return this.f2477g.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f2477g.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF222439c() {
        return this.f2477g.f90248c;
    }

    @Y61.k
    public final String toString() {
        return "PublishInputsValidationErrorEventV4(eventId = 2712, params = " + v0.a(this.f2472b, this.f2473c, this.f2474d, this.f2475e, this.f2476f) + ")}";
    }
}
