package com.avito.android.universal_map.map.pin_filters;

import com.avito.android.universal_map.map.pin_filters.j;
import com.avito.android.util.A4;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: UniversalMapPinFiltersViewModel.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", "it", "Lkotlin/G0;", "accept", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class m<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f305768b;

    public m(o oVar) {
        this.f305768b = oVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        j.b bVar = new j.b(!A4.j(A4.f318516a, r3).isEmpty(), (Map) obj);
        o oVar = this.f305768b;
        oVar.f305786Y.setValue(bVar);
        oVar.T2(false);
    }
}
