package q70;

import com.avito.android.phone_confirmation.deep_linking.PhoneVerifyLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PhoneConfirmationLinkHandlerModule_ProvidePhoneVerifyMappingFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: q70.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C47247b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f429039a;

    public C47247b(e eVar) {
        this.f429039a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = this.f429039a;
        C47246a.f429038a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(PhoneVerifyLink.class, new c(), new C43834a.b.C11809b(eVar));
    }
}
