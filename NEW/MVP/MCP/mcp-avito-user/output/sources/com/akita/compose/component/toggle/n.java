package com.akita.compose.component.toggle;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RadioToggle.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class n extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f63381l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f63382m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f63383n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ToggleState f63384o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f63385p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f63386q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f63387r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s f63388s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f63389t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f63390u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f63391v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(boolean z12, Y41.a aVar, v vVar, ToggleState toggleState, androidx.compose.foundation.interaction.m mVar, float f12, float f13, s sVar, boolean z13, int i12, int i13) {
        super(2);
        this.f63381l = z12;
        this.f63382m = aVar;
        this.f63383n = vVar;
        this.f63384o = toggleState;
        this.f63385p = mVar;
        this.f63386q = f12;
        this.f63387r = f13;
        this.f63388s = sVar;
        this.f63389t = z13;
        this.f63390u = i12;
        this.f63391v = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f63391v | 1);
        float f12 = this.f63387r;
        s sVar = this.f63388s;
        p.b(this.f63381l, this.f63382m, this.f63383n, this.f63384o, this.f63385p, this.f63386q, f12, sVar, this.f63389t, this.f63390u, a12, iA2);
        return G0.f406611a;
    }
}
