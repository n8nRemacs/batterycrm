package jZ0;

import android.os.Bundle;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import j.N;
import j.P;
import kZ0.InterfaceC42651a;
import kZ0.InterfaceC42652b;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BreadcrumbAnalyticsEventReceiver.java */
/* renamed from: jZ0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C42337d implements InterfaceC42335b, InterfaceC42652b {

    /* renamed from: b, reason: collision with root package name */
    @P
    public InterfaceC42651a f405646b;

    @N
    public static String a(@N Bundle bundle, @N String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, jSONObject2);
        return jSONObject.toString();
    }

    @Override // kZ0.InterfaceC42652b
    public final void b(@P InterfaceC42651a interfaceC42651a) {
        this.f405646b = interfaceC42651a;
        com.google.firebase.crashlytics.internal.d.f361031a.a(3);
    }

    @Override // jZ0.InterfaceC42335b
    public final void onEvent(@N String str, @N Bundle bundle) {
        InterfaceC42651a interfaceC42651a = this.f405646b;
        if (interfaceC42651a != null) {
            try {
                interfaceC42651a.a("$A$:" + a(bundle, str));
            } catch (JSONException unused) {
                com.google.firebase.crashlytics.internal.d.f361031a.a(5);
            }
        }
    }
}
