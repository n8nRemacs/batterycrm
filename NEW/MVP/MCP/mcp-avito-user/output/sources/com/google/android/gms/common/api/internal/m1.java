package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C36658n;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final class m1 extends AbstractC36645h1 {

    /* renamed from: c, reason: collision with root package name */
    public final P0 f349177c;

    public m1(P0 p02, C37028k c37028k) {
        super(3, c37028k);
        this.f349177c = p02;
    }

    @Override // com.google.android.gms.common.api.internal.G0
    public final boolean f(C36676w0 c36676w0) {
        return this.f349177c.f349047a.f349210c;
    }

    @Override // com.google.android.gms.common.api.internal.G0
    @j.P
    public final Feature[] g(C36676w0 c36676w0) {
        return this.f349177c.f349047a.f349209b;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC36645h1
    public final void h(C36676w0 c36676w0) {
        this.f349177c.f349047a.a(c36676w0.f349233b, this.f349116b);
        C36658n.a aVar = this.f349177c.f349047a.f349208a.f349180c;
        if (aVar != null) {
            c36676w0.f349237s.put(aVar, this.f349177c);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC36645h1, com.google.android.gms.common.api.internal.p1
    public final /* bridge */ /* synthetic */ void d(@j.N H h12, boolean z12) {
    }
}
