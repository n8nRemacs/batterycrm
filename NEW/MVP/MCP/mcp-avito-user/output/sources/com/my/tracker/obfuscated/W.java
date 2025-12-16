package com.my.tracker.obfuscated;

import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class W implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f365338b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C37848w f365339c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f365340d;

    public /* synthetic */ W(C37848w c37848w, List list, int i12) {
        this.f365338b = i12;
        this.f365339c = c37848w;
        this.f365340d = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f365338b) {
            case 0:
                this.f365339c.a(this.f365340d);
                break;
            default:
                this.f365339c.b(this.f365340d);
                break;
        }
    }
}
