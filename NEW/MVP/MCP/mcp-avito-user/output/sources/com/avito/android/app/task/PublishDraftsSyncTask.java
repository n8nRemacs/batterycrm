package com.avito.android.app.task;

import Cq0.C13343b;
import android.app.Application;
import com.avito.android.publish.InterfaceC33861g;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: PublishDraftsSyncTask.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001%BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0002\b\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0002\b\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010#R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010$¨\u0006&"}, d2 = {"Lcom/avito/android/app/task/PublishDraftsSyncTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Lcom/avito/android/publish/drafts/D;", "draftRepositoryObserver", "Lcom/avito/android/publish/g;", "draftSyncDelegate", "Lcom/avito/android/util/a5;", "schedulers", "Lf90/J;", "updateStorage", "Lcom/avito/android/publish/drafts/E;", "publishDraftWiper", "Lcom/avito/android/connection_quality/connectivity/a;", "connectivityProvider", "Lkotlin/Function1;", "", "Lcom/avito/android/photo_cache/j;", "uploadingProgressProvider", "<init>", "(Lcom/avito/android/publish/drafts/D;Lcom/avito/android/publish/g;Lcom/avito/android/util/a5;Lf90/J;Lcom/avito/android/publish/drafts/E;Lcom/avito/android/connection_quality/connectivity/a;LY41/l;)V", "Lio/reactivex/rxjava3/core/z;", "Lkotlin/G0;", "Lj41/e;", "getConnectivityObservable", "()Lio/reactivex/rxjava3/core/z;", "getUploadedPhotosObservable", "Landroid/app/Application;", "application", "execute", "(Landroid/app/Application;)V", "Lcom/avito/android/publish/drafts/D;", "Lcom/avito/android/publish/g;", "Lcom/avito/android/util/a5;", "Lf90/J;", "Lcom/avito/android/publish/drafts/E;", "Lcom/avito/android/connection_quality/connectivity/a;", "LY41/l;", "a", "_avito_publish-drafts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PublishDraftsSyncTask implements ApplicationBackgroundStartupTask {

    @Y61.k
    private final com.avito.android.connection_quality.connectivity.a connectivityProvider;

    @Y61.k
    private final com.avito.android.publish.drafts.D draftRepositoryObserver;

    @Y61.k
    private final InterfaceC33861g draftSyncDelegate;

    @Y61.k
    private final com.avito.android.publish.drafts.E publishDraftWiper;

    @Y61.k
    private final InterfaceC35745a5 schedulers;

    @Y61.k
    private final f90.J updateStorage;

    @Y61.k
    private final Y41.l<String, com.avito.android.photo_cache.j> uploadingProgressProvider;

    /* compiled from: PublishDraftsSyncTask.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/app/task/PublishDraftsSyncTask$a;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "_avito_publish-drafts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends Exception {
    }

    /* compiled from: PublishDraftsSyncTask.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f91493b = new b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", "PublishDraftsSyncTask", (Throwable) obj);
        }
    }

    /* compiled from: PublishDraftsSyncTask.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "Lio/reactivex/rxjava3/core/g;", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T, R> implements l41.o {
        public c() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            PublishDraftsSyncTask publishDraftsSyncTask = PublishDraftsSyncTask.this;
            return new io.reactivex.rxjava3.internal.operators.completable.v(new C42007e(new C13343b(publishDraftsSyncTask, 3)).r(C28593s1.f91732b).w(com.avito.android.util.rx3.H0.a(publishDraftsSyncTask.schedulers.c(), C28596t1.f91737l, C28599u1.f91738l))).k(new com.avito.android.advert_core.task.a(5)).l(C28602v1.f91739b).r();
        }
    }

    /* compiled from: PublishDraftsSyncTask.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T> f91495b = new d<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((Boolean) obj).booleanValue();
        }
    }

    /* compiled from: PublishDraftsSyncTask.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "apply", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final e<T, R> f91496b = new e<>();

        @Override // l41.o
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            ((Boolean) obj).booleanValue();
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: PublishDraftsSyncTask.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Larrow/core/Y0;", "", "optionalDraft", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/photo_cache/q;", "apply", "(Larrow/core/Y0;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T, R> implements l41.o {
        public f() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            String str = (String) ((arrow.core.Y0) obj).c();
            return str != null ? ((com.avito.android.photo_cache.j) PublishDraftsSyncTask.this.uploadingProgressProvider.invoke(str)).b().N(C28605w1.f91742b) : io.reactivex.rxjava3.internal.operators.observable.U.f403867b;
        }
    }

    /* compiled from: PublishDraftsSyncTask.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/photo_cache/q;", "it", "Lkotlin/G0;", "apply", "(Lcom/avito/android/photo_cache/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final g<T, R> f91498b = new g<>();

        @Override // l41.o
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PublishDraftsSyncTask(@Y61.k com.avito.android.publish.drafts.D d12, @Y61.k InterfaceC33861g interfaceC33861g, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k f90.J j12, @Y61.k com.avito.android.publish.drafts.E e12, @Y61.k com.avito.android.connection_quality.connectivity.a aVar, @Y61.k Y41.l<? super String, ? extends com.avito.android.photo_cache.j> lVar) {
        this.draftRepositoryObserver = d12;
        this.draftSyncDelegate = interfaceC33861g;
        this.schedulers = interfaceC35745a5;
        this.updateStorage = j12;
        this.publishDraftWiper = e12;
        this.connectivityProvider = aVar;
        this.uploadingProgressProvider = lVar;
    }

    private final io.reactivex.rxjava3.core.z<kotlin.G0> getConnectivityObservable() {
        io.reactivex.rxjava3.core.z zVarQ = io.reactivex.rxjava3.core.z.q(io.reactivex.rxjava3.core.z.c0(Boolean.valueOf(this.connectivityProvider.c())), this.connectivityProvider.d());
        zVarQ.getClass();
        return zVarQ.D(io.reactivex.rxjava3.internal.functions.a.f401991a).N(d.f91495b).d0(e.f91496b);
    }

    private final io.reactivex.rxjava3.core.z<kotlin.G0> getUploadedPhotosObservable() {
        io.reactivex.rxjava3.core.z<R> zVarY0 = this.draftRepositoryObserver.b().y0(new f());
        zVarY0.getClass();
        return zVarY0.D(io.reactivex.rxjava3.internal.functions.a.f401991a).d0(g.f91498b);
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    public void execute(@Y61.k Application application) {
        (this.updateStorage.getF395691b() ? this.publishDraftWiper.a("AppUpdateTask") : C41823n.f402260b).g(new io.reactivex.rxjava3.internal.operators.observable.Z(getConnectivityObservable().i0(getUploadedPhotosObservable()).y(500L, TimeUnit.MILLISECONDS, this.schedulers.c()), new c())).v(new com.avito.android.advert_core.task.a(4), b.f91493b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$0() {
    }
}
