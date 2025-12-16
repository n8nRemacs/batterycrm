package com.my.tracker.obfuscated;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class Z implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f365353b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C37848w f365354c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f365355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f365356e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f365357f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f365358g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f365359h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f365360i;

    public /* synthetic */ Z(C37848w c37848w, String str, String str2, String str3, String str4, String str5, long j12) {
        this.f365354c = c37848w;
        this.f365355d = str;
        this.f365357f = str2;
        this.f365358g = str3;
        this.f365359h = str4;
        this.f365360i = str5;
        this.f365356e = j12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f365353b) {
            case 0:
                this.f365354c.a(this.f365355d, (String) this.f365357f, (String) this.f365358g, (String) this.f365359h, (String) this.f365360i, this.f365356e);
                break;
            default:
                this.f365354c.a((Map) this.f365357f, (JSONObject) this.f365358g, this.f365355d, this.f365356e, (JSONObject) this.f365359h, (Map) this.f365360i);
                break;
        }
    }

    public /* synthetic */ Z(C37848w c37848w, Map map, JSONObject jSONObject, String str, long j12, JSONObject jSONObject2, Map map2) {
        this.f365354c = c37848w;
        this.f365357f = map;
        this.f365358g = jSONObject;
        this.f365355d = str;
        this.f365356e = j12;
        this.f365359h = jSONObject2;
        this.f365360i = map2;
    }
}
