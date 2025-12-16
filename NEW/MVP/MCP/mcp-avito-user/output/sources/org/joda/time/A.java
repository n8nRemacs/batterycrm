package org.joda.time;

import java.io.Serializable;

/* compiled from: MutablePeriod.java */
/* loaded from: classes7.dex */
public class A extends org.joda.time.base.l implements H, Cloneable, Serializable {
    private static final long serialVersionUID = 3436451121567212165L;

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError("Clone error");
        }
    }
}
