package yM0;

import com.avito.android.deep_linking.links.VerificationConfirmRequisitesLink;
import lv.C43834a;

/* compiled from: VerificationDeepLinkHandlerModule_ProvideConfirmRequisitesMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: yM0.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50136e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.verification.verification_confirm_requisites.e f443052a;

    public C50136e(com.avito.android.verification.verification_confirm_requisites.e eVar) {
        this.f443052a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.verification.verification_confirm_requisites.e eVar = this.f443052a;
        C50134c.f443050a.getClass();
        return new C43834a(VerificationConfirmRequisitesLink.class, null, new C43834a.b.C11809b(eVar));
    }
}
