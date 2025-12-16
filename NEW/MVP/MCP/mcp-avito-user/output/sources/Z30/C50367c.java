package z30;

import com.avito.android.notification.task.NotificationStartupTask;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import y30.InterfaceC50050d;
import y30.f;

/* compiled from: NotificationStartupTask_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: z30.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C50367c implements h<NotificationStartupTask> {

    /* renamed from: a, reason: collision with root package name */
    public final f f443823a;

    public C50367c(f fVar) {
        this.f443823a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new NotificationStartupTask((InterfaceC50050d) this.f443823a.get());
    }
}
