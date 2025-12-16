package ZM;

import com.avito.android.imv_cars_details.presentation.f;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ImvLineChartItemConverterImpl_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f20114a;

    public c(u uVar) {
        this.f20114a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((f) this.f20114a.get());
    }
}
