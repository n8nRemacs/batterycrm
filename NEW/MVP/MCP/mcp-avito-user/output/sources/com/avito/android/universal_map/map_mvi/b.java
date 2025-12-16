package com.avito.android.universal_map.map_mvi;

import Y41.l;
import com.avito.android.universal_map.map_mvi.UniversalMapFragmentMvi;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import rG0.AbstractC47541a;

/* compiled from: UniversalMapFragmentMvi.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LrG0/a;", "it", "Lkotlin/G0;", "invoke", "(LrG0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class b extends N implements l<AbstractC47541a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UniversalMapFragmentMvi f306025l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(UniversalMapFragmentMvi universalMapFragmentMvi) {
        super(1);
        this.f306025l = universalMapFragmentMvi;
    }

    @Override // Y41.l
    public final G0 invoke(AbstractC47541a abstractC47541a) {
        UniversalMapFragmentMvi.a aVar = UniversalMapFragmentMvi.f305959P0;
        this.f306025l.q5().accept(abstractC47541a);
        return G0.f406611a;
    }
}
