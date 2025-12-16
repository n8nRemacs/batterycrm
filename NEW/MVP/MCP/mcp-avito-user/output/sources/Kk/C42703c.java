package kk;

import com.avito.android.deep_linking.links.BrandspaceLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: BrandspaceLinkHandlerModule_ProvideBrandspaceLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: kk.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C42703c implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C42704d f406569a;

    public C42703c(C42704d c42704d) {
        this.f406569a = c42704d;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C42704d c42704d = this.f406569a;
        C42702b.f406568a.getClass();
        return new C43834a(BrandspaceLink.class, null, new C43834a.b.C11809b(c42704d));
    }
}
