package com.avito.android.data_picker_show.datapickershow.mvi;

import com.avito.android.data_picker_show.DataPickerArgs;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DataPickerShowBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f132511a;

    public d(dagger.internal.l lVar) {
        this.f132511a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((DataPickerArgs) this.f132511a.f393949a);
    }
}
