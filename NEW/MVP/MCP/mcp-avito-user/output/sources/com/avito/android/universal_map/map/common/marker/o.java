package com.avito.android.universal_map.map.common.marker;

import com.avito.android.R;
import com.avito.android.universal_map.map.common.marker.m;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UniversalMapMarkerIconFactory.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/common/marker/m$b;", "invoke", "()Lcom/avito/android/universal_map/map/common/marker/m$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class o extends N implements Y41.a<m.b> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f305001l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m mVar) {
        super(0);
        this.f305001l = mVar;
    }

    @Override // Y41.a
    public final m.b invoke() {
        m mVar = this.f305001l;
        return new m.b(m.a(mVar, mVar.f304986a, R.layout.universal_map_cluster_with_label));
    }
}
