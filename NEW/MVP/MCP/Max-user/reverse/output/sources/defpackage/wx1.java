package defpackage;

/* loaded from: classes2.dex */
public enum wx1 implements xx1 {
    EVERYTHING_OK("everything_ok"),
    TO_CONTACTS("to_contacts"),
    BLOCK("block"),
    CLOSE("close"),
    HIDE("hide");

    public final String a;

    wx1(String str) {
        this.a = str;
    }

    @Override // defpackage.xx1
    public final String e() {
        return this.a;
    }
}
