package com.akita.compose.component.avatar;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Avatar.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class g extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f60304l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.foundation.p f60305m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.foundation.p f60306n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f60307o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C22096n f60308p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f60309q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(float f12, com.akita.compose.foundation.p pVar, com.akita.compose.foundation.p pVar2, v vVar, C22096n c22096n, int i12) {
        super(2);
        this.f60304l = f12;
        this.f60305m = pVar;
        this.f60306n = pVar2;
        this.f60307o = vVar;
        this.f60308p = c22096n;
        this.f60309q = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f60309q | 1);
        com.akita.compose.foundation.p pVar = this.f60306n;
        v vVar = this.f60307o;
        h.d(this.f60304l, this.f60305m, pVar, vVar, this.f60308p, a12, iA2);
        return G0.f406611a;
    }
}
