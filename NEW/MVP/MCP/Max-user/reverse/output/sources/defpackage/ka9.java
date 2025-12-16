package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ka9 {
    public final String a;
    public final nv4 b;
    public final String c = ka9.class.getName();
    public final bwf d;
    public final bwf e;
    public final bwf f;
    public final bwf g;
    public final bwf h;

    public ka9(String str, nv4 nv4Var) {
        this.a = str;
        this.b = nv4Var;
        final int i = 0;
        this.d = new bwf(new cm6(this) { // from class: ia9
            public final /* synthetic */ ka9 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                JSONObject jSONObjectOptJSONObject;
                switch (i) {
                    case 0:
                        ka9 ka9Var = this.b;
                        String str2 = ka9Var.a;
                        if (str2 == null) {
                            return null;
                        }
                        try {
                            return new JSONObject(str2);
                        } catch (JSONException e) {
                            wqi.e(ka9Var.c, "Failed to parse media transform params", e);
                            return null;
                        }
                    case 1:
                        JSONObject jSONObject = (JSONObject) this.b.d.getValue();
                        return Boolean.valueOf(jSONObject != null ? jSONObject.optBoolean("enabled", false) : false);
                    case 2:
                        JSONObject jSONObject2 = (JSONObject) this.b.d.getValue();
                        return Boolean.valueOf(jSONObject2 != null ? jSONObject2.optBoolean("hevc_enabled", false) : false);
                    case 3:
                        JSONObject jSONObject3 = (JSONObject) this.b.d.getValue();
                        return Boolean.valueOf(jSONObject3 != null ? jSONObject3.optBoolean("hdr_enabled", false) : false);
                    default:
                        ka9 ka9Var2 = this.b;
                        JSONObject jSONObject4 = (JSONObject) ka9Var2.d.getValue();
                        int iOptInt = -1;
                        if (jSONObject4 != null && (jSONObjectOptJSONObject = jSONObject4.optJSONObject("max_enc_frames")) != null) {
                            int i2 = ja9.$EnumSwitchMapping$0[ka9Var2.b.ordinal()];
                            iOptInt = jSONObjectOptJSONObject.optInt(i2 != 1 ? i2 != 2 ? "low" : "high" : "avg", -1);
                        }
                        return Integer.valueOf(iOptInt);
                }
            }
        });
        final int i2 = 1;
        this.e = new bwf(new cm6(this) { // from class: ia9
            public final /* synthetic */ ka9 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                JSONObject jSONObjectOptJSONObject;
                switch (i2) {
                    case 0:
                        ka9 ka9Var = this.b;
                        String str2 = ka9Var.a;
                        if (str2 == null) {
                            return null;
                        }
                        try {
                            return new JSONObject(str2);
                        } catch (JSONException e) {
                            wqi.e(ka9Var.c, "Failed to parse media transform params", e);
                            return null;
                        }
                    case 1:
                        JSONObject jSONObject = (JSONObject) this.b.d.getValue();
                        return Boolean.valueOf(jSONObject != null ? jSONObject.optBoolean("enabled", false) : false);
                    case 2:
                        JSONObject jSONObject2 = (JSONObject) this.b.d.getValue();
                        return Boolean.valueOf(jSONObject2 != null ? jSONObject2.optBoolean("hevc_enabled", false) : false);
                    case 3:
                        JSONObject jSONObject3 = (JSONObject) this.b.d.getValue();
                        return Boolean.valueOf(jSONObject3 != null ? jSONObject3.optBoolean("hdr_enabled", false) : false);
                    default:
                        ka9 ka9Var2 = this.b;
                        JSONObject jSONObject4 = (JSONObject) ka9Var2.d.getValue();
                        int iOptInt = -1;
                        if (jSONObject4 != null && (jSONObjectOptJSONObject = jSONObject4.optJSONObject("max_enc_frames")) != null) {
                            int i22 = ja9.$EnumSwitchMapping$0[ka9Var2.b.ordinal()];
                            iOptInt = jSONObjectOptJSONObject.optInt(i22 != 1 ? i22 != 2 ? "low" : "high" : "avg", -1);
                        }
                        return Integer.valueOf(iOptInt);
                }
            }
        });
        final int i3 = 2;
        this.f = new bwf(new cm6(this) { // from class: ia9
            public final /* synthetic */ ka9 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                JSONObject jSONObjectOptJSONObject;
                switch (i3) {
                    case 0:
                        ka9 ka9Var = this.b;
                        String str2 = ka9Var.a;
                        if (str2 == null) {
                            return null;
                        }
                        try {
                            return new JSONObject(str2);
                        } catch (JSONException e) {
                            wqi.e(ka9Var.c, "Failed to parse media transform params", e);
                            return null;
                        }
                    case 1:
                        JSONObject jSONObject = (JSONObject) this.b.d.getValue();
                        return Boolean.valueOf(jSONObject != null ? jSONObject.optBoolean("enabled", false) : false);
                    case 2:
                        JSONObject jSONObject2 = (JSONObject) this.b.d.getValue();
                        return Boolean.valueOf(jSONObject2 != null ? jSONObject2.optBoolean("hevc_enabled", false) : false);
                    case 3:
                        JSONObject jSONObject3 = (JSONObject) this.b.d.getValue();
                        return Boolean.valueOf(jSONObject3 != null ? jSONObject3.optBoolean("hdr_enabled", false) : false);
                    default:
                        ka9 ka9Var2 = this.b;
                        JSONObject jSONObject4 = (JSONObject) ka9Var2.d.getValue();
                        int iOptInt = -1;
                        if (jSONObject4 != null && (jSONObjectOptJSONObject = jSONObject4.optJSONObject("max_enc_frames")) != null) {
                            int i22 = ja9.$EnumSwitchMapping$0[ka9Var2.b.ordinal()];
                            iOptInt = jSONObjectOptJSONObject.optInt(i22 != 1 ? i22 != 2 ? "low" : "high" : "avg", -1);
                        }
                        return Integer.valueOf(iOptInt);
                }
            }
        });
        final int i4 = 3;
        this.g = new bwf(new cm6(this) { // from class: ia9
            public final /* synthetic */ ka9 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                JSONObject jSONObjectOptJSONObject;
                switch (i4) {
                    case 0:
                        ka9 ka9Var = this.b;
                        String str2 = ka9Var.a;
                        if (str2 == null) {
                            return null;
                        }
                        try {
                            return new JSONObject(str2);
                        } catch (JSONException e) {
                            wqi.e(ka9Var.c, "Failed to parse media transform params", e);
                            return null;
                        }
                    case 1:
                        JSONObject jSONObject = (JSONObject) this.b.d.getValue();
                        return Boolean.valueOf(jSONObject != null ? jSONObject.optBoolean("enabled", false) : false);
                    case 2:
                        JSONObject jSONObject2 = (JSONObject) this.b.d.getValue();
                        return Boolean.valueOf(jSONObject2 != null ? jSONObject2.optBoolean("hevc_enabled", false) : false);
                    case 3:
                        JSONObject jSONObject3 = (JSONObject) this.b.d.getValue();
                        return Boolean.valueOf(jSONObject3 != null ? jSONObject3.optBoolean("hdr_enabled", false) : false);
                    default:
                        ka9 ka9Var2 = this.b;
                        JSONObject jSONObject4 = (JSONObject) ka9Var2.d.getValue();
                        int iOptInt = -1;
                        if (jSONObject4 != null && (jSONObjectOptJSONObject = jSONObject4.optJSONObject("max_enc_frames")) != null) {
                            int i22 = ja9.$EnumSwitchMapping$0[ka9Var2.b.ordinal()];
                            iOptInt = jSONObjectOptJSONObject.optInt(i22 != 1 ? i22 != 2 ? "low" : "high" : "avg", -1);
                        }
                        return Integer.valueOf(iOptInt);
                }
            }
        });
        final int i5 = 4;
        this.h = new bwf(new cm6(this) { // from class: ia9
            public final /* synthetic */ ka9 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                JSONObject jSONObjectOptJSONObject;
                switch (i5) {
                    case 0:
                        ka9 ka9Var = this.b;
                        String str2 = ka9Var.a;
                        if (str2 == null) {
                            return null;
                        }
                        try {
                            return new JSONObject(str2);
                        } catch (JSONException e) {
                            wqi.e(ka9Var.c, "Failed to parse media transform params", e);
                            return null;
                        }
                    case 1:
                        JSONObject jSONObject = (JSONObject) this.b.d.getValue();
                        return Boolean.valueOf(jSONObject != null ? jSONObject.optBoolean("enabled", false) : false);
                    case 2:
                        JSONObject jSONObject2 = (JSONObject) this.b.d.getValue();
                        return Boolean.valueOf(jSONObject2 != null ? jSONObject2.optBoolean("hevc_enabled", false) : false);
                    case 3:
                        JSONObject jSONObject3 = (JSONObject) this.b.d.getValue();
                        return Boolean.valueOf(jSONObject3 != null ? jSONObject3.optBoolean("hdr_enabled", false) : false);
                    default:
                        ka9 ka9Var2 = this.b;
                        JSONObject jSONObject4 = (JSONObject) ka9Var2.d.getValue();
                        int iOptInt = -1;
                        if (jSONObject4 != null && (jSONObjectOptJSONObject = jSONObject4.optJSONObject("max_enc_frames")) != null) {
                            int i22 = ja9.$EnumSwitchMapping$0[ka9Var2.b.ordinal()];
                            iOptInt = jSONObjectOptJSONObject.optInt(i22 != 1 ? i22 != 2 ? "low" : "high" : "avg", -1);
                        }
                        return Integer.valueOf(iOptInt);
                }
            }
        });
    }
}
