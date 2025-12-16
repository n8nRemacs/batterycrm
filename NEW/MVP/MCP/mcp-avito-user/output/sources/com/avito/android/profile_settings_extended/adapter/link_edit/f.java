package com.avito.android.profile_settings_extended.adapter.link_edit;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile_management_core.moderation.ModerationStatus;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LinkEditItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/link_edit/f;", "Lcom/avito/android/profile_settings_extended/adapter/link_edit/c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<yc0.k, G0> f229664b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super yc0.k, G0> lVar) {
        this.f229664b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        LinkEditItem linkEditItem = (LinkEditItem) aVar;
        hVar.LX(linkEditItem);
        hVar.Rq(new d(this, linkEditItem));
        hVar.xT(linkEditItem.f229648j);
        DeepLink deepLink = linkEditItem.f229644f;
        if (deepLink != null) {
            hVar.wP(new e(this, deepLink));
        }
        ModerationStatus moderationStatus = linkEditItem.f229645g;
        AttributedText f226771c = moderationStatus != null ? moderationStatus.getF226771c() : null;
        if (f226771c == null) {
            return;
        }
        f226771c.setOnDeepLinkClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.e(this, 7));
    }
}
