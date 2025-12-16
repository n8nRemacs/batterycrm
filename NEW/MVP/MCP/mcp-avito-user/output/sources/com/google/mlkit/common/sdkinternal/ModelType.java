package com.google.mlkit.common.sdkinternal;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: com.google.mlkit:common@@18.10.0 */
@RX0.a
/* loaded from: classes6.dex */
public final class ModelType {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    @RX0.a
    public static final ModelType f362325b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    @RX0.a
    public static final ModelType f362326c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    @RX0.a
    public static final ModelType f362327d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ModelType[] f362328e;

    static {
        ModelType modelType = new ModelType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        f362325b = modelType;
        ModelType modelType2 = new ModelType("BASE", 1);
        ModelType modelType3 = new ModelType("TRANSLATE", 2);
        f362326c = modelType3;
        ModelType modelType4 = new ModelType("ENTITY_EXTRACTION", 3);
        ModelType modelType5 = new ModelType("CUSTOM", 4);
        f362327d = modelType5;
        f362328e = new ModelType[]{modelType, modelType2, modelType3, modelType4, modelType5, new ModelType("DIGITAL_INK", 5), new ModelType("DIGITAL_INK_SEGMENTATION", 6), new ModelType("TOXICITY_DETECTION", 7), new ModelType("IMAGE_CAPTIONING", 8)};
    }

    @j.N
    public static ModelType[] values() {
        return (ModelType[]) f362328e.clone();
    }
}
