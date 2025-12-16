package androidx.work.impl.utils.futures;

import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.futures.a;
import j.P;

/* compiled from: SettableFuture.java */
@RestrictTo
/* loaded from: classes10.dex */
public final class c<V> extends a<V> {
    public final boolean h(@P V v12) {
        if (v12 == null) {
            v12 = (V) a.f55991h;
        }
        if (!a.f55990g.b(this, null, v12)) {
            return false;
        }
        a.b(this);
        return true;
    }

    public final boolean i(Throwable th2) {
        if (!a.f55990g.b(this, null, new a.d(th2))) {
            return false;
        }
        a.b(this);
        return true;
    }
}
