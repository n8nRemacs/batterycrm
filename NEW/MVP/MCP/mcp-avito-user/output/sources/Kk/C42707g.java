package kk;

import com.avito.android.deep_linking.links.PlayerLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PlayerLinkHandlerModule_ProvidePlayerLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: kk.g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C42707g implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final h f406575a;

    public C42707g(h hVar) {
        this.f406575a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h hVar = this.f406575a;
        C42706f.f406574a.getClass();
        return new C43834a(PlayerLink.class, null, new C43834a.b.C11809b(hVar));
    }
}
