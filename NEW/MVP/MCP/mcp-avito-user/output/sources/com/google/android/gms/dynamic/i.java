package com.google.android.gms.dynamic;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class i implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f349645a;

    public i(a aVar) {
        this.f349645a = aVar;
    }

    @Override // com.google.android.gms.dynamic.g
    public final void a(e eVar) {
        a aVar = this.f349645a;
        aVar.f349638a = eVar;
        Iterator it = aVar.f349640c.iterator();
        while (it.hasNext()) {
            ((p) it.next()).a();
        }
        aVar.f349640c.clear();
        aVar.f349639b = null;
    }
}
