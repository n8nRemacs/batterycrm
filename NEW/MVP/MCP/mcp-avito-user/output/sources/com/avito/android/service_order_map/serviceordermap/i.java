package com.avito.android.service_order_map.serviceordermap;

import com.avito.android.avito_map.AvitoMap;
import com.avito.android.service_order_map.serviceordermap.mvi.entity.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceOrderMapView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class i extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f278682l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar) {
        super(1);
        this.f278682l = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        k kVar = this.f278682l;
        Y41.l<? super com.avito.android.service_order_map.serviceordermap.mvi.entity.a, G0> lVar = kVar.f278699p;
        if (lVar != null) {
            AvitoMap avitoMap = kVar.f278698o;
            ((a) lVar).invoke(new a.f(str2, avitoMap != null ? avitoMap.getMapBounds() : null));
        }
        return G0.f406611a;
    }
}
