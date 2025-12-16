package com.akita.compose.component.tab_group;

import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TabGroup.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class r extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f63080l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f63081m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f63082n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22096n f63083o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Integer> f63084p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ T1 f63085q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C22096n f63086r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f63087s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i12, float f12, androidx.compose.ui.v vVar, C22096n c22096n, Y41.a aVar, T1 t12, C22096n c22096n2, int i13) {
        super(2);
        this.f63080l = i12;
        this.f63081m = f12;
        this.f63082n = vVar;
        this.f63083o = c22096n;
        this.f63084p = aVar;
        this.f63085q = t12;
        this.f63086r = c22096n2;
        this.f63087s = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f63087s | 1);
        C22096n c22096n = this.f63086r;
        C22096n c22096n2 = this.f63083o;
        Y41.a<Integer> aVar = this.f63084p;
        k.b(this.f63080l, this.f63081m, this.f63082n, c22096n2, aVar, this.f63085q, c22096n, a12, iA2);
        return G0.f406611a;
    }
}
