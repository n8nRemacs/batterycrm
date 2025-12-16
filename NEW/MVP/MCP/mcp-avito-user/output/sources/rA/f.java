package ra;

import androidx.recyclerview.widget.A;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import ra.InterfaceC47623b;

/* compiled from: AdvertDetailsNeighboringDatesModule_NeighboringDatesItemsModule_ProvideSnapHelperFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements h<A> {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC47623b.a f429876a;

    public f(InterfaceC47623b.a aVar) {
        this.f429876a = aVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f429876a.getClass();
        return new com.avito.android.advert_details_items.neighboring_dates.tools.c(0, 1, null);
    }
}
