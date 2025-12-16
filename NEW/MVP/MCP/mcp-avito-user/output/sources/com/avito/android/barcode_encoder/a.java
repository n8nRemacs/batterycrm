package com.avito.android.barcode_encoder;

import Pg.c;
import Pg.d;
import Qg.C14892a;
import Rg.b;
import Y61.k;
import android.graphics.Bitmap;
import com.avito.android.barcode_encoder.BarcodeFormat;
import javax.inject.Inject;
import kotlin.C42833p;
import kotlin.Metadata;

/* compiled from: BarcodeEncoder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/barcode_encoder/a;", "LPg/c;", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C14892a f98770a;

    @Inject
    public a(@k C14892a c14892a) {
        this.f98770a = c14892a;
    }

    public static Bitmap b(b bVar) {
        int i12 = bVar.f14551a;
        int i13 = bVar.f14552b;
        int[] iArr = new int[i12 * i13];
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i14 * i12;
            for (int i16 = 0; i16 < i12; i16++) {
                iArr[i15 + i16] = (int) (((bVar.f14554d[(i16 / 32) + (bVar.f14553c * i14)] >>> (i16 & 31)) & 1) != 0 ? 4278190080L : 4294967295L);
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i12, i13, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPixels(iArr, 0, i12, 0, 0, i12, i13);
        return bitmapCreateBitmap;
    }

    @Override // Pg.c
    @k
    public final Bitmap a(int i12, int i13, @k String str, @k String str2) throws Exception {
        BarcodeFormat.f98754c.getClass();
        BarcodeFormat barcodeFormatA = BarcodeFormat.a.a(str2);
        C14892a c14892a = this.f98770a;
        if (barcodeFormatA == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Wrong barcode format. Expected one of the BarcodeFormat enum values, but was: ".concat(str2));
            String strB = C42833p.b(illegalArgumentException);
            c14892a.getClass();
            c14892a.f13971a.c(new Qg.c(str2, str, strB));
            throw illegalArgumentException;
        }
        try {
            return b(d.f13229a.a(str, barcodeFormatA, i12, i13, null));
        } catch (Exception e12) {
            String strName = barcodeFormatA.name();
            String strB2 = C42833p.b(e12);
            c14892a.getClass();
            c14892a.f13971a.c(new Qg.c(strName, str, strB2));
            throw e12;
        }
    }
}
