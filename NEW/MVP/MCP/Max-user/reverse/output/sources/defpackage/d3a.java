package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d3a {
    public static final d3a a;
    public static final d3a b;
    public static final /* synthetic */ d3a[] c;

    static {
        d3a d3aVar = new d3a("MOVIE", 0);
        a = d3aVar;
        d3a d3aVar2 = new d3a("STREAM", 1);
        b = d3aVar2;
        c = new d3a[]{d3aVar, d3aVar2};
    }

    public static d3a valueOf(String str) {
        return (d3a) Enum.valueOf(d3a.class, str);
    }

    public static d3a[] values() {
        return (d3a[]) c.clone();
    }
}
