package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d8b {
    public static final d8b a;
    public static final /* synthetic */ d8b[] b;

    /* JADX INFO: Fake field, exist only in values array */
    d8b EF0;

    static {
        d8b d8bVar = new d8b("SMALL", 0);
        d8b d8bVar2 = new d8b("MEDIUM", 1);
        a = d8bVar2;
        b = new d8b[]{d8bVar, d8bVar2};
    }

    public static d8b valueOf(String str) {
        return (d8b) Enum.valueOf(d8b.class, str);
    }

    public static d8b[] values() {
        return (d8b[]) b.clone();
    }
}
