package defpackage;

/* loaded from: classes2.dex */
public enum tx1 implements ux1 {
    CHAT_HEAD("CHAT_HEAD"),
    PROFILE("PROFILE"),
    ATTACH("ATTACH"),
    HISTORY("HISTORY"),
    CALL_CONTACT("CALL_CONTACT"),
    CONTACT("CONTACT"),
    RECALL("RECALL");

    public final String a;

    tx1(String str) {
        this.a = str;
    }

    @Override // defpackage.ux1
    public final String a() {
        return this.a;
    }
}
