package com.avito.android.vas_discount.v2.ui;

import Y41.l;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.vas_discount.v2.ui.VasDiscountV2DialogFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import qL0.InterfaceC47318b;

/* compiled from: VasDiscountV2DialogFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class c extends H implements l<InterfaceC47318b, G0> {
    @Override // Y41.l
    public final G0 invoke(InterfaceC47318b interfaceC47318b) {
        InterfaceC47318b interfaceC47318b2 = interfaceC47318b;
        VasDiscountV2DialogFragment vasDiscountV2DialogFragment = (VasDiscountV2DialogFragment) this.receiver;
        VasDiscountV2DialogFragment.a aVar = VasDiscountV2DialogFragment.f319825s0;
        vasDiscountV2DialogFragment.getClass();
        if (interfaceC47318b2 instanceof InterfaceC47318b.a) {
            vasDiscountV2DialogFragment.dismiss();
        } else {
            if (interfaceC47318b2 instanceof InterfaceC47318b.C12322b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = vasDiscountV2DialogFragment.f319828j0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, ((InterfaceC47318b.C12322b) interfaceC47318b2).f429198a, null, null, 6);
                vasDiscountV2DialogFragment.dismiss();
            } else if (interfaceC47318b2 instanceof InterfaceC47318b.c) {
                com.avito.android.progress_overlay.l lVar = vasDiscountV2DialogFragment.f319836r0;
                (lVar != null ? lVar : null).a("");
            }
        }
        return G0.f406611a;
    }
}
