package defpackage;

/* loaded from: classes.dex */
public enum i54 {
    PUSH_ENTER(true, true),
    PUSH_EXIT(true, false),
    POP_ENTER(false, true),
    POP_EXIT(false, false);

    public final boolean a;
    public final boolean b;

    i54(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
