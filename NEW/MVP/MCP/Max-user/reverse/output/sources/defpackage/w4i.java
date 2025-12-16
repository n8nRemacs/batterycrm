package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class w4i {
    public static final w4i X;
    public static final /* synthetic */ w4i[] Y;
    public static final w4i a;
    public static final w4i b;
    public static final w4i c;
    public static final w4i d;
    public static final w4i o;

    static {
        w4i w4iVar = new w4i("ENQUEUED", 0);
        a = w4iVar;
        w4i w4iVar2 = new w4i("RUNNING", 1);
        b = w4iVar2;
        w4i w4iVar3 = new w4i("SUCCEEDED", 2);
        c = w4iVar3;
        w4i w4iVar4 = new w4i("FAILED", 3);
        d = w4iVar4;
        w4i w4iVar5 = new w4i("BLOCKED", 4);
        o = w4iVar5;
        w4i w4iVar6 = new w4i("CANCELLED", 5);
        X = w4iVar6;
        Y = new w4i[]{w4iVar, w4iVar2, w4iVar3, w4iVar4, w4iVar5, w4iVar6};
    }

    public static w4i valueOf(String str) {
        return (w4i) Enum.valueOf(w4i.class, str);
    }

    public static w4i[] values() {
        return (w4i[]) Y.clone();
    }

    public final boolean a() {
        return this == c || this == d || this == X;
    }
}
