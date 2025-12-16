package com.akita.compose.component.time_line;

import Y41.l;
import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TimeLine.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class d extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f63109l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f63110m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f63111n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l<f, G0> f63112o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f63113p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, v vVar, j jVar, float f12, l lVar, int i12) {
        super(2);
        this.f63109l = gVar;
        this.f63110m = vVar;
        this.f63111n = jVar;
        this.f63112o = lVar;
        this.f63113p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f63113p | 1);
        v vVar = this.f63110m;
        j jVar = this.f63111n;
        b.a(this.f63109l, vVar, jVar, this.f63112o, a12, iA2);
        return G0.f406611a;
    }
}
