package CU0;

import SU0.m;
import Y61.k;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: DefaultResponseDeserializer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LCU0/b;", "LSU0/m;", "a", "serializer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements m {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f2183b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f2184a;

    /* compiled from: DefaultResponseDeserializer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCU0/b$a;", "", "<init>", "()V", "serializer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b() {
        throw null;
    }

    public b(@k PU0.b bVar) {
        f2183b.getClass();
        this.f2184a = P0.g(new Q("application/json", new CU0.a(new com.avito.beduin.v2.serialization.json.b(bVar))), new Q("text/plain", f.f2192a));
    }
}
