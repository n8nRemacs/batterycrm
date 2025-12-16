package org.joda.time;

import java.io.Serializable;
import org.joda.time.C44866h;

/* compiled from: MutableInterval.java */
/* loaded from: classes7.dex */
public class z extends org.joda.time.base.i implements G, Cloneable, Serializable {
    private static final long serialVersionUID = -5982824024992428470L;

    public z() {
        C44866h.b bVar = C44866h.f420908a;
        this.f420464b = org.joda.time.chrono.x.V();
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError("Clone error");
        }
    }
}
