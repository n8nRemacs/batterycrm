package com.avito.android.barcode_encoder.qr.encoder;

import Rg.C15039a;
import Y61.k;
import androidx.compose.runtime.C22026a;
import com.avito.android.barcode_encoder.exceptions.WriterException;
import com.avito.android.barcode_encoder.qr.ErrorCorrectionLevel;
import com.avito.android.barcode_encoder.qr.Mode;
import com.avito.android.barcode_encoder.qr.b;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;

/* compiled from: Encoder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/barcode_encoder/qr/encoder/a;", "", "<init>", "()V", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f98854a = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final Charset f98855b = Charset.forName("SJIS");

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final int[] f98856c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f98857d = StandardCharsets.ISO_8859_1;

    /* compiled from: Encoder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.barcode_encoder.qr.encoder.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C2978a {
        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Mode mode = Mode.f98806d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Mode mode2 = Mode.f98806d;
                iArr[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Mode mode3 = Mode.f98806d;
                iArr[6] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static void a(@k String str, @k Mode mode, @k C15039a c15039a, @k Charset charset) throws WriterException {
        int i12;
        int iOrdinal = mode.ordinal();
        int i13 = 0;
        if (iOrdinal == 1) {
            int length = str.length();
            while (i13 < length) {
                int iCharAt = str.charAt(i13) - '0';
                int i14 = i13 + 2;
                if (i14 < length) {
                    c15039a.b(C22026a.a(str.charAt(i13 + 1) - '0', 10, iCharAt * 100, str.charAt(i14) - '0'), 10);
                    i13 += 3;
                } else {
                    i13++;
                    if (i13 < length) {
                        c15039a.b((iCharAt * 10) + (str.charAt(i13) - '0'), 7);
                        i13 = i14;
                    } else {
                        c15039a.b(iCharAt, 4);
                    }
                }
            }
            return;
        }
        if (iOrdinal == 2) {
            int length2 = str.length();
            while (i13 < length2) {
                char cCharAt = str.charAt(i13);
                int[] iArr = f98856c;
                int i15 = cCharAt < iArr.length ? iArr[cCharAt] : -1;
                if (i15 == -1) {
                    throw new WriterException("");
                }
                int i16 = i13 + 1;
                if (i16 < length2) {
                    char cCharAt2 = str.charAt(i16);
                    int i17 = cCharAt2 < iArr.length ? iArr[cCharAt2] : -1;
                    if (i17 == -1) {
                        throw new WriterException("");
                    }
                    c15039a.b((i15 * 45) + i17, 11);
                    i13 += 2;
                } else {
                    c15039a.b(i15, 6);
                    i13 = i16;
                }
            }
            return;
        }
        if (iOrdinal == 4) {
            byte[] bytes = str.getBytes(charset);
            int length3 = bytes.length;
            while (i13 < length3) {
                c15039a.b(bytes[i13], 8);
                i13++;
            }
            return;
        }
        if (iOrdinal != 6) {
            throw new WriterException("Invalid mode: " + mode);
        }
        byte[] bytes2 = str.getBytes(f98855b);
        if (bytes2.length % 2 != 0) {
            throw new WriterException("Kanji byte size not even");
        }
        int length4 = bytes2.length - 1;
        while (i13 < length4) {
            int i18 = ((bytes2[i13] & 255) << 8) | (bytes2[i13 + 1] & 255);
            int i19 = 33088;
            if (33088 <= i18 && i18 < 40957) {
                i12 = i18 - i19;
            } else if (57408 > i18 || i18 >= 60352) {
                i12 = -1;
            } else {
                i19 = 49472;
                i12 = i18 - i19;
            }
            if (i12 == -1) {
                throw new WriterException("Invalid byte sequence");
            }
            c15039a.b(((i12 >> 8) * 192) + (i12 & 255), 13);
            i13 += 2;
        }
    }

    public static com.avito.android.barcode_encoder.qr.b b(int i12, ErrorCorrectionLevel errorCorrectionLevel) throws WriterException {
        for (int i13 = 1; i13 < 41; i13++) {
            com.avito.android.barcode_encoder.qr.b.f98818d.getClass();
            com.avito.android.barcode_encoder.qr.b bVarA = b.a.a(i13);
            if (d(i12, bVarA, errorCorrectionLevel)) {
                return bVarA;
            }
        }
        throw new WriterException("Data too big");
    }

    public static boolean c(@k String str) {
        byte[] bytes = str.getBytes(f98855b);
        int length = bytes.length;
        if (length % 2 != 0) {
            return false;
        }
        for (int i12 = 0; i12 < length; i12 += 2) {
            int i13 = bytes[i12] & 255;
            if ((i13 < 129 || i13 > 159) && (i13 < 224 || i13 > 235)) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(int i12, @k com.avito.android.barcode_encoder.qr.b bVar, @k ErrorCorrectionLevel errorCorrectionLevel) {
        b.c cVar = bVar.f98821b[errorCorrectionLevel.ordinal()];
        int i13 = 0;
        for (b.C2975b c2975b : cVar.f98826b) {
            i13 += c2975b.f98823a;
        }
        return bVar.f98822c - (i13 * cVar.f98825a) >= (i12 + 7) / 8;
    }
}
