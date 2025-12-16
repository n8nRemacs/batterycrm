package HL;

import com.avito.android.iac_incoming_call_ability.public_module.deeplink.iac_onboarding.IacMicOnboardingLink;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: IacMicOnboardingLinkModule_ProvideMappingFactory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class d implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final b f7046a;

    public d(b bVar) {
        this.f7046a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b bVar = this.f7046a;
        c.f7045a.getClass();
        return new C43834a(IacMicOnboardingLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(IacMicOnboardingLink.class), bVar));
    }
}
