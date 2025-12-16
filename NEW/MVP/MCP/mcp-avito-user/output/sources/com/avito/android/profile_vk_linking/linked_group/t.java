package com.avito.android.profile_vk_linking.linked_group;

import android.view.View;
import androidx.view.Lifecycle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile_vk_linking.common.VkPopupView;
import com.avito.android.profile_vk_linking.common.mvi.entity.VkPopup;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VkLinkedGroupView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_vk_linking/linked_group/t;", "", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f231328a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final VkLinkedGroupFragment f231329b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final f f231330c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.status_view.g f231331d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a f231332e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Y41.p<DeepLink, VkPopup.CommonButton.ActionButton.ActionType, View.OnClickListener> f231333f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final VkPopupView f231334g;

    public t(@Y61.k View view, @Y61.k VkLinkedGroupFragment vkLinkedGroupFragment, @Y61.k f fVar) {
        this.f231328a = view;
        this.f231329b = vkLinkedGroupFragment;
        this.f231330c = fVar;
        this.f231331d = new com.avito.android.status_view.g(view, null, new m(this), 2, null);
        this.f231332e = new a(view.getContext(), new j(this));
        l lVar = new l(this);
        this.f231333f = lVar;
        this.f231334g = new VkPopupView(view, false, VkPopupView.NavigationType.f230946b, new n(this), new o(this), lVar, new p(this));
        com.avito.android.arch.mvi.android.f.a(fVar, vkLinkedGroupFragment.getViewLifecycleOwner(), Lifecycle.State.f46682e, new h(1, this, t.class, "handleOneTimeEvent", "handleOneTimeEvent(Lcom/avito/android/profile_vk_linking/linked_group/mvi/entity/VkLinkedGroupOneTimeEvent;)V", 0), new i(1, this, t.class, "render", "render(Lcom/avito/android/profile_vk_linking/linked_group/mvi/entity/state/VkLinkedGroupState;)V", 0));
    }
}
