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
final class l extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f63368l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f63369m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ u f63370n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f63371o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ToggleState f63372p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f63373q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f63374r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f63375s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(boolean z12, Y41.a aVar, u uVar, v vVar, ToggleState toggleState, androidx.compose.foundation.interaction.m mVar, int i12, int i13) {
        super(2);
        this.f63368l = z12;
        this.f63369m = aVar;
        this.f63370n = uVar;
        this.f63371o = vVar;
        this.f63372p = toggleState;
        this.f63373q = mVar;
        this.f63374r = i12;
        this.f63375s = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f63374r | 1);
        ToggleState toggleState = this.f63372p;
        p.a(this.f63368l, this.f63369m, this.f63370n, this.f63371o, toggleState, this.f63373q, a12, iA2, this.f63375s);
        return G0.f406611a;
    }
}
