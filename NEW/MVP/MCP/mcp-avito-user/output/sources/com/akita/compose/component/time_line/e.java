package com.akita.compose.component.time_line;

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
final class e extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f63114l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f63115m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g f63116n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f63117o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f63118p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i12, j jVar, g gVar, v vVar, int i13) {
        super(2);
        this.f63114l = i12;
        this.f63115m = jVar;
        this.f63116n = gVar;
        this.f63117o = vVar;
        this.f63118p = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f63118p | 1);
        j jVar = this.f63115m;
        g gVar = this.f63116n;
        b.b(this.f63114l, jVar, gVar, a12, iA2);
        return G0.f406611a;
    }
}
