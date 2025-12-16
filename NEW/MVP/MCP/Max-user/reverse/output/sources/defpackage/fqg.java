package defpackage;

/* loaded from: classes2.dex */
public final class fqg {
    public final tcf a;

    public fqg() {
        sxg sxgVar = ((t1b) zm.a()).j().c;
        this.a = ucf.a(Float.valueOf(sxgVar.g.getFloat("app.extra.text.size.sp", 0.0f)));
        nm0 nm0Var = sxgVar.h;
        nm0Var.getClass();
        try {
            nm0Var.a(new pra(new v08(new hfd(10, this), pdf.f, pdf.d)));
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            raj.c(th);
            t8j.a(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
