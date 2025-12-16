package defpackage;

/* loaded from: classes.dex */
public enum t6j implements ami {
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_UNKNOWN(0),
    TYPE_THIN(1),
    TYPE_THICK(2),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_GMV(3);

    public final int a;

    t6j(int i) {
        this.a = i;
    }

    @Override // defpackage.ami
    public final int d() {
        return this.a;
    }
}
