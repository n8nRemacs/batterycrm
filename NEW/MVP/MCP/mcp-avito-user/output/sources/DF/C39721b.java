package df;

import com.avito.android.auto_select.booking.mvi.g;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutoSelectBookingViewModel_Factory.java */
@e
@y
@x
/* renamed from: df.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C39721b implements h<C39720a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.auto_select.booking.mvi.h f393994a;

    public C39721b(com.avito.android.auto_select.booking.mvi.h hVar) {
        this.f393994a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C39720a((g) this.f393994a.get(), null, 2, null);
    }
}
