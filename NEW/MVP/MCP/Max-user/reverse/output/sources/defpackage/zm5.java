package defpackage;

/* loaded from: classes.dex */
public final class zm5 {
    public final lfg a;
    public final int[] b;

    public zm5(int i, lfg lfgVar, int[] iArr) {
        if (iArr.length == 0) {
            a8i.h("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = lfgVar;
        this.b = iArr;
    }
}
