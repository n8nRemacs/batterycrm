package com.akita.compose.component.tab_group;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TabGroupItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class f extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ R2.b f62990l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f62991m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f62992n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f62993o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v.a f62994p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(R2.b bVar, boolean z12, j jVar, Y41.a aVar, v.a aVar2, int i12) {
        super(2);
        this.f62990l = bVar;
        this.f62991m = z12;
        this.f62992n = jVar;
        this.f62993o = aVar;
        this.f62994p = aVar2;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(1);
        boolean z12 = this.f62991m;
        j jVar = this.f62992n;
        i.a(this.f62990l, z12, jVar, this.f62993o, this.f62994p, a12, iA2);
        return G0.f406611a;
    }
}
