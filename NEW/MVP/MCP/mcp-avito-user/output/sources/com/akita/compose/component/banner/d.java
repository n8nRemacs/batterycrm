package com.akita.compose.component.banner;

import Y41.p;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Banner.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class d extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.close_button.c f60448l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T1 f60449m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f60450n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ T1 f60451o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v f60452p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C22096n f60453q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f60454r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.akita.compose.component.close_button.c cVar, T1 t12, Y41.a aVar, T1 t13, v vVar, C22096n c22096n, int i12) {
        super(2);
        this.f60448l = cVar;
        this.f60449m = t12;
        this.f60450n = aVar;
        this.f60451o = t13;
        this.f60452p = vVar;
        this.f60453q = c22096n;
        this.f60454r = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f60454r | 1);
        T1 t12 = this.f60451o;
        v vVar = this.f60452p;
        g.b(this.f60448l, this.f60449m, this.f60450n, t12, vVar, this.f60453q, a12, iA2);
        return G0.f406611a;
    }
}
