package com.avito.android.app.work;

import android.content.Context;
import androidx.work.C23542f;
import androidx.work.ExistingWorkPolicy;
import androidx.work.J;
import androidx.work.NetworkType;
import androidx.work.WorkManager;
import androidx.work.impl.Y;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PublishDraftsSyncWorkFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/app/work/d;", "Lcom/avito/android/app/work/c;", "_avito_publish-drafts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f91759a;

    @Inject
    public d(@Y61.k Context context) {
        this.f91759a = context;
    }

    @Override // com.avito.android.app.work.c
    public final void a() {
        C23542f.a aVar = new C23542f.a();
        aVar.b(NetworkType.f55396c);
        J jB2 = new J.a(PublishDraftsSyncWorker.class).f(aVar.a()).g(15L, TimeUnit.SECONDS).b();
        WorkManager.f55428a.getClass();
        Y.f(this.f91759a).a("PublishDraftsSyncWorker", ExistingWorkPolicy.f55375b, jB2).a();
    }
}
