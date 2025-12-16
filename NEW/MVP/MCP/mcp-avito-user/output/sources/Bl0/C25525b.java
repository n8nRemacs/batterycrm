package bL0;

import com.avito.android.vacancy_call_action.deeplink.VacancyCallActionDeepLink;
import com.avito.android.vacancy_call_action.deeplink.c;
import com.avito.android.vacancy_call_action.deeplink.d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: VacancyCallActionDeeplinkModule_ProvideDeeplinkMappingFactory.java */
@e
@y
@x
/* renamed from: bL0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25525b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final c f57040a;

    public C25525b(c cVar) {
        this.f57040a = cVar;
    }

    public static C43834a a(c cVar) {
        C25524a.f57039a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(VacancyCallActionDeepLink.class, new d(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(VacancyCallActionDeepLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f57040a);
    }
}
