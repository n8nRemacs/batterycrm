package R31;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PluginName.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LR31/a;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "a", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class a extends AbstractCoroutineContextElement {

    /* compiled from: PluginName.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LR31/a$a;", "Lkotlin/coroutines/CoroutineContext$Key;", "LR31/a;", "<init>", "()V", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: R31.a$a, reason: collision with other inner class name */
    public static final class C0939a implements CoroutineContext.Key<a> {
        public /* synthetic */ C0939a(C42822w c42822w) {
            this();
        }

        public C0939a() {
        }
    }

    static {
        new C0939a(null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        ((a) obj).getClass();
        return L.f(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    @k
    public final String toString() {
        return "PluginName(null)";
    }
}
