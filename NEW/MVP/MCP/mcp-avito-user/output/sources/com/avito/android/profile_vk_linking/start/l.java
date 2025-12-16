package com.avito.android.profile_vk_linking.start;

import Y41.p;
import android.view.View;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile_vk_linking.common.mvi.entity.VkPopup;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VkLinkingStartView.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Landroid/view/View$OnClickListener;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "actionType", "Lcom/avito/android/profile_vk_linking/common/mvi/entity/VkPopup$CommonButton$ActionButton$ActionType;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class l extends N implements p<DeepLink, VkPopup.CommonButton.ActionButton.ActionType, View.OnClickListener> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f231444l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar) {
        super(2);
        this.f231444l = nVar;
    }

    @Override // Y41.p
    public final View.OnClickListener invoke(DeepLink deepLink, VkPopup.CommonButton.ActionButton.ActionType actionType) {
        DeepLink deepLink2 = deepLink;
        VkPopup.CommonButton.ActionButton.ActionType actionType2 = actionType;
        n nVar = this.f231444l;
        if (deepLink2 != null) {
            return new com.avito.android.profile.pro.impl.screen.item.recommendations.h(13, nVar, deepLink2);
        }
        if (actionType2 == VkPopup.CommonButton.ActionButton.ActionType.f231015b) {
            return new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.a(nVar, 7);
        }
        return null;
    }
}
