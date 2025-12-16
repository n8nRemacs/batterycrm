package com.avito.android.universal_map.map;

import com.avito.android.universal_map.remote.model.UniversalPreselectMapPoint;
import kotlin.Metadata;

/* compiled from: UniversalPointsViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/universal_map/remote/model/UniversalPreselectMapPoint;", "savedLocation", "Lkotlin/G0;", "accept", "(Lcom/avito/android/universal_map/remote/model/UniversalPreselectMapPoint;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class e0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f305172b;

    public e0(g0 g0Var) {
        this.f305172b = g0Var;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        g0 g0Var = this.f305172b;
        g0Var.f305211n0 = true;
        g0Var.f305208k0 = (UniversalPreselectMapPoint) obj;
    }
}
