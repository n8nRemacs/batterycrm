package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class r4c {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public r4c(age ageVar) {
        JSONObject jSONObject;
        lg8 lg8Var = lg8.d;
        String name = r4c.class.getName();
        String strT = ((l5c) ageVar).t(PmsKey.f120playerloadcontrol, null);
        l6b l6bVar = wqi.a;
        if (l6bVar != null && l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, name, wy1.h("Server player control params=", strT), null);
        }
        if (strT != null) {
            try {
                jSONObject = new JSONObject(strT);
            } catch (JSONException e) {
                wqi.e(name, "Failed to parse player control params", e);
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject != null) {
            this.a = jSONObject.optBoolean("mp_autoplay_enabled", false);
            this.c = jSONObject.optBoolean("time_over_size", false);
            this.d = jSONObject.optInt("buffer_after_rebuffer_ms", 3000);
            this.e = jSONObject.optInt("min_buffer_ms", 5000);
            this.f = jSONObject.optInt("max_buffer_ms", 13000);
            this.g = jSONObject.optInt("buffer_ms", 500);
            this.b = jSONObject.optBoolean("use_min_size_lc", true);
            this.h = jSONObject.optInt("min_size_lc_fmt_mis_sf", 4);
        } else {
            this.a = false;
            this.c = false;
            this.d = 3000;
            this.e = 5000;
            this.f = 13000;
            this.g = 500;
            this.b = true;
            this.h = 4;
        }
        l6b l6bVar2 = wqi.a;
        if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
            l6bVar2.c(lg8Var, name, toString(), null);
        }
    }

    public final String toString() {
        StringBuilder sbP = ho7.p("PlayerControl(\n        isAutoPlayEnabledDuringMediaProcessing=", this.a, "\n        isMinSizeLoadControlRequested=", this.b, "\n        isPlaybackPrioritizeTimeOverSize=");
        sbP.append(this.c);
        sbP.append("\n        playbackMinBufferMs=");
        sbP.append(this.e);
        sbP.append("\n        playbackMaxBufferMs=");
        hf3.g(sbP, this.f, "\n        playbackBufferMs=", this.g, "\n        playbackBufferAfterRebufferMs=");
        return xc0.i(sbP, this.d, "\n        formatMaxInputSizeScaleUpFactor=", this.h, "\n        )\n        ");
    }
}
