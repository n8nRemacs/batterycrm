package com.akita.compose.component.toggle;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CheckToggle.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class e extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ToggleableState f63343l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f63344m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f63345n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ToggleState f63346o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f63347p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f63348q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f63349r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s f63350s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f63351t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f63352u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f63353v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f63354w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.animation.core.N f63355x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f63356y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ToggleableState toggleableState, Y41.a aVar, v vVar, ToggleState toggleState, androidx.compose.foundation.interaction.m mVar, float f12, float f13, s sVar, boolean z12, float f14, float f15, int i12, androidx.compose.animation.core.N n12, int i13) {
        super(2);
        this.f63343l = toggleableState;
        this.f63344m = aVar;
        this.f63345n = vVar;
        this.f63346o = toggleState;
        this.f63347p = mVar;
        this.f63348q = f12;
        this.f63349r = f13;
        this.f63350s = sVar;
        this.f63351t = z12;
        this.f63352u = f14;
        this.f63353v = f15;
        this.f63354w = i12;
        this.f63355x = n12;
        this.f63356y = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f63356y | 1);
        float f12 = this.f63352u;
        float f13 = this.f63353v;
        j.c(this.f63343l, this.f63344m, this.f63345n, this.f63346o, this.f63347p, this.f63348q, this.f63349r, this.f63350s, this.f63351t, f12, f13, this.f63354w, this.f63355x, a12, iA2);
        return G0.f406611a;
    }
}
