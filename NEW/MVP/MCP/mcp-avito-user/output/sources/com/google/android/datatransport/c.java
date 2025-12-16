package com.google.android.datatransport;

import j.N;
import j.P;

/* compiled from: Encoding.java */
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f342922a;

    public c(@N String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f342922a = str;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f342922a.equals(((c) obj).f342922a);
    }

    public final int hashCode() {
        return this.f342922a.hashCode() ^ 1000003;
    }

    @N
    public final String toString() {
        return AK.c.s(new StringBuilder("Encoding{name=\""), this.f342922a, "\"}");
    }
}
