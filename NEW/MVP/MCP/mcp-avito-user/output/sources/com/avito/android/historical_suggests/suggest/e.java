package com.avito.android.historical_suggests.suggest;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import uI.C48901b;
import uI.C48904e;
import vI.InterfaceC49216a;

/* compiled from: HistoricalSuggestsScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class e extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C48904e f161992l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C48901b f161993m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC49216a, G0> f161994n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f161995o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f161996p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(C48904e c48904e, C48901b c48901b, Y41.l lVar, v vVar, int i12) {
        super(2);
        this.f161992l = c48904e;
        this.f161993m = c48901b;
        this.f161994n = lVar;
        this.f161995o = vVar;
        this.f161996p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f161996p | 1);
        C48901b c48901b = this.f161993m;
        Y41.l<InterfaceC49216a, G0> lVar = this.f161994n;
        h.b(this.f161992l, c48901b, lVar, this.f161995o, a12, iA2);
        return G0.f406611a;
    }
}
