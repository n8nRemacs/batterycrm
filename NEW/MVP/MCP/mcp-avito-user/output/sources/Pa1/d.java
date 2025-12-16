package pa1;

import android.net.Uri;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class d extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ru.mts.biometry.sdk.feature.registration.ui.gallery.g f428608l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ru.mts.biometry.sdk.feature.registration.ui.gallery.g gVar) {
        super(0);
        this.f428608l = gVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        return Uri.parse(this.f428608l.requireArguments().getString("image_uri"));
    }
}
