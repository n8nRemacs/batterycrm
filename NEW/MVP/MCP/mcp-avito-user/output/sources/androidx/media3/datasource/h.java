package androidx.media3.datasource;

import android.net.Uri;
import android.util.Base64;
import androidx.camera.camera2.internal.G;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import com.google.common.base.C37262f;
import j.P;
import java.net.URLDecoder;

/* compiled from: DataSchemeDataSource.java */
@J
/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: e, reason: collision with root package name */
    @P
    public o f48234e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public byte[] f48235f;

    /* renamed from: g, reason: collision with root package name */
    public int f48236g;

    /* renamed from: h, reason: collision with root package name */
    public int f48237h;

    public h() {
        super(false);
    }

    @Override // androidx.media3.datasource.j
    public final void close() {
        if (this.f48235f != null) {
            this.f48235f = null;
            l();
        }
        this.f48234e = null;
    }

    @Override // androidx.media3.datasource.j
    public final long e(o oVar) throws ParserException, DataSourceException {
        m(oVar);
        this.f48234e = oVar;
        Uri uriNormalizeScheme = oVar.f48245a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        C23110a.a("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i12 = M.f47887a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new ParserException(androidx.appcompat.app.r.n(uriNormalizeScheme, "Unexpected URI format: "), null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f48235f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e12) {
                throw new ParserException(G.f("Error while parsing Base64 encoded string: ", str), e12, true, 0);
            }
        } else {
            this.f48235f = URLDecoder.decode(str, C37262f.f359032a.name()).getBytes(C37262f.f359034c);
        }
        byte[] bArr = this.f48235f;
        long length = bArr.length;
        long j12 = oVar.f48250f;
        if (j12 > length) {
            this.f48235f = null;
            throw new DataSourceException(2008);
        }
        int i13 = (int) j12;
        this.f48236g = i13;
        int length2 = bArr.length - i13;
        this.f48237h = length2;
        long j13 = oVar.f48251g;
        if (j13 != -1) {
            this.f48237h = (int) Math.min(length2, j13);
        }
        n(oVar);
        return j13 != -1 ? j13 : this.f48237h;
    }

    @Override // androidx.media3.datasource.j
    @P
    public final Uri getUri() {
        o oVar = this.f48234e;
        if (oVar != null) {
            return oVar.f48245a;
        }
        return null;
    }

    @Override // androidx.media3.common.InterfaceC23102m
    public final int read(byte[] bArr, int i12, int i13) {
        if (i13 == 0) {
            return 0;
        }
        int i14 = this.f48237h;
        if (i14 == 0) {
            return -1;
        }
        int iMin = Math.min(i13, i14);
        byte[] bArr2 = this.f48235f;
        int i15 = M.f47887a;
        System.arraycopy(bArr2, this.f48236g, bArr, i12, iMin);
        this.f48236g += iMin;
        this.f48237h -= iMin;
        k(iMin);
        return iMin;
    }
}
