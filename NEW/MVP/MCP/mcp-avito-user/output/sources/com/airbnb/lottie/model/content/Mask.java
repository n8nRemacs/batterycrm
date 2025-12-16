package com.airbnb.lottie.model.content;

/* loaded from: classes10.dex */
public class Mask {

    /* renamed from: a, reason: collision with root package name */
    public final MaskMode f59662a;

    /* renamed from: b, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.h f59663b;

    /* renamed from: c, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.d f59664c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f59665d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MaskMode {

        /* renamed from: b, reason: collision with root package name */
        public static final MaskMode f59666b;

        /* renamed from: c, reason: collision with root package name */
        public static final MaskMode f59667c;

        /* renamed from: d, reason: collision with root package name */
        public static final MaskMode f59668d;

        /* renamed from: e, reason: collision with root package name */
        public static final MaskMode f59669e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ MaskMode[] f59670f;

        static {
            MaskMode maskMode = new MaskMode("MASK_MODE_ADD", 0);
            f59666b = maskMode;
            MaskMode maskMode2 = new MaskMode("MASK_MODE_SUBTRACT", 1);
            f59667c = maskMode2;
            MaskMode maskMode3 = new MaskMode("MASK_MODE_INTERSECT", 2);
            f59668d = maskMode3;
            MaskMode maskMode4 = new MaskMode("MASK_MODE_NONE", 3);
            f59669e = maskMode4;
            f59670f = new MaskMode[]{maskMode, maskMode2, maskMode3, maskMode4};
        }

        public MaskMode() {
            throw null;
        }

        public static MaskMode valueOf(String str) {
            return (MaskMode) Enum.valueOf(MaskMode.class, str);
        }

        public static MaskMode[] values() {
            return (MaskMode[]) f59670f.clone();
        }
    }

    public Mask(MaskMode maskMode, com.airbnb.lottie.model.animatable.h hVar, com.airbnb.lottie.model.animatable.d dVar, boolean z12) {
        this.f59662a = maskMode;
        this.f59663b = hVar;
        this.f59664c = dVar;
        this.f59665d = z12;
    }
}
