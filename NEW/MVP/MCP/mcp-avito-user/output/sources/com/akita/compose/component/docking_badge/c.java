package com.akita.compose.component.docking_badge;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DockingBadge.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class c extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f61518l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f61519m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m f61520n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.foundation.p f61521o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C22096n f61522p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f61523q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(m mVar, v vVar, m mVar2, com.akita.compose.foundation.p pVar, C22096n c22096n, int i12) {
        super(2);
        this.f61518l = mVar;
        this.f61519m = vVar;
        this.f61520n = mVar2;
        this.f61521o = pVar;
        this.f61522p = c22096n;
        this.f61523q = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f61523q | 1);
        C22096n c22096n = this.f61522p;
        m mVar = this.f61520n;
        com.akita.compose.foundation.p pVar = this.f61521o;
        b.a(this.f61518l, this.f61519m, mVar, pVar, c22096n, a12, iA2);
        return G0.f406611a;
    }
}
