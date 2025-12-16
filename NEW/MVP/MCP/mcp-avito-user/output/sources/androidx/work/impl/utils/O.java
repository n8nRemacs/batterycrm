package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.C23638w;
import androidx.work.InterfaceC23639x;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.model.C23580w;
import androidx.work.impl.model.o0;
import com.google.common.util.concurrent.D0;
import java.util.UUID;

/* compiled from: WorkForegroundUpdater.java */
@RestrictTo
/* loaded from: classes10.dex */
public class O implements InterfaceC23639x {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f55959d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.work.impl.utils.taskexecutor.c f55960a;

    /* renamed from: b, reason: collision with root package name */
    public final ForegroundProcessor f55961b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.work.impl.model.I f55962c;

    static {
        androidx.work.G.b("WMFgUpdater");
    }

    @SuppressLint({"LambdaLast"})
    public O(@j.N WorkDatabase workDatabase, @j.N ForegroundProcessor foregroundProcessor, @j.N androidx.work.impl.utils.taskexecutor.c cVar) {
        this.f55961b = foregroundProcessor;
        this.f55960a = cVar;
        this.f55962c = workDatabase.A();
    }

    @Override // androidx.work.InterfaceC23639x
    @j.N
    public final D0<Void> a(@j.N final Context context, @j.N final UUID uuid, @j.N final C23638w c23638w) {
        return androidx.concurrent.futures.b.a(new FX0.b(this.f55960a.f56028a, "setForegroundAsync", new Y41.a() { // from class: androidx.work.impl.utils.N
            @Override // Y41.a
            public final Object invoke() {
                int i12 = O.f55959d;
                O o12 = this.f55955b;
                o12.getClass();
                String string = uuid.toString();
                androidx.work.impl.model.H hI2 = o12.f55962c.i(string);
                if (hI2 == null || hI2.f55796b.a()) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                ForegroundProcessor foregroundProcessor = o12.f55961b;
                C23638w c23638w2 = c23638w;
                foregroundProcessor.startForeground(string, c23638w2);
                C23580w c23580wA = o0.a(hI2);
                Context context2 = context;
                context2.startService(SystemForegroundDispatcher.createNotifyIntent(context2, c23580wA, c23638w2));
                return null;
            }
        }, 3));
    }
}
