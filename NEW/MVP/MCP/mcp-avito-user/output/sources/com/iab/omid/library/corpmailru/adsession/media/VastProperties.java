package com.iab.omid.library.corpmailru.adsession.media;

import com.iab.omid.library.corpmailru.d.c;
import com.iab.omid.library.corpmailru.d.e;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class VastProperties {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f363963a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f363964b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f363965c;

    /* renamed from: d, reason: collision with root package name */
    private final Position f363966d;

    private VastProperties(boolean z12, Float f12, boolean z13, Position position) {
        this.f363963a = z12;
        this.f363964b = f12;
        this.f363965c = z13;
        this.f363966d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z12, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(false, null, z12, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f12, boolean z12, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f12), z12, position);
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f363963a);
            if (this.f363963a) {
                jSONObject.put("skipOffset", this.f363964b);
            }
            jSONObject.put("autoPlay", this.f363965c);
            jSONObject.put("position", this.f363966d);
        } catch (JSONException e12) {
            c.a("VastProperties: JSON error", e12);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f363966d;
    }

    public Float getSkipOffset() {
        return this.f363964b;
    }

    public boolean isAutoPlay() {
        return this.f363965c;
    }

    public boolean isSkippable() {
        return this.f363963a;
    }
}
