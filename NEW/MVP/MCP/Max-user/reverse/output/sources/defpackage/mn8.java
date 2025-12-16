package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* loaded from: classes.dex */
public abstract class mn8 {
    public int a;
    public int b;
    public int c;
    public Object d;

    public mn8() {
        if (cyf.a == null) {
            cyf.a = new cyf();
        }
    }

    public int a(int i) {
        if (i < this.c) {
            return ((ByteBuffer) this.d).getShort(this.b + i);
        }
        return 0;
    }

    public void b() {
        if (((nn8) this.d).Z != this.c) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i = this.a;
            nn8 nn8Var = (nn8) this.d;
            if (i >= nn8Var.X || nn8Var.c[i] >= 0) {
                return;
            } else {
                this.a = i + 1;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.b) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.b) {
            tag = c(view);
        } else {
            tag = view.getTag(this.a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateD = hfh.d(view);
            z4 z4Var = accessibilityDelegateD == null ? null : accessibilityDelegateD instanceof y4 ? ((y4) accessibilityDelegateD).a : new z4(accessibilityDelegateD);
            if (z4Var == null) {
                z4Var = new z4();
            }
            hfh.n(view, z4Var);
            view.setTag(this.a, obj);
            hfh.h(view, this.c);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.a < ((nn8) this.d).X;
    }

    public void remove() {
        nn8 nn8Var = (nn8) this.d;
        b();
        if (this.b == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        nn8Var.c();
        nn8Var.h(this.b);
        this.b = -1;
        this.c = nn8Var.Z;
    }
}
