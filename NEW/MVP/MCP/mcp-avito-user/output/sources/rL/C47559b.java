package rL;

import android.app.Application;
import androidx.room.RoomDatabase;
import androidx.room.x0;
import com.avito.android.iac_dialer_watcher.impl_module.db.InAppCallsDatabase;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InAppCallsDatabaseModule_ProvideDatabaseFactory.java */
@e
@y
@x
/* renamed from: rL.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C47559b implements h<InAppCallsDatabase> {

    /* renamed from: a, reason: collision with root package name */
    public final C47558a f429755a;

    /* renamed from: b, reason: collision with root package name */
    public final l f429756b;

    public C47559b(C47558a c47558a, l lVar) {
        this.f429755a = c47558a;
        this.f429756b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f429756b.f393949a;
        this.f429755a.getClass();
        application.deleteDatabase("in_app_calls_logs.db");
        RoomDatabase.a aVarA = x0.a(application, "iac_db.db", InAppCallsDatabase.class);
        aVarA.c();
        return (InAppCallsDatabase) aVarA.b();
    }
}
