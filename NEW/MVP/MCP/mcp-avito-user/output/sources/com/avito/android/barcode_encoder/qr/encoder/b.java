package com.avito.android.barcode_encoder.qr.encoder;

import Wg.C15761b;
import Y61.k;
import com.avito.android.barcode_encoder.exceptions.WriterException;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: MatrixUtil.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/barcode_encoder/qr/encoder/b;", "", "<init>", "()V", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f98858a = new b();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final int[][] f98859b = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final int[][] f98860c = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final int[][] f98861d = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, WebSocketProtocol.PAYLOAD_SHORT, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, WebSocketProtocol.PAYLOAD_SHORT, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final int[][] f98862e = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0261  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(@Y61.k Rg.C15039a r26, @Y61.k com.avito.android.barcode_encoder.qr.ErrorCorrectionLevel r27, @Y61.k com.avito.android.barcode_encoder.qr.b r28, int r29, @Y61.k Wg.C15761b r30) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.barcode_encoder.qr.encoder.b.a(Rg.a, com.avito.android.barcode_encoder.qr.ErrorCorrectionLevel, com.avito.android.barcode_encoder.qr.b, int, Wg.b):void");
    }

    public static int b(int i12, int i13) {
        if (i13 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i13);
        int i14 = 32 - iNumberOfLeadingZeros;
        int iNumberOfLeadingZeros2 = i12 << (31 - iNumberOfLeadingZeros);
        while (32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2) >= i14) {
            iNumberOfLeadingZeros2 ^= i13 << ((32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2)) - i14);
        }
        return iNumberOfLeadingZeros2;
    }

    public static void c(int i12, int i13, C15761b c15761b) throws WriterException {
        for (int i14 = 0; i14 < 8; i14++) {
            int i15 = i12 + i14;
            if (!f(c15761b.a(i15, i13))) {
                throw new WriterException("");
            }
            c15761b.b(i15, i13, 0);
        }
    }

    public static void d(int i12, int i13, C15761b c15761b) {
        for (int i14 = 0; i14 < 7; i14++) {
            int[] iArr = f98859b[i14];
            for (int i15 = 0; i15 < 7; i15++) {
                c15761b.b(i12 + i15, i13 + i14, iArr[i15]);
            }
        }
    }

    public static void e(int i12, int i13, C15761b c15761b) throws WriterException {
        for (int i14 = 0; i14 < 7; i14++) {
            int i15 = i13 + i14;
            if (!f(c15761b.a(i12, i15))) {
                throw new WriterException("");
            }
            c15761b.b(i12, i15, 0);
        }
    }

    public static boolean f(int i12) {
        return i12 == -1;
    }
}
