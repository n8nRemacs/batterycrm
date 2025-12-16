package com.bumptech.glide.util;

import j.N;
import j.P;

/* compiled from: MultiClassKey.java */
/* loaded from: classes5.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public Class<?> f339646a;

    /* renamed from: b, reason: collision with root package name */
    public Class<?> f339647b;

    /* renamed from: c, reason: collision with root package name */
    public Class<?> f339648c;

    public j() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f339646a.equals(jVar.f339646a) && this.f339647b.equals(jVar.f339647b) && m.a(this.f339648c, jVar.f339648c);
    }

    public final int hashCode() {
        int iHashCode = (this.f339647b.hashCode() + (this.f339646a.hashCode() * 31)) * 31;
        Class<?> cls = this.f339648c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f339646a + ", second=" + this.f339647b + '}';
    }

    public j(@N Class<?> cls, @N Class<?> cls2, @P Class<?> cls3) {
        this.f339646a = cls;
        this.f339647b = cls2;
        this.f339648c = cls3;
    }
}
