package defpackage;

/* loaded from: classes2.dex */
public enum p07 implements r07 {
    /* JADX INFO: Fake field, exist only in values array */
    KEYBOARD_PRESS(3),
    VIRTUAL_KEY(1),
    KEYBOARD_TAP(3),
    CONTEXT_CLICK(6),
    GESTURE_START(12),
    CONFIRM(16);

    public final int a;

    p07(int i) {
        this.a = i;
    }

    @Override // defpackage.r07
    public final int a() {
        return this.a;
    }
}
