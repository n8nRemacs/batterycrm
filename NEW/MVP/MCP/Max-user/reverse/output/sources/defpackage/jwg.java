package defpackage;

/* loaded from: classes2.dex */
public final class jwg implements gwg {
    public final lwg a = new lwg();
    public final bwf b;

    public jwg(bwf bwfVar) {
        this.b = new bwf(new kvf(12, bwfVar));
    }

    @Override // defpackage.gwg
    public final hk3 a(ttg ttgVar) {
        return new kk3(0, new c5g(this, 10, ttgVar));
    }

    @Override // defpackage.gwg
    public final hk3 b(long j) {
        return new kk3(0, new ny1(this, j, 12));
    }

    @Override // defpackage.gwg
    public final hk3 c(bug bugVar) {
        return new kk3(0, new iwg(this, bugVar));
    }

    @Override // defpackage.gwg
    public final hk3 clear() {
        return new kk3(0, new hwg(this, 1));
    }

    @Override // defpackage.gwg
    public final or8 d(bug bugVar) {
        return new sr8(new iwg(this, bugVar));
    }

    @Override // defpackage.gwg
    public final hk3 e(String str) {
        return new kk3(0, new c5g(this, 9, str));
    }

    @Override // defpackage.gwg
    public final or8 f(String str) {
        return ((gwg) this.b.getValue()).f(str);
    }

    @Override // defpackage.gwg
    public final or8 g() {
        vvg vvgVar = vvg.UNKNOWN;
        return new sr8(new hwg(this, 0));
    }
}
