package B4;

import androidx.view.P0;
import androidx.view.T0;
import com.avito.android.advert.di.p0;
import com.avito.android.advert.item.beduin.k;
import com.avito.android.advert.item.beduin.l;
import com.avito.android.advert.item.beduin.m;
import com.avito.android.advert.item.beduin.n;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertDetailsBeduinModule_ProvideViewModel$_avito_advert_details_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final p0 f868a;

    /* renamed from: b, reason: collision with root package name */
    public final n f869b;

    public c(p0 p0Var, n nVar) {
        this.f868a = p0Var;
        this.f869b = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        T0 t02 = (T0) this.f868a.get();
        m mVar = (m) this.f869b.get();
        a.f866a.getClass();
        return (k) new P0(t02, mVar).a(l.class);
    }
}
