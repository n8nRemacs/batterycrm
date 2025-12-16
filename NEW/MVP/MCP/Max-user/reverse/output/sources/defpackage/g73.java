package defpackage;

import org.apache.http.client.methods.HttpDelete;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class g73 {
    public static final g73 a;
    public static final /* synthetic */ g73[] b;

    /* JADX INFO: Fake field, exist only in values array */
    g73 EF0;

    static {
        g73 g73Var = new g73("EDIT", 0);
        g73 g73Var2 = new g73(HttpDelete.METHOD_NAME, 1);
        a = g73Var2;
        b = new g73[]{g73Var, g73Var2};
    }

    public static g73 valueOf(String str) {
        return (g73) Enum.valueOf(g73.class, str);
    }

    public static g73[] values() {
        return (g73[]) b.clone();
    }
}
