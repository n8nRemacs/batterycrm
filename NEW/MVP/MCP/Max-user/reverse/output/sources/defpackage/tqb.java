package defpackage;

/* loaded from: classes2.dex */
public enum tqb implements lqb {
    TIMEOUT(0),
    INVALID_SCHEMA(-2),
    INVALID_DURATIONS(-3),
    LACK_SPAN_COUNT(-4),
    LACK_REQUIRED_PROPS(-5),
    SHOULD_BE_TIMEOUT(-6),
    ROOT_SPAN_INVALID_DURATION(-7);

    public final int a;

    tqb(int i) {
        this.a = i;
    }

    @Override // defpackage.lqb
    public final int a() {
        return this.a;
    }
}
