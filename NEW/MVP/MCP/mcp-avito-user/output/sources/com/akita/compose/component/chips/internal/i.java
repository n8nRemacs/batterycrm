package com.akita.compose.component.chips.internal;

import Y41.p;
import androidx.compose.foundation.d2;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SingleLineStretchedLayout.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class i extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f60933l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v.a f60934m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ T1 f60935n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ d2 f60936o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C22096n f60937p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f60938q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(float f12, v.a aVar, T1 t12, d2 d2Var, C22096n c22096n, int i12) {
        super(2);
        this.f60933l = f12;
        this.f60934m = aVar;
        this.f60935n = t12;
        this.f60936o = d2Var;
        this.f60937p = c22096n;
        this.f60938q = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f60938q | 1);
        C22096n c22096n = this.f60937p;
        v.a aVar = this.f60934m;
        T1 t12 = this.f60935n;
        k.a(this.f60933l, aVar, t12, this.f60936o, c22096n, a12, iA2);
        return G0.f406611a;
    }
}
