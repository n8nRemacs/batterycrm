package com.avito.android.service_booking.data.preferences;

import android.content.SharedPreferences;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DayScheduleSavePreferencesStorageImpl_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f274176a;

    public c(u uVar) {
        this.f274176a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((SharedPreferences) this.f274176a.get());
    }
}
