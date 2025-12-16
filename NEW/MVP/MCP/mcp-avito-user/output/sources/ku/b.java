package KU;

import android.app.Activity;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DialogRouterModule_ProvideDialogRouterFactory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<com.avito.android.lib.deprecated_design.dialog.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f9463a;

    public b(u uVar) {
        this.f9463a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Activity activity = (Activity) this.f9463a.get();
        int i12 = a.f9462a;
        return new com.avito.android.lib.deprecated_design.dialog.b(activity);
    }
}
