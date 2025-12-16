package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.g;
import j.P;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: AutoValue_BackendRequest.java */
/* loaded from: classes10.dex */
final class a extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Iterable<com.google.android.datatransport.runtime.j> f343090a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f343091b;

    /* compiled from: AutoValue_BackendRequest.java */
    public static final class b extends g.a {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList f343092a;

        /* renamed from: b, reason: collision with root package name */
        public byte[] f343093b;

        @Override // com.google.android.datatransport.runtime.backends.g.a
        public final g a() {
            String str = this.f343092a == null ? " events" : "";
            if (str.isEmpty()) {
                return new a(this.f343092a, this.f343093b, null);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.google.android.datatransport.runtime.backends.g.a
        public final g.a b(ArrayList arrayList) {
            this.f343092a = arrayList;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.backends.g.a
        public final g.a c(@P byte[] bArr) {
            this.f343093b = bArr;
            return this;
        }
    }

    public a() {
        throw null;
    }

    public a(Iterable iterable, byte[] bArr, C10563a c10563a) {
        this.f343090a = iterable;
        this.f343091b = bArr;
    }

    @Override // com.google.android.datatransport.runtime.backends.g
    public final Iterable<com.google.android.datatransport.runtime.j> b() {
        return this.f343090a;
    }

    @Override // com.google.android.datatransport.runtime.backends.g
    @P
    public final byte[] c() {
        return this.f343091b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f343090a.equals(gVar.b())) {
            if (Arrays.equals(this.f343091b, gVar instanceof a ? ((a) gVar).f343091b : gVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f343090a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f343091b);
    }

    public final String toString() {
        return "BackendRequest{events=" + this.f343090a + ", extras=" + Arrays.toString(this.f343091b) + "}";
    }
}
