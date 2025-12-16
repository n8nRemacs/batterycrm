package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.q;

/* compiled from: AutoValue_SendRequest.java */
/* loaded from: classes10.dex */
final class c extends q {

    /* renamed from: a, reason: collision with root package name */
    public final r f343113a;

    /* renamed from: b, reason: collision with root package name */
    public final String f343114b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.datatransport.d<?> f343115c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.datatransport.f<?, byte[]> f343116d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.android.datatransport.c f343117e;

    /* compiled from: AutoValue_SendRequest.java */
    public static final class b extends q.a {

        /* renamed from: a, reason: collision with root package name */
        public r f343118a;

        /* renamed from: b, reason: collision with root package name */
        public String f343119b;

        /* renamed from: c, reason: collision with root package name */
        public com.google.android.datatransport.d<?> f343120c;

        /* renamed from: d, reason: collision with root package name */
        public com.google.android.datatransport.f<?, byte[]> f343121d;

        /* renamed from: e, reason: collision with root package name */
        public com.google.android.datatransport.c f343122e;
    }

    public c() {
        throw null;
    }

    public c(r rVar, String str, com.google.android.datatransport.d dVar, com.google.android.datatransport.f fVar, com.google.android.datatransport.c cVar, a aVar) {
        this.f343113a = rVar;
        this.f343114b = str;
        this.f343115c = dVar;
        this.f343116d = fVar;
        this.f343117e = cVar;
    }

    @Override // com.google.android.datatransport.runtime.q
    public final com.google.android.datatransport.c a() {
        return this.f343117e;
    }

    @Override // com.google.android.datatransport.runtime.q
    public final com.google.android.datatransport.d<?> b() {
        return this.f343115c;
    }

    @Override // com.google.android.datatransport.runtime.q
    public final com.google.android.datatransport.f<?, byte[]> c() {
        return this.f343116d;
    }

    @Override // com.google.android.datatransport.runtime.q
    public final r d() {
        return this.f343113a;
    }

    @Override // com.google.android.datatransport.runtime.q
    public final String e() {
        return this.f343114b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f343113a.equals(qVar.d()) && this.f343114b.equals(qVar.e()) && this.f343115c.equals(qVar.b()) && this.f343116d.equals(qVar.c()) && this.f343117e.equals(qVar.a());
    }

    public final int hashCode() {
        return ((((((((this.f343113a.hashCode() ^ 1000003) * 1000003) ^ this.f343114b.hashCode()) * 1000003) ^ this.f343115c.hashCode()) * 1000003) ^ this.f343116d.hashCode()) * 1000003) ^ this.f343117e.hashCode();
    }

    public final String toString() {
        return "SendRequest{transportContext=" + this.f343113a + ", transportName=" + this.f343114b + ", event=" + this.f343115c + ", transformer=" + this.f343116d + ", encoding=" + this.f343117e + "}";
    }
}
