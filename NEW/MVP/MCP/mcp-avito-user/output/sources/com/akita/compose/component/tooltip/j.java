package com.akita.compose.component.tooltip;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Tooltip.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class j extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r f63497l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f63498m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f63499n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f63500o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C22096n f63501p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f63502q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r rVar, androidx.compose.ui.v vVar, Y41.a aVar, boolean z12, C22096n c22096n, int i12) {
        super(2);
        this.f63497l = rVar;
        this.f63498m = vVar;
        this.f63499n = aVar;
        this.f63500o = z12;
        this.f63501p = c22096n;
        this.f63502q = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f63502q | 1);
        C22096n c22096n = this.f63501p;
        androidx.compose.ui.v vVar = this.f63498m;
        Y41.a<G0> aVar = this.f63499n;
        k.b(this.f63497l, vVar, aVar, this.f63500o, c22096n, a12, iA2);
        return G0.f406611a;
    }
}
