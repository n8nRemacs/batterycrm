package com.google.common.hash;

import com.google.common.hash.q;
import javax.crypto.Mac;

/* compiled from: MacHashFunction.java */
@InterfaceC37497l
@aZ0.j
/* loaded from: classes6.dex */
final class E extends AbstractC37489d {

    /* compiled from: MacHashFunction.java */
    public static final class b extends AbstractC37486a {

        /* renamed from: b, reason: collision with root package name */
        public final Mac f360193b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f360194c;

        public b(Mac mac, a aVar) {
            this.f360193b = mac;
        }

        @Override // com.google.common.hash.s
        public final q e() throws IllegalStateException {
            com.google.common.base.M.n("Cannot re-use a Hasher after calling hash() on it", !this.f360194c);
            this.f360194c = true;
            byte[] bArrDoFinal = this.f360193b.doFinal();
            char[] cArr = q.f360281b;
            return new q.a(bArrDoFinal);
        }

        @Override // com.google.common.hash.AbstractC37486a
        public final void j(byte b12) throws IllegalStateException {
            com.google.common.base.M.n("Cannot re-use a Hasher after calling hash() on it", !this.f360194c);
            this.f360193b.update(b12);
        }

        @Override // com.google.common.hash.AbstractC37486a
        public final void l(int i12, byte[] bArr) throws IllegalStateException {
            com.google.common.base.M.n("Cannot re-use a Hasher after calling hash() on it", !this.f360194c);
            this.f360193b.update(bArr, 0, i12);
        }

        @Override // com.google.common.hash.AbstractC37486a
        public final void m(byte[] bArr) throws IllegalStateException {
            com.google.common.base.M.n("Cannot re-use a Hasher after calling hash() on it", !this.f360194c);
            this.f360193b.update(bArr);
        }
    }

    @Override // com.google.common.hash.r
    public final s a() {
        throw null;
    }

    @Override // com.google.common.hash.r
    public final int b() {
        return 0;
    }

    public final String toString() {
        return null;
    }
}
