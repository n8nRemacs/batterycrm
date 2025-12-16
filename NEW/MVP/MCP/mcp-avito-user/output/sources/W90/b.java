package w90;

import com.avito.android.profile.pro.impl.generated.api.ProfileProApi;
import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileProApi_Module_ProvideProfileProApiFactory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class b implements h<ProfileProApi> {

    /* renamed from: a, reason: collision with root package name */
    public final f f441307a;

    public b(f fVar) {
        this.f441307a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f441307a.get();
        C49473a.f441306a.getClass();
        ProfileProApi profileProApi = (ProfileProApi) r02.create(ProfileProApi.class);
        t.d(profileProApi);
        return profileProApi;
    }
}
