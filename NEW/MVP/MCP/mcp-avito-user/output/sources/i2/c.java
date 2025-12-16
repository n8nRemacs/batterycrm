package I2;

import coil.request.t;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: HttpUrlMapper.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LI2/c;", "LI2/d;", "Lokhttp3/HttpUrl;", "", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements d<HttpUrl, String> {
    @Override // I2.d
    public final String a(HttpUrl httpUrl, t tVar) {
        return httpUrl.getUrl();
    }
}
