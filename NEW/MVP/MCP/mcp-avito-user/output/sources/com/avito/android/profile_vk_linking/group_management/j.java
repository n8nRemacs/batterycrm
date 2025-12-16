package com.avito.android.profile_vk_linking.group_management;

import Vc0.InterfaceC15664a;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.C23425p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile_vk_linking.common.VkPopupView;
import com.avito.android.profile_vk_linking.common.mvi.entity.VkPopup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: VkLinkingGroupManagementView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_vk_linking/group_management/j;", "", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f231186a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final VkLinkingGroupManagementFragment f231187b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final f f231188c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f231189d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f231190e;

    /* renamed from: f, reason: collision with root package name */
    public final RecyclerView f231191f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.status_view.g f231192g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final VkPopupView f231193h;

    /* compiled from: VkLinkingGroupManagementView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[VkPopup.CommonButton.ActionButton.ActionType.values().length];
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                VkPopup.CommonButton.ActionButton.ActionType actionType = VkPopup.CommonButton.ActionButton.ActionType.f231015b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                VkPopup.CommonButton.ActionButton.ActionType actionType2 = VkPopup.CommonButton.ActionButton.ActionType.f231015b;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                VkPopup.CommonButton.ActionButton.ActionType actionType3 = VkPopup.CommonButton.ActionButton.ActionType.f231015b;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                VkPopup.CommonButton.ActionButton.ActionType actionType4 = VkPopup.CommonButton.ActionButton.ActionType.f231015b;
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public j(@Y61.k View view, @Y61.k VkLinkingGroupManagementFragment vkLinkingGroupManagementFragment, @Y61.k f fVar, @Y61.k com.avito.konveyor.adapter.d dVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f231186a = view;
        this.f231187b = vkLinkingGroupManagementFragment;
        this.f231188c = fVar;
        this.f231189d = dVar;
        this.f231190e = aVar;
        this.f231192g = new com.avito.android.status_view.g(view, null, new k(this), 2, null);
        this.f231193h = new VkPopupView(view, false, VkPopupView.NavigationType.f230946b, new l(this), new m(this), new n(this), null, 64, null);
        RecyclerView recyclerView = new RecyclerView(view.getContext(), null);
        recyclerView.setId(View.generateViewId());
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        recyclerView.setItemAnimator(null);
        C23425p c23425p = new C23425p(recyclerView.getRootView().getContext());
        Drawable drawable = androidx.core.content.d.getDrawable(recyclerView.getRootView().getContext(), R.drawable.bg_vk_groups_divider);
        if (drawable != null) {
            c23425p.f54092b = drawable;
        }
        recyclerView.l(c23425p, -1);
        recyclerView.setAdapter(dVar);
        this.f231191f = recyclerView;
        com.avito.android.arch.mvi.android.f.a(fVar, vkLinkingGroupManagementFragment.getViewLifecycleOwner(), Lifecycle.State.f46682e, new h(1, this, j.class, "handleOneTimeEvent", "handleOneTimeEvent(Lcom/avito/android/profile_vk_linking/group_management/mvi/entity/VkLinkingGroupManagementOneTimeEvent;)V", 0), new i(1, this, j.class, "render", "render(Lcom/avito/android/profile_vk_linking/group_management/mvi/entity/state/VkLinkingGroupManagementState;)V", 0));
    }

    public static final VkPopup.CommonButton a(j jVar, ArrayList arrayList, VkPopup.CommonButton.Type type) {
        Object next;
        VkPopup.CommonButton.a aVar;
        jVar.getClass();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            VkPopup.CommonButton commonButton = (VkPopup.CommonButton) next;
            VkPopup.CommonButton.ActionButton actionButton = commonButton.f231010b;
            if ((actionButton != null && actionButton.f231014c == type) || ((aVar = commonButton.f231009a) != null && aVar.f231028c == type)) {
                break;
            }
        }
        return (VkPopup.CommonButton) next;
    }

    public static final InterfaceC15664a b(j jVar, VkPopup.CommonButton commonButton) {
        DeepLink deepLink;
        InterfaceC15664a interfaceC15664aC;
        jVar.getClass();
        VkPopup.CommonButton.ActionButton actionButton = commonButton.f231010b;
        if (actionButton != null && (interfaceC15664aC = c(actionButton.f231013b)) != null) {
            return interfaceC15664aC;
        }
        VkPopup.CommonButton.a aVar = commonButton.f231009a;
        if (aVar == null || (deepLink = aVar.f231027b) == null) {
            return null;
        }
        return new InterfaceC15664a.b(deepLink);
    }

    public static InterfaceC15664a c(VkPopup.CommonButton.ActionButton.ActionType actionType) {
        int iOrdinal = actionType.ordinal();
        if (iOrdinal == 0) {
            return InterfaceC15664a.C1192a.f17276a;
        }
        if (iOrdinal == 1) {
            return InterfaceC15664a.f.f17282a;
        }
        if (iOrdinal == 2) {
            return InterfaceC15664a.h.f17285a;
        }
        if (iOrdinal == 3) {
            return InterfaceC15664a.i.f17286a;
        }
        if (iOrdinal == 4) {
            return InterfaceC15664a.e.f17281a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
