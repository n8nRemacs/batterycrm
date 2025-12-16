package com.avito.android.app.work;

import android.content.Context;
import androidx.work.F;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.avito.android.di.C29972i;
import com.avito.android.publish.InterfaceC33861g;
import com.avito.android.publish.drafts.PublishDraftRepository;
import com.avito.android.publish.drafts.di.c;
import javax.inject.Inject;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PublishDraftsSyncWorker.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/app/work/PublishDraftsSyncWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "_avito_publish-drafts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes11.dex */
public final class PublishDraftsSyncWorker extends Worker {

    /* renamed from: a, reason: collision with root package name */
    @Inject
    public InterfaceC33861g f91748a;

    /* compiled from: PublishDraftsSyncWorker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/app/work/PublishDraftsSyncWorker$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_publish-drafts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PublishDraftsSyncWorker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f91749a;

        static {
            int[] iArr = new int[PublishDraftRepository.DraftSyncResult.values().length];
            try {
                PublishDraftRepository.DraftSyncResult draftSyncResult = PublishDraftRepository.DraftSyncResult.f235332b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f91749a = iArr;
        }
    }

    static {
        new a(null);
    }

    public PublishDraftsSyncWorker(@Y61.k Context context, @Y61.k WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.work.Worker
    @Y61.k
    public final F.a doWork() {
        try {
            c.a aVarA = com.avito.android.publish.drafts.di.b.a();
            aVarA.a((com.avito.android.publish.drafts.di.f) C29972i.a(C29972i.b(getApplicationContext()), com.avito.android.publish.drafts.di.f.class));
            aVarA.build().a(this);
            InterfaceC33861g interfaceC33861g = this.f91748a;
            if (interfaceC33861g == null) {
                interfaceC33861g = null;
            }
            return b.f91749a[((PublishDraftRepository.DraftSyncResult) interfaceC33861g.a().e()).ordinal()] == 1 ? new F.a.c() : new F.a.b();
        } catch (Exception unused) {
            return new F.a.b();
        }
    }
}
