package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class hsa extends am0 {
    public final vta a;
    public final Object[] b;
    public int c;
    public boolean d;
    public volatile boolean o;

    public hsa(vta vtaVar, Object[] objArr) {
        this.a = vtaVar;
        this.b = objArr;
    }

    @Override // defpackage.o1f
    public final void clear() {
        this.c = this.b.length;
    }

    @Override // defpackage.py4
    public final void dispose() {
        this.o = true;
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.o;
    }

    @Override // defpackage.psc
    public final int h(int i) {
        this.d = true;
        return 1;
    }

    @Override // defpackage.o1f
    public final boolean isEmpty() {
        return this.c == this.b.length;
    }

    @Override // defpackage.o1f
    public final Object poll() {
        int i = this.c;
        Object[] objArr = this.b;
        if (i == objArr.length) {
            return null;
        }
        this.c = i + 1;
        Object obj = objArr[i];
        Objects.requireNonNull(obj, "The array element is null");
        return obj;
    }
}
