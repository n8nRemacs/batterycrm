package Dy;

import com.avito.android.deep_linking.links.EmailChangeConfirmationDeepLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: EmailDeeplinkHandlerModule_ProvideEmailChangeConfirmationDeeplinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: Dy.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C13460c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C13458a f3581a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.email.email_confirmation.deeplink.h f3582b;

    public C13460c(C13458a c13458a, com.avito.android.email.email_confirmation.deeplink.h hVar) {
        this.f3581a = c13458a;
        this.f3582b = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.email.email_confirmation.deeplink.h hVar = this.f3582b;
        this.f3581a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(EmailChangeConfirmationDeepLink.class, new com.avito.android.email.email_confirmation.deeplink.e(), new C43834a.b.C11809b(hVar));
    }
}
