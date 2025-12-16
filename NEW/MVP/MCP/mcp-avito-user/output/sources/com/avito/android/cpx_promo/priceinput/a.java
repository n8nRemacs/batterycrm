package com.avito.android.cpx_promo.priceinput;

import androidx.core.os.C22777e;
import androidx.fragment.app.C22960s;
import com.avito.android.cpx_promo.priceinput.CpxPromoPriceInputFragment;
import is.InterfaceC42097b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.H;

/* compiled from: CpxPromoPriceInputFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class a extends H implements Y41.l<InterfaceC42097b, G0> {
    @Override // Y41.l
    public final G0 invoke(InterfaceC42097b interfaceC42097b) {
        InterfaceC42097b interfaceC42097b2 = interfaceC42097b;
        CpxPromoPriceInputFragment cpxPromoPriceInputFragment = (CpxPromoPriceInputFragment) this.receiver;
        CpxPromoPriceInputFragment.a aVar = CpxPromoPriceInputFragment.f127271s0;
        cpxPromoPriceInputFragment.getClass();
        if (interfaceC42097b2 instanceof InterfaceC42097b.a) {
            String tag = cpxPromoPriceInputFragment.getTag();
            if (tag == null) {
                tag = "";
            }
            InterfaceC42097b.a aVar2 = (InterfaceC42097b.a) interfaceC42097b2;
            C22960s.a(C22777e.b(new Q("cpx_promo_price_input_result", new CpxPromoPriceInputResult(aVar2.f405316a, aVar2.f405317b))), cpxPromoPriceInputFragment, tag);
            cpxPromoPriceInputFragment.dismiss();
        }
        return G0.f406611a;
    }
}
