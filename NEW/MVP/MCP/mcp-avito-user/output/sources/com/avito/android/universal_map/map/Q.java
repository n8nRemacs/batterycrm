package com.avito.android.universal_map.map;

import gj.InterfaceC40691b;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.i2;
import rG0.AbstractC47541a;
import rG0.InterfaceC47542b;

/* compiled from: UniversalMapMviViewModel.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/universal_map/map/Q;", "Lcom/avito/android/arch/mvi/android/j;", "LrG0/a;", "Lcom/avito/android/universal_map/map/mvi/entity/e;", "LrG0/b;", "Lgj/e;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Q extends com.avito.android.arch.mvi.android.j<AbstractC47541a, com.avito.android.universal_map.map.mvi.entity.e, InterfaceC47542b> implements gj.e {

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f304811N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final Set<com.avito.android.universal_map.map.mvi.reducer.d> f304812O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public Q(@Y61.k InterfaceC40691b interfaceC40691b, @Y61.k Set<com.avito.android.universal_map.map.mvi.reducer.d> set, @Y61.k com.avito.android.universal_map.map.mvi.p pVar) {
        super(pVar, i2.a.f411433c);
        i2.f411430a.getClass();
        this.f304811N = interfaceC40691b;
        this.f304812O = set;
    }
}
