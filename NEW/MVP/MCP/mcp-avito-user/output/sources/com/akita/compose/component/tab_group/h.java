package com.akita.compose.component.tab_group;

import R2.b;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TabGroupItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class h extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b.C0936b f63011l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f63012m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.foundation.p f63013n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.foundation.p f63014o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.foundation.r f63015p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.badge.i f63016q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f63017r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f63018s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f63019t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b.C0936b c0936b, float f12, com.akita.compose.foundation.p pVar, com.akita.compose.foundation.p pVar2, com.akita.compose.foundation.r rVar, com.akita.compose.component.badge.i iVar, float f13, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f63011l = c0936b;
        this.f63012m = f12;
        this.f63013n = pVar;
        this.f63014o = pVar2;
        this.f63015p = rVar;
        this.f63016q = iVar;
        this.f63017r = f13;
        this.f63018s = vVar;
        this.f63019t = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f63019t | 1);
        com.akita.compose.component.badge.i iVar = this.f63016q;
        float f12 = this.f63017r;
        i.c(this.f63011l, this.f63012m, this.f63013n, this.f63014o, this.f63015p, iVar, f12, this.f63018s, a12, iA2);
        return G0.f406611a;
    }
}
