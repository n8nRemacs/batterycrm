package com.akita.compose.component.spinner;

import Y41.p;
import androidx.compose.animation.core.F;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Spinner.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class c extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f62797l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.foundation.p f62798m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f62799n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f62800o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ F f62801p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f62802q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f62803r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(v vVar, com.akita.compose.foundation.p pVar, float f12, int i12, F f13, int i13, int i14) {
        super(2);
        this.f62797l = vVar;
        this.f62798m = pVar;
        this.f62799n = f12;
        this.f62800o = i12;
        this.f62801p = f13;
        this.f62802q = i13;
        this.f62803r = i14;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f62802q | 1);
        float f12 = this.f62799n;
        b.b(this.f62797l, this.f62798m, f12, this.f62800o, this.f62801p, a12, iA2, this.f62803r);
        return G0.f406611a;
    }
}
