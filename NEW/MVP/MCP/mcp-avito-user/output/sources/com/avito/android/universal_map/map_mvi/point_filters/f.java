package com.avito.android.universal_map.map_mvi.point_filters;

import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UniversalMapPinFiltersMviView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f306276l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar) {
        super(0);
        this.f306276l = dVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        d dVar = this.f306276l;
        dVar.f306257i.setMinimumHeight(0);
        dVar.f306256h.j();
        D6.H(dVar.f306258j);
        return G0.f406611a;
    }
}
