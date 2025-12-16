package com.akita.compose.component.toggle;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SwitcherToggle.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class q extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f63395l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f63396m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ u f63397n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f63398o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ToggleState f63399p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f63400q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f63401r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f63402s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(boolean z12, Y41.a aVar, u uVar, v vVar, ToggleState toggleState, androidx.compose.foundation.interaction.m mVar, int i12, int i13) {
        super(2);
        this.f63395l = z12;
        this.f63396m = aVar;
        this.f63397n = uVar;
        this.f63398o = vVar;
        this.f63399p = toggleState;
        this.f63400q = mVar;
        this.f63401r = i12;
        this.f63402s = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f63401r | 1);
        ToggleState toggleState = this.f63399p;
        r.a(this.f63395l, this.f63396m, this.f63397n, this.f63398o, toggleState, this.f63400q, a12, iA2, this.f63402s);
        return G0.f406611a;
    }
}
