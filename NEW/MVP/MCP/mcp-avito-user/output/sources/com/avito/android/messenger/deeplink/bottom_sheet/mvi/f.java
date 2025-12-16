package com.avito.android.messenger.deeplink.bottom_sheet.mvi;

import com.avito.android.messenger.deeplink.ChannelBottomSheetInputLink;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BottomSheetInputActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<UY.a> f195486a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f195487b;

    public f(dagger.internal.l lVar, Provider provider) {
        this.f195486a = provider;
        this.f195487b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f195486a.get(), (ChannelBottomSheetInputLink) this.f195487b.f393949a);
    }
}
