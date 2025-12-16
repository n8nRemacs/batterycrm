package xyz.n.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class ub {

    /* renamed from: b, reason: collision with root package name */
    public static final ub f442800b;

    /* renamed from: c, reason: collision with root package name */
    public static final ub f442801c;

    /* renamed from: d, reason: collision with root package name */
    public static final ub f442802d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ub[] f442803e;

    static {
        ub ubVar = new ub("DELETE_SCREENSHOT", 0);
        f442800b = ubVar;
        ub ubVar2 = new ub("DELETE_FROM_GALLERY", 1);
        f442801c = ubVar2;
        ub ubVar3 = new ub("MAX_SCREENSHOT_NUMBER", 2);
        f442802d = ubVar3;
        f442803e = new ub[]{ubVar, ubVar2, ubVar3};
    }

    public ub() {
        throw null;
    }

    public static ub valueOf(String str) {
        return (ub) Enum.valueOf(ub.class, str);
    }

    public static ub[] values() {
        return (ub[]) f442803e.clone();
    }
}
