package defpackage;

/* loaded from: classes2.dex */
public final class p4f {
    public static final /* synthetic */ yy7[] g = {new z8a(p4f.class, "from", "getFrom$common_release()F"), u45.h(vid.a, p4f.class, "to", "getTo$common_release()F"), new z8a(p4f.class, "stepSize", "getStepSize$common_release()F")};
    public final o4f a = new o4f(this, 0);
    public final o4f b;
    public final o4f c;
    public float d;
    public int e;
    public float f;

    public p4f() {
        o4f o4fVar = new o4f(this, 1);
        this.b = o4fVar;
        this.c = new o4f(this, 2);
        this.e = a();
        float fB = this.d - b();
        yy7 yy7Var = g[1];
        this.f = n7j.b(fB / (((Number) o4fVar.b).floatValue() - b()), 0.0f, 1.0f);
    }

    public final int a() {
        yy7[] yy7VarArr = g;
        yy7 yy7Var = yy7VarArr[1];
        float fFloatValue = ((Number) this.b.b).floatValue() - b();
        yy7 yy7Var2 = yy7VarArr[2];
        return kti.d(fFloatValue / ((Number) this.c.b).floatValue()) + 1;
    }

    public final float b() {
        yy7 yy7Var = g[0];
        return ((Number) this.a.b).floatValue();
    }

    public final void c(float f) {
        float fB = b();
        yy7[] yy7VarArr = g;
        yy7 yy7Var = yy7VarArr[1];
        o4f o4fVar = this.b;
        float fB2 = n7j.b(f, fB, ((Number) o4fVar.b).floatValue());
        this.d = fB2;
        float fB3 = fB2 - b();
        yy7 yy7Var2 = yy7VarArr[1];
        this.f = n7j.b(fB3 / (((Number) o4fVar.b).floatValue() - b()), 0.0f, 1.0f);
    }
}
