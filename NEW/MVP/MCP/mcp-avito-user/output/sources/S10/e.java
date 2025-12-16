package S10;

import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MortgageInviteLegacyApi_Module_ProvideMortgageInviteLegacyApiFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final f f14790a;

    public e(f fVar) {
        this.f14790a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f14790a.get();
        d.f14789a.getClass();
        c cVar = (c) r02.create(c.class);
        t.d(cVar);
        return cVar;
    }
}
