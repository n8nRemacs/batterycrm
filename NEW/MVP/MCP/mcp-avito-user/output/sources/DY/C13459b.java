package Dy;

import com.avito.android.C30566f2;
import com.avito.android.C30743h2;
import com.avito.android.deep_linking.links.EmailAddConfirmationDeepLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.reflect.n;
import lv.C43834a;

/* compiled from: EmailDeeplinkHandlerModule_ProvideEmailAddConfirmationDeeplinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: Dy.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C13459b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C13458a f3578a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.email.email_confirmation.deeplink.d f3579b;

    /* renamed from: c, reason: collision with root package name */
    public final C30743h2 f3580c;

    public C13459b(C13458a c13458a, com.avito.android.email.email_confirmation.deeplink.d dVar, C30743h2 c30743h2) {
        this.f3578a = c13458a;
        this.f3579b = dVar;
        this.f3580c = c30743h2;
    }

    public static C43834a a(C13458a c13458a, com.avito.android.email.email_confirmation.deeplink.d dVar, C30566f2 c30566f2) {
        c13458a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        c30566f2.getClass();
        n<Object> nVar = C30566f2.f155067o[12];
        return new C43834a(EmailAddConfirmationDeepLink.class, ((Boolean) c30566f2.f155080n.a().invoke()).booleanValue() ? new com.avito.android.email.email_confirmation.deeplink.a() : null, new C43834a.b.C11809b(dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C30566f2 c30566f2 = (C30566f2) this.f3580c.get();
        return a(this.f3578a, this.f3579b, c30566f2);
    }
}
