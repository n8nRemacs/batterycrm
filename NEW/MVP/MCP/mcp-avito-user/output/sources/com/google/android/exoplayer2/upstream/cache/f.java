package com.google.android.exoplayer2.upstream.cache;

import j.P;
import java.io.File;

/* compiled from: CacheSpan.java */
/* loaded from: classes6.dex */
public class f implements Comparable<f> {

    /* renamed from: b, reason: collision with root package name */
    public final String f347842b;

    /* renamed from: c, reason: collision with root package name */
    public final long f347843c;

    /* renamed from: d, reason: collision with root package name */
    public final long f347844d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f347845e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public final File f347846f;

    /* renamed from: g, reason: collision with root package name */
    public final long f347847g;

    public f(String str, long j12, long j13, long j14, @P File file) {
        this.f347842b = str;
        this.f347843c = j12;
        this.f347844d = j13;
        this.f347845e = file != null;
        this.f347846f = file;
        this.f347847g = j14;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(f fVar) {
        String str = fVar.f347842b;
        String str2 = this.f347842b;
        if (!str2.equals(str)) {
            return str2.compareTo(fVar.f347842b);
        }
        long j12 = this.f347843c - fVar.f347843c;
        if (j12 == 0) {
            return 0;
        }
        return j12 < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(this.f347843c);
        sb2.append(", ");
        return AK.c.j(this.f347844d, "]", sb2);
    }
}
