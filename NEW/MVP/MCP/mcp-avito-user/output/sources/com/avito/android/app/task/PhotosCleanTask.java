package com.avito.android.app.task;

import android.app.Application;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.publish.drafts.C33842h;
import com.avito.android.publish.drafts.InterfaceC33843i;
import com.avito.android.publish.drafts.PublishDraftRepository;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PhotosCleanTask.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/app/task/PhotosCleanTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Lcom/avito/android/publish/drafts/PublishDraftRepository;", "draftRepository", "Lcom/avito/android/publish/drafts/i;", "photosCleaner", "Lcom/avito/android/util/a5;", "schedulers", "Lcom/avito/android/analytics/a;", "analytics", "Lcom/avito/android/util/C;", "buildInfo", "<init>", "(Lcom/avito/android/publish/drafts/PublishDraftRepository;Lcom/avito/android/publish/drafts/i;Lcom/avito/android/util/a5;Lcom/avito/android/analytics/a;Lcom/avito/android/util/C;)V", "Landroid/app/Application;", "application", "Lkotlin/G0;", "execute", "(Landroid/app/Application;)V", "Lcom/avito/android/publish/drafts/PublishDraftRepository;", "Lcom/avito/android/publish/drafts/i;", "Lcom/avito/android/util/a5;", "Lcom/avito/android/analytics/a;", "Lcom/avito/android/util/C;", "_avito_publish-drafts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PhotosCleanTask implements ApplicationBackgroundStartupTask {

    @Y61.k
    private final InterfaceC28373a analytics;

    @Y61.k
    private final com.avito.android.util.C buildInfo;

    @Y61.k
    private final PublishDraftRepository draftRepository;

    @Y61.k
    private final InterfaceC33843i photosCleaner;

    @Y61.k
    private final InterfaceC35745a5 schedulers;

    /* compiled from: PhotosCleanTask.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Larrow/core/Y0;", "Lcom/avito/android/publish/drafts/h;", "it", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/G0;", "apply", "(Larrow/core/Y0;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {
        public a() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            arrow.core.Y0 y02 = (arrow.core.Y0) obj;
            return PhotosCleanTask.this.photosCleaner.a(!y02.b() ? ((C33842h) y02.a()).f235376b : null);
        }
    }

    /* compiled from: PhotosCleanTask.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f91487b = new b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.c("PhotosCleanTask", "Publish photos cleaned on app start", null);
        }
    }

    /* compiled from: PhotosCleanTask.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Throwable th2 = (Throwable) obj;
            PhotosCleanTask photosCleanTask = PhotosCleanTask.this;
            photosCleanTask.analytics.c(new NonFatalErrorEvent("PhotosCleanTask", th2, null, null, 12, null));
            photosCleanTask.buildInfo.getF125491k().getClass();
        }
    }

    @Inject
    public PhotosCleanTask(@Y61.k PublishDraftRepository publishDraftRepository, @Y61.k InterfaceC33843i interfaceC33843i, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.util.C c12) {
        this.draftRepository = publishDraftRepository;
        this.photosCleaner = interfaceC33843i;
        this.schedulers = interfaceC35745a5;
        this.analytics = interfaceC28373a;
        this.buildInfo = c12;
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    public void execute(@Y61.k Application application) {
        this.draftRepository.e().n(new a()).z(this.schedulers.a()).x(b.f91487b, new c());
    }
}
