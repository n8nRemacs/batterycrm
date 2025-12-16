package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d9c {
    public static final d9c a;
    public static final d9c b;
    public static final /* synthetic */ d9c[] c;

    static {
        d9c d9cVar = new d9c("Gallery", 0);
        a = d9cVar;
        d9c d9cVar2 = new d9c("Permissions", 1);
        b = d9cVar2;
        c = new d9c[]{d9cVar, d9cVar2};
    }

    public static d9c valueOf(String str) {
        return (d9c) Enum.valueOf(d9c.class, str);
    }

    public static d9c[] values() {
        return (d9c[]) c.clone();
    }
}
