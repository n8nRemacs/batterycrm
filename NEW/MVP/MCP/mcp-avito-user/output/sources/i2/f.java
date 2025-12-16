package I2;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import androidx.appcompat.app.r;
import coil.request.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ResourceUriMapper.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LI2/f;", "LI2/d;", "Landroid/net/Uri;", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements d<Uri, Uri> {
    @Override // I2.d
    public final Uri a(Uri uri, t tVar) throws PackageManager.NameNotFoundException {
        String authority;
        Uri uri2 = uri;
        if (!L.f(uri2.getScheme(), "android.resource") || (authority = uri2.getAuthority()) == null || C43066x.K(authority) || uri2.getPathSegments().size() != 2) {
            return null;
        }
        String authority2 = uri2.getAuthority();
        if (authority2 == null) {
            authority2 = "";
        }
        Resources resourcesForApplication = tVar.f58717a.getPackageManager().getResourcesForApplication(authority2);
        List<String> pathSegments = uri2.getPathSegments();
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
        if (identifier == 0) {
            throw new IllegalStateException(r.n(uri2, "Invalid android.resource URI: ").toString());
        }
        return Uri.parse("android.resource://" + authority2 + '/' + identifier);
    }
}
