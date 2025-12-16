package com.bumptech.glide.load;

import com.bumptech.glide.load.j;
import j.N;
import j.P;
import java.security.MessageDigest;

/* compiled from: Options.java */
/* loaded from: classes5.dex */
public final class k implements h {

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.util.b f339200b = new com.bumptech.glide.util.b();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.h
    public final void b(@N MessageDigest messageDigest) {
        int i12 = 0;
        while (true) {
            com.bumptech.glide.util.b bVar = this.f339200b;
            if (i12 >= bVar.f25790d) {
                return;
            }
            j jVar = (j) bVar.f(i12);
            V vK2 = this.f339200b.k(i12);
            j.b<T> bVar2 = jVar.f339197b;
            if (jVar.f339199d == null) {
                jVar.f339199d = jVar.f339198c.getBytes(h.f339193a);
            }
            bVar2.a(jVar.f339199d, vK2, messageDigest);
            i12++;
        }
    }

    @P
    public final <T> T c(@N j<T> jVar) {
        com.bumptech.glide.util.b bVar = this.f339200b;
        return bVar.containsKey(jVar) ? (T) bVar.get(jVar) : jVar.f339196a;
    }

    @Override // com.bumptech.glide.load.h
    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f339200b.equals(((k) obj).f339200b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.h
    public final int hashCode() {
        return this.f339200b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f339200b + '}';
    }
}
