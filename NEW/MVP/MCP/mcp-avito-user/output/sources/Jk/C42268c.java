package jK;

import com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing.k;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacShortVibrationPlayerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: jK.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C42268c implements h<C42267b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<k> f405547a;

    public C42268c(Provider<k> provider) {
        this.f405547a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C42267b(this.f405547a.get());
    }
}
