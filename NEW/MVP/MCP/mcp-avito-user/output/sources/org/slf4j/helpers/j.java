package org.slf4j.helpers;

import java.io.Serializable;

/* compiled from: NamedLoggerBase.java */
/* loaded from: classes7.dex */
abstract class j implements org.slf4j.a, Serializable {
    private static final long serialVersionUID = 7535258609338176893L;

    @Override // org.slf4j.a
    public String getName() {
        return null;
    }

    public Object readResolve() {
        return org.slf4j.b.e(getName());
    }
}
