package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: JsonArray.java */
/* loaded from: classes6.dex */
public final class f extends i implements Iterable<i> {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f362000b;

    public f() {
        this.f362000b = new ArrayList();
    }

    @Override // com.google.gson.i
    public final i b() {
        ArrayList arrayList = this.f362000b;
        if (arrayList.isEmpty()) {
            return new f();
        }
        f fVar = new f(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fVar.t(((i) it.next()).b());
        }
        return fVar;
    }

    @Override // com.google.gson.i
    public final boolean d() {
        ArrayList arrayList = this.f362000b;
        if (arrayList.size() == 1) {
            return ((i) arrayList.get(0)).d();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.i
    public final double e() {
        ArrayList arrayList = this.f362000b;
        if (arrayList.size() == 1) {
            return ((i) arrayList.get(0)).e();
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof f) && ((f) obj).f362000b.equals(this.f362000b));
    }

    @Override // com.google.gson.i
    public final int g() {
        ArrayList arrayList = this.f362000b;
        if (arrayList.size() == 1) {
            return ((i) arrayList.get(0)).g();
        }
        throw new IllegalStateException();
    }

    public final int hashCode() {
        return this.f362000b.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<i> iterator() {
        return this.f362000b.iterator();
    }

    @Override // com.google.gson.i
    public final long l() {
        ArrayList arrayList = this.f362000b;
        if (arrayList.size() == 1) {
            return ((i) arrayList.get(0)).l();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.i
    public final Number r() {
        ArrayList arrayList = this.f362000b;
        if (arrayList.size() == 1) {
            return ((i) arrayList.get(0)).r();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.i
    public final String s() {
        ArrayList arrayList = this.f362000b;
        if (arrayList.size() == 1) {
            return ((i) arrayList.get(0)).s();
        }
        throw new IllegalStateException();
    }

    public final void t(i iVar) {
        if (iVar == null) {
            iVar = j.f362193b;
        }
        this.f362000b.add(iVar);
    }

    public final void v(String str) {
        this.f362000b.add(str == null ? j.f362193b : new m(str));
    }

    public final i w(int i12) {
        return (i) this.f362000b.get(i12);
    }

    public f(int i12) {
        this.f362000b = new ArrayList(i12);
    }
}
