package CU0;

import CU0.c;
import CU0.g;
import SU0.m;
import Y61.k;
import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.engine.field.entity.A;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: LegacyDefaultResponseDeserializer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"LCU0/d;", "LSU0/m;", "LCU0/g;", "a", "b", "serializer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes5.dex */
public final class d implements m, g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f2188a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b f2189b = b.f2190a;

    /* compiled from: LegacyDefaultResponseDeserializer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LCU0/d$a;", "", "<init>", "()V", "", "ERROR_STATUS_VALUE", "Ljava/lang/String;", "RAW_BODY_KEY", "serializer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: LegacyDefaultResponseDeserializer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCU0/d$b;", "LSU0/m$a;", "<init>", "()V", "serializer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements m.a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f2190a = new b();
    }

    static {
        new a(null);
    }

    public d(@k PU0.b bVar) {
        this.f2188a = P0.g(new Q("application/json", new c(c.b.f2187a, new com.avito.beduin.v2.serialization.json.b(bVar))), new Q("text/plain", e.f2191a));
    }

    @k
    public final com.avito.beduin.v2.engine.field.d a(@k Exception exc, @k C36272i c36272i) {
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        A a12 = new A(new com.avito.beduin.v2.engine.field.m((Q<String, ? extends com.avito.beduin.v2.engine.field.d>[]) new Q[]{new Q("rawBody", c36272i.e(message))}), null, 2, null);
        this.f2189b.getClass();
        return g.b.a(a12, "error", c36272i);
    }
}
