package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.pc;
import com.yandex.mobile.ads.impl.pd;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class J1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f383236b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f383237c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f383238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f383239e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f383240f;

    public /* synthetic */ J1(Object obj, int i12, long j12, long j13, int i13) {
        this.f383236b = i13;
        this.f383240f = obj;
        this.f383237c = i12;
        this.f383238d = j12;
        this.f383239e = j13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f383236b) {
            case 0:
                pd.a.C10980a.a((pd.a.C10980a.C10981a) this.f383240f, this.f383237c, this.f383238d, this.f383239e);
                break;
            default:
                ((pc.a) this.f383240f).a(this.f383237c, this.f383238d, this.f383239e);
                break;
        }
    }
}
