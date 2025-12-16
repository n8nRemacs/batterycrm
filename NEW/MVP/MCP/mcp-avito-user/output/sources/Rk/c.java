package rK;

import com.avito.android.notification.p;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SetupCallNotificationChannelTaskModule_ProvideSetupCallNotificationChannelTaskFactory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final u f429754a;

    public c(u uVar) {
        this.f429754a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarA = g.a(w.a(this.f429754a));
        b.f429753a.getClass();
        return new C47556a(eVarA);
    }
}
