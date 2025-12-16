package okhttp3;

import X41.j;
import X41.n;
import Y61.k;
import androidx.camera.camera2.internal.G;
import androidx.compose.foundation.H;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import okio.C44805o;

/* compiled from: Credentials.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lokhttp3/Credentials;", "", "()V", "basic", "", "username", "password", "charset", "Ljava/nio/charset/Charset;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Credentials {

    @k
    public static final Credentials INSTANCE = new Credentials();

    private Credentials() {
    }

    @j
    @n
    @k
    public static final String basic(@k String str, @k String str2) {
        return basic$default(str, str2, null, 4, null);
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset charset, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            charset = StandardCharsets.ISO_8859_1;
        }
        return basic(str, str2, charset);
    }

    @j
    @n
    @k
    public static final String basic(@k String username, @k String password, @k Charset charset) {
        String strI = H.i(':', username, password);
        C44805o.f420139e.getClass();
        return G.f("Basic ", new C44805o(strI.getBytes(charset)).a());
    }
}
