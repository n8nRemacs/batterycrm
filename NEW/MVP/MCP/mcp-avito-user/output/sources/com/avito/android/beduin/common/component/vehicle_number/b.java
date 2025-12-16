package com.avito.android.beduin.common.component.vehicle_number;

import com.avito.android.remote.model.category_parameters.MaskInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;
import ue.C49040a;

/* compiled from: BeduinVehicleNumberComponent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lue/a;", "it", "Lkotlin/G0;", "invoke", "(Lue/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b extends N implements Y41.l<C49040a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f102856l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar) {
        super(1);
        this.f102856l = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(C49040a c49040a) {
        C49040a c49040a2 = c49040a;
        MaskInfo maskInfo = null;
        if (c49040a2 != null) {
            String str = c49040a2.f440191c;
            if (!C43066x.K(str)) {
                int length = str.length();
                MaskInfo maskInfo2 = c49040a2.f440190b;
                if (length == maskInfo2.getMask().length()) {
                    maskInfo = maskInfo2;
                }
            }
        }
        this.f102856l.f102850h = maskInfo;
        return G0.f406611a;
    }
}
