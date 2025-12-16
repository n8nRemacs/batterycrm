package com.avito.android.messenger.di;

import android.app.Application;
import androidx.room.RoomDatabase;
import com.avito.android.C30277e1;
import com.avito.android.C30713g1;
import com.avito.android.messenger.InterfaceC32522f;
import com.avito.android.messenger.di.R0;
import com.avito.android.persistence.messenger.MessengerDatabase;
import java.util.ArrayList;

/* compiled from: MessengerDatabaseModule_ProvideMessengerDatabaseFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class T0 implements dagger.internal.h<MessengerDatabase> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f195709a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f195710b;

    /* renamed from: c, reason: collision with root package name */
    public final C30713g1 f195711c;

    public T0(dagger.internal.l lVar, dagger.internal.u uVar, C30713g1 c30713g1) {
        this.f195709a = lVar;
        this.f195710b = uVar;
        this.f195711c = c30713g1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f195709a.f393949a;
        InterfaceC32522f interfaceC32522f = (InterfaceC32522f) this.f195710b.get();
        C30277e1 c30277e1 = (C30277e1) this.f195711c.get();
        int i12 = R0.f195700a;
        RoomDatabase.a aVarA = androidx.room.x0.a(application, "messenger.db", MessengerDatabase.class);
        R0.a aVar = R0.a.f195701a;
        ArrayList arrayList = aVarA.f54316d;
        arrayList.add(aVar);
        arrayList.add(new R0.b(interfaceC32522f, c30277e1));
        aVarA.c();
        return (MessengerDatabase) aVarA.b();
    }
}
