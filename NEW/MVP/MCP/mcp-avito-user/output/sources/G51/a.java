package G51;

import Y61.k;
import Y61.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.u1;
import org.slf4j.c;

/* compiled from: MDCContext.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0002`\u00040\u00012\u00020\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"LG51/a;", "Lkotlinx/coroutines/u1;", "", "", "Lkotlinx/coroutines/slf4j/MDCContextMap;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "a", "kotlinx-coroutines-slf4j"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class a extends AbstractCoroutineContextElement implements u1<Map<String, ? extends String>> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final C0331a f6353c = new C0331a(null);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Map<String, String> f6354b;

    /* compiled from: MDCContext.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LG51/a$a;", "Lkotlin/coroutines/CoroutineContext$Key;", "LG51/a;", "<init>", "()V", "kotlinx-coroutines-slf4j"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: G51.a$a, reason: collision with other inner class name */
    public static final class C0331a implements CoroutineContext.Key<a> {
        public /* synthetic */ C0331a(C42822w c42822w) {
            this();
        }

        public C0331a() {
        }
    }

    public a() {
        this(null, 1, null);
    }

    @Override // kotlinx.coroutines.u1
    public final Map<String, ? extends String> R(CoroutineContext coroutineContext) {
        Map<String, String> mapC = c.c();
        Map<String, String> map = this.f6354b;
        if (map == null) {
            c.b();
        } else {
            c.d(map);
        }
        return mapC;
    }

    @Override // kotlinx.coroutines.u1
    public final void o(Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            c.b();
        } else {
            c.d(map);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Map map, int i12, C42822w c42822w) {
        super(f6353c);
        map = (i12 & 1) != 0 ? c.c() : map;
        this.f6354b = map;
    }
}
