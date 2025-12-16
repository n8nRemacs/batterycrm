package androidx.media3.datasource;

import defpackage.ho7;
import java.util.Map;

/* loaded from: classes.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {
    public final byte[] X;
    public final int d;
    public final Map o;

    public HttpDataSource$InvalidResponseCodeException(int i, String str, DataSourceException dataSourceException, Map map, byte[] bArr) {
        super(ho7.f(i, "Response code: "), dataSourceException, 2004);
        this.d = i;
        this.o = map;
        this.X = bArr;
    }
}
