package com.akita.compose.component.tab_group;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TabGroupIndicator.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class d extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ R2.a f62983l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.foundation.p f62984m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f62985n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.foundation.p f62986o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f62987p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f62988q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f62989r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(R2.a aVar, com.akita.compose.foundation.p pVar, float f12, com.akita.compose.foundation.p pVar2, float f13, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f62983l = aVar;
        this.f62984m = pVar;
        this.f62985n = f12;
        this.f62986o = pVar2;
        this.f62987p = f13;
        this.f62988q = vVar;
        this.f62989r = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f62989r | 1);
        float f12 = this.f62985n;
        com.akita.compose.foundation.p pVar = this.f62986o;
        e.a(this.f62983l, this.f62984m, f12, pVar, this.f62987p, this.f62988q, a12, iA2);
        return G0.f406611a;
    }
}
