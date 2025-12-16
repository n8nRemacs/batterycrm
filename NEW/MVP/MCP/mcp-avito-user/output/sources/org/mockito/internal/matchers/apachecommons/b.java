package org.mockito.internal.matchers.apachecommons;

import java.io.Serializable;
import org.mockito.d;

/* compiled from: ReflectionEquals.java */
/* loaded from: classes7.dex */
public class b implements d<Object>, Serializable {
    @Override // org.mockito.d
    public final boolean b(Object obj) {
        return obj == null;
    }

    public final String toString() {
        return "refEq(null)";
    }
}
