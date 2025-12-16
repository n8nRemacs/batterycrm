package d1;

import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ h[] f393613b;

    static {
        h[] hVarArr = {new h("BLACKLIST", 0), new h("SDK_VERSION", 1)};
        f393613b = hVarArr;
        c.a(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f393613b.clone();
    }
}
