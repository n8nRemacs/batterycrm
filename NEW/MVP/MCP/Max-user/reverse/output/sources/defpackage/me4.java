package defpackage;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class me4 extends mj0 {
    public byte[] X;
    public int Y;
    public int Z;
    public ze4 o;

    @Override // defpackage.se4
    public final long H(ze4 ze4Var) throws ParserException, DataSourceException {
        d(ze4Var);
        this.o = ze4Var;
        Uri uri = ze4Var.a;
        long j = ze4Var.g;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        hsi.a("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = zxg.a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new ParserException(ctd.i(uriNormalizeScheme, "Unexpected URI format: "), null, true, 0);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.X = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e) {
                throw new ParserException(wy1.h("Error while parsing Base64 encoded string: ", str2), e, true, 0);
            }
        } else {
            this.X = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j2 = ze4Var.f;
        byte[] bArr = this.X;
        if (j2 > bArr.length) {
            this.X = null;
            throw new DataSourceException(2008);
        }
        int i = (int) j2;
        this.Y = i;
        int length = bArr.length - i;
        this.Z = length;
        if (j != -1) {
            this.Z = (int) Math.min(length, j);
        }
        e(ze4Var);
        return j != -1 ? j : this.Z;
    }

    @Override // defpackage.se4
    public final void close() {
        if (this.X != null) {
            this.X = null;
            c();
        }
        this.o = null;
    }

    @Override // defpackage.se4
    public final Uri getUri() {
        ze4 ze4Var = this.o;
        if (ze4Var != null) {
            return ze4Var.a;
        }
        return null;
    }

    @Override // defpackage.ke4
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.Z;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.X;
        String str = zxg.a;
        System.arraycopy(bArr2, this.Y, bArr, i, iMin);
        this.Y += iMin;
        this.Z -= iMin;
        b(iMin);
        return iMin;
    }
}
