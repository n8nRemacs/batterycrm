package com.avito.android.credman;

import hD.C40806a;
import hD.C40808c;

/* compiled from: CredmanBindingModule_ProvideCredmanSaverFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final a f129082a;

    /* renamed from: b, reason: collision with root package name */
    public final C40808c f129083b;

    /* renamed from: c, reason: collision with root package name */
    public final r f129084c;

    /* renamed from: d, reason: collision with root package name */
    public final x f129085d;

    public d(a aVar, C40808c c40808c, r rVar, x xVar) {
        this.f129082a = aVar;
        this.f129083b = c40808c;
        this.f129084c = rVar;
        this.f129085d = xVar;
    }

    public static o a(a aVar, C40806a c40806a, r rVar, x xVar) {
        aVar.getClass();
        c40806a.getClass();
        kotlin.reflect.n<Object> nVar = C40806a.f397105l[0];
        if (((Boolean) c40806a.f397106b.a().invoke()).booleanValue()) {
            return (o) rVar.get();
        }
        xVar.getClass();
        return new w();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f129082a, (C40806a) this.f129083b.get(), this.f129084c, this.f129085d);
    }
}
