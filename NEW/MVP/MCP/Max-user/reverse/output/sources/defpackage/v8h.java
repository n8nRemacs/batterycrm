package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class v8h {
    public static final v8h X;
    public static final /* synthetic */ v8h[] Y;
    public static final v8h a;
    public static final v8h b;
    public static final v8h c;
    public static final v8h d;
    public static final v8h o;

    static {
        v8h v8hVar = new v8h("PREPARE", 0);
        a = v8hVar;
        v8h v8hVar2 = new v8h("PLAY", 1);
        b = v8hVar2;
        v8h v8hVar3 = new v8h("IN_PROGRESS", 2);
        c = v8hVar3;
        v8h v8hVar4 = new v8h("PAUSE", 3);
        d = v8hVar4;
        v8h v8hVar5 = new v8h("STOP", 4);
        o = v8hVar5;
        v8h v8hVar6 = new v8h("END", 5);
        X = v8hVar6;
        Y = new v8h[]{v8hVar, v8hVar2, v8hVar3, v8hVar4, v8hVar5, v8hVar6};
    }

    public static v8h valueOf(String str) {
        return (v8h) Enum.valueOf(v8h.class, str);
    }

    public static v8h[] values() {
        return (v8h[]) Y.clone();
    }
}
