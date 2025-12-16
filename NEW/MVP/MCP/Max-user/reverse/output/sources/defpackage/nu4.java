package defpackage;

/* loaded from: classes.dex */
public final class nu4 extends yr0 {
    @Override // defpackage.yr0
    public final float b(Object obj) {
        return ((ou4) obj).y0.b * 10000.0f;
    }

    @Override // defpackage.yr0
    public final void c(Object obj, float f) {
        ou4 ou4Var = (ou4) obj;
        ou4Var.y0.b = f / 10000.0f;
        ou4Var.invalidateSelf();
    }
}
