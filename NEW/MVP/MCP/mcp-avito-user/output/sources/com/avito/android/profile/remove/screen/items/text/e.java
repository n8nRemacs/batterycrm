package com.avito.android.profile.remove.screen.items.text;

import Y41.l;
import Y61.k;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: TextItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/remove/screen/items/text/e;", "Lcom/avito/android/profile/remove/screen/items/text/d;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<M90.a, G0> f224136b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super M90.a, G0> lVar) {
        this.f224136b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.e eVar2 = new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.e(this, 1);
        AttributedText attributedText = ((a) aVar).f224129c;
        attributedText.setOnDeepLinkClickListener(eVar2);
        ((g) eVar).r(attributedText);
    }
}
