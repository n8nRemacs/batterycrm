package org.threeten.bp.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class ResolverStyle {

    /* renamed from: b, reason: collision with root package name */
    public static final ResolverStyle f421953b;

    /* renamed from: c, reason: collision with root package name */
    public static final ResolverStyle f421954c;

    /* renamed from: d, reason: collision with root package name */
    public static final ResolverStyle f421955d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ResolverStyle[] f421956e;

    static {
        ResolverStyle resolverStyle = new ResolverStyle("STRICT", 0);
        f421953b = resolverStyle;
        ResolverStyle resolverStyle2 = new ResolverStyle("SMART", 1);
        f421954c = resolverStyle2;
        ResolverStyle resolverStyle3 = new ResolverStyle("LENIENT", 2);
        f421955d = resolverStyle3;
        f421956e = new ResolverStyle[]{resolverStyle, resolverStyle2, resolverStyle3};
    }

    public ResolverStyle() {
        throw null;
    }

    public static ResolverStyle valueOf(String str) {
        return (ResolverStyle) Enum.valueOf(ResolverStyle.class, str);
    }

    public static ResolverStyle[] values() {
        return (ResolverStyle[]) f421956e.clone();
    }
}
