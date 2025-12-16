package defpackage;

import androidx.media3.muxer.MuxerException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class ph7 implements s9a {
    public final w3a a;
    public final LinkedHashSet b = new LinkedHashSet();

    public ph7(w3a w3aVar) {
        this.a = w3aVar;
    }

    @Override // defpackage.s9a
    public final void A(ry9 ry9Var) {
        if (qxi.b(ry9Var)) {
            this.b.add(ry9Var);
        }
    }

    @Override // defpackage.s9a
    public final void J(int i, ByteBuffer byteBuffer, zu0 zu0Var) throws MuxerException {
        this.a.J(i, byteBuffer, zu0Var);
    }

    @Override // defpackage.s9a
    public final int c0(hf6 hf6Var) {
        w3a w3aVar = this.a;
        int iC0 = w3aVar.c0(hf6Var);
        if (xz9.m(hf6Var.n)) {
            w3aVar.A(new x3a(hf6Var.z));
        }
        return iC0;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws MuxerException, IOException {
        Iterator it = this.b.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            w3a w3aVar = this.a;
            if (!zHasNext) {
                w3aVar.close();
                return;
            }
            w3aVar.A((ry9) it.next());
        }
    }
}
