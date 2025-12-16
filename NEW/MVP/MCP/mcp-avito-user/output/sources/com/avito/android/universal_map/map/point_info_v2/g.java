package com.avito.android.universal_map.map.point_info_v2;

import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UniversalMapPointInfoViewV2Impl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f305911l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f305912m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Y41.a<G0> aVar) {
        super(0);
        this.f305911l = hVar;
        this.f305912m = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        h hVar = this.f305911l;
        D6.l(true, hVar.f305929o, new f(hVar));
        ((e) this.f305912m).invoke();
        return G0.f406611a;
    }
}
