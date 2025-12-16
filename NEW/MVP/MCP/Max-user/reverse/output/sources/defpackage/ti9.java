package defpackage;

import java.io.Closeable;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class ti9 implements Closeable {
    public final /* synthetic */ int a;
    public final qu0 b;
    public final boolean c;
    public final Object d;
    public final Closeable o;

    public ti9(boolean z, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = z;
                qu0 qu0Var = new qu0();
                this.b = qu0Var;
                Inflater inflater = new Inflater(true);
                this.d = inflater;
                this.o = new zj7(new jbd(qu0Var), inflater);
                break;
            default:
                this.c = z;
                qu0 qu0Var2 = new qu0();
                this.b = qu0Var2;
                Deflater deflater = new Deflater(-1, true);
                this.d = deflater;
                this.o = new ls4(qu0Var2, deflater);
                break;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        switch (this.a) {
            case 0:
                ((ls4) this.o).close();
                break;
            default:
                ((zj7) this.o).close();
                break;
        }
    }
}
