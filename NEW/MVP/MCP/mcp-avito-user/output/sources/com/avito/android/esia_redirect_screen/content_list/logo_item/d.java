package com.avito.android.esia_redirect_screen.content_list.logo_item;

import android.net.Uri;
import com.avito.android.image_loader.ImageRequest;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EsiaRedirectContentLogoPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/esia_redirect_screen/content_list/logo_item/d;", "LTV0/d;", "Lcom/avito/android/esia_redirect_screen/content_list/logo_item/c;", "Lcom/avito/android/esia_redirect_screen/content_list/logo_item/EsiaRedirectContentLogoItem;", "<init>", "()V", "_avito_gig_esia-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements TV0.d<c, EsiaRedirectContentLogoItem> {
    @Inject
    public d() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ImageRequest.a aVar2 = new ImageRequest.a(new DM.a(((c) eVar).f147975b));
        aVar2.f(Uri.parse(((EsiaRedirectContentLogoItem) aVar).f147969b));
        aVar2.c();
    }
}
