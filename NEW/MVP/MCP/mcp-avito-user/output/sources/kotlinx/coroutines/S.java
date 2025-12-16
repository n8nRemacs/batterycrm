package kotlinx.coroutines;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C42822w;

/* compiled from: CoroutineName.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/S;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class S extends AbstractCoroutineContextElement {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f410719c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f410720b;

    /* compiled from: CoroutineName.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/S$a;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/S;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements CoroutineContext.Key<S> {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public S(@Y61.k String str) {
        super(f410719c);
        this.f410720b = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof S) && kotlin.jvm.internal.L.f(this.f410720b, ((S) obj).f410720b);
    }

    public final int hashCode() {
        return this.f410720b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("CoroutineName("), this.f410720b, ')');
    }
}
