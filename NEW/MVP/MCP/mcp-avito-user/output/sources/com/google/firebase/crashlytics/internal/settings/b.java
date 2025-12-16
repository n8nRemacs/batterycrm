package com.google.firebase.crashlytics.internal.settings;

import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.common.a0;
import com.google.firebase.crashlytics.internal.settings.d;
import org.json.JSONObject;

/* compiled from: DefaultSettingsJsonTransform.java */
/* loaded from: classes4.dex */
class b implements j {
    public static d b(a0 a0Var) {
        return new d(System.currentTimeMillis() + Constants.ONE_HOUR, new d.b(8), new d.a(true, false, false), 10.0d, 1.2d, 60);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.j
    public final d a(a0 a0Var, JSONObject jSONObject) {
        return b(a0Var);
    }
}
