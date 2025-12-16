package com.akita.compose.component.toggle;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CheckToggle.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class b extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f63318l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Boolean, G0> f63319m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ u f63320n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f63321o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ToggleState f63322p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f63323q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f63324r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f63325s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z12, Y41.l lVar, u uVar, v vVar, ToggleState toggleState, androidx.compose.foundation.interaction.m mVar, int i12, int i13) {
        super(2);
        this.f63318l = z12;
        this.f63319m = lVar;
        this.f63320n = uVar;
        this.f63321o = vVar;
        this.f63322p = toggleState;
        this.f63323q = mVar;
        this.f63324r = i12;
        this.f63325s = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f63324r | 1);
        ToggleState toggleState = this.f63322p;
        j.b(this.f63318l, this.f63319m, this.f63320n, this.f63321o, toggleState, this.f63323q, a12, iA2, this.f63325s);
        return G0.f406611a;
    }
}
