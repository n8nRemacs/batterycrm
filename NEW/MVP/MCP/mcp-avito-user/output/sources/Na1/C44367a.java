package na1;

import Aa1.d;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import kotlin.Q;
import ru.mts.biometry.sdk.feature.registration.ui.camera.h;
import ru.mts.biometry.sdk.feature.registration.ui.gallery.g;
import ru.mts.biometry.sdk.feature.registration.ui.intro.b;

/* renamed from: na1.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C44367a implements d {
    @Override // Aa1.d
    public final Fragment a(int i12, Bundle bundle) {
        String string;
        if (i12 == 0) {
            return new b();
        }
        Uri uri = (bundle == null || (string = bundle.getString("image_uri")) == null) ? null : Uri.parse(string);
        if (uri == null) {
            return new h();
        }
        g.f436513m0.getClass();
        g gVar = new g();
        gVar.setArguments(C22777e.b(new Q("image_uri", uri.toString())));
        return gVar;
    }

    @Override // Aa1.d
    public final int a() {
        return 2;
    }
}
