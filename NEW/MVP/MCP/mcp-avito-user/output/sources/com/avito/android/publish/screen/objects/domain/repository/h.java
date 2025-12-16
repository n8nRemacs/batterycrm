package com.avito.android.publish.screen.objects.domain.repository;

import com.avito.android.Q1;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.publish.objects.ObjectFillFormScreenParams;
import com.avito.android.validation.InterfaceC36030r0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;
import yc.C50213a;

/* compiled from: ObjectItemsRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f240041a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f240042b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<a> f240043c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.publish.objects.slot.d f240044d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.category_parameters.a> f240045e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC36030r0> f240046f;

    /* renamed from: g, reason: collision with root package name */
    public final u f240047g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f240048h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<C50213a> f240049i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<Q1> f240050j;

    /* renamed from: k, reason: collision with root package name */
    public final Provider<u3.l<SimpleTestGroupWithNone>> f240051k;

    public h(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, com.avito.android.publish.objects.slot.d dVar, Provider provider2, Provider provider3, u uVar, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.f240041a = lVar;
        this.f240042b = lVar2;
        this.f240043c = provider;
        this.f240044d = dVar;
        this.f240045e = provider2;
        this.f240046f = provider3;
        this.f240047g = uVar;
        this.f240048h = provider4;
        this.f240049i = provider5;
        this.f240050j = provider6;
        this.f240051k = provider7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g(((Boolean) this.f240041a.f393949a).booleanValue(), (ObjectFillFormScreenParams) this.f240042b.f393949a, this.f240043c.get(), (com.avito.android.publish.objects.slot.c) this.f240044d.get(), this.f240045e.get(), this.f240046f.get(), (Set) this.f240047g.get(), this.f240048h.get(), this.f240049i.get(), this.f240050j.get(), this.f240051k.get());
    }
}
