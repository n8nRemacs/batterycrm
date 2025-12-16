package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import j.N;

/* compiled from: AutoValue_CreationContext.java */
/* loaded from: classes10.dex */
final class c extends h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f343096a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.time.a f343097b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.datatransport.runtime.time.a f343098c;

    /* renamed from: d, reason: collision with root package name */
    public final String f343099d;

    public c(Context context, com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f343096a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f343097b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f343098c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f343099d = str;
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    public final Context a() {
        return this.f343096a;
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    @N
    public final String b() {
        return this.f343099d;
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    public final com.google.android.datatransport.runtime.time.a c() {
        return this.f343098c;
    }

    @Override // com.google.android.datatransport.runtime.backends.h
    public final com.google.android.datatransport.runtime.time.a d() {
        return this.f343097b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f343096a.equals(hVar.a()) && this.f343097b.equals(hVar.d()) && this.f343098c.equals(hVar.c()) && this.f343099d.equals(hVar.b());
    }

    public final int hashCode() {
        return ((((((this.f343096a.hashCode() ^ 1000003) * 1000003) ^ this.f343097b.hashCode()) * 1000003) ^ this.f343098c.hashCode()) * 1000003) ^ this.f343099d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f343096a);
        sb2.append(", wallClock=");
        sb2.append(this.f343097b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f343098c);
        sb2.append(", backendName=");
        return AK.c.s(sb2, this.f343099d, "}");
    }
}
