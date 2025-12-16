package com.avito.android.profile_vk_linking.start;

import android.view.View;
import androidx.view.Lifecycle;
import com.avito.android.profile_vk_linking.common.VkPopupView;
import kotlin.Metadata;

/* compiled from: VkLinkingStartView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_vk_linking/start/n;", "", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f231485a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final VkLinkingStartFragment f231486b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final e f231487c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.status_view.g f231488d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final VkPopupView f231489e;

    public n(@Y61.k View view, @Y61.k VkLinkingStartFragment vkLinkingStartFragment, @Y61.k e eVar) {
        this.f231485a = view;
        this.f231486b = vkLinkingStartFragment;
        this.f231487c = eVar;
        this.f231488d = new com.avito.android.status_view.g(view, null, new i(this), 2, null);
        this.f231489e = new VkPopupView(view, true, VkPopupView.NavigationType.f230947c, new j(this), new k(this), new l(this), null, 64, null);
        com.avito.android.arch.mvi.android.f.a(eVar, vkLinkingStartFragment.getViewLifecycleOwner(), Lifecycle.State.f46682e, new g(1, this, n.class, "handleOneTimeEvent", "handleOneTimeEvent(Lcom/avito/android/profile_vk_linking/start/mvi/entity/VkLinkingStartOneTimeEvent;)V", 0), new h(1, this, n.class, "render", "render(Lcom/avito/android/profile_vk_linking/start/mvi/entity/state/VkLinkingStartState;)V", 0));
    }
}
