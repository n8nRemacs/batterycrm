package wM;

import com.avito.android.image.enhancement.C30974e;
import com.avito.android.image.enhancement.InterfaceC30970a;
import com.avito.android.image.enhancement.InterfaceC30975f;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ImageEnhanceAppModule_ProvideImageEnhanceInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<C30974e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f441413a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC30970a> f441414b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.image.enhancement.files.e> f441415c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.image.enhancement.files.a> f441416d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC30975f> f441417e;

    /* renamed from: f, reason: collision with root package name */
    public final u f441418f;

    public f(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f441413a = provider;
        this.f441414b = provider2;
        this.f441415c = provider3;
        this.f441416d = provider4;
        this.f441417e = provider5;
        this.f441418f = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35745a5 interfaceC35745a5 = this.f441413a.get();
        InterfaceC30970a interfaceC30970a = this.f441414b.get();
        com.avito.android.image.enhancement.files.e eVar = this.f441415c.get();
        com.avito.android.image.enhancement.files.a aVar = this.f441416d.get();
        InterfaceC30975f interfaceC30975f = this.f441417e.get();
        com.avito.android.image.enhancement.files.c cVar = (com.avito.android.image.enhancement.files.c) this.f441418f.get();
        C49536a.f441408a.getClass();
        return new C30974e(interfaceC35745a5, interfaceC30970a, eVar, aVar, interfaceC30975f, cVar);
    }
}
