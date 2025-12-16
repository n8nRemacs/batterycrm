package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import GX0.a;
import com.google.android.datatransport.runtime.r;
import com.google.firebase.crashlytics.internal.model.C;
import com.yandex.mobile.ads.impl.k9;
import com.yandex.mobile.ads.impl.m90;
import wZ0.InterfaceC49583a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class h implements a.InterfaceC0354a, InterfaceC49583a.InterfaceC12820a, m90.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f343201b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f343202c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f343203d;

    public /* synthetic */ h(Object obj, long j12, Object obj2) {
        this.f343202c = obj;
        this.f343203d = obj2;
        this.f343201b = j12;
    }

    @Override // wZ0.InterfaceC49583a.InterfaceC12820a
    public void d(wZ0.b bVar) {
        com.google.firebase.crashlytics.internal.e eVar = com.google.firebase.crashlytics.internal.b.f360871c;
        ((com.google.firebase.crashlytics.internal.a) bVar.get()).a((String) this.f343202c, this.f343201b, (C) this.f343203d);
    }

    @Override // GX0.a.InterfaceC0354a
    public Object execute() {
        i iVar = (i) this.f343202c;
        iVar.f343206c.X5(iVar.f343210g.O() + this.f343201b, (r) this.f343203d);
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.m90.a
    public void invoke(Object obj) {
        Object obj2 = this.f343203d;
        long j12 = this.f343201b;
        ((k9) obj).getClass();
    }

    public /* synthetic */ h(String str, long j12, C c12) {
        this.f343202c = str;
        this.f343201b = j12;
        this.f343203d = c12;
    }
}
