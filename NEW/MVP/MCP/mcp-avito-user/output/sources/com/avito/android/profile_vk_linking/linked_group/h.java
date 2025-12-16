package com.avito.android.profile_vk_linking.linked_group;

import Xc0.c;
import android.view.View;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: VkLinkedGroupView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class h extends H implements Y41.l<Xc0.c, G0> {
    public final void f(@Y61.k Xc0.c cVar) {
        t tVar = (t) this.receiver;
        tVar.getClass();
        boolean z12 = cVar instanceof c.a;
        VkLinkedGroupFragment vkLinkedGroupFragment = tVar.f231329b;
        if (z12) {
            ActivityC22955m activityC22955mL1 = vkLinkedGroupFragment.l1();
            if (activityC22955mL1 != null) {
                activityC22955mL1.finish();
                return;
            }
            return;
        }
        if (cVar instanceof c.b) {
            ActivityC22955m activityC22955mL12 = vkLinkedGroupFragment.l1();
            if (activityC22955mL12 != null) {
                activityC22955mL12.setResult(-1);
                return;
            }
            return;
        }
        boolean z13 = cVar instanceof c.C1341c;
        View view = tVar.f231328a;
        if (z13) {
            f.c.f125255c.getClass();
            f.c cVarB = f.c.a.b();
            com.avito.android.component.toast.b.b(view, ((c.C1341c) cVar).f18978a, 0, null, 0, null, 0, ToastBarPosition.f181046d, cVarB, null, 130878);
            return;
        }
        if (cVar instanceof c.d) {
            c.d dVar = (c.d) cVar;
            f.c.f125255c.getClass();
            f.c cVarB2 = f.c.a.b();
            ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
            com.avito.android.component.toast.b.b(view, dVar.f18979a, 0, dVar.f18980b, 0, new s(tVar), 0, toastBarPosition, cVarB2, null, 130858);
        }
    }

    @Override // Y41.l
    public final /* bridge */ /* synthetic */ G0 invoke(Xc0.c cVar) {
        f(cVar);
        return G0.f406611a;
    }
}
