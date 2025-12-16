package com.avito.android.profile_vk_linking.start;

import ad0.InterfaceC19872c;
import android.view.View;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: VkLinkingStartView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class g extends H implements Y41.l<InterfaceC19872c, G0> {
    public final void f(@Y61.k InterfaceC19872c interfaceC19872c) {
        ActivityC22955m activityC22955mL1;
        n nVar = (n) this.receiver;
        nVar.getClass();
        boolean z12 = interfaceC19872c instanceof InterfaceC19872c.b;
        View view = nVar.f231485a;
        if (z12) {
            f.c.f125255c.getClass();
            com.avito.android.component.toast.b.b(view, ((InterfaceC19872c.b) interfaceC19872c).f21100a, 0, null, 0, null, 0, ToastBarPosition.f181046d, f.c.a.b(), null, 130878);
        } else {
            if (!(interfaceC19872c instanceof InterfaceC19872c.C1502c)) {
                if (!(interfaceC19872c instanceof InterfaceC19872c.a) || (activityC22955mL1 = nVar.f231486b.l1()) == null) {
                    return;
                }
                activityC22955mL1.finish();
                return;
            }
            InterfaceC19872c.C1502c c1502c = (InterfaceC19872c.C1502c) interfaceC19872c;
            f.c.f125255c.getClass();
            f.c cVarB = f.c.a.b();
            ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
            com.avito.android.component.toast.b.b(view, c1502c.f21101a, 0, c1502c.f21102b, 0, new m(nVar, c1502c.f21103c), 0, toastBarPosition, cVarB, null, 130858);
        }
    }

    @Override // Y41.l
    public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC19872c interfaceC19872c) {
        f(interfaceC19872c);
        return G0.f406611a;
    }
}
