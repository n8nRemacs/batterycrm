package com.avito.android.timestamp_storage.di;

import android.app.Application;
import androidx.room.RoomDatabase;
import androidx.room.x0;
import com.avito.android.timestamp_storage.data.database.TimestampDatabase;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TimestampStorageModule_ProvideTimestampDatabaseFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements h<TimestampDatabase> {

    /* renamed from: a, reason: collision with root package name */
    public final l f301486a;

    public f(l lVar) {
        this.f301486a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f301486a.f393949a;
        d.f301484a.getClass();
        RoomDatabase.a aVarA = x0.a(application, "timestamps.db", TimestampDatabase.class);
        aVarA.c();
        return (TimestampDatabase) aVarA.b();
    }
}
