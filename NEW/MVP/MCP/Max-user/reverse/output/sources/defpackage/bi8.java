package defpackage;

/* loaded from: classes2.dex */
public enum bi8 implements lqb {
    SOCKET_CLOSED(100),
    SESSION_FORCE_UPDATE(110),
    SESSION_RESTART(111),
    LOGIN_DROP_CACHE(120),
    LOGIN_BACK_BLOCKED(121),
    LOGIN_RESTART(122),
    LOGIN_UNKNOWN(123);

    public final int a;

    bi8(int i) {
        this.a = i;
    }

    @Override // defpackage.lqb
    public final int a() {
        return this.a;
    }
}
