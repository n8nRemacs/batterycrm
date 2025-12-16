package x01;

/* renamed from: x01.j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC49725j {
    public static G a(String str, String str2) {
        C49714A.a().getClass();
        M m12 = (M) C49714A.f441937b.get(str);
        if (m12 == null) {
            return null;
        }
        if (!"alltype".equals(str2)) {
            return m12.a(str2);
        }
        G gA2 = m12.a("oper");
        return gA2 == null ? m12.a("maint") : gA2;
    }
}
