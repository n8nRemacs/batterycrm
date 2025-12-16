package Jd0;

import android.app.Application;
import com.avito.android.photo_storage.i;
import com.avito.android.photo_storage.k;
import com.avito.android.publish.analytics.InterfaceC33515a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import t80.InterfaceC48515a;
import yc.C50213a;

/* compiled from: ComputerVisionModule_ProvideComputerVisionInteractorFactory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<com.avito.android.computer_vision.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f9072a;

    /* renamed from: b, reason: collision with root package name */
    public final l f9073b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC33515a> f9074c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f9075d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<C50213a> f9076e;

    /* renamed from: f, reason: collision with root package name */
    public final k f9077f;

    public c(u uVar, l lVar, Provider provider, Provider provider2, Provider provider3, k kVar) {
        this.f9072a = uVar;
        this.f9073b = lVar;
        this.f9074c = provider;
        this.f9075d = provider2;
        this.f9076e = provider3;
        this.f9077f = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC48515a interfaceC48515a = (InterfaceC48515a) this.f9072a.get();
        Application application = (Application) this.f9073b.f393949a;
        InterfaceC33515a interfaceC33515a = this.f9074c.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f9075d.get();
        C50213a c50213a = this.f9076e.get();
        i iVar = (i) this.f9077f.get();
        int i12 = b.f9071a;
        return new com.avito.android.computer_vision.c(new C14188a(interfaceC48515a, 0), interfaceC33515a, new com.avito.android.photo_picker.converter.c(application, iVar), interfaceC35745a5, c50213a);
    }
}
