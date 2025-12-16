package com.google.common.hash;

import com.google.common.hash.q;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* compiled from: MessageDigestHashFunction.java */
@InterfaceC37497l
@aZ0.j
/* loaded from: classes6.dex */
final class F extends AbstractC37489d implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final MessageDigest f360195b;

    /* renamed from: c, reason: collision with root package name */
    public final int f360196c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f360197d;

    /* renamed from: e, reason: collision with root package name */
    public final String f360198e;

    /* compiled from: MessageDigestHashFunction.java */
    public static final class b extends AbstractC37486a {

        /* renamed from: b, reason: collision with root package name */
        public final MessageDigest f360199b;

        /* renamed from: c, reason: collision with root package name */
        public final int f360200c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f360201d;

        public b(MessageDigest messageDigest, int i12, a aVar) {
            this.f360199b = messageDigest;
            this.f360200c = i12;
        }

        @Override // com.google.common.hash.s
        public final q e() {
            com.google.common.base.M.n("Cannot re-use a Hasher after calling hash() on it", !this.f360201d);
            this.f360201d = true;
            MessageDigest messageDigest = this.f360199b;
            int digestLength = messageDigest.getDigestLength();
            int i12 = this.f360200c;
            if (i12 == digestLength) {
                byte[] bArrDigest = messageDigest.digest();
                char[] cArr = q.f360281b;
                return new q.a(bArrDigest);
            }
            byte[] bArrCopyOf = Arrays.copyOf(messageDigest.digest(), i12);
            char[] cArr2 = q.f360281b;
            return new q.a(bArrCopyOf);
        }

        @Override // com.google.common.hash.AbstractC37486a
        public final void j(byte b12) {
            com.google.common.base.M.n("Cannot re-use a Hasher after calling hash() on it", !this.f360201d);
            this.f360199b.update(b12);
        }

        @Override // com.google.common.hash.AbstractC37486a
        public final void l(int i12, byte[] bArr) {
            com.google.common.base.M.n("Cannot re-use a Hasher after calling hash() on it", !this.f360201d);
            this.f360199b.update(bArr, 0, i12);
        }
    }

    /* compiled from: MessageDigestHashFunction.java */
    public static final class c implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final String f360202b;

        /* renamed from: c, reason: collision with root package name */
        public final int f360203c;

        /* renamed from: d, reason: collision with root package name */
        public final String f360204d;

        public c(String str, int i12, String str2, a aVar) {
            this.f360202b = str;
            this.f360203c = i12;
            this.f360204d = str2;
        }

        private Object readResolve() {
            return new F(this.f360202b, this.f360203c, this.f360204d);
        }
    }

    public F(String str, String str2) throws NoSuchAlgorithmException, CloneNotSupportedException {
        boolean z12;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            this.f360195b = messageDigest;
            this.f360196c = messageDigest.getDigestLength();
            this.f360198e = str2;
            try {
                messageDigest.clone();
                z12 = true;
            } catch (CloneNotSupportedException unused) {
                z12 = false;
            }
            this.f360197d = z12;
        } catch (NoSuchAlgorithmException e12) {
            throw new AssertionError(e12);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.hash.r
    public final s a() {
        boolean z12 = this.f360197d;
        int i12 = this.f360196c;
        MessageDigest messageDigest = this.f360195b;
        if (z12) {
            try {
                return new b((MessageDigest) messageDigest.clone(), i12, null);
            } catch (CloneNotSupportedException unused) {
            }
        }
        try {
            return new b(MessageDigest.getInstance(messageDigest.getAlgorithm()), i12, null);
        } catch (NoSuchAlgorithmException e12) {
            throw new AssertionError(e12);
        }
    }

    @Override // com.google.common.hash.r
    public final int b() {
        return this.f360196c * 8;
    }

    public final String toString() {
        return this.f360198e;
    }

    public Object writeReplace() {
        return new c(this.f360195b.getAlgorithm(), this.f360196c, this.f360198e, null);
    }

    public F(String str, int i12, String str2) throws NoSuchAlgorithmException, CloneNotSupportedException {
        str2.getClass();
        this.f360198e = str2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            this.f360195b = messageDigest;
            int digestLength = messageDigest.getDigestLength();
            boolean z12 = false;
            com.google.common.base.M.b(i12, digestLength, "bytes (%s) must be >= 4 and < %s", i12 >= 4 && i12 <= digestLength);
            this.f360196c = i12;
            try {
                messageDigest.clone();
                z12 = true;
            } catch (CloneNotSupportedException unused) {
            }
            this.f360197d = z12;
        } catch (NoSuchAlgorithmException e12) {
            throw new AssertionError(e12);
        }
    }
}
