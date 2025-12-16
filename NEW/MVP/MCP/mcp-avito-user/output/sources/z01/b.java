package Z01;

import X41.i;
import Y61.k;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.disposables.d;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: mainThread.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"rxbinding_release"}, k = 2, mv = {1, 4, 0})
@i
/* loaded from: classes7.dex */
public final class b {
    @RestrictTo
    public static final boolean a(@k G<?> g12) {
        if (L.f(Looper.myLooper(), Looper.getMainLooper())) {
            return true;
        }
        g12.b(d.E(io.reactivex.rxjava3.internal.functions.a.f401992b));
        g12.onError(new IllegalStateException("Expected to be called on the main thread but was " + Thread.currentThread().getName()));
        return false;
    }
}
