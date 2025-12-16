package com.google.common.hash;

import com.google.common.base.N;
import com.google.common.hash.EnumC37494i;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

/* compiled from: BloomFilter.java */
@InterfaceC37497l
@XY0.a
/* renamed from: com.google.common.hash.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37493h<T> implements N<T>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final EnumC37494i.c f360251b;

    /* renamed from: c, reason: collision with root package name */
    public final int f360252c;

    /* renamed from: d, reason: collision with root package name */
    public final o<? super T> f360253d;

    /* renamed from: e, reason: collision with root package name */
    public final c f360254e;

    /* compiled from: BloomFilter.java */
    /* renamed from: com.google.common.hash.h$b */
    public static class b<T> implements Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f360255b;

        /* renamed from: c, reason: collision with root package name */
        public final int f360256c;

        /* renamed from: d, reason: collision with root package name */
        public final o<? super T> f360257d;

        /* renamed from: e, reason: collision with root package name */
        public final c f360258e;

        public b(C37493h<T> c37493h) {
            this.f360255b = EnumC37494i.c.a(c37493h.f360251b.f360260a);
            this.f360256c = c37493h.f360252c;
            this.f360257d = c37493h.f360253d;
            this.f360258e = c37493h.f360254e;
        }

        public Object readResolve() {
            return new C37493h(new EnumC37494i.c(this.f360255b), this.f360256c, this.f360257d, this.f360258e, null);
        }
    }

    /* compiled from: BloomFilter.java */
    /* renamed from: com.google.common.hash.h$c */
    public interface c extends Serializable {
        <T> boolean w3(@I T t12, o<? super T> oVar, int i12, EnumC37494i.c cVar);
    }

    public C37493h() {
        throw null;
    }

    public C37493h(EnumC37494i.c cVar, int i12, o oVar, c cVar2, a aVar) {
        com.google.common.base.M.c(i12, "numHashFunctions (%s) must be > 0", i12 > 0);
        com.google.common.base.M.c(i12, "numHashFunctions (%s) must be <= 255", i12 <= 255);
        cVar.getClass();
        this.f360251b = cVar;
        this.f360252c = i12;
        oVar.getClass();
        this.f360253d = oVar;
        cVar2.getClass();
        this.f360254e = cVar2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    private Object writeReplace() {
        return new b(this);
    }

    @Override // com.google.common.base.N
    @Deprecated
    public final boolean apply(@I T t12) {
        return this.f360254e.w3(t12, this.f360253d, this.f360252c, this.f360251b);
    }

    @Override // com.google.common.base.N
    public final boolean equals(@I41.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C37493h)) {
            return false;
        }
        C37493h c37493h = (C37493h) obj;
        return this.f360252c == c37493h.f360252c && this.f360253d.equals(c37493h.f360253d) && this.f360251b.equals(c37493h.f360251b) && this.f360254e.equals(c37493h.f360254e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f360252c), this.f360253d, this.f360254e, this.f360251b});
    }
}
