package com.avito.android.iac_dialer.impl_module.socket_subscription.app_startup_task;

import CK.b;
import X81.x;
import Y41.l;
import Y61.k;
import android.annotation.SuppressLint;
import android.app.Application;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.app.task.ApplicationBackgroundStartupTask;
import com.avito.android.iac_analytics.public_module.analytics_models.CallDeliveryType;
import com.avito.android.iac_dialer.impl_module.analytics.tech_info.IacTechInfoStorage;
import com.avito.android.iac_dialer.impl_module.push_handler.g;
import com.avito.android.iac_dialer.impl_module.push_handler.j;
import com.avito.android.iac_dialer.impl_module.telecom.e;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiString;
import com.avito.android.permissions.z;
import com.avito.android.util.C2;
import com.avito.android.util.InterfaceC35745a5;
import com.google.gson.i;
import com.huawei.hms.api.FailedBinderCallBack;
import io.reactivex.rxjava3.kotlin.A1;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import nJ.C44280o;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: IacSocketSubscriptionTask.kt */
@P
@s0
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001'BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010#R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010$R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010%¨\u0006("}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/socket_subscription/app_startup_task/IacSocketSubscriptionTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Lru/avito/messenger/z;", "messengerClient", "Lcom/avito/android/util/a5;", "schedulersFactory", "LCK/a;", "dialer", "Lcom/avito/android/analytics/a;", "analytics", "Lcom/avito/android/permissions/z;", "permissionStateProvider", "Lcom/avito/android/iac_dialer/impl_module/analytics/tech_info/IacTechInfoStorage;", "techInfoStorage", "Lcom/avito/android/app_foreground_provider/util_module/a;", "appForegroundStatusProvider", "Lcom/avito/android/iac_dialer/impl_module/telecom/e;", "iacTelecomManagerSplitter", "<init>", "(Lru/avito/messenger/z;Lcom/avito/android/util/a5;LCK/a;Lcom/avito/android/analytics/a;Lcom/avito/android/permissions/z;Lcom/avito/android/iac_dialer/impl_module/analytics/tech_info/IacTechInfoStorage;Lcom/avito/android/app_foreground_provider/util_module/a;Lcom/avito/android/iac_dialer/impl_module/telecom/e;)V", "Landroid/app/Application;", "application", "Lkotlin/G0;", "execute", "(Landroid/app/Application;)V", "Lcom/google/gson/i;", "json", "Lcom/avito/android/iac_dialer/impl_module/socket_subscription/app_startup_task/CallDeliveredBySocketMessage;", "tryToExtractIncomingCallMessage", "(Lcom/google/gson/i;)Lcom/avito/android/iac_dialer/impl_module/socket_subscription/app_startup_task/CallDeliveredBySocketMessage;", "Lru/avito/messenger/z;", "Lcom/avito/android/util/a5;", "LCK/a;", "Lcom/avito/android/analytics/a;", "Lcom/avito/android/permissions/z;", "Lcom/avito/android/iac_dialer/impl_module/analytics/tech_info/IacTechInfoStorage;", "Lcom/avito/android/app_foreground_provider/util_module/a;", "Lcom/avito/android/iac_dialer/impl_module/telecom/e;", "Companion", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IacSocketSubscriptionTask implements ApplicationBackgroundStartupTask {

    @k
    private final InterfaceC28373a analytics;

    @k
    private final com.avito.android.app_foreground_provider.util_module.a appForegroundStatusProvider;

    @k
    private final CK.a dialer;

    @k
    private final e iacTelecomManagerSplitter;

    @k
    private final InterfaceC47842z messengerClient;

    @k
    private final z permissionStateProvider;

    @k
    private final InterfaceC35745a5 schedulersFactory;

    @k
    private final IacTechInfoStorage techInfoStorage;
    public static final int $stable = 8;

    /* compiled from: IacSocketSubscriptionTask.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f166368l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            Throwable th3 = th2;
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.b("AvCallsPlatform", "IacSocketSubscriptionTask: Can't process new voip event, error: " + th3.getLocalizedMessage(), th3);
            return G0.f406611a;
        }
    }

    /* compiled from: IacSocketSubscriptionTask.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LX81/x;", "voipEvent", "Lkotlin/G0;", "invoke", "(LX81/x;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<x, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(x xVar) {
            i iVar = xVar.f18723a;
            IacSocketSubscriptionTask iacSocketSubscriptionTask = IacSocketSubscriptionTask.this;
            CallDeliveredBySocketMessage callDeliveredBySocketMessageTryToExtractIncomingCallMessage = iacSocketSubscriptionTask.tryToExtractIncomingCallMessage(iVar);
            if (callDeliveredBySocketMessageTryToExtractIncomingCallMessage != null) {
                iacSocketSubscriptionTask.techInfoStorage.a(callDeliveredBySocketMessageTryToExtractIncomingCallMessage.getCallId(), IacCallDirection.INCOMING, callDeliveredBySocketMessageTryToExtractIncomingCallMessage.getTags());
                iacSocketSubscriptionTask.analytics.c(new C44280o(callDeliveredBySocketMessageTryToExtractIncomingCallMessage.getCallId(), CallDeliveryType.f164270c, iacSocketSubscriptionTask.permissionStateProvider.b("android.permission.RECORD_AUDIO").b(), iacSocketSubscriptionTask.techInfoStorage.b(callDeliveredBySocketMessageTryToExtractIncomingCallMessage.getCallId())));
                if (iacSocketSubscriptionTask.iacTelecomManagerSplitter.c(callDeliveredBySocketMessageTryToExtractIncomingCallMessage.getTags()) || iacSocketSubscriptionTask.appForegroundStatusProvider.getStatus().isForeground()) {
                    iacSocketSubscriptionTask.dialer.a(new b.a(callDeliveredBySocketMessageTryToExtractIncomingCallMessage), "IacSocketSubscriptionTask");
                } else {
                    com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.d("AvCallsPlatform", "IacSocketSubscriptionTask: Ignore socket call_deliver message when app is background", null);
                }
            } else {
                iacSocketSubscriptionTask.dialer.a(new b.C0102b(new IacPiiString(iVar.toString())), "IacSocketSubscriptionTask");
            }
            return G0.f406611a;
        }
    }

    @Inject
    public IacSocketSubscriptionTask(@k InterfaceC47842z interfaceC47842z, @k InterfaceC35745a5 interfaceC35745a5, @k CK.a aVar, @k InterfaceC28373a interfaceC28373a, @k z zVar, @k IacTechInfoStorage iacTechInfoStorage, @k com.avito.android.app_foreground_provider.util_module.a aVar2, @k e eVar) {
        this.messengerClient = interfaceC47842z;
        this.schedulersFactory = interfaceC35745a5;
        this.dialer = aVar;
        this.analytics = interfaceC28373a;
        this.permissionStateProvider = zVar;
        this.techInfoStorage = iacTechInfoStorage;
        this.appForegroundStatusProvider = aVar2;
        this.iacTelecomManagerSplitter = eVar;
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    @SuppressLint({"CheckResult"})
    public void execute(@k Application application) {
        A1.h(this.messengerClient.q().j0(this.schedulersFactory.c()), b.f166368l, new c(), 2);
    }

    @Y61.l
    public final CallDeliveredBySocketMessage tryToExtractIncomingCallMessage(@k i json) {
        try {
            com.google.gson.k kVarI = json.i();
            if (kVarI.i().D("type").s().equals("voip.push")) {
                com.google.gson.k kVarI2 = kVarI.I("data");
                String strS = kVarI2.i().D(FailedBinderCallBack.CALLER_ID).s();
                Boolean boolA = C2.a(kVarI2, "isVideo");
                boolean zBooleanValue = boolA != null ? boolA.booleanValue() : false;
                i iVarA = j.a(kVarI2, Constants.REFERRER_API_META, g.f166216l);
                if (iVarA == null) {
                    return null;
                }
                return new CallDeliveredBySocketMessage(strS, new IacPiiString(json.toString()), zBooleanValue, j.d(iVarA, com.avito.android.iac_dialer.impl_module.push_handler.i.f166217l));
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
