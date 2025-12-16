package androidx.work.impl.utils;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.C23544h;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import com.google.common.util.concurrent.D0;
import java.util.Objects;
import java.util.UUID;

/* compiled from: WorkProgressUpdater.java */
@RestrictTo
/* loaded from: classes10.dex */
public class Q implements androidx.work.T {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f55966c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase f55967a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.work.impl.utils.taskexecutor.c f55968b;

    static {
        androidx.work.G.b("WorkProgressUpdater");
    }

    public Q(@j.N WorkDatabase workDatabase, @j.N androidx.work.impl.utils.taskexecutor.c cVar) {
        this.f55967a = workDatabase;
        this.f55968b = cVar;
    }

    @Override // androidx.work.T
    @j.N
    public final D0<Void> a(@j.N Context context, @j.N final UUID uuid, @j.N final C23544h c23544h) {
        return androidx.concurrent.futures.b.a(new FX0.b(this.f55968b.f56028a, "updateProgress", new Y41.a() { // from class: androidx.work.impl.utils.P
            @Override // Y41.a
            public final Object invoke() {
                int i12 = Q.f55966c;
                Q q12 = this.f55963b;
                q12.getClass();
                UUID uuid2 = uuid;
                String string = uuid2.toString();
                androidx.work.G gA2 = androidx.work.G.a();
                uuid2.toString();
                C23544h c23544h2 = c23544h;
                Objects.toString(c23544h2);
                gA2.getClass();
                WorkDatabase workDatabase = q12.f55967a;
                workDatabase.c();
                try {
                    androidx.work.impl.model.H hI2 = workDatabase.A().i(string);
                    if (hI2 == null) {
                        throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    if (hI2.f55796b == WorkInfo.State.f55420c) {
                        workDatabase.z().c(new androidx.work.impl.model.B(c23544h2, string));
                    } else {
                        androidx.work.G.a().getClass();
                    }
                    workDatabase.s();
                    workDatabase.l();
                    return null;
                } catch (Throwable th2) {
                    try {
                        androidx.work.G.a().getClass();
                        throw th2;
                    } catch (Throwable th3) {
                        workDatabase.l();
                        throw th3;
                    }
                }
            }
        }, 3));
    }
}
