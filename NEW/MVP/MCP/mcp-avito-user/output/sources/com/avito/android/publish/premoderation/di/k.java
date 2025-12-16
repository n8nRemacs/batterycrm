package com.avito.android.publish.premoderation.di;

import androidx.view.P0;
import com.avito.android.publish.premoderation.WrongCategoryFragment;
import com.avito.android.publish.premoderation.s;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: WrongCategoryModule_ProvideViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final i f238295a;

    /* renamed from: b, reason: collision with root package name */
    public final l f238296b;

    /* renamed from: c, reason: collision with root package name */
    public final u f238297c;

    public k(i iVar, l lVar, u uVar) {
        this.f238295a = iVar;
        this.f238296b = lVar;
        this.f238297c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        WrongCategoryFragment wrongCategoryFragment = (WrongCategoryFragment) this.f238296b.f393949a;
        P0.c cVar = (P0.c) this.f238297c.get();
        this.f238295a.getClass();
        return (s) new P0(wrongCategoryFragment, cVar).a(s.class);
    }
}
