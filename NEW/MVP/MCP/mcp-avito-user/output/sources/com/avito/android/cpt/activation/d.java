package com.avito.android.cpt.activation;

import Lr.InterfaceC14432b;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.cpt.activation.CptActivationFragment;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: CptActivationFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class d extends H implements Y41.l<InterfaceC14432b, G0> {
    @Override // Y41.l
    public final G0 invoke(InterfaceC14432b interfaceC14432b) {
        ActivityC22955m activityC22955mL1;
        InterfaceC14432b interfaceC14432b2 = interfaceC14432b;
        CptActivationFragment cptActivationFragment = (CptActivationFragment) this.receiver;
        CptActivationFragment.a aVar = CptActivationFragment.f126198B0;
        cptActivationFragment.getClass();
        if (interfaceC14432b2 instanceof InterfaceC14432b.C0634b) {
            com.avito.android.deeplink_handler.handler.composite.a aVar2 = cptActivationFragment.f126204r0;
            if (aVar2 == null) {
                aVar2 = null;
            }
            b.a.a(aVar2, ((InterfaceC14432b.C0634b) interfaceC14432b2).f10136a, null, null, 6);
        } else if ((interfaceC14432b2 instanceof InterfaceC14432b.a) && (activityC22955mL1 = cptActivationFragment.l1()) != null) {
            activityC22955mL1.onBackPressed();
        }
        return G0.f406611a;
    }
}
