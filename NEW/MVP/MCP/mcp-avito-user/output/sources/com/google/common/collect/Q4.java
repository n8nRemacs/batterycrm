package com.google.common.collect;

import java.io.Serializable;

/* compiled from: UsingToStringOrdering.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
final class Q4 extends AbstractC37429w3<Object> implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final Q4 f359568b = new Q4();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return f359568b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return obj.toString().compareTo(obj2.toString());
    }

    public final String toString() {
        return "Ordering.usingToString()";
    }
}
