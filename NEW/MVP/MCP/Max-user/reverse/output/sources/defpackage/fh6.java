package defpackage;

import android.media.Image;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class fh6 implements jf7 {
    public final jf7 b;
    public final Object a = new Object();
    public final HashSet c = new HashSet();

    public fh6(jf7 jf7Var) {
        this.b = jf7Var;
    }

    @Override // defpackage.jf7
    public final Image V() {
        return this.b.V();
    }

    public final void c(eh6 eh6Var) {
        synchronized (this.a) {
            this.c.add(eh6Var);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        HashSet hashSet;
        this.b.close();
        synchronized (this.a) {
            hashSet = new HashSet(this.c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((eh6) it.next()).a(this);
        }
    }

    @Override // defpackage.jf7
    public final int getFormat() {
        return this.b.getFormat();
    }

    @Override // defpackage.jf7
    public int getHeight() {
        return this.b.getHeight();
    }

    @Override // defpackage.jf7
    public qe7 getImageInfo() {
        return this.b.getImageInfo();
    }

    @Override // defpackage.jf7
    public int getWidth() {
        return this.b.getWidth();
    }

    @Override // defpackage.jf7
    public final h08[] s() {
        return this.b.s();
    }
}
