package androidx.window.core;

import android.annotation.SuppressLint;
import android.util.Pair;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PredicateAdapter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/window/core/m;", "", "a", "b", "c", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"BanUncheckedReflection"})
/* loaded from: classes10.dex */
public final class m {

    /* compiled from: PredicateAdapter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\"\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/window/core/m$a;", "", "T", "Ljava/lang/reflect/InvocationHandler;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class a<T> implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        @Y61.k
        public final Object invoke(@Y61.k Object obj, @Y61.k Method method, @Y61.l Object[] objArr) {
            if (L.f(method.getName(), "test") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
                kotlin.reflect.e.a(null, objArr[0]);
                throw null;
            }
            if (L.f(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
                return Boolean.valueOf(obj == objArr[0]);
            }
            if (L.f(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
                return Integer.valueOf(hashCode());
            }
            if (L.f(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                return toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }
    }

    /* compiled from: PredicateAdapter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00050\u0004¨\u0006\u0006"}, d2 = {"Landroidx/window/core/m$b;", "", "T", "U", "Landroidx/window/core/m$a;", "Landroid/util/Pair;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b<T, U> extends a<Pair<?, ?>> {
        public final int hashCode() {
            throw null;
        }

        @Y61.k
        public final String toString() {
            throw null;
        }
    }

    /* compiled from: PredicateAdapter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/window/core/m$c;", "", "T", "Landroidx/window/core/m$a;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c<T> extends a<T> {
        public final int hashCode() {
            throw null;
        }

        @Y61.k
        public final String toString() {
            throw null;
        }
    }
}
