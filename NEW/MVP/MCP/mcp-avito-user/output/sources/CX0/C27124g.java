package cX0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import com.facebook.common.internal.j;
import com.facebook.infer.annotation.Nullsafe;
import uW0.C48986a;

/* compiled from: SimpleImageTranscoder.java */
@Nullsafe
/* renamed from: cX0.g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C27124g implements InterfaceC27120c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f57923a;

    public C27124g(boolean z12) {
        this.f57923a = z12;
    }

    @Override // cX0.InterfaceC27120c
    public final String a() {
        return "SimpleImageTranscoder";
    }

    @Override // cX0.InterfaceC27120c
    public final C27119b b(YW0.d dVar, wW0.i iVar, @I41.h UW0.e eVar, @I41.h UW0.d dVar2) throws Throwable {
        C27124g c27124g;
        UW0.e eVar2;
        Bitmap bitmapCreateBitmap;
        Integer num = 85;
        if (eVar == null) {
            eVar2 = UW0.e.f16416b;
            c27124g = this;
        } else {
            c27124g = this;
            eVar2 = eVar;
        }
        int iA2 = !c27124g.f57923a ? 1 : C27118a.a(eVar2, dVar2, dVar, 2048);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = iA2;
        try {
            Matrix matrix = null;
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(dVar.f(), null, options);
            if (bitmapDecodeStream == null) {
                C48986a.b("SimpleImageTranscoder", "Couldn't decode the EncodedImage InputStream ! ");
                return new C27119b(2);
            }
            j<Integer> jVar = C27122e.f57919a;
            dVar.m();
            if (jVar.contains(Integer.valueOf(dVar.f19501e))) {
                int iA3 = C27122e.a(eVar2, dVar);
                Matrix matrix2 = new Matrix();
                if (iA3 == 2) {
                    matrix2.setScale(-1.0f, 1.0f);
                } else if (iA3 == 7) {
                    matrix2.setRotate(-90.0f);
                    matrix2.postScale(-1.0f, 1.0f);
                } else if (iA3 == 4) {
                    matrix2.setRotate(180.0f);
                    matrix2.postScale(-1.0f, 1.0f);
                } else if (iA3 == 5) {
                    matrix2.setRotate(90.0f);
                    matrix2.postScale(-1.0f, 1.0f);
                }
                matrix = matrix2;
            } else {
                int iB2 = C27122e.b(eVar2, dVar);
                if (iB2 != 0) {
                    matrix = new Matrix();
                    matrix.setRotate(iB2);
                }
            }
            Matrix matrix3 = matrix;
            if (matrix3 != null) {
                try {
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix3, false);
                } catch (OutOfMemoryError e12) {
                    e = e12;
                    bitmapCreateBitmap = bitmapDecodeStream;
                    C48986a.c("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    C27119b c27119b = new C27119b(2);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return c27119b;
                } catch (Throwable th2) {
                    th = th2;
                    bitmapCreateBitmap = bitmapDecodeStream;
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    throw th;
                }
            } else {
                bitmapCreateBitmap = bitmapDecodeStream;
            }
            try {
                try {
                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, num.intValue(), iVar);
                    C27119b c27119b2 = new C27119b(iA2 > 1 ? 0 : 1);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return c27119b2;
                } catch (OutOfMemoryError e13) {
                    e = e13;
                    C48986a.c("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    C27119b c27119b3 = new C27119b(2);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return c27119b3;
                }
            } catch (Throwable th3) {
                th = th3;
                bitmapCreateBitmap.recycle();
                bitmapDecodeStream.recycle();
                throw th;
            }
        } catch (OutOfMemoryError e14) {
            C48986a.c("SimpleImageTranscoder", "Out-Of-Memory during transcode", e14);
            return new C27119b(2);
        }
    }

    @Override // cX0.InterfaceC27120c
    public final boolean c(RW0.c cVar) {
        return cVar == RW0.b.f14505k || cVar == RW0.b.f14495a;
    }

    @Override // cX0.InterfaceC27120c
    public final boolean d(YW0.d dVar, @I41.h UW0.e eVar, @I41.h UW0.d dVar2) {
        if (eVar == null) {
            eVar = UW0.e.f16416b;
        }
        return this.f57923a && C27118a.a(eVar, dVar2, dVar, 2048) > 1;
    }
}
