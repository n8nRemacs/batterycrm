package WI0;

import androidx.view.P0;
import androidx.view.T0;
import com.avito.android.user_adverts.tab_actions.host.j;
import com.avito.android.user_adverts.tab_actions.host.k;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UserAdvertsActionsModule_ProviderUserAdvertsActionsViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class f implements h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final k f17851a;

    /* renamed from: b, reason: collision with root package name */
    public final l f17852b;

    public f(k kVar, l lVar) {
        this.f17851a = kVar;
        this.f17852b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        j.a aVar = (j.a) this.f17851a.get();
        T0 t02 = (T0) this.f17852b.f393949a;
        b.f17845a.getClass();
        return (j) new P0(t02, aVar).a(j.class);
    }
}
