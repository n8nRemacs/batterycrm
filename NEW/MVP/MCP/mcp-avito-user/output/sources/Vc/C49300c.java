package vc;

import android.app.Application;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import uc.C49031f;
import uc.InterfaceC49030e;

/* compiled from: MyTrackerModule_ProvideMyTrackerFacadeFactory.java */
@e
@y
@x
/* renamed from: vc.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49300c implements h<InterfaceC49030e> {

    /* renamed from: a, reason: collision with root package name */
    public final C49298a f440889a;

    /* renamed from: b, reason: collision with root package name */
    public final l f440890b;

    /* renamed from: c, reason: collision with root package name */
    public final f f440891c;

    public C49300c(C49298a c49298a, l lVar, f fVar) {
        this.f440889a = c49298a;
        this.f440890b = lVar;
        this.f440891c = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f440890b.f393949a;
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f440891c.get();
        this.f440889a.getClass();
        return new C49031f(application, interfaceC28373a);
    }
}
