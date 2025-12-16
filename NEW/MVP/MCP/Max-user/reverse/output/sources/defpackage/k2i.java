package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class k2i {
    public static final k2i X;
    public static final /* synthetic */ k2i[] Y;
    public static final k2i a;
    public static final k2i b;
    public static final k2i c;
    public static final k2i d;
    public static final k2i o;

    static {
        k2i k2iVar = new k2i("ADAPTIVE_ICON", 0);
        a = k2iVar;
        k2i k2iVar2 = new k2i("PICTURE", 1);
        b = k2iVar2;
        k2i k2iVar3 = new k2i("TITLE_BIG", 2);
        c = k2iVar3;
        k2i k2iVar4 = new k2i("TITLE_STANDARD", 3);
        d = k2iVar4;
        k2i k2iVar5 = new k2i("DESCRIPTION", 4);
        o = k2iVar5;
        k2i k2iVar6 = new k2i("FILE", 5);
        k2i k2iVar7 = new k2i("KEYBOARD", 6);
        X = k2iVar7;
        Y = new k2i[]{k2iVar, k2iVar2, k2iVar3, k2iVar4, k2iVar5, k2iVar6, k2iVar7};
    }

    public static k2i valueOf(String str) {
        return (k2i) Enum.valueOf(k2i.class, str);
    }

    public static k2i[] values() {
        return (k2i[]) Y.clone();
    }
}
