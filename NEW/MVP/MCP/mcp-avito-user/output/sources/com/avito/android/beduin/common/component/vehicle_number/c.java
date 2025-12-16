package com.avito.android.beduin.common.component.vehicle_number;

import com.avito.android.beduin.common.component.vehicle_number.a;
import com.avito.android.remote.model.category_parameters.MaskInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: BeduinVehicleNumberComponent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f102857l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f102858m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(a aVar, Y41.l<? super String, G0> lVar) {
        super(1);
        this.f102857l = aVar;
        this.f102858m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        a aVar = this.f102857l;
        String strA0 = C43066x.a0(str, " ", "", false);
        aVar.f102848f = strA0;
        MaskInfo maskInfo = aVar.f102850h;
        Y41.l<String, G0> lVar = this.f102858m;
        if (maskInfo != null) {
            ((a.b) lVar).invoke(aVar.f102848f + aVar.f102849g);
        } else {
            ((a.b) lVar).invoke(strA0);
        }
        return G0.f406611a;
    }
}
