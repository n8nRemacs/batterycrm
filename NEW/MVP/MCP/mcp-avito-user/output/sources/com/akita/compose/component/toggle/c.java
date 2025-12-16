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
final class c extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ToggleableState f63326l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f63327m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ u f63328n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f63329o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ToggleState f63330p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f63331q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f63332r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f63333s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ToggleableState toggleableState, Y41.a aVar, u uVar, v vVar, ToggleState toggleState, androidx.compose.foundation.interaction.m mVar, int i12, int i13) {
        super(2);
        this.f63326l = toggleableState;
        this.f63327m = aVar;
        this.f63328n = uVar;
        this.f63329o = vVar;
        this.f63330p = toggleState;
        this.f63331q = mVar;
        this.f63332r = i12;
        this.f63333s = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f63332r | 1);
        ToggleState toggleState = this.f63330p;
        j.a(this.f63326l, this.f63327m, this.f63328n, this.f63329o, toggleState, this.f63331q, a12, iA2, this.f63333s);
        return G0.f406611a;
    }
}
