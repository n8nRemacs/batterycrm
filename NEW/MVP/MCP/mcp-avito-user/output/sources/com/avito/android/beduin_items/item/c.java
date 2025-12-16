package com.avito.android.beduin_items.item;

import bj.InterfaceC25659b;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BeduinItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f105244a;

    /* renamed from: b, reason: collision with root package name */
    public final u f105245b;

    /* renamed from: c, reason: collision with root package name */
    public final u f105246c;

    public c(u uVar, u uVar2, u uVar3) {
        this.f105244a = uVar;
        this.f105245b = uVar2;
        this.f105246c = uVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((e) this.f105244a.get(), (InterfaceC25659b) this.f105245b.get(), (InterfaceC35745a5) this.f105246c.get());
    }
}
