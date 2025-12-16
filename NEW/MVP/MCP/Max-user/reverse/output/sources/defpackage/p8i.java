package defpackage;

import android.os.Handler;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class p8i implements uud {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p8i(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uud
    public final void a(ae4 ae4Var, byte[] bArr, int i) {
        b9i b9iVar;
        switch (this.a) {
            case 0:
                fa6 fa6Var = (fa6) this.b;
                y6i y6iVar = (y6i) fa6Var.c;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                byteBufferWrap.get();
                byteBufferWrap.get();
                byteBufferWrap.getShort();
                int i2 = byteBufferWrap.getInt() & 268435455;
                byteBufferWrap.getInt();
                byteBufferWrap.getInt();
                String string = StandardCharsets.UTF_8.decode(byteBufferWrap.slice()).toString();
                y6iVar.B(i2);
                ut utVar = new ut(y6iVar.B(i2), string);
                Iterator it = ((CopyOnWriteArrayList) fa6Var.d).iterator();
                while (it.hasNext()) {
                    ((d01) it.next()).a.R0.o.onAsrDataPackage(utVar);
                }
                break;
            case 1:
                ((Handler) ((j35) this.b).X).post(new qe5(this, ae4Var, bArr, i, 6));
                break;
            case 2:
                ((jud) this.b).f.post(new qe5(this, ae4Var, bArr, i, 7));
                break;
            default:
                n2e n2eVar = (n2e) this.b;
                if (!n2eVar.f) {
                    z9i z9iVar = new z9i(bArr);
                    ti1 ti1VarB = n2eVar.c.B(z9iVar.d);
                    if (ti1VarB != null) {
                        b9i b9iVar2 = null;
                        if (!n2eVar.f) {
                            if (n2eVar.a.get(ti1VarB) != null) {
                                b9iVar2 = (b9i) n2eVar.a.get(ti1VarB);
                            } else {
                                if (n2eVar.h == null ? true : n2eVar.h.contains(ti1VarB)) {
                                    n2eVar.a.put(ti1VarB, new b9i(n2eVar.b, n2eVar.i, new z9a(n2eVar, 22, ti1VarB)));
                                    b9iVar2 = (b9i) n2eVar.a.get(ti1VarB);
                                }
                            }
                        }
                        if (b9iVar2 != null) {
                            b9iVar2.e.post(new n1h(b9iVar2, 21, z9iVar));
                        }
                        if (((z9iVar.a & 8) != 0) && (b9iVar = (b9i) n2eVar.a.get(ti1VarB)) != null) {
                            b9iVar.a();
                            n2eVar.a.remove(ti1VarB);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
