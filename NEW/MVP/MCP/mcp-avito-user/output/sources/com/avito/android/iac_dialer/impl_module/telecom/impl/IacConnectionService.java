package com.avito.android.iac_dialer.impl_module.telecom.impl;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.ConnectionService;
import android.telecom.DisconnectCause;
import android.telecom.PhoneAccountHandle;
import androidx.camera.camera2.internal.G;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.telecom.IacConnectionException;
import com.avito.android.iac_dialer.impl_module.telecom.IacConnectionInputData;
import com.avito.android.iac_dialer.impl_module.telecom.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: IacConnectionService.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/telecom/impl/IacConnectionService;", "Landroid/telecom/ConnectionService;", "<init>", "()V", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IacConnectionService extends ConnectionService {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f166428b = new a(null);

    /* compiled from: IacConnectionService.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/telecom/impl/IacConnectionService$a;", "", "<init>", "()V", "", "EXTRA_CALL_ID", "Ljava/lang/String;", "TAG", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public static Connection a(String str) {
        IacConnectionInputData iacConnectionInputDataA = com.avito.android.iac_dialer.impl_module.telecom.c.f166407a.a(str);
        if (iacConnectionInputDataA != null) {
            return new b(iacConnectionInputDataA);
        }
        String strF = G.f("IacConnectionInputData is null for callId=", str);
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.b("IacConnectionService", "createConnection: " + strF, null);
        return Connection.createFailedConnection(new DisconnectCause(1, strF));
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [Y41.a, kotlin.jvm.internal.N] */
    public static void b(String str) {
        IacConnectionInputData iacConnectionInputDataA = com.avito.android.iac_dialer.impl_module.telecom.c.f166407a.a(str);
        if (iacConnectionInputDataA != null) {
            iacConnectionInputDataA.getCallbacks().getOnAddCallFailed().invoke(new IacConnectionException("IacConnectionService: onCreateConnectionFailed, " + iacConnectionInputDataA.getCallId()));
            return;
        }
        String strF = G.f("IacConnectionInputData is null for callId=", str);
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.b("IacConnectionService", "onCreateConnectionFailed: " + strF, null);
        com.avito.android.iac_dialer.impl_module.telecom.d.f166409a.getClass();
        d.a.f166411b.invoke();
    }

    @Override // android.telecom.ConnectionService
    public final void onConnectionServiceFocusGained() {
        super.onConnectionServiceFocusGained();
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacConnectionService", "onConnectionServiceFocusGained", null);
    }

    @Override // android.telecom.ConnectionService
    public final void onConnectionServiceFocusLost() {
        super.onConnectionServiceFocusLost();
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacConnectionService", "onConnectionServiceFocusLost", null);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacConnectionService", "onCreate", null);
    }

    @Override // android.telecom.ConnectionService
    @Y61.k
    public final Connection onCreateIncomingConnection(@Y61.l PhoneAccountHandle phoneAccountHandle, @Y61.l ConnectionRequest connectionRequest) {
        Bundle extras;
        String string = null;
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacConnectionService", "onCreateIncomingConnection", null);
        if (connectionRequest != null && (extras = connectionRequest.getExtras()) != null) {
            Bundle bundle = (Bundle) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras.getParcelable("android.telecom.extra.INCOMING_CALL_EXTRAS", Bundle.class) : extras.getParcelable("android.telecom.extra.INCOMING_CALL_EXTRAS"));
            if (bundle != null) {
                string = bundle.getString("iac_call_extra_call_id");
            }
        }
        return a(string);
    }

    @Override // android.telecom.ConnectionService
    public final void onCreateIncomingConnectionFailed(@Y61.l PhoneAccountHandle phoneAccountHandle, @Y61.l ConnectionRequest connectionRequest) {
        Bundle extras;
        String string = null;
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacConnectionService", "onCreateIncomingConnectionFailed", null);
        if (connectionRequest != null && (extras = connectionRequest.getExtras()) != null) {
            Bundle bundle = (Bundle) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras.getParcelable("android.telecom.extra.INCOMING_CALL_EXTRAS", Bundle.class) : extras.getParcelable("android.telecom.extra.INCOMING_CALL_EXTRAS"));
            if (bundle != null) {
                string = bundle.getString("iac_call_extra_call_id");
            }
        }
        b(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    @Override // android.telecom.ConnectionService
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.telecom.Connection onCreateOutgoingConnection(@Y61.l android.telecom.PhoneAccountHandle r5, @Y61.l android.telecom.ConnectionRequest r6) {
        /*
            r4 = this;
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b r5 = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a
            java.lang.String r0 = "IacConnectionService"
            java.lang.String r1 = "onCreateOutgoingConnection"
            r2 = 0
            r5.a(r0, r1, r2)
            java.lang.String r5 = "iac_call_extra_call_id"
            if (r6 == 0) goto L33
            android.os.Bundle r0 = r6.getExtras()
            if (r0 == 0) goto L33
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 34
            if (r1 < r3) goto L21
            java.lang.Object r0 = com.avito.android.gig_apply.deeplink.c.h(r0)
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            goto L27
        L21:
            java.lang.String r1 = "android.telecom.extra.OUTGOING_CALL_EXTRAS"
            android.os.Parcelable r0 = r0.getParcelable(r1)
        L27:
            android.os.Bundle r0 = (android.os.Bundle) r0
            if (r0 == 0) goto L33
            java.lang.String r0 = r0.getString(r5)
            if (r0 == 0) goto L33
            r2 = r0
            goto L3f
        L33:
            if (r6 == 0) goto L3f
            android.os.Bundle r6 = r6.getExtras()
            if (r6 == 0) goto L3f
            java.lang.String r2 = r6.getString(r5)
        L3f:
            android.telecom.Connection r5 = a(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.telecom.impl.IacConnectionService.onCreateOutgoingConnection(android.telecom.PhoneAccountHandle, android.telecom.ConnectionRequest):android.telecom.Connection");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    @Override // android.telecom.ConnectionService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreateOutgoingConnectionFailed(@Y61.l android.telecom.PhoneAccountHandle r5, @Y61.l android.telecom.ConnectionRequest r6) {
        /*
            r4 = this;
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b r5 = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a
            java.lang.String r0 = "IacConnectionService"
            java.lang.String r1 = "onCreateOutgoingConnectionFailed"
            r2 = 0
            r5.a(r0, r1, r2)
            java.lang.String r5 = "iac_call_extra_call_id"
            if (r6 == 0) goto L33
            android.os.Bundle r0 = r6.getExtras()
            if (r0 == 0) goto L33
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 34
            if (r1 < r3) goto L21
            java.lang.Object r0 = com.avito.android.gig_apply.deeplink.c.h(r0)
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            goto L27
        L21:
            java.lang.String r1 = "android.telecom.extra.OUTGOING_CALL_EXTRAS"
            android.os.Parcelable r0 = r0.getParcelable(r1)
        L27:
            android.os.Bundle r0 = (android.os.Bundle) r0
            if (r0 == 0) goto L33
            java.lang.String r0 = r0.getString(r5)
            if (r0 == 0) goto L33
            r2 = r0
            goto L3f
        L33:
            if (r6 == 0) goto L3f
            android.os.Bundle r6 = r6.getExtras()
            if (r6 == 0) goto L3f
            java.lang.String r2 = r6.getString(r5)
        L3f:
            b(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.telecom.impl.IacConnectionService.onCreateOutgoingConnectionFailed(android.telecom.PhoneAccountHandle, android.telecom.ConnectionRequest):void");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacConnectionService", "onDestroy", null);
    }
}
