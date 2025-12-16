package defpackage;

/* loaded from: classes.dex */
public class y8a extends b9a implements ry7 {
    public y8a(Class cls, String str) {
        super(nu1.NO_RECEIVER, cls, str, "<v#0>", 0);
    }

    public final void a() {
        ((y8a) ((ry7) getReflected())).a();
    }

    @Override // defpackage.nu1
    public final iy7 computeReflected() {
        vid.a.getClass();
        return this;
    }

    public Object get() {
        mo54getGetter();
        throw null;
    }

    @Override // defpackage.wy7
    public final Object getDelegate() {
        return ((y8a) ((ry7) getReflected())).getDelegate();
    }

    @Override // defpackage.wy7
    /* renamed from: getGetter */
    public final vy7 mo54getGetter() {
        ((y8a) ((ry7) getReflected())).mo54getGetter();
        return null;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        return get();
    }

    public void set(Object obj) {
        a();
        throw null;
    }
}
