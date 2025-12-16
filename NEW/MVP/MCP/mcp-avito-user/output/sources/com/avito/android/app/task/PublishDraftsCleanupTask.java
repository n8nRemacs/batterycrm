package com.avito.android.app.task;

import android.app.Application;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: PublishDraftsCleanupTask.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/app/task/PublishDraftsCleanupTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Lcom/avito/android/account/E;", "accountStateProvider", "Lcom/avito/android/publish/drafts/E;", "publishDraftWiper", "Lcom/avito/android/util/a5;", "schedulers", "Lcom/avito/android/util/C;", "build", "<init>", "(Lcom/avito/android/account/E;Lcom/avito/android/publish/drafts/E;Lcom/avito/android/util/a5;Lcom/avito/android/util/C;)V", "Landroid/app/Application;", "application", "Lkotlin/G0;", "execute", "(Landroid/app/Application;)V", "Lcom/avito/android/account/E;", "Lcom/avito/android/publish/drafts/E;", "Lcom/avito/android/util/a5;", "Lcom/avito/android/util/C;", "_avito_publish-drafts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PublishDraftsCleanupTask implements ApplicationBackgroundStartupTask {

    @Y61.k
    private final com.avito.android.account.E accountStateProvider;

    @Y61.k
    private final com.avito.android.util.C build;

    @Y61.k
    private final com.avito.android.publish.drafts.E publishDraftWiper;

    @Y61.k
    private final InterfaceC35745a5 schedulers;

    /* compiled from: PublishDraftsCleanupTask.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T> f91489b = new a<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return !((Boolean) obj).booleanValue();
        }
    }

    /* compiled from: PublishDraftsCleanupTask.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "apply", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T, R> f91490b = new b<>();

        @Override // l41.o
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            ((Boolean) obj).booleanValue();
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: PublishDraftsCleanupTask.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "Lio/reactivex/rxjava3/core/g;", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T, R> implements l41.o {
        public c() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return PublishDraftsCleanupTask.this.publishDraftWiper.a("DraftsCleanupTask");
        }
    }

    /* compiled from: PublishDraftsCleanupTask.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("PublishDrafts", "Failed to deleted drafts on ", (Throwable) obj);
            PublishDraftsCleanupTask.this.build.getF125491k().getClass();
        }
    }

    public PublishDraftsCleanupTask(@Y61.k com.avito.android.account.E e12, @Y61.k com.avito.android.publish.drafts.E e13, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.util.C c12) {
        this.accountStateProvider = e12;
        this.publishDraftWiper = e13;
        this.schedulers = interfaceC35745a5;
        this.build = c12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$0() {
        V2.f318762a.c("PublishDrafts", "Publish drafts deleted on logout", null);
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    public void execute(@Y61.k Application application) {
        new io.reactivex.rxjava3.internal.operators.observable.Z(this.accountStateProvider.g().N(a.f91489b).d0(b.f91490b), new c()).x(this.schedulers.a()).q(this.schedulers.a()).v(new com.avito.android.advert_core.task.a(3), new d());
    }
}
