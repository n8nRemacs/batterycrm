package zW0;

import com.facebook.infer.annotation.Nullsafe;
import java.io.UnsupportedEncodingException;

/* compiled from: WebpSupportStatus.java */
@Nullsafe
/* loaded from: classes5.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f444048a = false;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f444049b = a("RIFF");

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f444050c = a("WEBP");

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f444051d = a("VP8 ");

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f444052e = a("VP8L");

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f444053f = a("VP8X");

    public static byte[] a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e12) {
            throw new RuntimeException("ASCII not found!", e12);
        }
    }

    public static boolean b(int i12, byte[] bArr) {
        return i12 >= 20 && c(bArr, f444049b, 0) && c(bArr, f444050c, 8);
    }

    public static boolean c(byte[] bArr, byte[] bArr2, int i12) {
        if (bArr2 == null || bArr2.length + i12 > bArr.length) {
            return false;
        }
        for (int i13 = 0; i13 < bArr2.length; i13++) {
            if (bArr[i13 + i12] != bArr2[i13]) {
                return false;
            }
        }
        return true;
    }
}
