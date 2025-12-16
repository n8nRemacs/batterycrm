package defpackage;

import com.google.android.exoplayer2.ParserException;

/* loaded from: classes.dex */
public final class py {
    public final /* synthetic */ int a = 0;
    public final int b;
    public int c;
    public int d;
    public long e;
    public final boolean f;
    public int g;
    public int h;
    public final Object i;
    public final Object j;

    public py(qyg qygVar, qyg qygVar2, boolean z) throws ParserException {
        this.j = qygVar;
        this.i = qygVar2;
        this.f = z;
        qygVar2.E(12);
        this.b = qygVar2.v();
        qygVar.E(12);
        this.h = qygVar.v();
        cbj.a("first_chunk must be 1", qygVar.f() == 1);
        this.c = -1;
    }

    public final boolean a() {
        switch (this.a) {
            case 0:
                qyg qygVar = (qyg) this.i;
                qyg qygVar2 = (qyg) this.j;
                int i = this.c + 1;
                this.c = i;
                if (i != this.b) {
                    this.e = this.f ? qygVar.w() : qygVar.t();
                    if (this.c == this.g) {
                        this.d = qygVar2.v();
                        qygVar2.F(4);
                        int i2 = this.h - 1;
                        this.h = i2;
                        this.g = i2 > 0 ? qygVar2.v() - 1 : -1;
                        break;
                    }
                }
                break;
            default:
                umb umbVar = (umb) this.i;
                umb umbVar2 = (umb) this.j;
                int i3 = this.c + 1;
                this.c = i3;
                if (i3 != this.b) {
                    this.e = this.f ? umbVar.C() : umbVar.z();
                    if (this.c == this.g) {
                        this.d = umbVar2.B();
                        umbVar2.K(4);
                        int i4 = this.h - 1;
                        this.h = i4;
                        this.g = i4 > 0 ? umbVar2.B() - 1 : -1;
                        break;
                    }
                }
                break;
        }
        return true;
    }

    public py(umb umbVar, umb umbVar2, boolean z) throws androidx.media3.common.ParserException {
        this.j = umbVar;
        this.i = umbVar2;
        this.f = z;
        umbVar2.J(12);
        this.b = umbVar2.B();
        umbVar.J(12);
        this.h = umbVar.B();
        dbj.a("first_chunk must be 1", umbVar.j() == 1);
        this.c = -1;
    }
}
