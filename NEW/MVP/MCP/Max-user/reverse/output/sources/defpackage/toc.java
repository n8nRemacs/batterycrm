package defpackage;

/* loaded from: classes.dex */
public class toc extends uoc implements xy7 {
    public toc(Class cls, String str, String str2, int i) {
        super(nu1.NO_RECEIVER, cls, str, str2, i);
    }

    @Override // defpackage.nu1
    public final iy7 computeReflected() {
        vid.a.getClass();
        return this;
    }

    public Object get(Object obj) {
        getGetter();
        throw null;
    }

    @Override // defpackage.xy7
    public final void getGetter() {
        ((xy7) getReflected()).getGetter();
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        return get(obj);
    }
}
