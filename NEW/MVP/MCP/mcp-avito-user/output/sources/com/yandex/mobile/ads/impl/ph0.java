package com.yandex.mobile.ads.impl;

import org.json.JSONObject;

/* loaded from: classes8.dex */
final class ph0 {

    /* renamed from: a, reason: collision with root package name */
    private final nr0 f388839a;

    public ph0(@j.N nr0 nr0Var) {
        this.f388839a = nr0Var;
    }

    public final void a(@j.N int i12, @j.N String str) {
        StringBuilder sbA = Cif.a("notifyErrorEvent(");
        sbA.append(JSONObject.quote(bi0.a(i12)));
        sbA.append(", ");
        sbA.append(JSONObject.quote(str));
        sbA.append(")");
        a(sbA.toString());
    }

    public final void b(String str) {
        this.f388839a.a(str);
    }

    public final void a(@j.N int i12) {
        StringBuilder sbA = Cif.a("nativeCallComplete(");
        sbA.append(JSONObject.quote(bi0.a(i12)));
        sbA.append(")");
        a(sbA.toString());
    }

    public final void a() {
        a("notifyReadyEvent();");
    }

    public final void a(@j.N k80... k80VarArr) {
        if (k80VarArr.length > 0) {
            StringBuilder sb2 = new StringBuilder("fireChangeEvent({");
            int length = k80VarArr.length;
            String str = "";
            int i12 = 0;
            while (i12 < length) {
                k80 k80Var = k80VarArr[i12];
                sb2.append(str);
                sb2.append(k80Var.a());
                i12++;
                str = ", ";
            }
            sb2.append("})");
            a(sb2.toString());
        }
    }

    private void a(@j.N String str) {
        this.f388839a.loadUrl("javascript: ".concat(androidx.camera.camera2.internal.G.f("window.mraidbridge.", str)));
    }
}
