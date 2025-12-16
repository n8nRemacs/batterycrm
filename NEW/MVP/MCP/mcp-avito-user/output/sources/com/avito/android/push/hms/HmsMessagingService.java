package com.avito.android.push.hms;

import Qf0.C14891a;
import Y61.k;
import android.os.Bundle;
import android.text.TextUtils;
import bg0.InterfaceC25647a;
import com.avito.android.di.C29972i;
import com.avito.android.push.PushService;
import com.avito.android.push.hms.a;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.huawei.hms.push.RemoteMessage;
import com.huawei.hms.support.log.HMSLog;
import dagger.internal.t;
import dg0.InterfaceC39724a;
import eg0.InterfaceC40103a;
import java.util.HashMap;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import org.json.JSONException;
import org.json.JSONObject;
import z01.ServiceC50337a;

/* compiled from: HmsMessagingService.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/push/hms/HmsMessagingService;", "Lz01/a;", "<init>", "()V", "_avito_push-hms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class HmsMessagingService extends ServiceC50337a {

    /* renamed from: c, reason: collision with root package name */
    @Inject
    public InterfaceC39724a f245934c;

    /* renamed from: d, reason: collision with root package name */
    @Inject
    public InterfaceC40103a f245935d;

    @Override // z01.ServiceC50337a
    public final void j(@k RemoteMessage remoteMessage) throws NumberFormatException {
        HashMap map = new HashMap();
        Bundle bundle = remoteMessage.f363603b;
        String string = bundle.getString("data");
        if (string != null && !string.trim().isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String strValueOf = String.valueOf(itKeys.next());
                    map.put(strValueOf, String.valueOf(jSONObject.get(strValueOf)));
                }
            } catch (JSONException unused) {
                HMSLog.w("RemoteMessage", "JSONException: get data from map failed");
            }
        }
        String string2 = bundle.getString(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME);
        int i12 = bundle.getInt("oriUrgency");
        int i13 = (i12 == 1 || i12 == 2) ? i12 : 0;
        int i14 = bundle.getInt("urgency");
        int i15 = (i14 == 1 || i14 == 2) ? i14 : 0;
        int i16 = bundle.getInt("ttl");
        long j12 = 0;
        try {
            String string3 = bundle.getString("sendTime");
            if (!TextUtils.isEmpty(string3)) {
                j12 = Long.parseLong(string3);
            }
        } catch (NumberFormatException unused2) {
            HMSLog.w("RemoteMessage", "NumberFormatException: get sendTime error.");
        }
        Qf0.b bVar = Qf0.b.f13970a;
        PushService pushService = PushService.f245928c;
        bVar.getClass();
        C14891a c14891a = new C14891a(map, string2, i13, i15, i16, j12, Qf0.b.a(pushService));
        InterfaceC39724a interfaceC39724a = this.f245934c;
        if (interfaceC39724a == null) {
            interfaceC39724a = null;
        }
        interfaceC39724a.a(c14891a);
    }

    @Override // z01.ServiceC50337a
    public final void k() {
        InterfaceC40103a interfaceC40103a = this.f245935d;
        if (interfaceC40103a == null) {
            interfaceC40103a = null;
        }
        interfaceC40103a.a(PushService.f245928c);
    }

    @Override // android.app.Service
    public final void onCreate() {
        InterfaceC25647a interfaceC25647a = (InterfaceC25647a) C29972i.a(C29972i.b(this), InterfaceC25647a.class);
        new a.b();
        InterfaceC25647a interfaceC25647a2 = new a.c(interfaceC25647a, null).f245937a;
        InterfaceC39724a interfaceC39724aW4 = interfaceC25647a2.W4();
        t.c(interfaceC39724aW4);
        this.f245934c = interfaceC39724aW4;
        InterfaceC40103a interfaceC40103aAl = interfaceC25647a2.Al();
        t.c(interfaceC40103aAl);
        this.f245935d = interfaceC40103aAl;
        interfaceC25647a2.O6();
    }
}
