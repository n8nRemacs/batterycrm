package defpackage;

/* loaded from: classes.dex */
public interface re7 extends ebd {
    public static final s90 x = new s90("camerax.core.imageInput.inputFormat", Integer.TYPE, null);
    public static final s90 y = new s90("camerax.core.imageInput.inputDynamicRange", u75.class, null);

    default int getInputFormat() {
        return ((Integer) f(x)).intValue();
    }

    default u75 l() {
        u75 u75Var = (u75) d(y, u75.c);
        u75Var.getClass();
        return u75Var;
    }
}
