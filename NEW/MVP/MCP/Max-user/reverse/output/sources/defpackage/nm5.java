package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class nm5 {
    public final /* synthetic */ int a = 1;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public Object f;

    public nm5(a3c a3cVar) {
        this.f = a3cVar;
    }

    public void a() {
        this.c = this.d ? ((aw7) this.f).h() : ((aw7) this.f).m();
    }

    public void b(View view, int i) {
        if (this.d) {
            this.c = ((aw7) this.f).o() + ((aw7) this.f).c(view);
        } else {
            this.c = ((aw7) this.f).f(view);
        }
        this.b = i;
    }

    public void c(View view, int i) {
        int iO = ((aw7) this.f).o();
        if (iO >= 0) {
            b(view, i);
            return;
        }
        this.b = i;
        if (!this.d) {
            int iF = ((aw7) this.f).f(view);
            int iM = iF - ((aw7) this.f).m();
            this.c = iF;
            if (iM > 0) {
                int iH = (((aw7) this.f).h() - Math.min(0, (((aw7) this.f).h() - iO) - ((aw7) this.f).c(view))) - (((aw7) this.f).d(view) + iF);
                if (iH < 0) {
                    this.c -= Math.min(iM, -iH);
                    return;
                }
                return;
            }
            return;
        }
        int iH2 = (((aw7) this.f).h() - iO) - ((aw7) this.f).c(view);
        this.c = ((aw7) this.f).h() - iH2;
        if (iH2 > 0) {
            int iD = this.c - ((aw7) this.f).d(view);
            int iM2 = ((aw7) this.f).m();
            int iMin = iD - (Math.min(((aw7) this.f).f(view) - iM2, 0) + iM2);
            if (iMin < 0) {
                this.c = Math.min(iH2, -iMin) + this.c;
            }
        }
    }

    public void d(int i) {
        this.d |= i > 0;
        this.b += i;
    }

    public void e() {
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.d = false;
        this.e = false;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
            default:
                return super.toString();
        }
    }

    public nm5() {
        e();
    }
}
