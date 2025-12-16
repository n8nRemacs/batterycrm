package com.my.tracker.obfuscated;

import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class Q implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f365310b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C37848w f365311c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f365312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f365313e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f365314f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f365315g;

    public /* synthetic */ Q(C37848w c37848w, String str, String str2, long j12, Runnable runnable) {
        this.f365310b = 2;
        this.f365311c = c37848w;
        this.f365313e = str;
        this.f365314f = str2;
        this.f365315g = j12;
        this.f365312d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f365310b) {
            case 0:
                this.f365311c.b((Map) this.f365312d, this.f365313e, this.f365314f, this.f365315g);
                break;
            case 1:
                this.f365311c.a((Map) this.f365312d, this.f365313e, this.f365314f, this.f365315g);
                break;
            default:
                this.f365311c.a(this.f365313e, this.f365314f, this.f365315g, (Runnable) this.f365312d);
                break;
        }
    }

    public /* synthetic */ Q(C37848w c37848w, Map map, String str, String str2, long j12, int i12) {
        this.f365310b = i12;
        this.f365311c = c37848w;
        this.f365312d = map;
        this.f365313e = str;
        this.f365314f = str2;
        this.f365315g = j12;
    }
}
