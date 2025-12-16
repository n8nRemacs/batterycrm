package com.avito.android.iac_calls_history.impl_module.interactor;

import androidx.compose.runtime.internal.P;
import cK.InterfaceC27058a;
import com.avito.android.account.E;
import com.avito.android.app.task.ApplicationForegroundStartupTask;
import io.reactivex.rxjava3.kotlin.A1;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CallsHistoryStartupTask.kt */
@P
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/interactor/CallsHistoryStartupTask;", "Lcom/avito/android/app/task/ApplicationForegroundStartupTask;", "Lcom/avito/android/account/E;", "accountProvider", "LcK/a;", "callsHistoryUnreadCounterInteractor", "Lcom/avito/android/missed_calls/a;", "missedCallsPushStream", "<init>", "(Lcom/avito/android/account/E;LcK/a;Lcom/avito/android/missed_calls/a;)V", "", "isAuthorized", "Lkotlin/G0;", "refreshOrMuteCounter", "(Z)V", "execute", "()V", "Lcom/avito/android/account/E;", "LcK/a;", "Lcom/avito/android/missed_calls/a;", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CallsHistoryStartupTask implements ApplicationForegroundStartupTask {

    @Y61.k
    private final E accountProvider;

    @Y61.k
    private final InterfaceC27058a callsHistoryUnreadCounterInteractor;

    @Y61.k
    private final com.avito.android.missed_calls.a missedCallsPushStream;

    /* compiled from: CallsHistoryStartupTask.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isAuthorized", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Boolean, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            CallsHistoryStartupTask.this.refreshOrMuteCounter(bool.booleanValue());
            return G0.f406611a;
        }
    }

    /* compiled from: CallsHistoryStartupTask.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "invoke", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<G0, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(G0 g02) {
            CallsHistoryStartupTask callsHistoryStartupTask = CallsHistoryStartupTask.this;
            callsHistoryStartupTask.refreshOrMuteCounter(callsHistoryStartupTask.accountProvider.b());
            return G0.f406611a;
        }
    }

    @Inject
    public CallsHistoryStartupTask(@Y61.k E e12, @Y61.k InterfaceC27058a interfaceC27058a, @Y61.k com.avito.android.missed_calls.a aVar) {
        this.accountProvider = e12;
        this.callsHistoryUnreadCounterInteractor = interfaceC27058a;
        this.missedCallsPushStream = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshOrMuteCounter(boolean isAuthorized) {
        if (isAuthorized) {
            this.callsHistoryUnreadCounterInteractor.b();
        } else {
            this.callsHistoryUnreadCounterInteractor.c();
        }
    }

    @Override // com.avito.android.app.task.ApplicationForegroundStartupTask
    public void execute() {
        A1.h(this.accountProvider.g(), null, new a(), 3);
        A1.h(this.missedCallsPushStream.l(), null, new b(), 3);
    }
}
