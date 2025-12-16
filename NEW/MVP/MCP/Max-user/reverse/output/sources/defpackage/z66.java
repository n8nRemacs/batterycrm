package defpackage;

import ru.ok.android.onelog.impl.BuildConfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class z66 implements gu3 {
    public static final z66 a;
    public static final /* synthetic */ z66[] b;

    static {
        z66 z66Var = new z66("INSTANCE", 0);
        a = z66Var;
        b = new z66[]{z66Var};
    }

    public static z66 valueOf(String str) {
        return (z66) Enum.valueOf(z66.class, str);
    }

    public static z66[] values() {
        return (z66[]) b.clone();
    }

    @Override // defpackage.gu3
    public final void accept(Object obj) {
        ((cof) obj).g(BuildConfig.MAX_TIME_TO_UPLOAD);
    }
}
