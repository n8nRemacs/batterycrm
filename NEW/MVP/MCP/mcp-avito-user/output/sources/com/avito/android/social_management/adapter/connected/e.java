package com.avito.android.social_management.adapter.connected;

import Y61.k;
import com.avito.android.component.info_block.ConnectionLabel;
import com.avito.android.remote.model.social.SocialNetwork;
import com.avito.android.social_management.adapter.SocialItem;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ConnectedItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/social_management/adapter/connected/e;", "Lcom/avito/android/social_management/adapter/connected/b;", "_avito_social-network-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f284515b;

    public e(@k com.jakewharton.rxrelay3.c cVar) {
        this.f284515b = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ConnectionLabel connectionLabel;
        f fVar = (f) eVar;
        SocialItem.Connected connected = (SocialItem.Connected) aVar;
        SocialNetwork socialNetwork = connected.f284478c;
        fVar.m6(socialNetwork.getTitle());
        if (socialNetwork instanceof SocialNetwork.Google) {
            connectionLabel = ConnectionLabel.f125215d;
        } else if (socialNetwork instanceof SocialNetwork.Odnoklassniki) {
            connectionLabel = ConnectionLabel.f125216e;
        } else if (socialNetwork instanceof SocialNetwork.Vkontakte) {
            connectionLabel = ConnectionLabel.f125214c;
        } else if (socialNetwork instanceof SocialNetwork.Esia) {
            connectionLabel = ConnectionLabel.f125217f;
        } else if (socialNetwork instanceof SocialNetwork.Apple) {
            connectionLabel = ConnectionLabel.f125218g;
        } else if (socialNetwork instanceof SocialNetwork.AvitoFake) {
            connectionLabel = ConnectionLabel.f125219h;
        } else {
            if (!(socialNetwork instanceof SocialNetwork.VkId)) {
                throw new NoWhenBranchMatchedException();
            }
            connectionLabel = ConnectionLabel.f125214c;
        }
        fVar.setIcon(connectionLabel.f125222b);
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        fVar.d(new c(fVar, cVar));
        cVar.b(fVar.A().t0(new d(this, connected)));
    }
}
