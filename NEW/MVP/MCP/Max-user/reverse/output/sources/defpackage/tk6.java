package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class tk6 implements prf {
    public final bwf X = new bwf(new m2(4, this));
    public boolean Y;
    public final Context a;
    public final String b;
    public final ggg c;
    public final boolean d;
    public final boolean o;

    public tk6(Context context, String str, ggg gggVar, boolean z, boolean z2) {
        this.a = context;
        this.b = str;
        this.c = gggVar;
        this.d = z;
        this.o = z2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        bwf bwfVar = this.X;
        if (bwfVar.e()) {
            ((sk6) bwfVar.getValue()).close();
        }
    }

    @Override // defpackage.prf
    public final pk6 getReadableDatabase() {
        return ((sk6) this.X.getValue()).c(false);
    }

    @Override // defpackage.prf
    public final pk6 getWritableDatabase() {
        return ((sk6) this.X.getValue()).c(true);
    }

    @Override // defpackage.prf
    public final void setWriteAheadLoggingEnabled(boolean z) {
        bwf bwfVar = this.X;
        if (bwfVar.e()) {
            ((sk6) bwfVar.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.Y = z;
    }
}
