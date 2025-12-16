package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class zog {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final hz9 b;
    public volatile int c = 0;

    public zog(hz9 hz9Var, int i) {
        this.b = hz9Var;
        this.a = i;
    }

    public final int a(int i) {
        zy9 zy9VarB = b();
        int iA = zy9VarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) zy9VarB.d;
        int i2 = iA + zy9VarB.a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final zy9 b() {
        ThreadLocal threadLocal = d;
        zy9 zy9Var = (zy9) threadLocal.get();
        if (zy9Var == null) {
            zy9Var = new zy9();
            threadLocal.set(zy9Var);
        }
        az9 az9Var = this.b.a;
        int iA = az9Var.a(6);
        if (iA != 0) {
            int i = iA + az9Var.a;
            int i2 = (this.a * 4) + ((ByteBuffer) az9Var.d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) az9Var.d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) az9Var.d;
            zy9Var.d = byteBuffer;
            if (byteBuffer != null) {
                zy9Var.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                zy9Var.b = i4;
                zy9Var.c = ((ByteBuffer) zy9Var.d).getShort(i4);
                return zy9Var;
            }
            zy9Var.a = 0;
            zy9Var.b = 0;
            zy9Var.c = 0;
        }
        return zy9Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        zy9 zy9VarB = b();
        int iA = zy9VarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) zy9VarB.d).getInt(iA + zy9VarB.a) : 0));
        sb.append(", codepoints:");
        zy9 zy9VarB2 = b();
        int iA2 = zy9VarB2.a(16);
        if (iA2 != 0) {
            int i2 = iA2 + zy9VarB2.a;
            i = ((ByteBuffer) zy9VarB2.d).getInt(((ByteBuffer) zy9VarB2.d).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
