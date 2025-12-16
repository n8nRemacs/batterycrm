package com.google.common.hash;

import com.google.common.hash.q;
import java.io.Serializable;
import java.nio.ByteBuffer;

/* compiled from: SipHashFunction.java */
@InterfaceC37497l
@aZ0.j
/* loaded from: classes6.dex */
final class K extends AbstractC37489d implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f360218b = 2;

    /* renamed from: c, reason: collision with root package name */
    public final int f360219c = 4;

    /* renamed from: d, reason: collision with root package name */
    public final long f360220d = 506097522914230528L;

    /* renamed from: e, reason: collision with root package name */
    public final long f360221e = 1084818905618843912L;

    /* compiled from: SipHashFunction.java */
    public static final class a extends AbstractC37492g {

        /* renamed from: d, reason: collision with root package name */
        public final int f360222d;

        /* renamed from: e, reason: collision with root package name */
        public final int f360223e;

        /* renamed from: f, reason: collision with root package name */
        public long f360224f;

        /* renamed from: g, reason: collision with root package name */
        public long f360225g;

        /* renamed from: h, reason: collision with root package name */
        public long f360226h;

        /* renamed from: i, reason: collision with root package name */
        public long f360227i;

        /* renamed from: j, reason: collision with root package name */
        public long f360228j;

        /* renamed from: k, reason: collision with root package name */
        public long f360229k;

        public a(int i12, int i13, long j12, long j13) {
            super(8);
            this.f360228j = 0L;
            this.f360229k = 0L;
            this.f360222d = i12;
            this.f360223e = i13;
            this.f360224f = 8317987319222330741L ^ j12;
            this.f360225g = 7237128888997146477L ^ j13;
            this.f360226h = 7816392313619706465L ^ j12;
            this.f360227i = 8387220255154660723L ^ j13;
        }

        @Override // com.google.common.hash.AbstractC37492g
        public final q j() {
            long j12 = this.f360229k ^ (this.f360228j << 56);
            this.f360229k = j12;
            this.f360227i ^= j12;
            o(this.f360222d);
            this.f360224f = j12 ^ this.f360224f;
            this.f360226h ^= 255;
            o(this.f360223e);
            long j13 = ((this.f360224f ^ this.f360225g) ^ this.f360226h) ^ this.f360227i;
            char[] cArr = q.f360281b;
            return new q.c(j13);
        }

        @Override // com.google.common.hash.AbstractC37492g
        public final void m(ByteBuffer byteBuffer) {
            this.f360228j += 8;
            long j12 = byteBuffer.getLong();
            this.f360227i ^= j12;
            o(this.f360222d);
            this.f360224f = j12 ^ this.f360224f;
        }

        @Override // com.google.common.hash.AbstractC37492g
        public final void n(ByteBuffer byteBuffer) {
            this.f360228j += byteBuffer.remaining();
            int i12 = 0;
            while (byteBuffer.hasRemaining()) {
                this.f360229k ^= (byteBuffer.get() & 255) << i12;
                i12 += 8;
            }
        }

        public final void o(int i12) {
            for (int i13 = 0; i13 < i12; i13++) {
                long j12 = this.f360224f;
                long j13 = this.f360225g;
                this.f360224f = j12 + j13;
                this.f360226h += this.f360227i;
                this.f360225g = Long.rotateLeft(j13, 13);
                long jRotateLeft = Long.rotateLeft(this.f360227i, 16);
                long j14 = this.f360225g;
                long j15 = this.f360224f;
                this.f360225g = j14 ^ j15;
                this.f360227i = jRotateLeft ^ this.f360226h;
                long jRotateLeft2 = Long.rotateLeft(j15, 32);
                long j16 = this.f360226h;
                long j17 = this.f360225g;
                this.f360226h = j16 + j17;
                this.f360224f = jRotateLeft2 + this.f360227i;
                this.f360225g = Long.rotateLeft(j17, 17);
                long jRotateLeft3 = Long.rotateLeft(this.f360227i, 21);
                long j18 = this.f360225g;
                long j19 = this.f360226h;
                this.f360225g = j18 ^ j19;
                this.f360227i = jRotateLeft3 ^ this.f360224f;
                this.f360226h = Long.rotateLeft(j19, 32);
            }
        }
    }

    static {
        new K();
    }

    @Override // com.google.common.hash.r
    public final s a() {
        return new a(this.f360218b, this.f360219c, this.f360220d, this.f360221e);
    }

    @Override // com.google.common.hash.r
    public final int b() {
        return 64;
    }

    public final boolean equals(@I41.a Object obj) {
        if (!(obj instanceof K)) {
            return false;
        }
        K k12 = (K) obj;
        return this.f360218b == k12.f360218b && this.f360219c == k12.f360219c && this.f360220d == k12.f360220d && this.f360221e == k12.f360221e;
    }

    public final int hashCode() {
        return (int) ((((K.class.hashCode() ^ this.f360218b) ^ this.f360219c) ^ this.f360220d) ^ this.f360221e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Hashing.sipHash");
        sb2.append(this.f360218b);
        sb2.append("");
        sb2.append(this.f360219c);
        sb2.append("(");
        sb2.append(this.f360220d);
        sb2.append(", ");
        return AK.c.j(this.f360221e, ")", sb2);
    }
}
