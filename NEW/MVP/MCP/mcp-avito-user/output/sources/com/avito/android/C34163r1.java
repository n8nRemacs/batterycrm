package com.avito.android;

import android.content.Context;
import androidx.work.BackoffPolicy;
import androidx.work.C23542f;
import androidx.work.ExistingWorkPolicy;
import androidx.work.J;
import androidx.work.NetworkType;
import androidx.work.WorkManager;
import androidx.work.impl.utils.C23593c;
import com.avito.android.app.work.SendPendingMessagesWorker;
import io.reactivex.rxjava3.internal.operators.completable.C41816g;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MessengerWorkFactoryImpl.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/r1;", "Lcom/avito/android/q1;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.r1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C34163r1 implements InterfaceC34159q1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f246394a;

    @Inject
    public C34163r1(@Y61.k Context context) {
        this.f246394a = context.getApplicationContext();
    }

    @Override // com.avito.android.InterfaceC34159q1
    @Y61.k
    public final C41816g a() {
        SendPendingMessagesWorker.f91750f.getClass();
        WorkManager.f55428a.getClass();
        return new C41816g(new Ba1.B(21, io.reactivex.rxjava3.schedulers.b.f404944d, C23593c.d(androidx.work.impl.Y.f(this.f246394a), "SendPendingMessagesWork")));
    }

    @Override // com.avito.android.InterfaceC34159q1
    @Y61.k
    public final C41816g b(long j12, boolean z12) {
        SendPendingMessagesWorker.f91750f.getClass();
        C23542f.a aVar = new C23542f.a();
        aVar.b(NetworkType.f55396c);
        J.a aVarA = new J.a(SendPendingMessagesWorker.class).f(aVar.a()).a("Messenger");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        androidx.work.J jB2 = aVarA.g(j12, timeUnit).e(BackoffPolicy.f55356c, 5L, timeUnit).b();
        ExistingWorkPolicy existingWorkPolicy = z12 ? ExistingWorkPolicy.f55375b : ExistingWorkPolicy.f55376c;
        WorkManager.f55428a.getClass();
        return new C41816g(new Ba1.B(21, io.reactivex.rxjava3.schedulers.b.f404944d, androidx.work.impl.Y.f(this.f246394a).a("SendPendingMessagesWork", existingWorkPolicy, jB2).a()));
    }
}
