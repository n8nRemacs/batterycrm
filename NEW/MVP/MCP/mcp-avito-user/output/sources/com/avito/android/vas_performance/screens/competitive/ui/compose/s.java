package com.avito.android.vas_performance.screens.competitive.ui.compose;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CompetitiveVasV2Screen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class s extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ JL0.c f320558l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<JL0.a, G0> f320559m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f320560n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f320561o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v.a f320562p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f320563q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(JL0.c cVar, Y41.l lVar, Y41.l lVar2, float f12, v.a aVar, int i12) {
        super(2);
        this.f320558l = cVar;
        this.f320559m = lVar;
        this.f320560n = lVar2;
        this.f320561o = f12;
        this.f320562p = aVar;
        this.f320563q = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f320563q | 1);
        Y41.l<JL0.a, G0> lVar = this.f320559m;
        Y41.l<DeepLink, G0> lVar2 = this.f320560n;
        u.c(this.f320558l, lVar, lVar2, this.f320561o, this.f320562p, a12, iA2);
        return G0.f406611a;
    }
}
