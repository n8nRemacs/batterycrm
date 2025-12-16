package com.avito.android.profile_vk_linking.group_management;

import android.content.DialogInterface;
import com.avito.android.lib.design.modal.a;
import com.avito.android.profile_vk_linking.common.mvi.entity.VkPopup;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VkLinkingGroupManagementView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "dialog", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class q extends N implements Y41.p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ VkPopup f231238l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f231239m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(VkPopup vkPopup, j jVar) {
        super(2);
        this.f231238l = vkPopup;
        this.f231239m = jVar;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        String str;
        String str2;
        a.b bVar2 = bVar;
        DialogInterface dialogInterface2 = dialogInterface;
        VkPopup vkPopup = this.f231238l;
        bVar2.setTitle(vkPopup.f231004b);
        String str3 = null;
        AttributedText attributedText = vkPopup.f231005c;
        bVar2.setSubtitle(attributedText != null ? attributedText.getText() : null);
        bVar2.setCancelable(true);
        bVar2.setButtonsOrientation(1);
        bVar2.setCloseButtonVisible(true);
        VkPopup.CommonButton.Type type = VkPopup.CommonButton.Type.f231022b;
        ArrayList arrayList = vkPopup.f231007e;
        j jVar = this.f231239m;
        VkPopup.CommonButton commonButtonA = j.a(jVar, arrayList, type);
        if (commonButtonA != null) {
            VkPopup.CommonButton.ActionButton actionButton = commonButtonA.f231010b;
            if (actionButton == null || (str2 = actionButton.f231012a) == null) {
                VkPopup.CommonButton.a aVar = commonButtonA.f231009a;
                str2 = aVar != null ? aVar.f231026a : null;
            }
            if (str2 == null) {
                str2 = "";
            }
            bVar2.L3(str2, new o(jVar, commonButtonA, dialogInterface2));
        }
        VkPopup.CommonButton commonButtonA2 = j.a(jVar, arrayList, VkPopup.CommonButton.Type.f231023c);
        if (commonButtonA2 != null) {
            VkPopup.CommonButton.ActionButton actionButton2 = commonButtonA2.f231010b;
            if (actionButton2 == null || (str = actionButton2.f231012a) == null) {
                VkPopup.CommonButton.a aVar2 = commonButtonA2.f231009a;
                if (aVar2 != null) {
                    str3 = aVar2.f231026a;
                }
            } else {
                str3 = str;
            }
            bVar2.M3(str3 != null ? str3 : "", new p(jVar, commonButtonA2, dialogInterface2));
        }
        return G0.f406611a;
    }
}
