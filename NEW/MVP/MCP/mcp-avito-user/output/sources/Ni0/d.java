package nI0;

import Rj.C15047a;
import Sj.C15192b;
import com.avito.android.L;
import com.avito.android.O;
import dagger.internal.x;
import dagger.internal.y;
import ur.InterfaceC49101b;

/* compiled from: UserAdvertsIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final O f414988a;

    /* renamed from: b, reason: collision with root package name */
    public final ur.e f414989b;

    /* renamed from: c, reason: collision with root package name */
    public final C15192b f414990c;

    public d(O o12, ur.e eVar, C15192b c15192b) {
        this.f414988a = o12;
        this.f414989b = eVar;
        this.f414990c = c15192b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((L) this.f414988a.get(), (InterfaceC49101b) this.f414989b.get(), (C15047a) this.f414990c.get());
    }
}
