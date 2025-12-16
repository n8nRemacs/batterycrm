package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class e7f {
    public static final e7f X;
    public static final /* synthetic */ e7f[] Y;
    public static final /* synthetic */ zg5 Z;
    public static final e7f b;
    public static final e7f c;
    public static final e7f d;
    public static final e7f o;
    public final int a;

    static {
        e7f e7fVar = new e7f("DIALOG_USER_ID", 0, 1);
        b = e7fVar;
        e7f e7fVar2 = new e7f("DIALOG_BOT_ID", 1, 2);
        c = e7fVar2;
        e7f e7fVar3 = new e7f("CHAT_ID", 2, 3);
        d = e7fVar3;
        e7f e7fVar4 = new e7f("CHANNEL_ID", 3, 4);
        e7f e7fVar5 = new e7f("FOLDER_ID", 4, 5);
        o = e7fVar5;
        e7f e7fVar6 = new e7f("WEBAPP_ID", 5, 6);
        X = e7fVar6;
        e7f[] e7fVarArr = {e7fVar, e7fVar2, e7fVar3, e7fVar4, e7fVar5, e7fVar6};
        Y = e7fVarArr;
        Z = new zg5(e7fVarArr);
    }

    public e7f(String str, int i, int i2) {
        this.a = i2;
    }

    public static e7f valueOf(String str) {
        return (e7f) Enum.valueOf(e7f.class, str);
    }

    public static e7f[] values() {
        return (e7f[]) Y.clone();
    }
}
