package com.avito.android.barcode_encoder.qr;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FormatInformation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/barcode_encoder/qr/a;", "", "a", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ErrorCorrectionLevel f98816a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f98817b;

    /* compiled from: FormatInformation.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/barcode_encoder/qr/a$a;", "", "<init>", "()V", "", "", "FORMAT_INFO_DECODE_LOOKUP", "[[I", "", "FORMAT_INFO_MASK_QR", "I", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.barcode_encoder.qr.a$a, reason: collision with other inner class name */
    public static final class C2974a {
        public /* synthetic */ C2974a(C42822w c42822w) {
            this();
        }

        public C2974a() {
        }
    }

    static {
        new C2974a(null);
    }

    public a(int i12, C42822w c42822w) {
        int i13 = (i12 >> 3) & 3;
        ErrorCorrectionLevel.f98800c.getClass();
        if (i13 >= 0) {
            ErrorCorrectionLevel[] errorCorrectionLevelArr = ErrorCorrectionLevel.f98801d;
            if (i13 < errorCorrectionLevelArr.length) {
                this.f98816a = errorCorrectionLevelArr[i13];
                this.f98817b = (byte) (i12 & 7);
                return;
            }
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public final boolean equals(@l Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f98816a == aVar.f98816a && this.f98817b == aVar.f98817b;
    }

    public final int hashCode() {
        return (this.f98816a.ordinal() << 3) | this.f98817b;
    }
}
