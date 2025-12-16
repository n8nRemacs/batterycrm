package com.avito.android.profile_vk_linking.linked_group;

import Ai.DialogInterfaceOnDismissListenerC13035a;
import Yc0.C18253a;
import Yc0.b;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.lib.design.list_item.layout.AlignmentFrameLayout;
import com.avito.android.lib.design.modal.a;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.profile_vk_linking.common.VkPopupView;
import com.avito.android.profile_vk_linking.common.mvi.entity.VkPopup;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;

/* compiled from: VkLinkedGroupView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class i extends H implements Y41.l<Yc0.b, G0> {
    public final void f(@Y61.k Yc0.b bVar) throws Resources.NotFoundException {
        com.avito.android.lib.design.bottom_sheet.d dVar;
        String str;
        t tVar = (t) this.receiver;
        tVar.getClass();
        String str2 = bVar.f19596c;
        AttributeSet attributeSet = null;
        com.avito.android.status_view.g gVar = tVar.f231331d;
        if (str2 != null) {
            com.avito.android.status_view.g.a(gVar, str2, null, 14);
            return;
        }
        if (bVar.f19594a) {
            D6.H(gVar.f284965h);
            D6.w(gVar.f284961d);
            gVar.f284967j.e();
            return;
        }
        C18253a c18253a = bVar.f19595b;
        if (c18253a != null) {
            D6.w(gVar.f284965h);
            D6.w(gVar.f284961d);
            gVar.f284967j.e();
            boolean z12 = bVar.f19597d;
            VkPopup.CommonButton.ActionButton.ActionType actionType = z12 ? VkPopup.CommonButton.ActionButton.ActionType.f231018e : null;
            VkPopup vkPopup = c18253a.f19590a;
            VkPopupView.b(tVar.f231334g, vkPopup, c18253a.f19591b, null, actionType, null, 20);
            boolean z13 = true;
            boolean z14 = bVar.f19598e;
            a aVar = tVar.f231332e;
            if (z14) {
                ArrayList arrayList = vkPopup.f231007e;
                Y41.p<DeepLink, VkPopup.CommonButton.ActionButton.ActionType, View.OnClickListener> pVar = tVar.f231333f;
                aVar.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    VkPopup.CommonButton commonButton = (VkPopup.CommonButton) obj;
                    if (commonButton.f231009a != null || commonButton.f231010b != null) {
                        if (L.f(commonButton.f231011c, Boolean.TRUE)) {
                            arrayList2.add(obj);
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    com.avito.android.lib.design.bottom_sheet.d dVar2 = aVar.f231253c;
                    Context context = aVar.f231251a;
                    boolean z15 = false;
                    if (dVar2 == null || !dVar2.isShowing()) {
                        com.avito.android.lib.design.bottom_sheet.d dVar3 = aVar.f231253c;
                        if (dVar3 != null) {
                            dVar3.dismiss();
                        }
                        com.avito.android.lib.design.bottom_sheet.d dVar4 = new com.avito.android.lib.design.bottom_sheet.d(context, 0, 2, null);
                        dVar4.setContentView(R.layout.vk_linked_group_menu);
                        dVar4.S(C35835l0.g(dVar4.getContext()).y);
                        com.avito.android.lib.design.bottom_sheet.d.M(dVar4, null, false, true, 7);
                        aVar.f231254d = (LinearLayout) dVar4.findViewById(R.id.vk_bottom_menu_container);
                        dVar4.setOnDismissListener(new DialogInterfaceOnDismissListenerC13035a(aVar, 26));
                        com.avito.android.lib.util.g.a(dVar4);
                        aVar.f231253c = dVar4;
                    }
                    LinearLayout linearLayout = aVar.f231254d;
                    if (linearLayout != null) {
                        linearLayout.removeAllViews();
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (L.f(((VkPopup.CommonButton) next).f231011c, Boolean.TRUE)) {
                            arrayList3.add(next);
                        }
                    }
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        VkPopup.CommonButton commonButton2 = (VkPopup.CommonButton) it2.next();
                        LinearLayout linearLayout2 = aVar.f231254d;
                        if (linearLayout2 != null) {
                            VkPopup.CommonButton.ActionButton actionButton = commonButton2.f231010b;
                            Object obj2 = actionButton != null ? actionButton.f231013b : attributeSet;
                            Object obj3 = VkPopup.CommonButton.ActionButton.ActionType.f231018e;
                            boolean z16 = (obj2 == obj3 && z12) ? z13 : z15;
                            ListItem listItem = new ListItem(context, attributeSet);
                            listItem.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                            listItem.setPadding(y6.b(16), 0, y6.b(16), 0);
                            VkPopup.CommonButton.ActionButton actionButton2 = commonButton2.f231010b;
                            VkPopup.CommonButton.a aVar2 = commonButton2.f231009a;
                            if (actionButton2 == null || (str = actionButton2.f231012a) == null) {
                                str = aVar2 != null ? aVar2.f231026a : null;
                                if (str == null) {
                                    str = "";
                                }
                            }
                            listItem.setTitle(str);
                            Object objInvoke = ((l) pVar).invoke(aVar2 != null ? aVar2.f231027b : null, actionButton2 != null ? actionButton2.f231013b : null);
                            if (z16) {
                                objInvoke = null;
                            }
                            listItem.setOnClickListener((View.OnClickListener) objInvoke);
                            if (actionButton2 != null && actionButton2.f231013b == obj3) {
                                if (z16) {
                                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                                    layoutParams.gravity = 8388627;
                                    Spinner spinner = new Spinner(listItem.getContext());
                                    spinner.setLayoutParams(layoutParams);
                                    spinner.setAppearance(R.style.Design_Widget_Spinner_Dark_Medium);
                                    View viewFindViewById = listItem.findViewById(R.id.design_left_container);
                                    if (viewFindViewById == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.layout.AlignmentFrameLayout");
                                    }
                                    AlignmentFrameLayout alignmentFrameLayout = (AlignmentFrameLayout) viewFindViewById;
                                    D6.H(alignmentFrameLayout);
                                    alignmentFrameLayout.addView(spinner);
                                } else {
                                    ListItem.i(listItem, C35835l0.h(R.attr.ic_delete24, listItem.getContext()));
                                    listItem.setLeftIconColor(C35835l0.d(R.attr.black, listItem.getContext()));
                                }
                            }
                            linearLayout2.addView(listItem);
                        }
                        z13 = true;
                        attributeSet = null;
                        z15 = false;
                    }
                }
            } else {
                com.avito.android.lib.design.bottom_sheet.d dVar5 = aVar.f231253c;
                if (dVar5 != null && dVar5.isShowing() && (dVar = aVar.f231253c) != null) {
                    dVar.dismiss();
                }
            }
            b.C1399b c1399b = bVar.f19599f;
            if (c1399b != null) {
                com.avito.android.lib.util.g.a(a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, tVar.f231328a.getContext(), new r(c1399b.f19600a, c1399b.f19601b, tVar)));
            }
        }
    }

    @Override // Y41.l
    public final /* bridge */ /* synthetic */ G0 invoke(Yc0.b bVar) throws Resources.NotFoundException {
        f(bVar);
        return G0.f406611a;
    }
}
