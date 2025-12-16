package YW0;

import android.util.Pair;
import com.facebook.common.internal.u;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imageutils.BitmapUtil;
import com.facebook.imageutils.HeifExifUtil;
import com.facebook.imageutils.ImageMetaData;
import com.facebook.imageutils.JfifUtil;
import com.facebook.imageutils.WebpUtil;
import fX0.InterfaceC40366d;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: EncodedImage.java */
@J41.b
/* loaded from: classes13.dex */
public class d implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    @I41.h
    public final com.facebook.common.references.a<PooledByteBuffer> f19498b;

    /* renamed from: c, reason: collision with root package name */
    public RW0.c f19499c;

    /* renamed from: d, reason: collision with root package name */
    public int f19500d;

    /* renamed from: e, reason: collision with root package name */
    public int f19501e;

    /* renamed from: f, reason: collision with root package name */
    public int f19502f;

    /* renamed from: g, reason: collision with root package name */
    public int f19503g;

    /* renamed from: h, reason: collision with root package name */
    public int f19504h;

    /* renamed from: i, reason: collision with root package name */
    public int f19505i;

    /* renamed from: j, reason: collision with root package name */
    @I41.h
    public UW0.a f19506j;

    public d() {
        throw null;
    }

    public d(com.facebook.common.references.a<PooledByteBuffer> aVar) {
        this.f19499c = RW0.c.f14507b;
        this.f19500d = -1;
        this.f19501e = 0;
        this.f19502f = -1;
        this.f19503g = -1;
        this.f19504h = 1;
        this.f19505i = -1;
        if (!com.facebook.common.references.a.k(aVar)) {
            throw new IllegalArgumentException();
        }
        this.f19498b = aVar.clone();
    }

    @I41.h
    public static d a(@I41.h d dVar) throws Throwable {
        d dVar2 = null;
        if (dVar != null) {
            com.facebook.common.references.a aVarB = com.facebook.common.references.a.b(dVar.f19498b);
            if (aVarB != null) {
                try {
                    dVar2 = new d(aVarB);
                } finally {
                    com.facebook.common.references.a.c(aVarB);
                }
            }
            if (dVar2 != null) {
                dVar2.c(dVar);
            }
        }
        return dVar2;
    }

    public static void b(@I41.h d dVar) {
        if (dVar != null) {
            dVar.close();
        }
    }

    public static boolean i(d dVar) {
        return dVar.f19500d >= 0 && dVar.f19502f >= 0 && dVar.f19503g >= 0;
    }

    @InterfaceC40366d
    public static boolean k(@I41.h d dVar) {
        return dVar != null && dVar.j();
    }

    public final void c(d dVar) throws Throwable {
        dVar.m();
        this.f19499c = dVar.f19499c;
        dVar.m();
        this.f19502f = dVar.f19502f;
        dVar.m();
        this.f19503g = dVar.f19503g;
        dVar.m();
        this.f19500d = dVar.f19500d;
        dVar.m();
        this.f19501e = dVar.f19501e;
        this.f19504h = dVar.f19504h;
        this.f19505i = dVar.g();
        this.f19506j = dVar.f19506j;
        dVar.m();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        com.facebook.common.references.a.c(this.f19498b);
    }

    public final String d() {
        com.facebook.common.references.a aVarB = com.facebook.common.references.a.b(this.f19498b);
        if (aVarB == null) {
            return "";
        }
        int iMin = Math.min(g(), 10);
        byte[] bArr = new byte[iMin];
        try {
            ((PooledByteBuffer) aVarB.i()).e(0, 0, iMin, bArr);
            aVarB.close();
            StringBuilder sb2 = new StringBuilder(iMin * 2);
            for (int i12 = 0; i12 < iMin; i12++) {
                sb2.append(String.format("%02X", Byte.valueOf(bArr[i12])));
            }
            return sb2.toString();
        } catch (Throwable th2) {
            aVarB.close();
            throw th2;
        }
    }

    @I41.h
    public final InputStream f() {
        com.facebook.common.references.a aVarB = com.facebook.common.references.a.b(this.f19498b);
        if (aVarB == null) {
            return null;
        }
        try {
            return new wW0.h((PooledByteBuffer) aVarB.i());
        } finally {
            com.facebook.common.references.a.c(aVarB);
        }
    }

    public final int g() {
        com.facebook.common.references.a<PooledByteBuffer> aVar = this.f19498b;
        if (aVar == null) {
            return this.f19505i;
        }
        aVar.i();
        return aVar.i().size();
    }

    public final void h() throws Throwable {
        Pair<Integer, Integer> size;
        InputStream inputStreamF = null;
        try {
            RW0.c cVarA = RW0.d.a(f());
            this.f19499c = cVarA;
            if (RW0.b.a(cVarA) || cVarA == RW0.b.f14504j) {
                size = WebpUtil.getSize(f());
                if (size != null) {
                    this.f19502f = ((Integer) size.first).intValue();
                    this.f19503g = ((Integer) size.second).intValue();
                }
            } else {
                try {
                    inputStreamF = f();
                    ImageMetaData imageMetaDataDecodeDimensionsAndColorSpace = BitmapUtil.decodeDimensionsAndColorSpace(inputStreamF);
                    imageMetaDataDecodeDimensionsAndColorSpace.getColorSpace();
                    Pair<Integer, Integer> dimensions = imageMetaDataDecodeDimensionsAndColorSpace.getDimensions();
                    if (dimensions != null) {
                        this.f19502f = ((Integer) dimensions.first).intValue();
                        this.f19503g = ((Integer) dimensions.second).intValue();
                    }
                    if (inputStreamF != null) {
                        try {
                            inputStreamF.close();
                        } catch (IOException unused) {
                        }
                    }
                    size = imageMetaDataDecodeDimensionsAndColorSpace.getDimensions();
                } catch (Throwable th2) {
                    if (inputStreamF != null) {
                        try {
                            inputStreamF.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th2;
                }
            }
            if (cVarA == RW0.b.f14495a && this.f19500d == -1) {
                if (size != null) {
                    int orientation = JfifUtil.getOrientation(f());
                    this.f19501e = orientation;
                    this.f19500d = JfifUtil.getAutoRotateAngleFromOrientation(orientation);
                    return;
                }
                return;
            }
            if (cVarA == RW0.b.f14505k && this.f19500d == -1) {
                int orientation2 = HeifExifUtil.getOrientation(f());
                this.f19501e = orientation2;
                this.f19500d = JfifUtil.getAutoRotateAngleFromOrientation(orientation2);
            } else if (this.f19500d == -1) {
                this.f19500d = 0;
            }
        } catch (IOException e12) {
            u.a(e12);
            throw null;
        }
    }

    public final synchronized boolean j() {
        return com.facebook.common.references.a.k(this.f19498b);
    }

    public final void m() throws Throwable {
        if (this.f19502f < 0 || this.f19503g < 0) {
            h();
        }
    }
}
