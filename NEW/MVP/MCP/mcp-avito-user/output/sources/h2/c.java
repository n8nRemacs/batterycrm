package H2;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import coil.request.t;
import coil.util.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UriKeyer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LH2/c;", "LH2/b;", "Landroid/net/Uri;", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements b<Uri> {
    @Override // H2.b
    public final String a(Uri uri, t tVar) {
        Uri uri2 = uri;
        if (!L.f(uri2.getScheme(), "android.resource")) {
            return uri2.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(uri2);
        sb2.append('-');
        Configuration configuration = tVar.f58717a.getResources().getConfiguration();
        Bitmap.Config[] configArr = l.f58781a;
        sb2.append(configuration.uiMode & 48);
        return sb2.toString();
    }
}
