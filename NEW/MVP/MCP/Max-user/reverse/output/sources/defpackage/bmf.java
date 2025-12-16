package defpackage;

/* loaded from: classes.dex */
public enum bmf implements lt7 {
    CAN_WRITE_BINARY_NATIVELY,
    CAN_WRITE_FORMATTED_NUMBERS;

    public final int a = 1 << ordinal();

    bmf() {
    }

    @Override // defpackage.lt7
    public final boolean a() {
        return false;
    }

    @Override // defpackage.lt7
    public final int c() {
        return this.a;
    }
}
