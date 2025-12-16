package net.bytebuddy.dynamic;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Nexus.java */
/* loaded from: classes8.dex */
public class b extends WeakReference<ClassLoader> {
    static {
        new ConcurrentHashMap();
    }

    public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "Nexus{name='null', classLoaderHashCode=0, identification=0, classLoader=" + get() + '}';
    }
}
