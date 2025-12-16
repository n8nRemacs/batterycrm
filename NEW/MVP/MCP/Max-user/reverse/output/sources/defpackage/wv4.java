package defpackage;

import android.media.MediaPlayer;

/* loaded from: classes.dex */
public final class wv4 implements cm6 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ wv4(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                try {
                    if (!iri.b) {
                        f9j.a = true;
                        iri.b = true;
                        g9j.a = new uha(13);
                    }
                    wqi.k(lg8.o, "[Scout]", "Key decoding enabled", new Object[0]);
                    h9j.a = new u1j(28);
                    d92 d92Var = new d92(19, this);
                    esg esgVar = new esg("app-scope");
                    d92Var.invoke(esgVar);
                    iri.a = esgVar.a();
                } catch (Throwable unused) {
                }
                return qqg.a;
            case 1:
                x2e x2eVar = (x2e) this.d;
                d3e d3eVar = (d3e) this.c;
                t2e t2eVar = (t2e) this.b;
                if (t2eVar.getParent() != null) {
                    d3eVar.removeView(t2eVar);
                }
                if (x2eVar == x2e.a) {
                    d3eVar.addView(t2eVar, d3eVar.getChildCount());
                } else {
                    d3eVar.addView(t2eVar, 0);
                }
                d3e.a(x2eVar, d3eVar.t0, d3eVar.u0, new uv1(t2eVar, d3eVar, x2eVar, 10));
                return Boolean.TRUE;
            default:
                return Boolean.valueOf(((g99) this.b).a((MediaPlayer) this.c, ((z1f) this.d).a));
        }
    }
}
