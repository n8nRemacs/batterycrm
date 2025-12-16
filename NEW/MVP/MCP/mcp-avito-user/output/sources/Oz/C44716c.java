package oZ;

import com.avito.android.messenger_unread_counter.impl_module.task.UnreadChatsCounterSyncTask;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import qZ.InterfaceC47362a;

/* compiled from: UnreadChatsCounterSyncTask_Factory.java */
@e
@y
@x
/* renamed from: oZ.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C44716c implements h<UnreadChatsCounterSyncTask> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC47362a> f419909a;

    public C44716c(Provider<InterfaceC47362a> provider) {
        this.f419909a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new UnreadChatsCounterSyncTask(this.f419909a.get());
    }
}
