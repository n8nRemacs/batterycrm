package com.avito.android.realty_agency.use_case;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import ti0.InterfaceC48675a;

/* compiled from: AddLotToSelectionUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class d implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f251766a;

    /* renamed from: b, reason: collision with root package name */
    public final u f251767b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.realty_agency.beduin.b f251768c;

    /* renamed from: d, reason: collision with root package name */
    public final l f251769d;

    /* renamed from: e, reason: collision with root package name */
    public final u f251770e;

    /* renamed from: f, reason: collision with root package name */
    public final u f251771f;

    public d(u uVar, u uVar2, com.avito.android.realty_agency.beduin.b bVar, l lVar, u uVar3, u uVar4) {
        this.f251766a = uVar;
        this.f251767b = uVar2;
        this.f251768c = bVar;
        this.f251769d = lVar;
        this.f251770e = uVar3;
        this.f251771f = uVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC48675a interfaceC48675a = (InterfaceC48675a) this.f251766a.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f251767b.get();
        this.f251768c.getClass();
        return new a(interfaceC48675a, aVar, new com.avito.android.realty_agency.beduin.a(), (a.i) this.f251769d.f393949a, (R0) this.f251770e.get(), (Context) this.f251771f.get());
    }
}
