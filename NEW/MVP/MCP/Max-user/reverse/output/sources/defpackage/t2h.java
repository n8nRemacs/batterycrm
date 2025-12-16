package defpackage;

import ru.ok.tamtam.media.converter.VideoConverterException;

/* loaded from: classes2.dex */
public final /* synthetic */ class t2h implements tm6, gu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u2h b;

    public /* synthetic */ t2h(u2h u2hVar, int i) {
        this.a = i;
        this.b = u2hVar;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                u2h u2hVar = this.b;
                py4 py4Var = (py4) obj;
                synchronized (u2hVar) {
                    u2hVar.h.a(py4Var);
                }
                return;
            default:
                k2h k2hVar = (k2h) obj;
                azi.b(new ik3(this.b.b.a(), 2, new s2h(k2hVar, 2)).i(), pdf.e, new s2h(k2hVar, 0), new gk0(14, k2hVar));
                return;
        }
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        e2f e2fVarG;
        int i = this.a;
        u2h u2hVar = this.b;
        int i2 = 2;
        k2h k2hVar = (k2h) obj;
        switch (i) {
            case 0:
                if (k2hVar.b && b6a.Q(k2hVar.d)) {
                    wqi.c("u2h", "convertVideo: exists result = %s", k2hVar);
                    return e2f.g(k2hVar);
                }
                wqi.c("u2h", "convertVideo: start convert = %s", k2hVar);
                int i3 = 0;
                if (l8g.c(k2hVar.c)) {
                    q34 q34VarF = u2hVar.a.f(k2hVar.a.a);
                    if (q34VarF == null) {
                        e2fVarG = e2f.f(new VideoConverterException("failed to prepare videoConversion files"));
                    } else {
                        String str = q34VarF.e;
                        if (q34VarF.b == 0) {
                            e2fVarG = e2f.f(new VideoConverterException("content is zero length"));
                        } else if (l8g.c(str)) {
                            e2fVarG = new wk3(i2, new r2h(u2hVar, k2hVar, q34VarF, i3)).m(u2hVar.g.a).i(u2hVar.f);
                        } else {
                            dl6 dl6VarA = k2hVar.a();
                            dl6VarA.c = str;
                            e2fVarG = e2f.g(new k2h(dl6VarA));
                        }
                    }
                } else {
                    e2fVarG = e2f.g(k2hVar);
                }
                int i4 = 1;
                return new k2f(new k2f(new m2f(new k2f(e2fVarG, new t2h(u2hVar, i2), i4), new t2h(u2hVar, 3), 0), new s2h(k2hVar, i4), i3), new t2h(u2hVar, i2), i4);
            default:
                return new wk3(i2, new c5g(u2hVar, 14, k2hVar)).m(u2hVar.e.a).i(u2hVar.f);
        }
    }
}
