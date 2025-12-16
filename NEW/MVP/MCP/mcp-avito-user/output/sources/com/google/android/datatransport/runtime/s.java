package com.google.android.datatransport.runtime;

import java.util.Set;

/* compiled from: TransportFactoryImpl.java */
/* loaded from: classes10.dex */
final class s implements com.google.android.datatransport.h {

    /* renamed from: a, reason: collision with root package name */
    public final Set<com.google.android.datatransport.c> f343171a;

    /* renamed from: b, reason: collision with root package name */
    public final r f343172b;

    /* renamed from: c, reason: collision with root package name */
    public final v f343173c;

    public s(Set set, r rVar, v vVar) {
        this.f343171a = set;
        this.f343172b = rVar;
        this.f343173c = vVar;
    }

    @Override // com.google.android.datatransport.h
    public final com.google.android.datatransport.g a(String str, com.google.android.datatransport.c cVar, com.google.android.datatransport.f fVar) {
        Set<com.google.android.datatransport.c> set = this.f343171a;
        if (!set.contains(cVar)) {
            throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
        }
        return new t(this.f343172b, str, cVar, fVar, this.f343173c);
    }
}
