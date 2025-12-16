package defpackage;

/* loaded from: classes2.dex */
public enum x8h implements z8h {
    CANCEL_1S("cancel_1s"),
    SWIPE("swipe"),
    DELETE_ON_PREVIEW("delete_on_preview"),
    DELETE_ON_RECORD("delete_on_record");

    public final String a;

    x8h(String str) {
        this.a = str;
    }

    @Override // defpackage.z8h
    public final String getTitle() {
        return this.a;
    }
}
