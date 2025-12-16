package defpackage;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import java.net.URLDecoder;

/* loaded from: classes.dex */
public final class le4 extends lj0 {
    public byte[] X;
    public int Y;
    public int Z;
    public ye4 o;

    @Override // defpackage.qe4
    public final long R(ye4 ye4Var) throws DataSourceException, ParserException {
        d();
        this.o = ye4Var;
        Uri uri = ye4Var.a;
        long j = ye4Var.g;
        String scheme = uri.getScheme();
        boolean zEquals = "data".equals(scheme);
        String strValueOf = String.valueOf(scheme);
        fsi.a(strValueOf.length() != 0 ? "Unsupported scheme: ".concat(strValueOf) : new String("Unsupported scheme: "), zEquals);
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i = xxg.a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            String strValueOf2 = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(strValueOf2.length() + 23);
            sb.append("Unexpected URI format: ");
            sb.append(strValueOf2);
            throw new ParserException(sb.toString(), null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.X = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                String strValueOf3 = String.valueOf(str);
                throw new ParserException(strValueOf3.length() != 0 ? "Error while parsing Base64 encoded string: ".concat(strValueOf3) : new String("Error while parsing Base64 encoded string: "), e, true, 0);
            }
        } else {
            this.X = URLDecoder.decode(str, mb2.a.name()).getBytes(mb2.c);
        }
        long j2 = ye4Var.f;
        byte[] bArr = this.X;
        if (j2 > bArr.length) {
            this.X = null;
            throw new DataSourceException(2008);
        }
        int i2 = (int) j2;
        this.Y = i2;
        int length = bArr.length - i2;
        this.Z = length;
        if (j != -1) {
            this.Z = (int) Math.min(length, j);
        }
        e(ye4Var);
        return j != -1 ? j : this.Z;
    }

    @Override // defpackage.qe4
    public final void close() throws Throwable {
        if (this.X != null) {
            this.X = null;
            c();
        }
        this.o = null;
    }

    @Override // defpackage.qe4
    public final Uri getUri() {
        ye4 ye4Var = this.o;
        if (ye4Var != null) {
            return ye4Var.a;
        }
        return null;
    }

    @Override // defpackage.je4
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
        int i4 = xxg.a;
        System.arraycopy(bArr2, this.Y, bArr, i, iMin);
        this.Y += iMin;
        this.Z -= iMin;
        b(iMin);
        return iMin;
    }
}
