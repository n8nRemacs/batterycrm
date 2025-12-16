package com.avito.android.work;

import Y41.l;
import Y61.k;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.Y;
import com.avito.android.AbstractApplicationC27634a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: WorkManagerInitialExceptionHandler.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/work/WorkManagerInitialExceptionHandler;", "Lkotlin/Function1;", "", "Lkotlin/G0;", "CloseDatabaseError", "DeleteDatabaseError", "OriginalErrorWrapper", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WorkManagerInitialExceptionHandler implements l<Throwable, G0> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AbstractApplicationC27634a f330590b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final InterfaceC28373a f330591c;

    /* compiled from: WorkManagerInitialExceptionHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/work/WorkManagerInitialExceptionHandler$CloseDatabaseError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CloseDatabaseError extends Exception {
    }

    /* compiled from: WorkManagerInitialExceptionHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/work/WorkManagerInitialExceptionHandler$DeleteDatabaseError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DeleteDatabaseError extends Exception {
    }

    /* compiled from: WorkManagerInitialExceptionHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/work/WorkManagerInitialExceptionHandler$OriginalErrorWrapper;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OriginalErrorWrapper extends Exception {
    }

    public WorkManagerInitialExceptionHandler(@k AbstractApplicationC27634a abstractApplicationC27634a, @Y61.l InterfaceC28373a interfaceC28373a) {
        this.f330590b = abstractApplicationC27634a;
        this.f330591c = interfaceC28373a;
    }

    public final void a(Exception exc) {
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        InterfaceC28373a interfaceC28373a = this.f330591c;
        if (interfaceC28373a != null) {
            interfaceC28373a.c(new NonFatalErrorEvent(message, exc, null, new NonFatalErrorEvent.a.b(exc.getClass(), message, 0, 4, null), 4, null));
        }
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        AbstractApplicationC27634a abstractApplicationC27634a = this.f330590b;
        a(new OriginalErrorWrapper("Error during WorkManager initialization", th2));
        try {
            WorkDatabase workDatabase = Y.f(abstractApplicationC27634a).f55559d;
            try {
                if (workDatabase.n()) {
                    ReentrantReadWriteLock.WriteLock writeLock = workDatabase.f54305i.writeLock();
                    writeLock.lock();
                    try {
                        androidx.room.Y y12 = workDatabase.f54301e;
                        if (y12.f54355l != null) {
                            throw null;
                        }
                        y12.f54355l = null;
                        workDatabase.i().close();
                    } finally {
                        writeLock.unlock();
                    }
                }
            } catch (Throwable th3) {
                a(new CloseDatabaseError("Error after trying to close WorkManager database", th3));
            }
            abstractApplicationC27634a.deleteDatabase(workDatabase.i().getF54516c());
        } catch (Throwable th4) {
            a(new DeleteDatabaseError("Error after trying to delete WorkManager database", th4));
        }
        return G0.f406611a;
    }
}
