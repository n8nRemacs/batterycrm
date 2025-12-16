package com.avito.android.messenger.map.viewing;

import com.avito.android.messenger.map.viewing.view.d;
import com.avito.android.remote.model.Coordinates;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PlatformMapPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/map/viewing/view/d$b;", "curState", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/messenger/map/viewing/view/d$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class D extends N implements Y41.l<d.b, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ A f196781l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(A a12) {
        super(1);
        this.f196781l = a12;
    }

    @Override // Y41.l
    public final G0 invoke(d.b bVar) {
        Object next;
        Iterator<T> it = bVar.f196870a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((com.avito.android.messenger.map.viewing.view.a) next).f196862c) {
                break;
            }
        }
        com.avito.android.messenger.map.viewing.view.a aVar = (com.avito.android.messenger.map.viewing.view.a) next;
        if (aVar != null) {
            this.f196781l.f196773b0.postValue(new Coordinates(aVar.getPosition().getLatitude(), aVar.getPosition().getLongitude()));
        }
        return G0.f406611a;
    }
}
