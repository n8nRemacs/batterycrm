package com.avito.android.barcode_encoder.qr.encoder;

import Wg.C15761b;
import Y61.k;
import Y61.l;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.barcode_encoder.qr.ErrorCorrectionLevel;
import com.avito.android.barcode_encoder.qr.Mode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: QRCode.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/barcode_encoder/qr/encoder/c;", "", "<init>", "()V", "a", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f98863f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public Mode f98864a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public ErrorCorrectionLevel f98865b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public com.avito.android.barcode_encoder.qr.b f98866c;

    /* renamed from: d, reason: collision with root package name */
    public int f98867d = -1;

    /* renamed from: e, reason: collision with root package name */
    @l
    public C15761b f98868e;

    /* compiled from: QRCode.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/barcode_encoder/qr/encoder/c$a;", "", "<init>", "()V", "", "NUM_MASK_PATTERNS", "I", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @k
    public final String toString() {
        StringBuilder sbQ = e.q(200, "<<\n mode: ");
        sbQ.append(this.f98864a);
        sbQ.append("\n ecLevel: ");
        sbQ.append(this.f98865b);
        sbQ.append("\n version: ");
        sbQ.append(this.f98866c);
        sbQ.append("\n maskPattern: ");
        sbQ.append(this.f98867d);
        if (this.f98868e == null) {
            sbQ.append("\n matrix: null\n");
        } else {
            sbQ.append("\n matrix:\n");
            sbQ.append(this.f98868e);
        }
        sbQ.append(">>\n");
        return sbQ.toString();
    }
}
