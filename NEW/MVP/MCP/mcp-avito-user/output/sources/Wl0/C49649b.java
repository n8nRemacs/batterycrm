package wl0;

import Y61.k;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.text.C43047d;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;

/* compiled from: ResponseBodies.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_network_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: wl0.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49649b {
    @k
    public static final Charset a(@k ResponseBody responseBody) {
        Charset charsetCharset$default;
        MediaType mediaType = responseBody.get$contentType();
        if (mediaType == null || (charsetCharset$default = MediaType.charset$default(mediaType, null, 1, null)) == null) {
            charsetCharset$default = C43047d.f410589b;
        }
        return Util.readBomAsCharset(responseBody.getSource(), charsetCharset$default);
    }
}
