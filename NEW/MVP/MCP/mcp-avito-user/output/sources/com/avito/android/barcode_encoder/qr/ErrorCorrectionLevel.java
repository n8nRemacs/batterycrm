package com.avito.android.barcode_encoder.qr;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ErrorCorrectionLevel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/barcode_encoder/qr/ErrorCorrectionLevel;", "", "a", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ErrorCorrectionLevel {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f98800c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final ErrorCorrectionLevel[] f98801d;

    /* renamed from: e, reason: collision with root package name */
    public static final ErrorCorrectionLevel f98802e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ErrorCorrectionLevel[] f98803f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f98804g;

    /* renamed from: b, reason: collision with root package name */
    public final int f98805b;

    /* compiled from: ErrorCorrectionLevel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/barcode_encoder/qr/ErrorCorrectionLevel$a;", "", "<init>", "()V", "", "Lcom/avito/android/barcode_encoder/qr/ErrorCorrectionLevel;", "FOR_BITS", "[Lcom/avito/android/barcode_encoder/qr/ErrorCorrectionLevel;", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        ErrorCorrectionLevel errorCorrectionLevel = new ErrorCorrectionLevel("L", 0, 1);
        f98802e = errorCorrectionLevel;
        ErrorCorrectionLevel errorCorrectionLevel2 = new ErrorCorrectionLevel("M", 1, 0);
        ErrorCorrectionLevel errorCorrectionLevel3 = new ErrorCorrectionLevel("Q", 2, 3);
        ErrorCorrectionLevel errorCorrectionLevel4 = new ErrorCorrectionLevel("H", 3, 2);
        ErrorCorrectionLevel[] errorCorrectionLevelArr = {errorCorrectionLevel, errorCorrectionLevel2, errorCorrectionLevel3, errorCorrectionLevel4};
        f98803f = errorCorrectionLevelArr;
        f98804g = c.a(errorCorrectionLevelArr);
        f98800c = new a(null);
        f98801d = new ErrorCorrectionLevel[]{errorCorrectionLevel2, errorCorrectionLevel, errorCorrectionLevel4, errorCorrectionLevel3};
    }

    public ErrorCorrectionLevel(String str, int i12, int i13) {
        this.f98805b = i13;
    }

    public static ErrorCorrectionLevel valueOf(String str) {
        return (ErrorCorrectionLevel) Enum.valueOf(ErrorCorrectionLevel.class, str);
    }

    public static ErrorCorrectionLevel[] values() {
        return (ErrorCorrectionLevel[]) f98803f.clone();
    }
}
