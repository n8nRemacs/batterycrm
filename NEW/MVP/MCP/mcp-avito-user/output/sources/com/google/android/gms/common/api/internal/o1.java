package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C36658n;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final class o1 extends AbstractC36645h1 {

    /* renamed from: c, reason: collision with root package name */
    public final C36658n.a f349202c;

    public o1(C36658n.a aVar, C37028k c37028k) {
        super(4, c37028k);
        this.f349202c = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.G0
    public final boolean f(C36676w0 c36676w0) {
        P0 p02 = (P0) c36676w0.f349237s.get(this.f349202c);
        return p02 != null && p02.f349047a.f349210c;
    }

    @Override // com.google.android.gms.common.api.internal.G0
    @j.P
    public final Feature[] g(C36676w0 c36676w0) {
        P0 p02 = (P0) c36676w0.f349237s.get(this.f349202c);
        if (p02 == null) {
            return null;
        }
        return p02.f349047a.f349209b;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC36645h1
    public final void h(C36676w0 c36676w0) {
        P0 p02 = (P0) c36676w0.f349237s.remove(this.f349202c);
        C37028k<Boolean> c37028k = this.f349116b;
        if (p02 == null) {
            c37028k.d(Boolean.FALSE);
        } else {
            p02.f349048b.a(c36676w0.f349233b, c37028k);
            p02.f349047a.f349208a.a();
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC36645h1, com.google.android.gms.common.api.internal.p1
    public final /* bridge */ /* synthetic */ void d(@j.N H h12, boolean z12) {
    }
}
