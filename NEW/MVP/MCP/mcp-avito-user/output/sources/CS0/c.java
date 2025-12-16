package Cs0;

import android.app.Application;
import android.content.SharedPreferences;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DayScheduleSavePreferencesStorageModule_ProvideSharedPreferencesFactory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<SharedPreferences> {

    /* renamed from: a, reason: collision with root package name */
    public final u f2723a;

    public c(u uVar) {
        this.f2723a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f2723a.get();
        C13349a.f2722a.getClass();
        return application.getSharedPreferences("DAY_SCHEDULE_SAVE_MODAL_PREFERENCES", 0);
    }
}
