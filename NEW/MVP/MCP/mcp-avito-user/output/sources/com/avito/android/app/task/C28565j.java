package com.avito.android.app.task;

import android.app.Application;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.H2;
import com.avito.android.app.task.InterfaceC28559h;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.observable.C41957i0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import od.InterfaceC44756a;

/* compiled from: ApplicationStartupTasksExecutorImpl.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/app/task/j;", "Lcom/avito/android/app/task/i;", "_common_startup-task_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.app.task.j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28565j implements InterfaceC28562i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f91617a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22983P f91618b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Set<ApplicationBlockingStartupTask> f91619c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Set<H2<? extends ApplicationBackgroundStartupTask>> f91620d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Set<H2<? extends ApplicationForegroundStartupTask>> f91621e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final M0 f91622f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f91623g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44756a f91624h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44756a f91625i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44756a f91626j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f91627k;

    /* compiled from: ApplicationStartupTasksExecutorImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Lcom/avito/android/app/task/h$a;", "invoke", "(Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;)Lcom/avito/android/app/task/h$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.app.task.j$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<ApplicationBackgroundStartupTask, InterfaceC28559h.a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Application f91628l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            super(1);
            this.f91628l = application;
        }

        @Override // Y41.l
        public final InterfaceC28559h.a invoke(ApplicationBackgroundStartupTask applicationBackgroundStartupTask) {
            applicationBackgroundStartupTask.execute(this.f91628l);
            return InterfaceC28559h.a.c.f91606a;
        }
    }

    /* compiled from: ApplicationStartupTasksExecutorImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/app/task/ApplicationForegroundStartupTask;", "Lcom/avito/android/app/task/h$a;", "invoke", "(Lcom/avito/android/app/task/ApplicationForegroundStartupTask;)Lcom/avito/android/app/task/h$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.app.task.j$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<ApplicationForegroundStartupTask, InterfaceC28559h.a> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f91629l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final InterfaceC28559h.a invoke(ApplicationForegroundStartupTask applicationForegroundStartupTask) {
            applicationForegroundStartupTask.execute();
            return InterfaceC28559h.a.c.f91606a;
        }
    }

    /* compiled from: ApplicationStartupTasksExecutorImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/app/task/h;", "T", "Lcom/avito/android/H2;", "typedLazy", "Lkotlin/G0;", "accept", "(Lcom/avito/android/H2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.app.task.j$c */
    public static final class c<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC44756a f91631c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f91632d;

        /* JADX WARN: Multi-variable type inference failed */
        public c(InterfaceC44756a interfaceC44756a, Y41.l<? super T, ? extends InterfaceC28559h.a> lVar) {
            this.f91631c = interfaceC44756a;
            this.f91632d = (kotlin.jvm.internal.N) lVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // l41.g
        public final void accept(Object obj) {
            H2 h22 = (H2) obj;
            InterfaceC28559h interfaceC28559h = (InterfaceC28559h) h22.f67277b.get();
            ?? r12 = this.f91632d;
            Class<? extends T> cls = h22.f67276a;
            C28565j c28565j = C28565j.this;
            c28565j.getClass();
            this.f91631c.a(interfaceC28559h.getClass().getSimpleName(), new C28574m(c28565j, interfaceC28559h, cls, r12));
        }
    }

    /* compiled from: ApplicationStartupTasksExecutorImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/app/task/h;", "T", "", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.app.task.j$d */
    public static final class d<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T> f91633b = new d<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("StartupTasksExecutor", "Unexpected error during async tasks execution", (Throwable) obj);
        }
    }

    public C28565j() {
        throw null;
    }

    public C28565j(Application application, InterfaceC22983P interfaceC22983P, Set set, Set set2, Set set3, M0 m02, InterfaceC35745a5 interfaceC35745a5, InterfaceC44756a interfaceC44756a, InterfaceC44756a interfaceC44756a2, InterfaceC44756a interfaceC44756a3, boolean z12, int i12, C42822w c42822w) {
        z12 = (i12 & 1024) != 0 ? false : z12;
        this.f91617a = application;
        this.f91618b = interfaceC22983P;
        this.f91619c = set;
        this.f91620d = set2;
        this.f91621e = set3;
        this.f91622f = m02;
        this.f91623g = interfaceC35745a5;
        this.f91624h = interfaceC44756a;
        this.f91625i = interfaceC44756a2;
        this.f91626j = interfaceC44756a3;
        this.f91627k = z12;
        Set set4 = set;
        ArrayList arrayList = new ArrayList(C42745f0.q(set4, 10));
        Iterator it = set4.iterator();
        while (it.hasNext()) {
            arrayList.add(((ApplicationBlockingStartupTask) it.next()).getClass());
        }
        M0 m03 = this.f91622f;
        m03.b(arrayList);
        Set<H2<? extends ApplicationBackgroundStartupTask>> set5 = this.f91620d;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(set5, 10));
        Iterator<T> it2 = set5.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((H2) it2.next()).f67276a);
        }
        m03.b(arrayList2);
        Set<H2<? extends ApplicationForegroundStartupTask>> set6 = this.f91621e;
        ArrayList arrayList3 = new ArrayList(C42745f0.q(set6, 10));
        Iterator<T> it3 = set6.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((H2) it3.next()).f67276a);
        }
        m03.b(arrayList3);
    }

    public final void a(@Y61.k Application application) {
        for (ApplicationBlockingStartupTask applicationBlockingStartupTask : C42745f0.B0(this.f91619c, new C28568k())) {
            Class<?> cls = applicationBlockingStartupTask.getClass();
            C28571l c28571l = new C28571l(this);
            this.f91624h.a(applicationBlockingStartupTask.getClass().getSimpleName(), new C28574m(this, applicationBlockingStartupTask, cls, c28571l));
        }
        b(C28577n.f91662a, this.f91620d, this.f91626j, new a(application));
        b(com.avito.android.util.architecture_components.l.b(this.f91618b, Lifecycle.Event.ON_START), this.f91621e, this.f91625i, b.f91629l);
    }

    public final <T extends InterfaceC28559h> void b(io.reactivex.rxjava3.core.z<kotlin.G0> zVar, Collection<? extends H2<? extends T>> collection, InterfaceC44756a interfaceC44756a, Y41.l<? super T, ? extends InterfaceC28559h.a> lVar) {
        C41957i0 c41957i0X = io.reactivex.rxjava3.core.z.X(collection);
        InterfaceC35745a5 interfaceC35745a5 = this.f91623g;
        io.reactivex.rxjava3.internal.operators.observable.I0 i0J0 = c41957i0X.x0(interfaceC35745a5.c()).j0(interfaceC35745a5.c());
        Objects.requireNonNull(zVar, "subscriptionIndicator is null");
        new io.reactivex.rxjava3.internal.operators.observable.H(i0J0, zVar).j0(interfaceC35745a5.c()).u0(new c(interfaceC44756a, lVar), d.f91633b);
    }
}
