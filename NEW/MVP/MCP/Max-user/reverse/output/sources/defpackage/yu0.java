package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class yu0 {
    public static final bwf g = new bwf(new l(24));
    public final String a;
    public final boolean b;
    public final su0 c;
    public final String d;
    public ByteBuffer e;
    public int f = 4096;

    public yu0(String str, boolean z, su0 su0Var) {
        this.a = str;
        this.b = z;
        this.c = su0Var;
        this.d = u45.k(yu0.class.getName(), "/", str);
    }

    public final boolean a() {
        if (this.e == null) {
            return false;
        }
        this.c.b(e());
        this.e = null;
        return true;
    }

    public final void b() {
        if (this.e == null) {
            return;
        }
        ByteBuffer byteBufferE = e();
        int iCapacity = byteBufferE.capacity();
        String str = this.a;
        if (iCapacity >= 17408) {
            throw new IllegalStateException(xc0.e(byteBufferE.capacity(), str, " buffer insufficient despite having capacity of ").toString());
        }
        int iMin = Math.min(byteBufferE.capacity() * 2, 17408);
        StringBuilder sbM = utb.m(byteBufferE.capacity(), "enlarging buffer ", str, ", increasing from ", " to ");
        sbM.append(iMin);
        wqi.c(this.d, sbM.toString(), new Object[0]);
        su0 su0Var = this.c;
        ByteBuffer byteBufferA = su0Var.a(iMin);
        ByteBuffer byteBufferE2 = e();
        byteBufferE2.flip();
        byteBufferA.put(byteBufferE2);
        if (this.b) {
            f(0);
        }
        su0Var.b(byteBufferE2);
        this.e = byteBufferA;
        this.f = iMin;
    }

    public final void c() {
        if (this.e == null) {
            this.e = this.c.a(this.f);
        }
    }

    public final boolean d() {
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer == null || byteBuffer.position() != 0) {
            return false;
        }
        return a();
    }

    public final ByteBuffer e() {
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer != null) {
            return byteBuffer;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void f(int i) {
        if (this.e == null) {
            return;
        }
        ByteBuffer byteBufferE = e();
        byteBufferE.mark();
        byteBufferE.position(i);
        int iRemaining = byteBufferE.remaining();
        bwf bwfVar = g;
        int iMin = Math.min(iRemaining, ((byte[]) bwfVar.getValue()).length);
        int i2 = 0;
        while (iMin > 0) {
            byteBufferE.put((byte[]) bwfVar.getValue(), 0, iMin);
            i2 += iMin;
            iMin = Math.min(iRemaining - i2, ((byte[]) bwfVar.getValue()).length);
        }
        byteBufferE.reset();
    }

    public final String toString() {
        ByteBuffer byteBuffer = this.e;
        int i = this.f;
        StringBuilder sb = new StringBuilder("BufferHolder{name='");
        sb.append(this.a);
        sb.append("', allocator=");
        sb.append(this.c);
        sb.append(", plainData=");
        sb.append(this.b);
        sb.append(", maxSize=17408, buffer=");
        sb.append(byteBuffer);
        sb.append(", lastSize=");
        return ho7.j(sb, i, "}");
    }
}
