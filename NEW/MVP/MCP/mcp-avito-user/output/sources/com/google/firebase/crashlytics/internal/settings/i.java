package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.a0;
import org.json.JSONObject;

/* compiled from: SettingsJsonParser.java */
/* loaded from: classes4.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f361479a;

    public i(a0 a0Var) {
        this.f361479a = a0Var;
    }

    public final d a(JSONObject jSONObject) {
        j nVar;
        if (jSONObject.getInt("settings_version") != 3) {
            com.google.firebase.crashlytics.internal.d.f361031a.b();
            nVar = new b();
        } else {
            nVar = new n();
        }
        return nVar.a(this.f361479a, jSONObject);
    }
}
