package com.avito.android.iac_dialer.impl_module.notifications.new_impl;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import androidx.core.app.K;
import androidx.core.app.z;
import com.avito.android.R;
import com.avito.android.iac_dialer.impl_module.notifications.channels.IacNotificationChannelManager;
import com.avito.android.iac_dialer.impl_module.notifications.new_impl.IacNotification;
import com.avito.android.iac_dialer.impl_module.screens.call_screen.IacCallScreenArgument;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import com.avito.android.util.C35835l0;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import kK.C42589a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import lL.InterfaceC43652a;
import qK.C47310a;

/* compiled from: IacNotificationBuilder.kt */
@P
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/notifications/new_impl/b;", "Lcom/avito/android/iac_dialer/impl_module/notifications/new_impl/a;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class b implements com.avito.android.iac_dialer.impl_module.notifications.new_impl.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f166106a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43652a f166107b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final IacNotificationChannelManager f166108c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final k f166109d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final androidx.appcompat.view.d f166110e;

    /* compiled from: IacNotificationBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f166111a;

        static {
            int[] iArr = new int[IacCallDirection.values().length];
            try {
                iArr[IacCallDirection.INCOMING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IacCallDirection.OUTGOING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f166111a = iArr;
        }
    }

    @Inject
    public b(@Y61.k Context context, @Y61.k InterfaceC43652a interfaceC43652a, @Y61.k IacNotificationChannelManager iacNotificationChannelManager, @Y61.k k kVar) {
        this.f166106a = context;
        this.f166107b = interfaceC43652a;
        this.f166108c = iacNotificationChannelManager;
        this.f166109d = kVar;
        C47310a.f429188a.getClass();
        this.f166110e = new androidx.appcompat.view.d(context, R.style.Theme_DesignSystem_Re23);
    }

    @Override // com.avito.android.iac_dialer.impl_module.notifications.new_impl.a
    @Y61.k
    public final Notification a() {
        IacNotificationChannelManager iacNotificationChannelManager = this.f166108c;
        iacNotificationChannelManager.c();
        IacNotificationChannelManager.a aVarB = iacNotificationChannelManager.b();
        androidx.appcompat.view.d dVar = this.f166110e;
        z.n nVar = new z.n(dVar, aVarB.f166047b);
        nVar.e(dVar.getString(R.string.iac_dialer_impl_notification_fetching_incoming_call_title));
        nVar.f44578B.icon = R.drawable.iac_dialer_impl_notification_media_service_icon;
        nVar.f44591k = -1;
        nVar.f44606z = 2;
        return d(nVar);
    }

    @Override // com.avito.android.iac_dialer.impl_module.notifications.new_impl.a
    @Y61.k
    public final Notification b(@Y61.k IacNotification.CallInitializing callInitializing) {
        IacNotificationChannelManager iacNotificationChannelManager = this.f166108c;
        this.f166109d.a(callInitializing.getCallId(), callInitializing.getDirection(), iacNotificationChannelManager.c());
        IacNotificationChannelManager.a aVarB = iacNotificationChannelManager.b();
        androidx.appcompat.view.d dVar = this.f166110e;
        z.n nVar = new z.n(dVar, aVarB.f166047b);
        nVar.f44602v = 1;
        Intent intentA = this.f166107b.a(new IacCallScreenArgument.WithoutAction(new IacCallScreenArgument.WithoutAction.From.CallNotification("fetching_notification_full_screen_intent_" + callInitializing.getCallId())));
        Context context = this.f166106a;
        nVar.f44588h = PendingIntent.getActivity(context, 1, intentA, 67108864);
        nVar.g(128, false);
        String string = context.getString(R.string.iac_dialer_impl_notification_default_display_name);
        K.c cVar = new K.c();
        cVar.f44500a = string;
        cVar.f44502c = true;
        K kA2 = cVar.a();
        kotlin.random.f.f406882b.getClass();
        int i12 = kotlin.random.f.f406883c.i();
        C42589a.C11613a c11613a = C42589a.f406229b;
        String callId = callInitializing.getCallId();
        c11613a.getClass();
        PendingIntent broadcast = PendingIntent.getBroadcast(context, i12, new Intent("IacBroadcastReceiver.ACTION_IAC_BROADCAST_ACTION").putExtra("IacBroadcastReceiver.EXTRA_TYPE", "IacBroadcastReceiver.TYPE_HANGUP_FROM_COMMON_NOTIFICATION").putExtra("IacBroadcastReceiver.EXTRA_CALL_ID", callId), 67108864);
        Objects.requireNonNull(broadcast, "hangUpIntent is required");
        z.o oVar = new z.o(2, kA2, broadcast, null, null);
        oVar.f44612i = callInitializing.isVideo();
        nVar.j(oVar);
        nVar.e(dVar.getString(R.string.iac_dialer_impl_notification_fetching_incoming_call_title));
        nVar.f44578B.icon = R.drawable.iac_dialer_impl_notification_incoming_call_icon;
        return d(nVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    @Override // com.avito.android.iac_dialer.impl_module.notifications.new_impl.a
    @Y61.k
    @android.annotation.SuppressLint({"HardcodeStringDetector"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.app.Notification c(@Y61.k com.avito.android.iac_dialer.impl_module.notifications.new_impl.IacNotification.Call r19) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.notifications.new_impl.b.c(com.avito.android.iac_dialer.impl_module.notifications.new_impl.IacNotification$Call):android.app.Notification");
    }

    public final Notification d(z.n nVar) {
        nVar.f44601u = C35835l0.d(R.attr.blue, this.f166110e);
        nVar.f44599s = "call";
        nVar.i(null);
        nVar.g(2, true);
        nVar.f44578B.vibrate = null;
        nVar.g(8, true);
        return nVar.b();
    }
}
