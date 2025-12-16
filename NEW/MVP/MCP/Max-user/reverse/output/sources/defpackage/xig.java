package defpackage;

/* loaded from: classes.dex */
public final class xig extends vig {
    public final atb d;

    public xig(atb atbVar) {
        this.d = atbVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.c;
        this.c = i + 2;
        Object[] objArr = this.a;
        return new o8a(this.d, objArr[i], objArr[i + 1]);
    }
}
