package androidx.compose.material;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Scaffold.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/S7;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class S7 {

    /* renamed from: b, reason: collision with root package name */
    public static final S7 f33169b;

    /* renamed from: c, reason: collision with root package name */
    public static final S7 f33170c;

    /* renamed from: d, reason: collision with root package name */
    public static final S7 f33171d;

    /* renamed from: e, reason: collision with root package name */
    public static final S7 f33172e;

    /* renamed from: f, reason: collision with root package name */
    public static final S7 f33173f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ S7[] f33174g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f33175h;

    static {
        S7 s72 = new S7("TopBar", 0);
        f33169b = s72;
        S7 s73 = new S7("MainContent", 1);
        f33170c = s73;
        S7 s74 = new S7("Snackbar", 2);
        f33171d = s74;
        S7 s75 = new S7("Fab", 3);
        f33172e = s75;
        S7 s76 = new S7("BottomBar", 4);
        f33173f = s76;
        S7[] s7Arr = {s72, s73, s74, s75, s76};
        f33174g = s7Arr;
        f33175h = kotlin.enums.c.a(s7Arr);
    }

    public S7() {
        throw null;
    }

    public static S7 valueOf(String str) {
        return (S7) Enum.valueOf(S7.class, str);
    }

    public static S7[] values() {
        return (S7[]) f33174g.clone();
    }
}
