package com.my.tracker.obfuscated;

import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class U implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f365326b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C37848w f365327c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Map f365328d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f365329e;

    public /* synthetic */ U(int i12, long j12, C37848w c37848w, Map map) {
        this.f365326b = i12;
        this.f365327c = c37848w;
        this.f365328d = map;
        this.f365329e = j12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f365326b) {
            case 0:
                this.f365327c.b(this.f365328d, this.f365329e);
                break;
            default:
                this.f365327c.a(this.f365328d, this.f365329e);
                break;
        }
    }
}
