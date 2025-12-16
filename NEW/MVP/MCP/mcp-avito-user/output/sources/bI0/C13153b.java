package Bi0;

import AK0.l;
import AK0.o;
import android.app.Application;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RecallMeConfirmedModule_ProvidePreferencesFactory.java */
@e
@y
@x
/* renamed from: Bi0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C13153b implements h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final u f1632a;

    public C13153b(u uVar) {
        this.f1632a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f1632a.get();
        C13152a.f1631a.getClass();
        return new o(application.getSharedPreferences("recall_me_timer_storage", 0));
    }
}
