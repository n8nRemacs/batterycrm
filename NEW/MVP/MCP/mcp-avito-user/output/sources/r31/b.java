package R31;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import io.ktor.util.debug.plugins.PluginTraceElement;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PluginsTrace.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LR31/b;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "a", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class b extends AbstractCoroutineContextElement {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f14098c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<PluginTraceElement> f14099b;

    /* compiled from: PluginsTrace.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LR31/b$a;", "Lkotlin/coroutines/CoroutineContext$Key;", "LR31/b;", "<init>", "()V", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements CoroutineContext.Key<b> {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b() {
        this(null, 1, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && L.f(this.f14099b, ((b) obj).f14099b);
    }

    public final int hashCode() {
        return this.f14099b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("PluginsTrace("), C42745f0.O(this.f14099b, null, null, null, null, 63), ')');
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List list, int i12, C42822w c42822w) {
        super(f14098c);
        list = (i12 & 1) != 0 ? new ArrayList() : list;
        this.f14099b = list;
    }
}
