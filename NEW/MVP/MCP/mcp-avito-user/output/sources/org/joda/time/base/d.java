package org.joda.time.base;

import java.io.IOException;
import org.joda.time.L;

/* compiled from: AbstractInterval.java */
/* loaded from: classes7.dex */
public abstract class d implements L {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l12 = (L) obj;
        return 0 == l12.e() && 0 == l12.a() && org.joda.time.field.j.a(((i) this).f420464b, l12.y());
    }

    public final int hashCode() {
        int i12 = (int) 0;
        return ((i) this).f420464b.hashCode() + ((((3007 + i12) * 31) + i12) * 31);
    }

    public final String toString() {
        org.joda.time.format.b bVarF = org.joda.time.format.j.e().f(((i) this).f420464b);
        StringBuffer stringBuffer = new StringBuffer(48);
        try {
            bVarF.e(stringBuffer, 0L, null);
        } catch (IOException unused) {
        }
        stringBuffer.append('/');
        try {
            bVarF.e(stringBuffer, 0L, null);
        } catch (IOException unused2) {
        }
        return stringBuffer.toString();
    }
}
