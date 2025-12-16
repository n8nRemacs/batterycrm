package com.avito.android.publish.details.adapter.objects.education;

import com.avito.android.Q1;
import com.avito.android.util.InterfaceC35807h4;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EducationListPreviewItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final u f233321a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35807h4> f233322b;

    /* renamed from: c, reason: collision with root package name */
    public final u f233323c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f233324d;

    public j(u uVar, Provider provider, u uVar2, dagger.internal.l lVar) {
        this.f233321a = uVar;
        this.f233322b = provider;
        this.f233323c = uVar2;
        this.f233324d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.util.text.a) this.f233321a.get(), this.f233322b.get(), (Q1) this.f233323c.get(), ((Boolean) this.f233324d.f393949a).booleanValue());
    }
}
