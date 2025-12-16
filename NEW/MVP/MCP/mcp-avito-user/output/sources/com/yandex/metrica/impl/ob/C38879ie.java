package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.yandex.metrica.PreloadInfo;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ie, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38879ie {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private C38779ee f380787a;

    public C38879ie(@j.P PreloadInfo preloadInfo, @j.N C38737cm c38737cm, boolean z12) {
        if (preloadInfo != null) {
            if (!TextUtils.isEmpty(preloadInfo.getTrackingId())) {
                this.f380787a = new C38779ee(preloadInfo.getTrackingId(), new JSONObject(preloadInfo.getAdditionalParams()), true, z12, EnumC39158u0.APP);
            } else if (c38737cm.isEnabled()) {
                c38737cm.e("Required field \"PreloadInfo.trackingId\" is empty!\nThis preload info will be skipped.");
            }
        }
    }

    @j.N
    public JSONObject a(@j.N JSONObject jSONObject) {
        C38779ee c38779ee = this.f380787a;
        if (c38779ee != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("trackingId", c38779ee.f380481a);
                    jSONObject2.put("additionalParams", c38779ee.f380482b);
                    jSONObject2.put("wasSet", c38779ee.f380483c);
                    jSONObject2.put("autoTracking", c38779ee.f380484d);
                    jSONObject2.put(SearchParamsConverterKt.SOURCE, c38779ee.f380485e.a());
                } catch (Throwable unused) {
                }
                jSONObject.put("preloadInfo", jSONObject2);
            } catch (Throwable unused2) {
            }
        }
        return jSONObject;
    }
}
