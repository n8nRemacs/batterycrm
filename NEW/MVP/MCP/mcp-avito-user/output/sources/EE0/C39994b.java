package eE0;

import com.avito.android.notification_center.counter.j;
import com.avito.android.remote.notification.InterfaceC34350q;
import com.avito.android.task.NotificationCenterTask;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: NotificationCenterTask_Factory.java */
@e
@y
@x
/* renamed from: eE0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C39994b implements h<NotificationCenterTask> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<j> f395059a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC34350q> f395060b;

    /* renamed from: c, reason: collision with root package name */
    public final u f395061c;

    public C39994b(u uVar, Provider provider, Provider provider2) {
        this.f395059a = provider;
        this.f395060b = provider2;
        this.f395061c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new NotificationCenterTask(this.f395059a.get(), this.f395060b.get(), g.a(w.a(this.f395061c)));
    }
}
