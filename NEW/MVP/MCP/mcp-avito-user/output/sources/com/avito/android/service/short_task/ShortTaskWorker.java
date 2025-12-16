package com.avito.android.service.short_task;

import android.content.Context;
import androidx.work.C23544h;
import androidx.work.F;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.avito.android.di.C29972i;
import com.avito.android.util.C;
import com.avito.android.util.V2;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ShortTaskWorker.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/service/short_task/ShortTaskWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "_common_job-scheduler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShortTaskWorker extends Worker {

    /* renamed from: a, reason: collision with root package name */
    @Inject
    public Map<Class<?>, Provider<ShortTask>> f274035a;

    /* renamed from: b, reason: collision with root package name */
    @Inject
    public Optional<g> f274036b;

    /* renamed from: c, reason: collision with root package name */
    @Inject
    public C f274037c;

    /* compiled from: ShortTaskWorker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service/short_task/ShortTaskWorker$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_common_job-scheduler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public ShortTaskWorker(@Y61.k Context context, @Y61.k WorkerParameters workerParameters) {
        super(context, workerParameters);
        com.avito.android.service.short_task.di.a.a().a((com.avito.android.service.short_task.di.c) C29972i.a(C29972i.b(context), com.avito.android.service.short_task.di.c.class)).Mj(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.work.Worker
    @Y61.k
    public final F.a doWork() throws ClassNotFoundException {
        Q q12;
        F.a cVar;
        Class<?> cls;
        ShortTask shortTask;
        V2.f318762a.c("ShortTaskWorker", "doWork: all tags=" + getTags(), null);
        Iterator<T> it = getTags().iterator();
        while (true) {
            if (!it.hasNext()) {
                q12 = null;
                break;
            }
            try {
                cls = Class.forName((String) it.next(), true, getApplicationContext().getClassLoader());
                Map<Class<?>, Provider<ShortTask>> map = this.f274035a;
                if (map == null) {
                    map = null;
                }
                Provider<ShortTask> provider = map.get(cls);
                shortTask = provider != null ? provider.get() : null;
            } catch (ClassNotFoundException unused) {
            }
            q12 = shortTask == null ? null : new Q(cls, shortTask);
            if (q12 != null) {
                break;
            }
        }
        if (q12 == null) {
            V2.f318762a.f(new IllegalArgumentException("ShortTaskWorker: no task for tags " + getTags()));
            return new F.a.C1949a();
        }
        Class cls2 = (Class) q12.f406619b;
        ShortTask shortTask2 = (ShortTask) q12.f406620c;
        V2 v22 = V2.f318762a;
        v22.c("ShortTaskWorker", "doWork: task=" + cls2 + "; extras=" + getInputData(), null);
        try {
            C23544h inputData = getInputData();
            C c12 = this.f274037c;
            if (c12 == null) {
                c12 = null;
            }
            int iOrdinal = shortTask2.start(com.avito.android.service.short_task.a.a(inputData, !c12.l())).e().ordinal();
            if (iOrdinal == 0) {
                cVar = new F.a.c();
            } else if (iOrdinal == 1) {
                cVar = new F.a.C1949a();
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar = new F.a.b();
            }
            v22.c("ShortTaskWorker", "doWork: " + cVar + " task=" + cls2 + "; extras=" + getInputData(), null);
            return cVar;
        } catch (Throwable th2) {
            V2.f318762a.a("ShortTaskWorker", "doWork: FAILED task=" + cls2 + "; extras=" + getInputData(), th2);
            Optional<g> optional = this.f274036b;
            if (optional == null) {
                optional = null;
            }
            g gVarOrElse = optional.orElse(null);
            if (gVarOrElse != null) {
                gVarOrElse.a(shortTask2, th2);
            }
            return new F.a.C1949a();
        }
    }
}
