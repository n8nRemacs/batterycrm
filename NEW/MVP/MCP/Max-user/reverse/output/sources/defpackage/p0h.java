package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class p0h {
    public static final p0h a;
    public static final p0h b;
    public static final p0h c;
    public static final /* synthetic */ p0h[] d;

    static {
        p0h p0hVar = new p0h("ACTION_PLAY", 0);
        a = p0hVar;
        p0h p0hVar2 = new p0h("FIRST_FRAME", 1);
        b = p0hVar2;
        p0h p0hVar3 = new p0h("FIRST_BYTES", 2);
        c = p0hVar3;
        d = new p0h[]{p0hVar, p0hVar2, p0hVar3, new p0h("CONTENT_ERROR", 3), new p0h("EMPTY_BUFFER", 4), new p0h("CLOSE_AT_EMPTY_BUFFER", 5)};
    }

    public static p0h valueOf(String str) {
        return (p0h) Enum.valueOf(p0h.class, str);
    }

    public static p0h[] values() {
        return (p0h[]) d.clone();
    }
}
