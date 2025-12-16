package defpackage;

import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* loaded from: classes2.dex */
public final class fv4 {
    public final k18 a;

    public fv4(k18 k18Var) {
        this.a = k18Var;
    }

    public static void a(fv4 fv4Var, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, String str, String str2, String str3, String str4, int i2, int i3) {
        float f17;
        String str5;
        String str6;
        float f18;
        float f19 = (i2 & 4) != 0 ? Float.NaN : f2;
        float f20 = (i2 & 8) != 0 ? Float.NaN : f3;
        float f21 = (i2 & 16) != 0 ? Float.NaN : f4;
        float f22 = (i2 & 32) != 0 ? Float.NaN : f5;
        float f23 = (i2 & 64) != 0 ? Float.NaN : f6;
        float f24 = (i2 & 128) != 0 ? Float.NaN : f7;
        float f25 = (i2 & 256) != 0 ? Float.NaN : f8;
        float f26 = (i2 & 512) != 0 ? Float.NaN : f9;
        float f27 = (i2 & 1024) != 0 ? Float.NaN : f10;
        float f28 = (i2 & 2048) != 0 ? Float.NaN : f11;
        float f29 = (i2 & 4096) != 0 ? Float.NaN : f12;
        float f30 = (i2 & 8192) != 0 ? Float.NaN : f13;
        float f31 = (i2 & 16384) != 0 ? Float.NaN : f14;
        float f32 = (32768 & i2) != 0 ? Float.NaN : f15;
        float f33 = (i2 & 65536) == 0 ? f16 : Float.NaN;
        String str7 = (i2 & 131072) != 0 ? null : str;
        float f34 = f19;
        String str8 = (i2 & 262144) != 0 ? null : str2;
        float f35 = f33;
        String str9 = (i2 & 524288) != 0 ? null : str3;
        if ((i3 & 1) != 0) {
            f17 = f20;
            str5 = null;
        } else {
            f17 = f20;
            str5 = str4;
        }
        float f36 = f21;
        frb frbVar = (frb) fv4Var.a.getValue();
        switch (i) {
            case 1:
                str6 = "startup_report";
                break;
            case 2:
                str6 = "host_reachability";
                break;
            case 3:
                str6 = "login";
                break;
            case 4:
                str6 = "upload";
                break;
            case 5:
                str6 = "download";
                break;
            case 6:
                str6 = "ab_event";
                break;
            default:
                throw null;
        }
        float f37 = f22;
        nn8 nn8Var = new nn8();
        float f38 = f23;
        if (Float.isNaN(f)) {
            f18 = f24;
        } else {
            f18 = f24;
            nn8Var.put(SdkMetricStatEvent.VALUE_KEY, Float.valueOf(f));
        }
        if (!Float.isNaN(f34)) {
            nn8Var.put("value2", Float.valueOf(f34));
        }
        if (!Float.isNaN(f17)) {
            nn8Var.put("value3", Float.valueOf(f17));
        }
        if (!Float.isNaN(f36)) {
            nn8Var.put("value4", Float.valueOf(f36));
        }
        if (!Float.isNaN(f37)) {
            nn8Var.put("value5", Float.valueOf(f37));
        }
        if (!Float.isNaN(f38)) {
            nn8Var.put("value6", Float.valueOf(f38));
        }
        if (!Float.isNaN(f18)) {
            nn8Var.put("value7", Float.valueOf(f18));
        }
        if (!Float.isNaN(f25)) {
            nn8Var.put("value8", Float.valueOf(f25));
        }
        if (!Float.isNaN(f26)) {
            nn8Var.put("value9", Float.valueOf(f26));
        }
        if (!Float.isNaN(f27)) {
            nn8Var.put("value10", Float.valueOf(f27));
        }
        if (!Float.isNaN(f28)) {
            nn8Var.put("value11", Float.valueOf(f28));
        }
        if (!Float.isNaN(f29)) {
            nn8Var.put("value12", Float.valueOf(f29));
        }
        if (!Float.isNaN(f30)) {
            nn8Var.put("value13", Float.valueOf(f30));
        }
        if (!Float.isNaN(f31)) {
            nn8Var.put("value14", Float.valueOf(f31));
        }
        if (!Float.isNaN(f32)) {
            nn8Var.put("value15", Float.valueOf(f32));
        }
        if (!Float.isNaN(f35)) {
            nn8Var.put("value16", Float.valueOf(f35));
        }
        if (str7 != null) {
            nn8Var.put("valueStr", str7);
        }
        if (str8 != null) {
            nn8Var.put("valueStr2", str8);
        }
        if (str9 != null) {
            nn8Var.put("valueStr3", str9);
        }
        if (str5 != null) {
            nn8Var.put("valueStr16", str5);
        }
        ((dd) frbVar.a.getValue()).h(new hg8("DEV", str6, 0L, 0L, nn8Var.b(), System.currentTimeMillis(), 12));
    }
}
