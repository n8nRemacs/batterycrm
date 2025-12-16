package PX;

import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;
import kotlin.collections.C42756l;

/* compiled from: MandatoryVerificationModule_ProvideItemPresentersSetFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class m implements dagger.internal.h<Set<TV0.d<?, ?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.mandatory_verification.items.header.e> f13120a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.mandatory_verification.items.benefits.d> f13121b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.mandatory_verification.items.accountVerification.e> f13122c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.mandatory_verification.items.uploader.f> f13123d;

    public m(Provider<com.avito.android.mandatory_verification.items.header.e> provider, Provider<com.avito.android.mandatory_verification.items.benefits.d> provider2, Provider<com.avito.android.mandatory_verification.items.accountVerification.e> provider3, Provider<com.avito.android.mandatory_verification.items.uploader.f> provider4) {
        this.f13120a = provider;
        this.f13121b = provider2;
        this.f13122c = provider3;
        this.f13123d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.mandatory_verification.items.header.e eVar = this.f13120a.get();
        com.avito.android.mandatory_verification.items.benefits.d dVar = this.f13121b.get();
        com.avito.android.mandatory_verification.items.accountVerification.e eVar2 = this.f13122c.get();
        com.avito.android.mandatory_verification.items.uploader.f fVar = this.f13123d.get();
        i.f13113a.getClass();
        Set setL0 = C42756l.l0(new TV0.d[]{eVar, dVar, eVar2, fVar});
        t.d(setL0);
        return setL0;
    }
}
