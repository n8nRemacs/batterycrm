package com.avito.android.iac_dialer.impl_module.telecom.impl;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telecom.PhoneAccount;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.C22491k0;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.TerminateReasonBundle;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.AudioState;
import com.avito.android.iac_dialer.impl_module.telecom.IacConnectionCallbacks;
import com.avito.android.iac_dialer.impl_module.telecom.IacConnectionInputData;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import java.lang.Thread;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: IacTelecomManagerImpl.kt */
@Singleton
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/telecom/impl/j;", "Lcom/avito/android/iac_dialer/impl_module/telecom/d;", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j implements com.avito.android.iac_dialer.impl_module.telecom.d {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f166467f = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PhoneAccountHandle f166468b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TelecomManager f166469c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public volatile Map<String, ? extends com.avito.android.iac_dialer.impl_module.telecom.a> f166470d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f166471e;

    /* compiled from: IacTelecomManagerImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/telecom/impl/j$a;", "", "<init>", "()V", "", "PHONE_ACCOUNT_HANDLE_ID", "Ljava/lang/String;", "PHONE_ACCOUNT_LABEL", "PLACEHOLDER_VALUE_ACCOUNT_BUNDLE", "TAG", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: IacTelecomManagerImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f166472a;

        static {
            int[] iArr = new int[IacCallDirection.values().length];
            try {
                iArr[IacCallDirection.OUTGOING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IacCallDirection.INCOMING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f166472a = iArr;
        }
    }

    /* compiled from: IacTelecomManagerImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/telecom/a;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/iac_dialer/impl_module/telecom/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<com.avito.android.iac_dialer.impl_module.telecom.a, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f166474m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.iac_dialer.impl_module.telecom.a, G0> f166475n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(String str, Y41.l<? super com.avito.android.iac_dialer.impl_module.telecom.a, G0> lVar) {
            super(1);
            this.f166474m = str;
            this.f166475n = lVar;
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.iac_dialer.impl_module.telecom.a aVar) {
            com.avito.android.iac_dialer.impl_module.telecom.a aVar2 = aVar;
            j jVar = j.this;
            jVar.f166470d = P0.l(jVar.f166470d, new Q(this.f166474m, aVar2));
            this.f166475n.invoke(aVar2);
            return G0.f406611a;
        }
    }

    /* compiled from: IacTelecomManagerImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReasonBundle;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReasonBundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<TerminateReasonBundle, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f166477m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<TerminateReasonBundle, G0> f166478n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(String str, Y41.l<? super TerminateReasonBundle, G0> lVar) {
            super(1);
            this.f166477m = str;
            this.f166478n = lVar;
        }

        @Override // Y41.l
        public final G0 invoke(TerminateReasonBundle terminateReasonBundle) {
            j jVar = j.this;
            jVar.f166470d = P0.i(jVar.f166470d, this.f166477m);
            this.f166478n.invoke(terminateReasonBundle);
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public j(@Y61.k Context context) {
        PhoneAccountHandle phoneAccountHandle = new PhoneAccountHandle(new ComponentName(context, (Class<?>) IacConnectionService.class), "Avito_internet_calls");
        this.f166468b = phoneAccountHandle;
        TelecomManager telecomManager = (TelecomManager) context.getSystemService("telecom");
        PhoneAccount.Builder capabilities = PhoneAccount.builder(phoneAccountHandle, "Avito internet calls").setCapabilities(3080);
        Bundle bundle = new Bundle();
        bundle.putBoolean("isTelecomAccount", true);
        capabilities.setExtras(bundle);
        telecomManager.registerPhoneAccount(capabilities.build());
        this.f166469c = telecomManager;
        this.f166470d = P0.c();
        this.f166471e = new AtomicBoolean(false);
    }

    @Override // com.avito.android.iac_dialer.impl_module.telecom.d
    @Y61.l
    @SuppressLint({"MissingPermission"})
    public final Object b(@Y61.k String str, @Y61.k IacCallDirection iacCallDirection, boolean z12, @Y61.l List<String> list, @Y61.k Y41.l<? super com.avito.android.iac_dialer.impl_module.telecom.a, G0> lVar, @Y61.k Y41.l<? super Throwable, G0> lVar2, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.l<? super Boolean, G0> lVar3, @Y61.k Y41.l<? super TerminateReasonBundle, G0> lVar4, @Y61.k Y41.l<? super AudioState, G0> lVar5, @Y61.k Continuation<? super G0> continuation) {
        String str2;
        Uri uri;
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
        bVar.a("IacTelecomManagerImpl", C22491k0.a(')', "addCall(callId=", str), null);
        if (!this.f166471e.getAndSet(true)) {
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.avito.android.iac_dialer.impl_module.telecom.impl.i
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th2) {
                    j jVar = this.f166465a;
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler;
                    Map<String, ? extends com.avito.android.iac_dialer.impl_module.telecom.a> map = jVar.f166470d;
                    com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacTelecomManagerImpl", "CRASH_HANDLER: crash detected", th2);
                    try {
                        map.forEach(new com.avito.android.advertising.loaders.my_target.g(3, k.f166479l));
                    } catch (Throwable unused) {
                    }
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th2);
                    }
                }
            });
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.telecom.extra.PHONE_ACCOUNT_HANDLE", this.f166468b);
        int[] iArr = b.f166472a;
        int i12 = iArr[iacCallDirection.ordinal()];
        if (i12 == 1) {
            str2 = "android.telecom.extra.OUTGOING_CALL_EXTRAS";
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "android.telecom.extra.INCOMING_CALL_EXTRAS";
        }
        IacConnectionService.f166428b.getClass();
        Bundle bundle2 = new Bundle();
        bundle2.putString("iac_call_extra_call_id", str);
        bundle.putParcelable(str2, bundle2);
        IacConnectionInputData iacConnectionInputData = new IacConnectionInputData(str, iacCallDirection, z12, new IacConnectionCallbacks(new c(str, lVar), lVar2, aVar, lVar3, new d(str, lVar4), lVar5));
        synchronized (com.avito.android.iac_dialer.impl_module.telecom.c.f166407a) {
            bVar.a("IacConnectionInputDataStorage", "add(callId=" + iacConnectionInputData.getCallId() + ')', null);
            com.avito.android.iac_dialer.impl_module.telecom.c.f166408b.put(iacConnectionInputData.getCallId(), iacConnectionInputData);
        }
        int i13 = iArr[iacCallDirection.ordinal()];
        if (i13 == 1) {
            if (Build.VERSION.SDK_INT < 28) {
                uri = Uri.parse("sip:" + this.f166468b.getComponentName().getPackageName());
            } else {
                uri = Uri.parse("tel:11111");
            }
            this.f166469c.placeCall(uri, bundle);
        } else if (i13 == 2) {
            bundle.putParcelable("android.telecom.extra.INCOMING_CALL_ADDRESS", Uri.parse("tel:11111"));
            this.f166469c.addNewIncomingCall(this.f166468b, bundle);
        }
        bVar.a("IacTelecomManagerImpl", "addCall: done", null);
        return G0.f406611a;
    }
}
