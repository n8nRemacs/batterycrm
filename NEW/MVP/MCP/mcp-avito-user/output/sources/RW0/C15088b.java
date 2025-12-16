package Rw0;

import com.avito.android.snippet.video.l;
import com.avito.android.snippet.video.m;
import com.avito.android.snippet.video.s;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SnippetVideoComponentModule_ProvideSnippetVideoComponentFactoryFactory.java */
@e
@y
@x
/* renamed from: Rw0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15088b implements h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final C15087a f14742a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f14743b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<s> f14744c;

    public C15088b(C15087a c15087a, dagger.internal.l lVar, Provider provider) {
        this.f14742a = c15087a;
        this.f14743b = lVar;
        this.f14744c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Y41.a aVar = (Y41.a) this.f14743b.f393949a;
        s sVar = this.f14744c.get();
        this.f14742a.getClass();
        return new l((m) aVar.invoke(), sVar);
    }
}
