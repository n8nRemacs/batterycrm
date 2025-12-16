package defpackage;

/* loaded from: classes.dex */
public final class qtd extends l6j {
    @Override // defpackage.l6j
    public final void a(gte gteVar, float f, float f2) {
        gteVar.d(0.0f, f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        cte cteVar = new cte(0.0f, 0.0f, f3, f3);
        cteVar.f = 180.0f;
        cteVar.g = 90.0f;
        gteVar.g.add(cteVar);
        ate ateVar = new ate(cteVar);
        gteVar.a(180.0f);
        gteVar.h.add(ateVar);
        gteVar.e = 270.0f;
        float f4 = (0.0f + f3) * 0.5f;
        float f5 = (f3 - 0.0f) / 2.0f;
        double d = 270.0f;
        gteVar.c = (((float) Math.cos(Math.toRadians(d))) * f5) + f4;
        gteVar.d = (f5 * ((float) Math.sin(Math.toRadians(d)))) + f4;
    }
}
