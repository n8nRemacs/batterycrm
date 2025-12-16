package com.google.common.net;

import com.google.common.base.F;
import java.io.Serializable;
import java.util.Arrays;

/* compiled from: HostAndPort.java */
@XY0.b
@a
@aZ0.j
/* loaded from: classes6.dex */
public final class b implements Serializable {
    private static final long serialVersionUID = 0;

    public final boolean equals(@I41.a Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        ((b) obj).getClass();
        return F.a(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, 0});
    }

    public final String toString() {
        throw null;
    }
}
