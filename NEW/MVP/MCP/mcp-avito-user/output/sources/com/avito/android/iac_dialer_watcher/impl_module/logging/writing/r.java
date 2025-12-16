package com.avito.android.iac_dialer_watcher.impl_module.logging.writing;

import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.C41936b0;
import io.reactivex.rxjava3.kotlin.A1;
import java.lang.Thread;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: IacLogSaver.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/w;", "session", "Lkotlin/G0;", "apply", "(Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/w;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class r<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f168124b;

    public r(q qVar) {
        this.f168124b = qVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w wVar = (com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w) obj;
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacLogSaver", "initialized: " + wVar, null);
        String str = q.f168102k;
        final q qVar = this.f168124b;
        qVar.getClass();
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        final long j12 = wVar.f167936a;
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.avito.android.iac_dialer_watcher.impl_module.logging.writing.p
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th2) {
                q qVar2 = qVar;
                long j13 = j12;
                String str2 = q.f168102k;
                try {
                    qVar2.c(j13, thread, th2);
                } catch (Throwable unused) {
                }
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th2);
                }
            }
        });
        if (!qVar.f168107d.i()) {
            io.reactivex.rxjava3.core.z<j> zVarL = qVar.f168105b.l();
            InterfaceC35745a5 interfaceC35745a5 = qVar.f168109f;
            A1.h(new C41936b0(zVarL.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.a()), new x(qVar, j12)), new y(qVar), null, 6);
        }
        return G0.f406611a;
    }
}
