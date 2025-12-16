package com.google.android.datatransport.runtime;

import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.r;
import j.P;
import java.util.Arrays;

/* compiled from: AutoValue_TransportContext.java */
/* loaded from: classes10.dex */
final class d extends r {

    /* renamed from: a, reason: collision with root package name */
    public final String f343123a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f343124b;

    /* renamed from: c, reason: collision with root package name */
    public final Priority f343125c;

    /* compiled from: AutoValue_TransportContext.java */
    public static final class b extends r.a {

        /* renamed from: a, reason: collision with root package name */
        public String f343126a;

        /* renamed from: b, reason: collision with root package name */
        public byte[] f343127b;

        /* renamed from: c, reason: collision with root package name */
        public Priority f343128c;

        @Override // com.google.android.datatransport.runtime.r.a
        public final r a() {
            String strQ = this.f343126a == null ? " backendName" : "";
            if (this.f343128c == null) {
                strQ = androidx.appcompat.app.r.q(strQ, " priority");
            }
            if (strQ.isEmpty()) {
                return new d(this.f343126a, this.f343127b, this.f343128c, null);
            }
            throw new IllegalStateException("Missing required properties:".concat(strQ));
        }

        @Override // com.google.android.datatransport.runtime.r.a
        public final r.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f343126a = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.r.a
        public final r.a c(@P byte[] bArr) {
            this.f343127b = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.r.a
        public final r.a d(Priority priority) {
            if (priority == null) {
                throw new NullPointerException("Null priority");
            }
            this.f343128c = priority;
            return this;
        }
    }

    public d(String str, byte[] bArr, Priority priority, a aVar) {
        this.f343123a = str;
        this.f343124b = bArr;
        this.f343125c = priority;
    }

    @Override // com.google.android.datatransport.runtime.r
    public final String b() {
        return this.f343123a;
    }

    @Override // com.google.android.datatransport.runtime.r
    @P
    public final byte[] c() {
        return this.f343124b;
    }

    @Override // com.google.android.datatransport.runtime.r
    @RestrictTo
    public final Priority d() {
        return this.f343125c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f343123a.equals(rVar.b())) {
            if (Arrays.equals(this.f343124b, rVar instanceof d ? ((d) rVar).f343124b : rVar.c()) && this.f343125c.equals(rVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f343123a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f343124b)) * 1000003) ^ this.f343125c.hashCode();
    }
}
