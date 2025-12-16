package defpackage;

/* loaded from: classes2.dex */
public final class aai {
    public static final bwf c = new bwf(new dwh(6));
    public final String a = aai.class.getName();
    public final Throwable b;

    public aai() {
        if (x9i.a.get() != null) {
            throw new ClassCastException();
        }
        try {
            System.loadLibrary("gleff");
            th = null;
        } catch (Throwable th) {
            th = th;
            wqi.e(this.a, "failed to load gl-effects library with system loader", th);
        }
        this.b = th;
    }
}
