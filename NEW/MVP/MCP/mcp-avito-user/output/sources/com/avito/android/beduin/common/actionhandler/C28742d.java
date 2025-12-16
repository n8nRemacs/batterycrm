package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15523b;
import gj.InterfaceC40691b;
import java.util.Map;

/* compiled from: BeduinActionHandlerWrapperWithCustom_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.beduin.common.actionhandler.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28742d implements dagger.internal.h<C28739c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.p f100224a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f100225b;

    /* renamed from: c, reason: collision with root package name */
    public final L f100226c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f100227d;

    public C28742d(dagger.internal.p pVar, dagger.internal.u uVar, L l12, dagger.internal.l lVar) {
        this.f100224a = pVar;
        this.f100225b = uVar;
        this.f100226c = l12;
        this.f100227d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C28739c((Map) this.f100224a.get(), (com.avito.android.beduin.context.di.h) this.f100225b.get(), (InterfaceC15523b) this.f100226c.get(), (InterfaceC40691b) this.f100227d.f393949a);
    }
}
