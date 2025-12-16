package defpackage;

/* loaded from: classes.dex */
public abstract class uti implements Runnable {
    public final n2g a;

    public uti() {
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

    public uti(n2g n2gVar) {
        this.a = n2gVar;
    }
}
