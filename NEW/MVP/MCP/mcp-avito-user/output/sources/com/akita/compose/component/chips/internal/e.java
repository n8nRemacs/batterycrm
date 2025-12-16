package com.akita.compose.component.chips.internal;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.i;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MultiLineLayout.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class e extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f60919l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f60920m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f60921n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i.a f60922o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C22096n f60923p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(v vVar, float f12, float f13, i.a aVar, C22096n c22096n, int i12) {
        super(2);
        this.f60919l = vVar;
        this.f60920m = f12;
        this.f60921n = f13;
        this.f60922o = aVar;
        this.f60923p = c22096n;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(27649);
        C22096n c22096n = this.f60923p;
        float f12 = this.f60920m;
        float f13 = this.f60921n;
        f.a(this.f60919l, f12, f13, this.f60922o, c22096n, a12, iA2);
        return G0.f406611a;
    }
}
