package com.avito.android.app.work;

import android.content.Context;
import androidx.compose.runtime.internal.P;
import androidx.work.F;
import androidx.work.WorkerParameters;
import androidx.work.rxjava3.RxWorker;
import com.avito.android.app.task.P0;
import com.avito.android.di.C29972i;
import com.avito.android.messenger.di.C32493q0;
import com.avito.android.messenger.di.s2;
import com.avito.android.messenger.di.t2;
import com.avito.android.messenger.w0;
import com.avito.android.persistence.messenger.Y0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.mixed.x;
import io.reactivex.rxjava3.internal.operators.observable.C41933a0;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import io.reactivex.rxjava3.internal.operators.observable.T;
import io.reactivex.rxjava3.internal.operators.single.W;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import l41.o;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.o0;

/* compiled from: SendPendingMessagesWorker.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/app/work/SendPendingMessagesWorker;", "Landroidx/work/rxjava3/RxWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes11.dex */
public final class SendPendingMessagesWorker extends RxWorker {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f91750f = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @Inject
    public w0 f91751b;

    /* renamed from: c, reason: collision with root package name */
    @Inject
    public InterfaceC35745a5 f91752c;

    /* renamed from: d, reason: collision with root package name */
    @Inject
    public Y0 f91753d;

    /* renamed from: e, reason: collision with root package name */
    @Inject
    public h31.e<P0> f91754e;

    /* compiled from: SendPendingMessagesWorker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/app/work/SendPendingMessagesWorker$a;", "", "<init>", "()V", "", "WORK_NAME", "Ljava/lang/String;", "WORK_TAG", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SendPendingMessagesWorker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo;", "userInfo", "Lio/reactivex/rxjava3/core/O;", "Landroidx/work/F$a;", "apply", "(Lru/avito/messenger/MessengerUserHashInfo;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements o {
        public b() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            I iQ2;
            MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) obj;
            if (o0.b(messengerUserHashInfo)) {
                SendPendingMessagesWorker sendPendingMessagesWorker = SendPendingMessagesWorker.this;
                Y0 y02 = sendPendingMessagesWorker.f91753d;
                if (y02 == null) {
                    y02 = null;
                }
                C41933a0 c41933a0D = y02.D(messengerUserHashInfo.f430682d, com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c));
                InterfaceC35745a5 interfaceC35745a5 = sendPendingMessagesWorker.f91752c;
                if (interfaceC35745a5 == null) {
                    interfaceC35745a5 = null;
                }
                C41982q1 c41982q1X0 = c41933a0D.x0(interfaceC35745a5.a());
                InterfaceC35745a5 interfaceC35745a52 = sendPendingMessagesWorker.f91752c;
                iQ2 = new x(c41982q1X0.j0((interfaceC35745a52 != null ? interfaceC35745a52 : null).c()).d0(h.f91761b).D(io.reactivex.rxjava3.internal.functions.a.f401991a), new j(sendPendingMessagesWorker)).S().A(360L, TimeUnit.SECONDS).u(new com.avito.android.analytics.clickstream.I(4));
            } else {
                iQ2 = I.q(new F.a.c());
            }
            return iQ2.j(k.f91763b).k(l.f91764b);
        }
    }

    public SendPendingMessagesWorker(@Y61.k Context context, @Y61.k WorkerParameters workerParameters) {
        super(context, workerParameters);
        V2.f318762a.i("SendPendingMessagesWorker", "work created", null);
        s2.a aVarA = C32493q0.a();
        aVarA.a((t2) C29972i.a(C29972i.b(getApplicationContext()), t2.class));
        aVarA.build().a(this);
    }

    @Override // androidx.work.rxjava3.RxWorker
    @Y61.k
    public final I<F.a> b() {
        w0 w0Var = this.f91751b;
        if (w0Var == null) {
            w0Var = null;
        }
        T tS2 = w0Var.g().S();
        InterfaceC35745a5 interfaceC35745a5 = this.f91752c;
        if (interfaceC35745a5 == null) {
            interfaceC35745a5 = null;
        }
        W wZ2 = tS2.z(interfaceC35745a5.a());
        InterfaceC35745a5 interfaceC35745a52 = this.f91752c;
        return wZ2.s((interfaceC35745a52 != null ? interfaceC35745a52 : null).c()).n(new b());
    }
}
