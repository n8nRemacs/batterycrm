package com.avito.android.profile_vk_linking.linked_group;

import Xc0.InterfaceC16989a;
import android.view.View;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile_vk_linking.common.mvi.entity.VkPopup;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VkLinkedGroupView.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Landroid/view/View$OnClickListener;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "actionType", "Lcom/avito/android/profile_vk_linking/common/mvi/entity/VkPopup$CommonButton$ActionButton$ActionType;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class l extends N implements Y41.p<DeepLink, VkPopup.CommonButton.ActionButton.ActionType, View.OnClickListener> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t f231295l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(t tVar) {
        super(2);
        this.f231295l = tVar;
    }

    @Override // Y41.p
    public final View.OnClickListener invoke(DeepLink deepLink, VkPopup.CommonButton.ActionButton.ActionType actionType) {
        DeepLink deepLink2 = deepLink;
        VkPopup.CommonButton.ActionButton.ActionType actionType2 = actionType;
        final t tVar = this.f231295l;
        if (deepLink2 != null) {
            return new com.avito.android.profile.pro.impl.screen.item.recommendations.h(12, tVar, deepLink2);
        }
        if (actionType2 == VkPopup.CommonButton.ActionButton.ActionType.f231018e) {
            final int i12 = 0;
            return new View.OnClickListener() { // from class: com.avito.android.profile_vk_linking.linked_group.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            tVar.f231330c.accept(InterfaceC16989a.f.f18962a);
                            break;
                        default:
                            tVar.f231330c.accept(InterfaceC16989a.C1339a.f18957a);
                            break;
                    }
                }
            };
        }
        if (actionType2 != VkPopup.CommonButton.ActionButton.ActionType.f231015b) {
            return null;
        }
        final int i13 = 1;
        return new View.OnClickListener() { // from class: com.avito.android.profile_vk_linking.linked_group.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        tVar.f231330c.accept(InterfaceC16989a.f.f18962a);
                        break;
                    default:
                        tVar.f231330c.accept(InterfaceC16989a.C1339a.f18957a);
                        break;
                }
            }
        };
    }
}
