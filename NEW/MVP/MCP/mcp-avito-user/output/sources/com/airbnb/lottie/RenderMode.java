package com.airbnb.lottie;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class RenderMode {

    /* renamed from: b, reason: collision with root package name */
    public static final RenderMode f59154b;

    /* renamed from: c, reason: collision with root package name */
    public static final RenderMode f59155c;

    /* renamed from: d, reason: collision with root package name */
    public static final RenderMode f59156d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ RenderMode[] f59157e;

    static {
        RenderMode renderMode = new RenderMode("AUTOMATIC", 0);
        f59154b = renderMode;
        RenderMode renderMode2 = new RenderMode("HARDWARE", 1);
        f59155c = renderMode2;
        RenderMode renderMode3 = new RenderMode("SOFTWARE", 2);
        f59156d = renderMode3;
        f59157e = new RenderMode[]{renderMode, renderMode2, renderMode3};
    }

    public RenderMode() {
        throw null;
    }

    public static RenderMode valueOf(String str) {
        return (RenderMode) Enum.valueOf(RenderMode.class, str);
    }

    public static RenderMode[] values() {
        return (RenderMode[]) f59157e.clone();
    }
}
