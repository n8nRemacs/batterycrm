package KX;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ClickSuggestEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LKX/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "a", "_avito_mall_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final C0573a f9503c = new C0573a(null);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f9504b;

    /* compiled from: ClickSuggestEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LKX/a$a;", "", "<init>", "()V", "_avito_mall_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: KX.a$a, reason: collision with other inner class name */
    public static final class C0573a {
        public /* synthetic */ C0573a(C42822w c42822w) {
            this();
        }

        public C0573a() {
        }
    }

    public a() {
        throw null;
    }

    public a(int i12, int i13, Map map, C42822w c42822w) {
        this.f9504b = new ParametrizedClickStreamEvent(i12, i13, map, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF441796b() {
        return this.f9504b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f9504b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF441797c() {
        return this.f9504b.f90248c;
    }
}
