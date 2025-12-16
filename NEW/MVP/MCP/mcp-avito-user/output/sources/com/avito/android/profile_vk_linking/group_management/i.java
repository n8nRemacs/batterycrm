package com.avito.android.profile_vk_linking.group_management;

import Wc0.C15743a;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.profile_vk_linking.common.VkPopupView;
import com.avito.android.profile_vk_linking.common.deep_linking.ProfileVkRequestTokenLink;
import com.avito.android.util.D6;
import com.avito.android.util.O2;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.H;

/* compiled from: VkLinkingGroupManagementView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class i extends H implements Y41.l<C15743a, G0> {
    @Override // Y41.l
    public final G0 invoke(C15743a c15743a) {
        C15743a c15743a2 = c15743a;
        j jVar = (j) this.receiver;
        jVar.getClass();
        boolean z12 = c15743a2.f17981a;
        com.avito.android.status_view.g gVar = jVar.f231192g;
        if (z12) {
            D6.H(gVar.f284965h);
            D6.w(gVar.f284961d);
            gVar.f284967j.e();
        } else {
            String str = c15743a2.f17982b;
            if (str != null) {
                com.avito.android.status_view.g.a(gVar, str, null, 14);
            } else {
                C15743a.b bVar = c15743a2.f17983c;
                if (bVar != null) {
                    D6.w(gVar.f284965h);
                    D6.w(gVar.f284961d);
                    gVar.f284967j.e();
                    List<com.avito.android.profile_vk_linking.group_management.adapter.group.a> list = bVar.f17987c;
                    boolean zA2 = O2.a(list);
                    com.avito.konveyor.adapter.d dVar = jVar.f231189d;
                    VkPopupView vkPopupView = jVar.f231193h;
                    if (zA2) {
                        RecyclerView recyclerView = jVar.f231191f;
                        if (recyclerView == null) {
                            recyclerView = null;
                        }
                        NestedScrollView nestedScrollView = vkPopupView.f230945s;
                        ViewGroup.LayoutParams layoutParams = nestedScrollView.getLayoutParams();
                        layoutParams.width = -1;
                        layoutParams.height = -2;
                        nestedScrollView.setLayoutParams(layoutParams);
                        int childCount = recyclerView.getChildCount();
                        FrameLayout frameLayout = vkPopupView.f230944r;
                        if (childCount == 0) {
                            frameLayout.addView(recyclerView);
                        }
                        D6.H(frameLayout);
                        dVar.l(list, null);
                    } else {
                        NestedScrollView nestedScrollView2 = vkPopupView.f230945s;
                        ViewGroup.LayoutParams layoutParams2 = nestedScrollView2.getLayoutParams();
                        layoutParams2.width = -1;
                        layoutParams2.height = 0;
                        nestedScrollView2.setLayoutParams(layoutParams2);
                        D6.w(vkPopupView.f230944r);
                        dVar.l(C42784z0.f406748b, null);
                    }
                    VkPopupView.b(jVar.f231193h, bVar.f17985a, bVar.f17986b, null, bVar.f17988d, bVar.f17989e ? ProfileVkRequestTokenLink.class : null, 4);
                }
            }
        }
        return G0.f406611a;
    }
}
