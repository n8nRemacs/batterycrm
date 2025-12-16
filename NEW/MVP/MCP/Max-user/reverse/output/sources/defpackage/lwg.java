package defpackage;

import java.util.Collections;

/* loaded from: classes2.dex */
public final class lwg implements gwg {
    public final /* synthetic */ int a;
    public final Object b;

    public lwg() {
        this.a = 0;
        this.b = Collections.synchronizedMap(new kr8(1000));
    }

    @Override // defpackage.gwg
    public final hk3 a(ttg ttgVar) {
        switch (this.a) {
            case 0:
                return new kk3(0, new c5g(this, 11, ttgVar));
            default:
                return new ik3(h(), 2, new ytg(ttgVar, 4));
        }
    }

    @Override // defpackage.gwg
    public final hk3 b(long j) {
        switch (this.a) {
            case 0:
                return new kk3(0, new c5g(this, 12, new t00(j, 15)));
            default:
                return new ik3(h(), 2, new t00(j, 16));
        }
    }

    @Override // defpackage.gwg
    public final hk3 c(bug bugVar) {
        switch (this.a) {
            case 0:
                return new kk3(0, new kwg(this, bugVar));
            default:
                return new ik3(h(), 2, new ztg(bugVar, 3));
        }
    }

    @Override // defpackage.gwg
    public final hk3 clear() {
        switch (this.a) {
            case 0:
                return new kk3(0, new ehg(9, this));
            default:
                return new ik3(h(), 2, new fwg(3));
        }
    }

    @Override // defpackage.gwg
    public final or8 d(bug bugVar) {
        switch (this.a) {
            case 0:
                return new sr8(new kwg(this, bugVar));
            default:
                return new xr8(new wr8(h(), new ztg(bugVar, 2), 1), new fwg(6), 1);
        }
    }

    @Override // defpackage.gwg
    public final hk3 e(String str) {
        switch (this.a) {
            case 0:
                return new kk3(0, new c5g(this, 12, new zi4(str, 5)));
            default:
                return new ik3(h(), 2, new zi4(str, 7));
        }
    }

    @Override // defpackage.gwg
    public final or8 f(String str) {
        switch (this.a) {
            case 0:
                return new xr8(str.isEmpty() ? tr8.a : new sr8(new c5g(this, 13, str)), new fwg(2), 1);
            default:
                return new wr8(h(), new zi4(str, 6), 1);
        }
    }

    @Override // defpackage.gwg
    public final or8 g() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                vvg vvgVar = vvg.UNKNOWN;
                return new wr8(new ora(new vr8(new wr8(h(), new fwg(5), 1), new vef(8), 0), new fwg(6), 5).s(), new fwg(7), 1);
        }
    }

    public m2f h() {
        return ((q9b) this.b).w().h(new fwg(4));
    }

    public lwg(q9b q9bVar) {
        this.a = 1;
        this.b = q9bVar;
    }
}
