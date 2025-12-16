package com.avito.android.messenger.conversation.mvi.sync;

import android.content.Context;
import androidx.work.F;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.avito.android.di.C29972i;
import com.avito.android.messenger.di.B0;
import com.avito.android.messenger.di.C32484n0;
import com.avito.android.util.V2;
import dZ.C39684b;
import dZ.j;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: IncompleteMessageLoadingWorker.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/IncompleteMessageLoadingWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes15.dex */
public final class IncompleteMessageLoadingWorker extends Worker {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f194599b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C39684b f194600c = new C39684b("version_for_incomplete_message_loading_worker", kotlin.collections.P0.g(new kotlin.Q(0, new j.a()), new kotlin.Q(1, new j.b("userAccountId"))));

    /* renamed from: a, reason: collision with root package name */
    @Inject
    public C32263g f194601a;

    /* compiled from: IncompleteMessageLoadingWorker.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/IncompleteMessageLoadingWorker$a;", "", "<init>", "()V", "", "CHANNEL_ID_KEY", "Ljava/lang/String;", "MESSAGE_LOCAL_ID_KEY", "TAG", "USER_ACCOUNT_ID_KEY", "USER_ID_KEY", "USER_IS_EMPLOYEE", "USER_TYPE_KEY", "LdZ/a;", "Lru/avito/messenger/MessengerUserHashInfo;", "userInfoPersistHelper", "LdZ/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public IncompleteMessageLoadingWorker(@Y61.k Context context, @Y61.k WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    @Y61.k
    public final F.a doWork() {
        V2 v22 = V2.f318762a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[" + Thread.currentThread().getName() + ']');
        sb2.append(" start ");
        sb2.append(getId());
        v22.i("IncompleteMessageLoadingWorker", sb2.toString(), null);
        MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) dZ.g.a(getInputData(), f194600c);
        if (messengerUserHashInfo == null) {
            v22.d("IncompleteMessageLoadingWorker", "No userInfo was passed!");
            return new F.a.C1949a();
        }
        String strC = getInputData().c("channelId");
        if (strC == null) {
            v22.d("IncompleteMessageLoadingWorker", "No channelId was passed!");
            return new F.a.C1949a();
        }
        String strC2 = getInputData().c("localId");
        B0.a aVarA = C32484n0.a();
        aVarA.a((com.avito.android.messenger.di.C0) C29972i.a(C29972i.b(getApplicationContext()), com.avito.android.messenger.di.C0.class));
        aVarA.build().a(this);
        try {
            C32263g c32263g = this.f194601a;
            if (c32263g == null) {
                c32263g = null;
            }
            io.reactivex.rxjava3.internal.operators.completable.K kA2 = c32263g.a(strC, strC2, messengerUserHashInfo);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Objects.requireNonNull(timeUnit, "unit is null");
            io.reactivex.rxjava3.internal.observers.j jVar = new io.reactivex.rxjava3.internal.observers.j();
            kA2.a(jVar);
            if (jVar.getCount() != 0) {
                try {
                    if (!jVar.await(60L, timeUnit)) {
                        jVar.f402111e = true;
                        io.reactivex.rxjava3.disposables.d dVar = jVar.f402110d;
                        if (dVar != null) {
                            dVar.dispose();
                        }
                        v22.j("IncompleteMessageLoadingWorker", "Timed out " + com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]) + " channelId=" + strC, null);
                        return new F.a.b();
                    }
                } catch (InterruptedException e12) {
                    jVar.f402111e = true;
                    io.reactivex.rxjava3.disposables.d dVar2 = jVar.f402110d;
                    if (dVar2 != null) {
                        dVar2.dispose();
                    }
                    throw io.reactivex.rxjava3.internal.util.h.f(e12);
                }
            }
            Throwable th2 = jVar.f402109c;
            if (th2 != null) {
                throw io.reactivex.rxjava3.internal.util.h.f(th2);
            }
            v22.i("IncompleteMessageLoadingWorker", "Completed " + com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]) + " channelId=" + strC, null);
            return new F.a.c();
        } catch (Exception e13) {
            V2.f318762a.j("IncompleteMessageLoadingWorker", androidx.camera.camera2.internal.G.g(new StringBuilder("Failed "), com.avito.android.messenger.util.i.b(messengerUserHashInfo, new kotlin.Q[0]), " channelId=", strC), e13);
            return new F.a.b();
        }
    }
}
