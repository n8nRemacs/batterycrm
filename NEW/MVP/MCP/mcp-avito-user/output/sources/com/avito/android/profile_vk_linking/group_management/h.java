package com.avito.android.profile_vk_linking.group_management;

import Vc0.c;
import android.view.View;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.lib.design.modal.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: VkLinkingGroupManagementView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class h extends H implements Y41.l<Vc0.c, G0> {
    public final void f(@Y61.k Vc0.c cVar) {
        ActivityC22955m activityC22955mL1;
        j jVar = (j) this.receiver;
        jVar.getClass();
        boolean z12 = cVar instanceof c.e;
        View view = jVar.f231186a;
        if (z12) {
            f.c.f125255c.getClass();
            com.avito.android.component.toast.b.b(view, ((c.e) cVar).f17315a, 0, null, 0, null, 0, ToastBarPosition.f181046d, f.c.a.b(), null, 130878);
            return;
        }
        if (cVar instanceof c.f) {
            c.f fVar = (c.f) cVar;
            f.c.f125255c.getClass();
            f.c cVarB = f.c.a.b();
            ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
            com.avito.android.component.toast.b.b(view, fVar.f17316a, 0, fVar.f17317b, 0, new r(jVar, fVar.f17318c), 0, toastBarPosition, cVarB, null, 130858);
            return;
        }
        if (cVar instanceof c.C1194c) {
            com.avito.android.lib.util.g.a(a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, view.getContext(), new q(((c.C1194c) cVar).f17313a, jVar)));
            return;
        }
        if (cVar instanceof c.b) {
            c.b bVar = (c.b) cVar;
            b.a.a(jVar.f231190e, bVar.f17311a, bVar.f17312b, null, 4);
            return;
        }
        boolean z13 = cVar instanceof c.d;
        VkLinkingGroupManagementFragment vkLinkingGroupManagementFragment = jVar.f231187b;
        if (z13) {
            ActivityC22955m activityC22955mL12 = vkLinkingGroupManagementFragment.l1();
            if (activityC22955mL12 != null) {
                activityC22955mL12.setResult(-1);
                return;
            }
            return;
        }
        if (!(cVar instanceof c.a) || (activityC22955mL1 = vkLinkingGroupManagementFragment.l1()) == null) {
            return;
        }
        activityC22955mL1.finish();
    }

    @Override // Y41.l
    public final /* bridge */ /* synthetic */ G0 invoke(Vc0.c cVar) {
        f(cVar);
        return G0.f406611a;
    }
}
