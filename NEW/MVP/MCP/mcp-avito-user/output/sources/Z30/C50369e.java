package z30;

import android.app.Application;
import com.avito.android.notification.s;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SetupNotificationChannelsTask_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: z30.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C50369e implements h<C50368d> {

    /* renamed from: a, reason: collision with root package name */
    public final l f443826a;

    /* renamed from: b, reason: collision with root package name */
    public final u f443827b;

    public C50369e(l lVar, u uVar) {
        this.f443826a = lVar;
        this.f443827b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C50368d((Application) this.f443826a.f393949a, (s) this.f443827b.get());
    }
}
