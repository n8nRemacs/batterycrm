package defpackage;

/* loaded from: classes.dex */
public enum rlf implements lt7 {
    /* JADX INFO: Fake field, exist only in values array */
    DUPLICATE_PROPERTIES,
    /* JADX INFO: Fake field, exist only in values array */
    SCALARS_AS_OBJECTS,
    /* JADX INFO: Fake field, exist only in values array */
    UNTYPED_SCALARS;

    public final int a = 1 << ordinal();

    rlf() {
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
