package com.avito.android.profile.user_profile.cards.extensions;

import Ua0.InterfaceC15503a;
import Y41.l;
import Y61.k;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.user_profile.items.ExtensionsItem;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ExtensionsCardItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/extensions/e;", "Lcom/avito/android/profile/user_profile/cards/extensions/c;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC15503a, G0> f224952b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC15503a, G0> lVar) {
        this.f224952b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        CardItem.ExtensionsCardItem extensionsCardItem = (CardItem.ExtensionsCardItem) aVar;
        gVar.setTitle(extensionsCardItem.f224403d);
        gVar.h(extensionsCardItem.f224404e);
        List<ExtensionsItem.ExtensionInfo> list = extensionsCardItem.f224405f;
        if (list != null) {
            for (ExtensionsItem.ExtensionInfo extensionInfo : list) {
                gVar.p20(extensionInfo.getTitle(), extensionInfo.getDescription());
            }
        }
        List<Action> list2 = extensionsCardItem.f224406g;
        if (list2 != null) {
            for (Action action : list2) {
                gVar.ND(action.getTitle(), new d(this, action));
            }
        }
    }
}
