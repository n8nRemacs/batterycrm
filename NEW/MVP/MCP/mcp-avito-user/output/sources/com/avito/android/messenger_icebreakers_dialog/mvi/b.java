package com.avito.android.messenger_icebreakers_dialog.mvi;

import com.avito.android.messenger_icebreakers_dialog.MessengerIcebreakerBottomSheetData;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MessengerIcebreakerBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f197666a;

    public b(l lVar) {
        this.f197666a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((MessengerIcebreakerBottomSheetData) this.f197666a.f393949a);
    }
}
