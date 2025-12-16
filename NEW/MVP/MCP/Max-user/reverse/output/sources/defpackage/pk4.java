package defpackage;

/* loaded from: classes.dex */
public abstract class pk4 extends gj0 {
    public final void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        op5.m("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}
