package aq0;

import AK0.l;
import AK0.o;
import android.app.Application;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectDialogLogoStorageModule_ProvidePreferencesFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: aq0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23655d implements h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final u f56254a;

    public C23655d(u uVar) {
        this.f56254a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f56254a.get();
        C23654c.f56253a.getClass();
        return new o(application.getSharedPreferences("select_logo", 0));
    }
}
