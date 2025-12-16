package com.avito.android.universal_map.map.mvi.actor;

import com.avito.android.arch.mvi.a;
import com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction;
import com.avito.android.util.R0;
import gj.InterfaceC40691b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import qG0.C47290a;
import rG0.AbstractC47541a;

/* compiled from: PointsActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/actor/j;", "Lcom/avito/android/arch/mvi/a;", "LrG0/a$d;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "Lcom/avito/android/universal_map/map/mvi/entity/e;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements com.avito.android.arch.mvi.a<AbstractC47541a.d, UniversalMapInternalAction, com.avito.android.universal_map.map.mvi.entity.e> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.universal_map.map_mvi.domain.p f305367a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f305368b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f305369c;

    @Inject
    public j(@Y61.k com.avito.android.universal_map.map_mvi.domain.p pVar, @Y61.k InterfaceC40691b interfaceC40691b, @Y61.k R0 r02) {
        this.f305367a = pVar;
        this.f305368b = interfaceC40691b;
        this.f305369c = r02;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<UniversalMapInternalAction> b(@Y61.k AbstractC47541a.d dVar, @Y61.k com.avito.android.universal_map.map.mvi.entity.e eVar) {
        boolean z12 = dVar instanceof AbstractC47541a.d.b;
        R0 r02 = this.f305369c;
        if (!z12) {
            if (!(dVar instanceof AbstractC47541a.d.C12365a)) {
                throw new NoWhenBranchMatchedException();
            }
            return C43175k.I(r02.b(), C43175k.G(new i(((AbstractC47541a.d.C12365a) dVar).f429695a, this, eVar, false, null)));
        }
        C47290a c47290a = eVar.f305599f.f305453f.f305462e;
        if (c47290a == null) {
            return C43175k.w();
        }
        return C43175k.I(r02.b(), C43175k.G(new i(c47290a, this, eVar, true, null)));
    }
}
