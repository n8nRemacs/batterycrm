package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class wef {
    public final hwa a;
    public final tef b;
    public final j0e c;
    public final d1g d;

    public wef(hwa hwaVar, tef tefVar, j0e j0eVar, d1g d1gVar) {
        this.a = hwaVar;
        this.b = tefVar;
        this.c = j0eVar;
        this.d = d1gVar;
    }

    public final m76 a(String str) {
        zf8 zf8Var = new zf8((xhb) null, 25);
        if (l8g.c(str)) {
            throw new IllegalStateException("token cannot be null");
        }
        zf8Var.x(ApiProtocol.KEY_TOKEN, str);
        k2f k2fVar = new k2f(new m2f(this.a.G(zf8Var, this.c).h(new kce(20, uef.class)).h(new ycd(29)).h(new vef(0)), new u4e(14, this), 0), new vef(1), 0);
        d1g d1gVar = this.d;
        d1gVar.getClass();
        return k2fVar.j(new b1g(d1gVar, 3, 0));
    }
}
