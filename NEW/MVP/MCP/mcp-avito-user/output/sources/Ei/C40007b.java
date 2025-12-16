package eI;

import com.avito.android.guests_selector.NewGuestsSelectorDeepLink;
import com.avito.android.guests_selector.deep_link.f;
import com.avito.android.guests_selector.deep_link.g;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: GuestsSelectorDeepLinkModule_ProvideGuestsSelectorDeepLinkMappingFactory.java */
@e
@y
@x
/* renamed from: eI.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C40007b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.guests_selector.deep_link.b f395089a;

    /* renamed from: b, reason: collision with root package name */
    public final g f395090b;

    public C40007b(com.avito.android.guests_selector.deep_link.b bVar, g gVar) {
        this.f395089a = bVar;
        this.f395090b = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f395090b.getClass();
        f fVar = new f();
        com.avito.android.guests_selector.deep_link.b bVar = this.f395089a;
        C40006a.f395088a.getClass();
        return new C43834a(NewGuestsSelectorDeepLink.class, fVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(NewGuestsSelectorDeepLink.class), bVar));
    }
}
