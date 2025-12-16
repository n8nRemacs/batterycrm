package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class m69 implements ew8, fw8 {
    public Object X;
    public final /* synthetic */ int a;
    public boolean b;
    public long c;
    public long d;
    public final Object o;

    public m69(r98 r98Var) {
        this.a = 0;
        this.o = new Handler(Looper.getMainLooper());
        this.X = r98Var;
    }

    @Override // defpackage.fw8
    public void J(c3c c3cVar) {
        if (this.b) {
            a(r());
        }
        this.X = c3cVar;
    }

    public void a(long j) {
        switch (this.a) {
            case 2:
                this.c = j;
                if (this.b) {
                    ((kwf) this.o).getClass();
                    this.d = SystemClock.elapsedRealtime();
                    break;
                }
                break;
            default:
                this.c = j;
                if (this.b) {
                    ((mwf) this.o).getClass();
                    this.d = SystemClock.elapsedRealtime();
                    break;
                }
                break;
        }
    }

    public void b() {
        switch (this.a) {
            case 2:
                if (!this.b) {
                    ((kwf) this.o).getClass();
                    this.d = SystemClock.elapsedRealtime();
                    this.b = true;
                    break;
                }
                break;
            default:
                if (!this.b) {
                    ((mwf) this.o).getClass();
                    this.d = SystemClock.elapsedRealtime();
                    this.b = true;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ew8
    public b3c c() {
        return (b3c) this.X;
    }

    @Override // defpackage.ew8
    public long r() {
        switch (this.a) {
            case 2:
                long j = this.c;
                if (!this.b) {
                    return j;
                }
                ((kwf) this.o).getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.d;
                return j + (((b3c) this.X).a == 1.0f ? xxg.B(jElapsedRealtime) : jElapsedRealtime * r4.c);
            default:
                long j2 = this.c;
                if (!this.b) {
                    return j2;
                }
                ((mwf) this.o).getClass();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - this.d;
                return j2 + (((c3c) this.X).a == 1.0f ? zxg.U(jElapsedRealtime2) : jElapsedRealtime2 * r4.c);
        }
    }

    @Override // defpackage.ew8
    public void s(b3c b3cVar) {
        if (this.b) {
            a(r());
        }
        this.X = b3cVar;
    }

    @Override // defpackage.fw8
    /* renamed from: c, reason: collision with other method in class */
    public c3c mo25c() {
        return (c3c) this.X;
    }

    public m69(kwf kwfVar) {
        this.a = 2;
        this.o = kwfVar;
        this.X = b3c.d;
    }

    public m69(mwf mwfVar) {
        this.a = 3;
        this.o = mwfVar;
        this.X = c3c.d;
    }

    public m69(boolean z, long j, long j2, em6 em6Var, em6 em6Var2) {
        this.a = 1;
        this.b = z;
        this.c = j;
        this.d = j2;
        this.o = em6Var;
        this.X = em6Var2;
    }
}
