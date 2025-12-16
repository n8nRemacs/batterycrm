package com.avito.android.bxcontent.di.module;

import java.util.HashSet;
import java.util.Set;

/* compiled from: BxContentKonveyorBlueprintsModule_ProvideBxContentKonveyorBlueprintsFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.bxcontent.di.module.l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29064l implements dagger.internal.h<Set<TV0.b<?, ?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final C29063k f110998a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f110999b;

    public C29064l(C29063k c29063k, dagger.internal.u uVar) {
        this.f110998a = c29063k;
        this.f110999b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        WQ.c cVar = (WQ.c) this.f110999b.get();
        this.f110998a.getClass();
        HashSet hashSetB = cVar.getF111001b();
        dagger.internal.t.d(hashSetB);
        return hashSetB;
    }
}
