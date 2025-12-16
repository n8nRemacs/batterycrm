package defpackage;

/* loaded from: classes2.dex */
public enum bu {
    UNKNOWN("UNKNOWN"),
    /* JADX INFO: Fake field, exist only in values array */
    ADDED("ADDED"),
    /* JADX INFO: Fake field, exist only in values array */
    REMOVED("REMOVED"),
    /* JADX INFO: Fake field, exist only in values array */
    MOVED("MOVED"),
    UPDATED("UPDATED"),
    /* JADX INFO: Fake field, exist only in values array */
    LIST_UPDATED("LIST_UPDATED");

    public static final bu[] d = values();
    public final String a;

    bu(String str) {
        this.a = str;
    }
}
