package com.avito.android.messenger.map.viewing;

import com.avito.android.lib.deprecated_design.bottom_sheet.BottomSheet;
import com.avito.android.messenger.map.MapBottomSheet;
import com.avito.android.messenger.map.viewing.A;
import com.avito.android.messenger.map.viewing.view.d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;

/* compiled from: PlatformMapPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/messenger/map/viewing/view/d$b;", "oldState", "invoke", "(Lcom/avito/android/messenger/map/viewing/view/d$b;)Lcom/avito/android/messenger/map/viewing/view/d$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class z extends N implements Y41.l<d.b, d.b> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BottomSheet.d f196910l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ A f196911m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(BottomSheet.d dVar, A a12) {
        super(1);
        this.f196910l = dVar;
        this.f196911m = a12;
    }

    @Override // Y41.l
    public final d.b invoke(d.b bVar) {
        d.b bVar2 = bVar;
        BottomSheet.d.a aVar = BottomSheet.d.a.f177836a;
        BottomSheet.d dVar = this.f196910l;
        if (kotlin.jvm.internal.L.f(dVar, aVar)) {
            A a12 = this.f196911m;
            a12.le().s(new A.h(null, null, new G(a12), 3, null));
            return bVar2;
        }
        boolean zF2 = kotlin.jvm.internal.L.f(dVar, BottomSheet.d.c.f177838a);
        MapBottomSheet.State state = bVar2.f196871b;
        if (!(state instanceof MapBottomSheet.State.b)) {
            if (kotlin.jvm.internal.L.f(state, MapBottomSheet.State.a.f196436a)) {
                return bVar2;
            }
            throw new NoWhenBranchMatchedException();
        }
        MapBottomSheet.State.b bVar3 = (MapBottomSheet.State.b) state;
        return d.b.a(bVar2, null, new MapBottomSheet.State.b(bVar3.f196437a, bVar3.f196438b, bVar3.f196439c, bVar3.f196440d, bVar3.f196441e, zF2), null, null, false, false, false, false, 253);
    }
}
