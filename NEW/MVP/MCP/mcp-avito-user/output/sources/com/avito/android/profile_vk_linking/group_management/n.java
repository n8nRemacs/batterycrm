package com.avito.android.profile_vk_linking.group_management;

import Vc0.InterfaceC15664a;
import android.view.View;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile_vk_linking.common.mvi.entity.VkPopup;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VkLinkingGroupManagementView.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Landroid/view/View$OnClickListener;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "actionType", "Lcom/avito/android/profile_vk_linking/common/mvi/entity/VkPopup$CommonButton$ActionButton$ActionType;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class n extends N implements Y41.p<DeepLink, VkPopup.CommonButton.ActionButton.ActionType, View.OnClickListener> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f231231l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(j jVar) {
        super(2);
        this.f231231l = jVar;
    }

    @Override // Y41.p
    public final View.OnClickListener invoke(DeepLink deepLink, VkPopup.CommonButton.ActionButton.ActionType actionType) {
        Object objC;
        DeepLink deepLink2 = deepLink;
        VkPopup.CommonButton.ActionButton.ActionType actionType2 = actionType;
        j jVar = this.f231231l;
        if (deepLink2 != null) {
            objC = new InterfaceC15664a.b(deepLink2);
        } else if (actionType2 != null) {
            jVar.getClass();
            objC = j.c(actionType2);
        } else {
            objC = null;
        }
        if (objC != null) {
            return new com.avito.android.profile.pro.impl.screen.item.recommendations.h(11, jVar, objC);
        }
        return null;
    }
}
