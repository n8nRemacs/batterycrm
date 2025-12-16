package Iw0;

import Bw0.i;
import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.silent_update_deeplinks.cancel.CancelSilentUpdateLink;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CancelSilentUpdateLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LIw0/c;", "Lev/b;", "Lcom/avito/android/silent_update_deeplinks/cancel/CancelSilentUpdateLink;", "_avito_silent-update-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Iw0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14168c extends AbstractC40162b<CancelSilentUpdateLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final i f8633d;

    @Inject
    public C14168c(@k i iVar) {
        this.f8633d = iVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f8633d.b();
        return AbstractC14250d.c.f9171c;
    }
}
