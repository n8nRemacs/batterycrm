package com.avito.android.bbl.screens.configure.v2.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.bbl.screens.configure.v2.mvi.entity.BblConfigureV2InternalAction;
import com.avito.android.bbl.screens.configure.v2.ui.items.cards.C28729a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import lh.InterfaceC43770a;
import wZ.C49582f;

/* compiled from: BblConfigureV2Reducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v2/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/bbl/screens/configure/v2/mvi/entity/BblConfigureV2InternalAction;", "LAh/c;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class l implements u<BblConfigureV2InternalAction, Ah.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43770a f99385b;

    @Inject
    public l(@Y61.k InterfaceC43770a interfaceC43770a) {
        this.f99385b = interfaceC43770a;
    }

    @Override // com.avito.android.arch.mvi.u
    public final Ah.c a(BblConfigureV2InternalAction bblConfigureV2InternalAction, Ah.c cVar) {
        C49582f c49582f;
        C49582f c49582f2;
        C49582f c49582f3;
        C49582f c49582f4;
        C49582f c49582f5;
        BblConfigureV2InternalAction bblConfigureV2InternalAction2 = bblConfigureV2InternalAction;
        Ah.c cVar2 = cVar;
        if (bblConfigureV2InternalAction2 instanceof BblConfigureV2InternalAction.Content) {
            BblConfigureV2InternalAction.Content content = (BblConfigureV2InternalAction.Content) bblConfigureV2InternalAction2;
            return new Ah.c(content.f99358b, content.f99359c, content.f99360d, content.f99361e, content.f99362f, content.f99363g, content.f99364h, content.f99365i, null, false, false, null);
        }
        if (!(bblConfigureV2InternalAction2 instanceof BblConfigureV2InternalAction.UpdateConfig)) {
            if (bblConfigureV2InternalAction2 instanceof BblConfigureV2InternalAction.Error.ScreenError) {
                return Ah.c.a(cVar2, null, null, null, ((BblConfigureV2InternalAction.Error.ScreenError) bblConfigureV2InternalAction2).f99366b, false, false, null, 3327);
            }
            if (bblConfigureV2InternalAction2 instanceof BblConfigureV2InternalAction.Loading) {
                return Ah.c.a(cVar2, null, null, null, null, true, false, null, 3327);
            }
            if (!(bblConfigureV2InternalAction2 instanceof BblConfigureV2InternalAction.ChangeOnScreenLoading)) {
                return cVar2;
            }
            BblConfigureV2InternalAction.ChangeOnScreenLoading changeOnScreenLoading = (BblConfigureV2InternalAction.ChangeOnScreenLoading) bblConfigureV2InternalAction2;
            return Ah.c.a(cVar2, null, null, null, null, false, changeOnScreenLoading.f99356b, changeOnScreenLoading.f99357c, 1023);
        }
        C49582f c49582f6 = cVar2.f574d;
        int i12 = 0;
        int i13 = c49582f6 != null ? c49582f6.f441555a : 0;
        C28729a c28729a = ((BblConfigureV2InternalAction.UpdateConfig) bblConfigureV2InternalAction2).f99372b;
        if (c28729a != null && (c49582f5 = c28729a.f99409g) != null) {
            i12 = c49582f5.f441555a;
        }
        int i14 = i13 + i12;
        float f12 = 0.0f;
        float f13 = c49582f6 != null ? c49582f6.f441556b : 0.0f;
        if (c28729a != null && (c49582f4 = c28729a.f99409g) != null) {
            f12 = c49582f4.f441556b;
        }
        float f14 = f13 + f12;
        wZ.k kVar = (c28729a == null || (c49582f3 = c28729a.f99409g) == null) ? null : c49582f3.f441559e;
        C49582f c49582f7 = new C49582f(i14, f14, (c28729a == null || (c49582f = c28729a.f99409g) == null) ? null : c49582f.f441557c, (c28729a == null || (c49582f2 = c28729a.f99409g) == null) ? null : c49582f2.f441558d, kVar);
        List<C28729a> list = cVar2.f579i;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (C28729a c28729a2 : list) {
            arrayList.add(C28729a.d(c28729a2, L.f(c28729a2.f99408f, c28729a != null ? c28729a.f99408f : null)));
        }
        this.f99385b.b(c28729a != null ? c28729a.f99403a : null, c49582f7);
        return Ah.c.a(cVar2, c49582f7, c28729a != null ? c28729a.f99408f : null, arrayList, null, false, false, null, 3943);
    }
}
