package defpackage;

/* loaded from: classes.dex */
public abstract class z1j implements Runnable {
    public final n2g a;

    public z1j() {
        this.a = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            n2g n2gVar = this.a;
            if (n2gVar != null) {
                n2gVar.c(e);
            }
        }
    }

    public z1j(n2g n2gVar) {
        this.a = n2gVar;
    }
}
