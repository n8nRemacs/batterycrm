package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l1e {
    public static final l1e a;
    public static final l1e b;
    public static final /* synthetic */ l1e[] c;

    static {
        l1e l1eVar = new l1e("PREVIEW_VIEW", 0);
        a = l1eVar;
        l1e l1eVar2 = new l1e("SCREEN_FLASH_VIEW", 1);
        b = l1eVar2;
        c = new l1e[]{l1eVar, l1eVar2};
    }

    public static l1e valueOf(String str) {
        return (l1e) Enum.valueOf(l1e.class, str);
    }

    public static l1e[] values() {
        return (l1e[]) c.clone();
    }
}
