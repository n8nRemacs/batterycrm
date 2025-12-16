package yf;

import com.avito.android.autoteka.deeplinks.AutotekaBuyReportLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: AutotekaDeepLinkHandlerModule_ProvideAutotekaDeepLinkMapperFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: yf.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C50237c implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.autoteka.deeplinks.buyReportLink.c f443417a;

    public C50237c(com.avito.android.autoteka.deeplinks.buyReportLink.c cVar) {
        this.f443417a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.autoteka.deeplinks.buyReportLink.c cVar = this.f443417a;
        C50235a.f443415a.getClass();
        return new C43834a(AutotekaBuyReportLink.class, null, new C43834a.b.C11809b(cVar));
    }
}
