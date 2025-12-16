package com.avito.android.messenger.map.viewing;

import com.avito.android.messenger.map.MapBottomSheet;
import com.avito.android.messenger.map.viewing.view.d;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PlatformMapPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/messenger/map/viewing/view/d$b;", "oldState", "invoke", "(Lcom/avito/android/messenger/map/viewing/view/d$b;)Lcom/avito/android/messenger/map/viewing/view/d$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class G extends N implements Y41.l<d.b, d.b> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ A f196786l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(A a12) {
        super(1);
        this.f196786l = a12;
    }

    @Override // Y41.l
    public final d.b invoke(d.b bVar) {
        d.b bVar2 = bVar;
        MapBottomSheet.State state = bVar2.f196871b;
        Object obj = null;
        MapBottomSheet.State.b bVar3 = state instanceof MapBottomSheet.State.b ? (MapBottomSheet.State.b) state : null;
        if (bVar3 == null || !bVar3.f196439c) {
            return bVar2;
        }
        Set<com.avito.android.messenger.map.viewing.view.a> set = bVar2.f196870a;
        Iterator<T> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((com.avito.android.messenger.map.viewing.view.a) next).f196862c) {
                obj = next;
                break;
            }
        }
        if (((com.avito.android.messenger.map.viewing.view.a) obj) == null) {
            return bVar2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (com.avito.android.messenger.map.viewing.view.a aVarA : set) {
            if (aVarA.f196862c) {
                aVarA = com.avito.android.messenger.map.viewing.view.a.a(aVarA, false);
            }
            linkedHashSet.add(aVarA);
        }
        return d.b.a(bVar2, linkedHashSet, A.me(this.f196786l, linkedHashSet), null, null, false, false, false, false, 252);
    }
}
