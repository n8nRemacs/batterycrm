package defpackage;

/* loaded from: classes.dex */
public abstract class roc extends uoc implements wy7 {
    @Override // defpackage.nu1
    public iy7 computeReflected() {
        vid.a.getClass();
        return this;
    }

    @Override // defpackage.wy7
    public Object getDelegate() {
        return ((wy7) getReflected()).getDelegate();
    }

    public /* bridge */ /* synthetic */ uy7 getGetter() {
        mo54getGetter();
        return null;
    }

    @Override // defpackage.cm6
    public Object invoke() {
        return get();
    }

    @Override // defpackage.wy7
    /* renamed from: getGetter, reason: collision with other method in class */
    public vy7 mo54getGetter() {
        ((wy7) getReflected()).mo54getGetter();
        return null;
    }
}
