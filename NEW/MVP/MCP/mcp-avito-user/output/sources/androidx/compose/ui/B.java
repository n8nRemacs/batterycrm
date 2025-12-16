package androidx.compose.ui;

import androidx.annotation.RestrictTo;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.U;

/* compiled from: SessionMutex.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003\u0088\u0001\u0004\u0092\u0001\"\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060\u0005j\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006`\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/B;", "T", "", "a", "currentSessionHolder", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/ui/B$a;", "Landroidx/compose/ui/AtomicReference;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X41.g
@RestrictTo
@q
/* loaded from: classes.dex */
public final class B<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AtomicReference<a<T>> f38810a;

    /* compiled from: SessionMutex.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/B$a;", "T", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final N0 f38811a;

        /* renamed from: b, reason: collision with root package name */
        public final T f38812b;

        public a(@Y61.k N0 n02, T t12) {
            this.f38811a = n02;
            this.f38812b = t12;
        }
    }

    @Y61.l
    public static final T a(AtomicReference<a<T>> atomicReference) {
        a<T> aVar = atomicReference.get();
        if (aVar != null) {
            return aVar.f38812b;
        }
        return null;
    }

    @Y61.l
    public static final Object b(AtomicReference atomicReference, @Y61.k Y41.l lVar, @Y61.k Y41.p pVar, @Y61.k ContinuationImpl continuationImpl) {
        return U.c(new C(lVar, atomicReference, pVar, null), continuationImpl);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof B) {
            return L.f(this.f38810a, ((B) obj).f38810a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38810a.hashCode();
    }

    public final String toString() {
        return "SessionMutex(currentSessionHolder=" + this.f38810a + ')';
    }
}
