package com.avito.android.publish.details.computer_vision;

import com.avito.android.publish.C0;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ComputerVisionDetailsHelperImpl_Factory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f233593a;

    /* renamed from: b, reason: collision with root package name */
    public final u f233594b;

    /* renamed from: c, reason: collision with root package name */
    public final u f233595c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.details.a> f233596d;

    /* renamed from: e, reason: collision with root package name */
    public final u f233597e;

    public c(u uVar, u uVar2, u uVar3, u uVar4, Provider provider) {
        this.f233593a = uVar;
        this.f233594b = uVar2;
        this.f233595c = uVar3;
        this.f233596d = provider;
        this.f233597e = uVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((C0) this.f233593a.get(), (InterfaceC35745a5) this.f233594b.get(), (com.avito.android.computer_vision.a) this.f233595c.get(), this.f233596d.get(), (InterfaceC33535v) this.f233597e.get());
    }
}
