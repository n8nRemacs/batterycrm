package com.avito.android.profile_settings_extended.adapter.about;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_management_core.moderation.ModerationStatus;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AboutItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/about/g;", "Lcom/avito/android/profile_settings_extended/adapter/about/c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<yc0.k, G0> f229115b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@k l<? super yc0.k, G0> lVar) {
        this.f229115b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        AboutItem aboutItem = (AboutItem) aVar;
        d dVar = new d(this, aboutItem);
        e eVar2 = new e(this, aboutItem);
        if (!aboutItem.f229098n) {
            eVar2 = null;
        }
        iVar.Nl(aboutItem, dVar, eVar2);
        iVar.xT(aboutItem.f229103s);
        ModerationStatus moderationStatus = aboutItem.f229096l;
        AttributedText f226771c = moderationStatus != null ? moderationStatus.getF226771c() : null;
        if (f226771c != null) {
            f226771c.setOnDeepLinkClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.e(this, 3));
        }
        iVar.d(new f(iVar, f226771c));
    }
}
