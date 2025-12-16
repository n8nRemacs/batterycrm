package defpackage;

import java.util.List;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class a72 extends qh4 implements hof {
    public long X;
    public final /* synthetic */ int Y;
    public Object Z;
    public hof o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a72() {
        super(2);
        this.Y = 0;
    }

    @Override // defpackage.hof
    public final int e(long j) {
        hof hofVar = this.o;
        hofVar.getClass();
        return hofVar.e(j - this.X);
    }

    @Override // defpackage.hof
    public final long g(int i) {
        hof hofVar = this.o;
        hofVar.getClass();
        return hofVar.g(i) + this.X;
    }

    @Override // defpackage.hof
    public final List m(long j) {
        hof hofVar = this.o;
        hofVar.getClass();
        return hofVar.m(j - this.X);
    }

    @Override // defpackage.hof
    public final int s() {
        hof hofVar = this.o;
        hofVar.getClass();
        return hofVar.s();
    }

    @Override // defpackage.qh4
    public final void w() {
        this.b = 0;
        this.c = 0L;
        this.d = false;
        this.o = null;
    }

    @Override // defpackage.qh4
    public final void x() {
        switch (this.Y) {
            case 0:
                c72 c72Var = (c72) ((i62) this.Z).b;
                c72Var.getClass();
                w();
                c72Var.b.add(this);
                return;
            case 1:
                jhb jhbVar = (jhb) this.Z;
                synchronized (jhbVar.b) {
                    w();
                    qh4[] qh4VarArr = jhbVar.f;
                    int i = jhbVar.h;
                    jhbVar.h = i + 1;
                    qh4VarArr[i] = this;
                    if (!jhbVar.c.isEmpty() && jhbVar.h > 0) {
                        jhbVar.b.notify();
                    }
                }
                return;
            default:
                ((it4) this.Z).m(this);
                return;
        }
    }

    public final void y(long j, hof hofVar, long j2) {
        this.c = j;
        this.o = hofVar;
        if (j2 != BuildConfig.MAX_TIME_TO_UPLOAD) {
            j = j2;
        }
        this.X = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a72(jof jofVar, int i) {
        super(2);
        this.Y = i;
        this.Z = jofVar;
    }
}
