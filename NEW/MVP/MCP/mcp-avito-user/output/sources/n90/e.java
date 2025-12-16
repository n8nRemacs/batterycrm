package N90;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: AvitoFinanceCardClickEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LN90/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "a", "b", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f11245b;

    /* compiled from: AvitoFinanceCardClickEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LN90/e$a;", "", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f11246a;

        /* renamed from: b, reason: collision with root package name */
        public final int f11247b;

        public a(int i12, int i13) {
            this.f11246a = i12;
            this.f11247b = i13;
        }
    }

    /* compiled from: AvitoFinanceCardClickEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"LN90/e$b;", "", "<init>", "()V", "", "BLOCK_TYPE_BONUSES", "Ljava/lang/String;", "BLOCK_TYPE_MY_LOANS", "BLOCK_TYPE_TAKE_LOAN", "BLOCK_TYPE_WALLET", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
    }

    public e(@Y61.k String str, @Y61.k String str2, @Y61.k a aVar, int i12, int i13) {
        Q q12 = new Q("session_id", str);
        Q q13 = new Q("block_type", str2);
        StringBuilder sb2 = new StringBuilder("{ \"column\" : ");
        sb2.append(aVar.f11247b);
        sb2.append(", \"row\" : ");
        this.f11245b = new ParametrizedClickStreamEvent(11537, 2, P0.g(q12, q13, new Q("block_position", AK.c.i(aVar.f11246a, " }", sb2)), new Q("screen_height", Integer.valueOf(i12)), new Q("screen_width", Integer.valueOf(i13))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF75431b() {
        return this.f11245b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f11245b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF75432c() {
        return this.f11245b.f90248c;
    }
}
