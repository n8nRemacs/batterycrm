package pF0;

import com.avito.android.travel_search.mvi.j;
import com.avito.android.travel_search.mvi.k;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import iT.C41343c;

/* compiled from: TravelSearchViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final k f428284a;

    /* renamed from: b, reason: collision with root package name */
    public final u f428285b;

    public i(k kVar, u uVar) {
        this.f428284a = kVar;
        this.f428285b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h((j) this.f428284a.get(), (C41343c) this.f428285b.get());
    }
}
