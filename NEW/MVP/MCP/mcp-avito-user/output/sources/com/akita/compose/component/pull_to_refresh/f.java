package com.akita.compose.component.pull_to_refresh;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PullToRefresh.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class f extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f62423l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f62424m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l f62425n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f62426o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f62427p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, boolean z12, l lVar, v vVar, int i12) {
        super(2);
        this.f62423l = jVar;
        this.f62424m = z12;
        this.f62425n = lVar;
        this.f62426o = vVar;
        this.f62427p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f62427p | 1);
        l lVar = this.f62425n;
        i.a(this.f62423l, this.f62424m, lVar, this.f62426o, a12, iA2);
        return G0.f406611a;
    }
}
