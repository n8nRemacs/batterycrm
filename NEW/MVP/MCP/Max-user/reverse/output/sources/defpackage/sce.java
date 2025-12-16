package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class sce {
    public static final /* synthetic */ sce[] X;
    public static final sce a;
    public static final sce b;
    public static final sce c;
    public static final sce d;
    public static final sce o;

    static {
        sce sceVar = new sce("UNKNOWN", 0);
        a = sceVar;
        sce sceVar2 = new sce("INITIAL", 1);
        b = sceVar2;
        sce sceVar3 = new sce("MANUAL", 2);
        c = sceVar3;
        sce sceVar4 = new sce("ADAPTIVE", 3);
        d = sceVar4;
        sce sceVar5 = new sce("TRICK_PLAY", 4);
        o = sceVar5;
        X = new sce[]{sceVar, sceVar2, sceVar3, sceVar4, sceVar5};
    }

    public static sce valueOf(String str) {
        return (sce) Enum.valueOf(sce.class, str);
    }

    public static sce[] values() {
        return (sce[]) X.clone();
    }
}
