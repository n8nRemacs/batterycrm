package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class eh9 implements j37 {
    public static final /* synthetic */ int s0 = 0;
    public final hl9 X;
    public final mm9 Y;
    public final ij2 Z;
    public final si9 a;
    public final ku3 b;
    public final sk9 c;
    public final eh9 d;
    public final d7c o;

    public eh9(si9 si9Var, ku3 ku3Var, sk9 sk9Var, eh9 eh9Var, d7c d7cVar, hl9 hl9Var, mm9 mm9Var, ij2 ij2Var) {
        this.a = si9Var;
        this.b = ku3Var;
        this.c = sk9Var;
        this.d = eh9Var;
        this.o = d7cVar;
        this.X = hl9Var;
        this.Y = mm9Var;
        this.Z = ij2Var;
    }

    public static Long a(String str) {
        try {
            ByteBuffer byteBufferPut = ByteBuffer.allocate(8).put(tui.a(str));
            byteBufferPut.flip();
            return Long.valueOf(byteBufferPut.getLong());
        } catch (Throwable th) {
            wqi.f("eh9", "decodeServerId error: %s", th.getMessage(), th);
            return null;
        }
    }

    public final eh9 b() {
        sk9 sk9Var = this.c;
        if (sk9Var == null || sk9Var.a != 2) {
            return null;
        }
        return sk9Var.c;
    }

    public final CharSequence c(pb2 pb2Var) {
        d7c d7cVar = this.o;
        d7cVar.f = pb2Var;
        f7b f7bVar = d7cVar.a;
        d7cVar.j(pb2Var, f7bVar.g(), f7bVar.f());
        d7cVar.h(pb2Var);
        return d7cVar.g;
    }

    public final boolean d() {
        return !this.b.X;
    }

    @Override // defpackage.j37
    /* renamed from: getId */
    public final long getA() {
        return this.a.a;
    }

    @Override // defpackage.j37
    /* renamed from: getTime */
    public final long getC() {
        si9 si9Var = this.a;
        ss4 ss4Var = si9Var.Q0;
        return ss4Var != null ? ss4Var.a : si9Var.c;
    }

    public final String toString() {
        return "Message{data=" + this.a + '}';
    }
}
