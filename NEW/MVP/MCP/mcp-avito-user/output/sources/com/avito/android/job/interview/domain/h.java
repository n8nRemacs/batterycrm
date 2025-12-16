package com.avito.android.job.interview.domain;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import sQ.InterfaceC48091a;

/* compiled from: InterviewInvitationInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final d f174557a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC48091a> f174558b;

    /* renamed from: c, reason: collision with root package name */
    public final l f174559c;

    public h(d dVar, Provider provider, l lVar) {
        this.f174557a = dVar;
        this.f174558b = provider;
        this.f174559c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        this.f174557a.getClass();
        return new g(new b(), this.f174558b.get(), (String) this.f174559c.f393949a);
    }
}
