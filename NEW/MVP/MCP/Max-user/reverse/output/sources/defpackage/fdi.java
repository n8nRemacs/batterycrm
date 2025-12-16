package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class fdi {
    public static final fdi a;
    public static final /* synthetic */ fdi[] b;

    static {
        fdi fdiVar = new fdi("DEFAULT", 0);
        a = fdiVar;
        b = new fdi[]{fdiVar, new fdi("SIGNED", 1), new fdi("FIXED", 2)};
    }

    public static fdi[] values() {
        return (fdi[]) b.clone();
    }
}
