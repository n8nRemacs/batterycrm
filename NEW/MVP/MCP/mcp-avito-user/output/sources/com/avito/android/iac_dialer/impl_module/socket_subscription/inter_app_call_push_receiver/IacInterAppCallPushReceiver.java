package com.avito.android.iac_dialer.impl_module.socket_subscription.inter_app_call_push_receiver;

import CK.b;
import EK.c;
import Y61.l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.di.C29972i;
import com.avito.android.iac_dialer.impl_module.socket_subscription.app_startup_task.CallDeliveredBySocketMessage;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiString;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.util.R1;
import com.google.gson.Gson;
import com.google.gson.k;
import com.huawei.hms.api.FailedBinderCallBack;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: IacInterAppCallPushReceiver.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/socket_subscription/inter_app_call_push_receiver/IacInterAppCallPushReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IacInterAppCallPushReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    @Inject
    public CK.a f166378a;

    /* compiled from: IacInterAppCallPushReceiver.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/socket_subscription/inter_app_call_push_receiver/IacInterAppCallPushReceiver$a;", "", "<init>", "()V", "", "ACTION_INCOMING_CALL", "Ljava/lang/String;", "EXTRA_PAYLOAD", "TAG", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Gsons.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"com/avito/android/util/GsonsKt$gsonTypeToken$1", "Lcom/google/gson/reflect/a;", "com/avito/android/util/O1", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.google.gson.reflect.a<c> {
    }

    static {
        new a(null);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@l Context context, @l Intent intent) {
        Object objE;
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
        StringBuilder sb2 = new StringBuilder("onReceive: action=");
        sb2.append(intent != null ? intent.getAction() : null);
        bVar.a("IacInterAppCallPushReceiver", sb2.toString(), null);
        if (L.f(intent != null ? intent.getAction() : null, "com.avito.android.call_broadcast_receiver.action.INCOMING_CALL")) {
            com.avito.android.iac_dialer.impl_module.socket_subscription.inter_app_call_push_receiver.di.a.a().a((com.avito.android.iac_dialer.impl_module.socket_subscription.inter_app_call_push_receiver.di.c) C29972i.a(C29972i.b(context), com.avito.android.iac_dialer.impl_module.socket_subscription.inter_app_call_push_receiver.di.c.class)).a(this);
            String stringExtra = intent.getStringExtra("com.avito.android.call_broadcast_receiver.extra.PAYLOAD");
            bVar.a("IacInterAppCallPushReceiver", "onReceive: payload=" + stringExtra, null);
            if (stringExtra == null) {
                return;
            }
            Gson gson = new Gson();
            try {
                Type type = new b().getType();
                objE = gson.e(stringExtra, ((type instanceof ParameterizedType) && R1.a((ParameterizedType) type)) ? ((ParameterizedType) type).getRawType() : R1.b(type));
            } catch (Throwable unused) {
                objE = null;
            }
            c cVar = (c) objE;
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacInterAppCallPushReceiver", "onReceive: interAppCallPushData=" + cVar, null);
            if (cVar != null) {
                CK.a aVar = this.f166378a;
                if (aVar == null) {
                    aVar = null;
                }
                String callId = cVar.getCallId();
                k kVar = new k();
                kVar.y("type", "voip.push");
                k kVar2 = new k();
                kVar2.y(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, cVar.getFrom());
                kVar2.y(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, cVar.getTo());
                kVar2.y(FailedBinderCallBack.CALLER_ID, cVar.getCallId());
                kVar2.v(cVar.getIsVideo(), "isVideo");
                k kVar3 = new k();
                kVar3.y("scenario", cVar.getScenario());
                G0 g02 = G0.f406611a;
                kVar2.t(Constants.REFERRER_API_META, kVar3);
                kVar.t("data", kVar2);
                IacPiiString iacPiiString = new IacPiiString(kVar.toString());
                Boolean isVideo = cVar.getIsVideo();
                aVar.a(new b.a(new CallDeliveredBySocketMessage(callId, iacPiiString, isVideo != null ? isVideo.booleanValue() : false, null)), "IacInterAppCallPushReceiver");
            }
        }
    }
}
