package I2;

import android.net.Uri;
import coil.request.t;
import coil.util.l;
import java.io.File;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: FileUriMapper.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LI2/b;", "LI2/d;", "Landroid/net/Uri;", "Ljava/io/File;", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements d<Uri, File> {
    @Override // I2.d
    public final File a(Uri uri, t tVar) {
        Uri uri2 = uri;
        if (l.d(uri2)) {
            return null;
        }
        String scheme = uri2.getScheme();
        if (scheme != null && !scheme.equals("file")) {
            return null;
        }
        String path = uri2.getPath();
        if (path == null) {
            path = "";
        }
        if (!C43066x.j0(path, '/') || ((String) C42745f0.G(uri2.getPathSegments())) == null) {
            return null;
        }
        if (!L.f(uri2.getScheme(), "file")) {
            return new File(uri2.toString());
        }
        String path2 = uri2.getPath();
        if (path2 != null) {
            return new File(path2);
        }
        return null;
    }
}
