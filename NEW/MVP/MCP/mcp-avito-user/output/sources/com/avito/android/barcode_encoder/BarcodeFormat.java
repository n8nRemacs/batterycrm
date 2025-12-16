package com.avito.android.barcode_encoder;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BarcodeFormat.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/barcode_encoder/BarcodeFormat;", "", "", "stringRepresentation", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "CODE128", "EAN13", "ITF14", "QR", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BarcodeFormat {

    @c("code128")
    public static final BarcodeFormat CODE128;

    @c("ean13")
    public static final BarcodeFormat EAN13;

    @c("itf14")
    public static final BarcodeFormat ITF14;

    /* renamed from: QR, reason: collision with root package name */
    @c("qr")
    public static final BarcodeFormat f98753QR;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f98754c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ BarcodeFormat[] f98755d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f98756e;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f98757b;

    /* compiled from: BarcodeFormat.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/barcode_encoder/BarcodeFormat$a;", "", "<init>", "()V", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @l
        public static BarcodeFormat a(@k String str) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            BarcodeFormat barcodeFormat = BarcodeFormat.CODE128;
            if (lowerCase.equals(barcodeFormat.f98757b)) {
                return barcodeFormat;
            }
            BarcodeFormat barcodeFormat2 = BarcodeFormat.EAN13;
            if (lowerCase.equals(barcodeFormat2.f98757b)) {
                return barcodeFormat2;
            }
            BarcodeFormat barcodeFormat3 = BarcodeFormat.ITF14;
            if (lowerCase.equals(barcodeFormat3.f98757b)) {
                return barcodeFormat3;
            }
            BarcodeFormat barcodeFormat4 = BarcodeFormat.f98753QR;
            if (lowerCase.equals(barcodeFormat4.f98757b)) {
                return barcodeFormat4;
            }
            return null;
        }

        public a() {
        }
    }

    static {
        BarcodeFormat barcodeFormat = new BarcodeFormat("CODE128", 0, "code128");
        CODE128 = barcodeFormat;
        BarcodeFormat barcodeFormat2 = new BarcodeFormat("EAN13", 1, "ean13");
        EAN13 = barcodeFormat2;
        BarcodeFormat barcodeFormat3 = new BarcodeFormat("ITF14", 2, "itf14");
        ITF14 = barcodeFormat3;
        BarcodeFormat barcodeFormat4 = new BarcodeFormat("QR", 3, "qr");
        f98753QR = barcodeFormat4;
        BarcodeFormat[] barcodeFormatArr = {barcodeFormat, barcodeFormat2, barcodeFormat3, barcodeFormat4};
        f98755d = barcodeFormatArr;
        f98756e = kotlin.enums.c.a(barcodeFormatArr);
        f98754c = new a(null);
    }

    private BarcodeFormat(String str, int i12, String str2) {
        this.f98757b = str2;
    }

    public static BarcodeFormat valueOf(String str) {
        return (BarcodeFormat) Enum.valueOf(BarcodeFormat.class, str);
    }

    public static BarcodeFormat[] values() {
        return (BarcodeFormat[]) f98755d.clone();
    }
}
