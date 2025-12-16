package Ug;

import AK.c;
import Pg.e;
import Y61.k;
import com.avito.android.barcode_encoder.BarcodeFormat;
import java.util.Collection;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43044a;

/* compiled from: ITFWriter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUg/b;", "LPg/e;", "<init>", "()V", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends e {
    @Override // Pg.e
    @k
    public final boolean[] b(@k String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        }
        if (length > 80) {
            throw new IllegalArgumentException(c.g(length, "Requested contents should be less than 80 digits long, but got ").toString());
        }
        e.f13231a.getClass();
        if (!e.f13232b.matcher(str).matches()) {
            throw new IllegalArgumentException("Input should only contain digits 0-9");
        }
        boolean[] zArr = new boolean[(length * 9) + 9];
        C15516a.f16545a.getClass();
        int iA2 = e.a.a(zArr, 0, C15516a.f16547c, true);
        for (int i12 = 0; i12 < length; i12 += 2) {
            int iB2 = C43044a.b(str.charAt(i12));
            int iB3 = C43044a.b(str.charAt(i12 + 1));
            int[] iArr = new int[10];
            for (int i13 = 0; i13 < 5; i13++) {
                int i14 = i13 * 2;
                C15516a.f16545a.getClass();
                int[][] iArr2 = C15516a.f16546b;
                iArr[i14] = iArr2[iB2][i13];
                iArr[i14 + 1] = iArr2[iB3][i13];
            }
            iA2 += e.a.a(zArr, iA2, iArr, true);
        }
        C15516a.f16545a.getClass();
        e.a.a(zArr, iA2, C15516a.f16548d, true);
        return zArr;
    }

    @Override // Pg.e
    @k
    public final Collection<BarcodeFormat> e() {
        return Collections.singletonList(BarcodeFormat.ITF14);
    }
}
