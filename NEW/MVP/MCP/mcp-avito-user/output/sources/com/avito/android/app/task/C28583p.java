package com.avito.android.app.task;

import com.avito.android.app.task.InterfaceC28559h;
import com.avito.android.util.V2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.text.C43066x;

/* compiled from: ApplicationStartupTasksRegistry.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/app/task/p;", "Lcom/avito/android/app/task/M0;", "_common_startup-task_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.app.task.p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28583p implements M0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f91680a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f91681b = new LinkedHashMap();

    /* compiled from: ApplicationStartupTasksRegistry.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u001a\u0010\u0004\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Ljava/lang/Class;", "Lcom/avito/android/app/task/h;", "Lcom/avito/android/app/task/h$b;", "<name for destructuring parameter 0>", "", "invoke", "(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.app.task.p$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Map.Entry<Class<? extends InterfaceC28559h>, InterfaceC28559h.b>, CharSequence> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f91682l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final CharSequence invoke(Map.Entry<Class<? extends InterfaceC28559h>, InterfaceC28559h.b> entry) {
            Map.Entry<Class<? extends InterfaceC28559h>, InterfaceC28559h.b> entry2 = entry;
            return entry2.getKey().getName() + '=' + entry2.getValue().getClass().getSimpleName();
        }
    }

    public C28583p(boolean z12) {
        this.f91680a = z12;
    }

    @Override // com.avito.android.app.task.M0
    public final synchronized void a(@Y61.k Class cls) {
        d(cls, InterfaceC28559h.b.C2696b.f91607a);
        this.f91681b.put(cls, new InterfaceC28559h.b.a(null));
    }

    @Override // com.avito.android.app.task.M0
    public final void b(@Y61.k ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Class<? extends InterfaceC28559h> cls = (Class) it.next();
            synchronized (this) {
                d(cls, InterfaceC28559h.b.c.f91608a);
                this.f91681b.put(cls, InterfaceC28559h.b.C2696b.f91607a);
            }
        }
    }

    @Override // com.avito.android.app.task.InterfaceC28580o
    public final synchronized void c(@Y61.k Class<? extends InterfaceC28559h> cls, @Y61.k Class<? extends InterfaceC28559h.b> cls2) {
        try {
            InterfaceC28559h.b bVarE = e(cls);
            if (!bVarE.a(cls2)) {
                IllegalStateException illegalStateException = new IllegalStateException(f(cls, bVarE, "expected at least ".concat(cls2.getSimpleName())));
                if (this.f91680a) {
                    throw illegalStateException;
                }
                V2.f318762a.a("DEFAULT_TAG", "AppStartupTaskRegistry", illegalStateException);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void d(Class<? extends InterfaceC28559h> cls, InterfaceC28559h.b bVar) {
        InterfaceC28559h.b bVarE = e(cls);
        if (kotlin.jvm.internal.L.f(bVarE, bVar)) {
            return;
        }
        throw new IllegalArgumentException(f(cls, bVarE, "expected exactly " + bVar + '.').toString());
    }

    @Y61.k
    public final synchronized InterfaceC28559h.b e(@Y61.k Class<? extends InterfaceC28559h> cls) {
        InterfaceC28559h.b bVar;
        bVar = (InterfaceC28559h.b) this.f91681b.get(cls);
        if (bVar == null) {
            bVar = InterfaceC28559h.b.c.f91608a;
        }
        return bVar;
    }

    public final String f(Class<? extends InterfaceC28559h> cls, InterfaceC28559h.b bVar, String str) {
        return C43066x.F0("\n            |Unexpected state of task " + cls.getCanonicalName() + ": " + bVar.getClass().getSimpleName() + ".\n            |Reason: " + str + ".\n            |Check that you registered the task in DI.\n            |All tasks: " + C42745f0.O(this.f91681b.entrySet(), null, null, null, a.f91682l, 31) + "\n            |");
    }
}
