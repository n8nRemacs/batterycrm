package Vd0;

import Od0.InterfaceC14673a;
import com.avito.android.publish.C0;
import com.avito.android.publish.details.InterfaceC33678b;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import nF.C44245a;

/* compiled from: HistoricalSuggestNewResultListener_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f17329a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC33678b> f17330b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<d> f17331c;

    /* renamed from: d, reason: collision with root package name */
    public final u f17332d;

    /* renamed from: e, reason: collision with root package name */
    public final u f17333e;

    public g(u uVar, u uVar2, u uVar3, Provider provider, Provider provider2) {
        this.f17329a = uVar;
        this.f17330b = provider;
        this.f17331c = provider2;
        this.f17332d = uVar2;
        this.f17333e = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((C0) this.f17329a.get(), this.f17330b.get(), this.f17331c.get(), (InterfaceC14673a) this.f17332d.get(), (C44245a) this.f17333e.get());
    }
}
