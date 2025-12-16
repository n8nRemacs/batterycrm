package com.avito.android.timestamp_storage.di;

import com.avito.android.timestamp_storage.data.database.TimestampDatabase;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TimestampStorageModule_ProvideTimestampDaoFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<com.avito.android.timestamp_storage.data.dao.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f301485a;

    public e(u uVar) {
        this.f301485a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        TimestampDatabase timestampDatabase = (TimestampDatabase) this.f301485a.get();
        d.f301484a.getClass();
        com.avito.android.timestamp_storage.data.dao.a aVarU = timestampDatabase.u();
        t.d(aVarU);
        return aVarU;
    }
}
