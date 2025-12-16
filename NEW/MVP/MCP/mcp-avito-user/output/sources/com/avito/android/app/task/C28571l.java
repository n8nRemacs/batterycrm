package com.avito.android.app.task;

import com.avito.android.app.task.InterfaceC28559h;
import kotlin.Metadata;

/* compiled from: ApplicationStartupTasksExecutorImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "Lcom/avito/android/app/task/h$a;", "invoke", "(Lcom/avito/android/app/task/ApplicationBlockingStartupTask;)Lcom/avito/android/app/task/h$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.app.task.l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28571l extends kotlin.jvm.internal.N implements Y41.l<ApplicationBlockingStartupTask, InterfaceC28559h.a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C28565j f91644l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28571l(C28565j c28565j) {
        super(1);
        this.f91644l = c28565j;
    }

    @Override // Y41.l
    public final InterfaceC28559h.a invoke(ApplicationBlockingStartupTask applicationBlockingStartupTask) {
        return applicationBlockingStartupTask.execute(this.f91644l.f91617a);
    }
}
