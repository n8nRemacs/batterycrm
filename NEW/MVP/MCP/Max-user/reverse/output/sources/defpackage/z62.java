package defpackage;

import java.util.ArrayDeque;
import java.util.List;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class z62 extends oy implements gof {
    public final /* synthetic */ int X;
    public Object Y;
    public long c;
    public gof d;
    public long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z62() {
        super(1);
        this.X = 0;
    }

    @Override // defpackage.gof
    public final int e(long j) {
        gof gofVar = this.d;
        gofVar.getClass();
        return gofVar.e(j - this.o);
    }

    @Override // defpackage.gof
    public final long g(int i) {
        gof gofVar = this.d;
        gofVar.getClass();
        return gofVar.g(i) + this.o;
    }

    @Override // defpackage.gof
    public final List m(long j) {
        gof gofVar = this.d;
        gofVar.getClass();
        return gofVar.m(j - this.o);
    }

    @Override // defpackage.gof
    public final int s() {
        gof gofVar = this.d;
        gofVar.getClass();
        return gofVar.s();
    }

    public final void w() {
        switch (this.X) {
            case 0:
                b72 b72Var = (b72) ((i62) this.Y).b;
                this.b = 0;
                this.d = null;
                b72Var.b.add(this);
                return;
            case 1:
                ArrayDeque arrayDeque = (ArrayDeque) ((rs0) this.Y).e;
                fsi.d(arrayDeque.size() < 2);
                fsi.b(!arrayDeque.contains(this));
                this.b = 0;
                this.d = null;
                arrayDeque.addFirst(this);
                return;
            default:
                b2f b2fVar = (b2f) this.Y;
                synchronized (b2fVar.b) {
                    this.b = 0;
                    this.d = null;
                    z62[] z62VarArr = b2fVar.f;
                    int i = b2fVar.h;
                    b2fVar.h = i + 1;
                    z62VarArr[i] = this;
                    if (!b2fVar.c.isEmpty() && b2fVar.h > 0) {
                        b2fVar.b.notify();
                    }
                }
                return;
        }
    }

    public final void x(long j, gof gofVar, long j2) {
        this.c = j;
        this.d = gofVar;
        if (j2 != BuildConfig.MAX_TIME_TO_UPLOAD) {
            j = j2;
        }
        this.o = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z62(iof iofVar, int i) {
        super(1);
        this.X = i;
        this.Y = iofVar;
    }
}
