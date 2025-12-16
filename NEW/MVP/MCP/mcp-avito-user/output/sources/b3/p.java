package B3;

import android.content.SharedPreferences;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PrefPassportToggleStorage_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final u f852a;

    public p(u uVar) {
        this.f852a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o((SharedPreferences) this.f852a.get());
    }
}
