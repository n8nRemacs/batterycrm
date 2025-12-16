package com.avito.android.barcode_encoder;

import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EncodeHintType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/barcode_encoder/EncodeHintType;", "", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EncodeHintType {

    /* renamed from: b, reason: collision with root package name */
    public static final EncodeHintType f98758b;

    /* renamed from: c, reason: collision with root package name */
    public static final EncodeHintType f98759c;

    /* renamed from: d, reason: collision with root package name */
    public static final EncodeHintType f98760d;

    /* renamed from: e, reason: collision with root package name */
    public static final EncodeHintType f98761e;

    /* renamed from: f, reason: collision with root package name */
    public static final EncodeHintType f98762f;

    /* renamed from: g, reason: collision with root package name */
    public static final EncodeHintType f98763g;

    /* renamed from: h, reason: collision with root package name */
    public static final EncodeHintType f98764h;

    /* renamed from: i, reason: collision with root package name */
    public static final EncodeHintType f98765i;

    /* renamed from: j, reason: collision with root package name */
    public static final EncodeHintType f98766j;

    /* renamed from: k, reason: collision with root package name */
    public static final EncodeHintType f98767k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ EncodeHintType[] f98768l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f98769m;

    static {
        EncodeHintType encodeHintType = new EncodeHintType("ERROR_CORRECTION", 0);
        f98758b = encodeHintType;
        EncodeHintType encodeHintType2 = new EncodeHintType("QR_VERSION", 1);
        f98759c = encodeHintType2;
        EncodeHintType encodeHintType3 = new EncodeHintType("QR_MASK_PATTERN", 2);
        f98760d = encodeHintType3;
        EncodeHintType encodeHintType4 = new EncodeHintType("QR_COMPACT", 3);
        f98761e = encodeHintType4;
        EncodeHintType encodeHintType5 = new EncodeHintType("GS1_FORMAT", 4);
        f98762f = encodeHintType5;
        EncodeHintType encodeHintType6 = new EncodeHintType("CHARACTER_SET", 5);
        f98763g = encodeHintType6;
        EncodeHintType encodeHintType7 = new EncodeHintType("MARGIN", 6);
        f98764h = encodeHintType7;
        EncodeHintType encodeHintType8 = new EncodeHintType("VERTICAL_MARGIN", 7);
        f98765i = encodeHintType8;
        EncodeHintType encodeHintType9 = new EncodeHintType("FORCE_CODE_SET", 8);
        f98766j = encodeHintType9;
        EncodeHintType encodeHintType10 = new EncodeHintType("CODE128_COMPACT", 9);
        f98767k = encodeHintType10;
        EncodeHintType[] encodeHintTypeArr = {encodeHintType, encodeHintType2, encodeHintType3, encodeHintType4, encodeHintType5, encodeHintType6, encodeHintType7, encodeHintType8, encodeHintType9, encodeHintType10};
        f98768l = encodeHintTypeArr;
        f98769m = c.a(encodeHintTypeArr);
    }

    public EncodeHintType() {
        throw null;
    }

    public static EncodeHintType valueOf(String str) {
        return (EncodeHintType) Enum.valueOf(EncodeHintType.class, str);
    }

    public static EncodeHintType[] values() {
        return (EncodeHintType[]) f98768l.clone();
    }
}
