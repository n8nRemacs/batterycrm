package defpackage;

/* loaded from: classes.dex */
public final class z8a extends b9a implements sy7 {
    public z8a(Class cls, String str, String str2) {
        super(nu1.NO_RECEIVER, cls, str, str2, 0);
    }

    @Override // defpackage.nu1
    public final iy7 computeReflected() {
        vid.a.getClass();
        return this;
    }

    @Override // defpackage.xy7
    public final Object get(Object obj) {
        throw null;
    }

    @Override // defpackage.xy7
    public final void getGetter() {
        ((z8a) ((sy7) getReflected())).getGetter();
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        getGetter();
        throw null;
    }
}
