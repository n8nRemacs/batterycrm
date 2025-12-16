package com.avito.android.social.apple;

import android.net.Uri;
import androidx.camera.core.Q;
import com.avito.android.H0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AppleAuthPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/social/apple/f;", "Lcom/avito/android/social/apple/b;", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final H0 f284307a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public l f284308b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public AppleAuthFragment f284309c;

    @Inject
    public f(@Y61.k H0 h02) {
        this.f284307a = h02;
    }

    public final void a() {
        l lVar = this.f284308b;
        if (lVar != null) {
            Uri uri = Uri.parse(this.f284307a.a());
            String strS = AK.c.s(new StringBuilder("https://appleid.apple.com/auth/authorize?client_id=service.ru.avito.app&scope=name%20email&response_mode=form_post&response_type=code"), Q.a("&redirect_uri=", uri.getScheme(), "://", uri.getAuthority(), "/web/1/profile/info/social/redirect"), "&state=2908");
            lVar.f284312b.b(new i());
            lVar.f284313c.loadUrl(strS);
        }
    }
}
