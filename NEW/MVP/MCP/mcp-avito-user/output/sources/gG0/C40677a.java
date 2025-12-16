package gg0;

import Y61.k;
import Y61.l;
import cc.e;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: DeviceReadyForSendPushTokenEvent8221.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lgg0/a;", "Lcc/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "a", "_avito_push_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gg0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C40677a implements e, com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f396698b;

    /* compiled from: DeviceReadyForSendPushTokenEvent8221.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgg0/a$a;", "", "<init>", "()V", "", "ERROR_NO_REASON_IN_SHORT_TASK", "Ljava/lang/String;", "_avito_push_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gg0.a$a, reason: collision with other inner class name */
    public static final class C11221a {
        public /* synthetic */ C11221a(C42822w c42822w) {
            this();
        }

        public C11221a() {
        }
    }

    static {
        new C11221a(null);
    }

    public C40677a(@l String str, boolean z12, @l String str2) {
        this.f396698b = new ParametrizedClickStreamEvent(8221, 3, C35755b0.c(P0.g(new Q("reason", str), new Q("errors_detailed", str2), new Q("is_voip", Boolean.valueOf(z12)))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f396698b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f396698b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f396698b.f90248c;
    }

    public /* synthetic */ C40677a(String str, boolean z12, String str2, int i12, C42822w c42822w) {
        this(str, z12, (i12 & 4) != 0 ? null : str2);
    }
}
