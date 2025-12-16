package com.avito.android.vas_performance.screens.visual_v2;

import Y41.l;
import androidx.core.content.j;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.vas_performance.screens.visual_v2.VisualVasV2Fragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import w50.InterfaceC49447a;

/* compiled from: VisualVasV2Fragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class c extends H implements l<Boolean, G0> {
    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        VisualVasV2Fragment visualVasV2Fragment = (VisualVasV2Fragment) this.receiver;
        if (zBooleanValue) {
            VisualVasV2Fragment.a aVar = VisualVasV2Fragment.f321158v0;
            j jVarL1 = visualVasV2Fragment.l1();
            InterfaceC49447a interfaceC49447a = jVarL1 instanceof InterfaceC49447a ? (InterfaceC49447a) jVarL1 : null;
            if (interfaceC49447a != null) {
                interfaceC49447a.r1();
            }
        } else {
            VisualVasV2Fragment.d dVar = visualVasV2Fragment.f321166u0;
            dVar.d(false);
            ActivityC22955m activityC22955mL1 = visualVasV2Fragment.l1();
            if (activityC22955mL1 != null) {
                activityC22955mL1.onBackPressed();
            }
            dVar.d(true);
        }
        return G0.f406611a;
    }
}
