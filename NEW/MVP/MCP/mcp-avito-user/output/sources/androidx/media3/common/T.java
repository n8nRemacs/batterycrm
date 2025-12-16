package androidx.media3.common;

import android.os.Bundle;
import com.google.common.collect.AbstractC37401r1;
import java.util.Collections;
import java.util.List;

/* compiled from: TrackSelectionOverride.java */
/* loaded from: classes.dex */
public final class T implements InterfaceC23096j {

    /* renamed from: d, reason: collision with root package name */
    public static final String f47451d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f47452e;

    /* renamed from: f, reason: collision with root package name */
    @androidx.media3.common.util.J
    public static final S f47453f;

    /* renamed from: b, reason: collision with root package name */
    public final Q f47454b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC37401r1<Integer> f47455c;

    static {
        int i12 = androidx.media3.common.util.M.f47887a;
        f47451d = Integer.toString(0, 36);
        f47452e = Integer.toString(1, 36);
        f47453f = new S(0);
    }

    public T(Q q12, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= q12.f47439b)) {
            throw new IndexOutOfBoundsException();
        }
        this.f47454b = q12;
        this.f47455c = AbstractC37401r1.v(list);
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || T.class != obj.getClass()) {
            return false;
        }
        T t12 = (T) obj;
        return this.f47454b.equals(t12.f47454b) && this.f47455c.equals(t12.f47455c);
    }

    public final int hashCode() {
        return (this.f47455c.hashCode() * 31) + this.f47454b.hashCode();
    }

    @Override // androidx.media3.common.InterfaceC23096j
    @androidx.media3.common.util.J
    public final Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f47451d, this.f47454b.k());
        bundle.putIntArray(f47452e, com.google.common.primitives.l.g(this.f47455c));
        return bundle;
    }
}
