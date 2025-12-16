package com.akita.compose.component.selector_card;

import Y41.p;
import androidx.compose.foundation.interaction.m;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectorCard.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class e extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f62637l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f62638m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f62639n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f62640o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f62641p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ SelectorCardType f62642q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ SelectorCardState f62643r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f62644s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C22096n f62645t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f62646u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f62647v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z12, Y41.a aVar, h hVar, v vVar, boolean z13, SelectorCardType selectorCardType, SelectorCardState selectorCardState, m mVar, C22096n c22096n, int i12, int i13) {
        super(2);
        this.f62637l = z12;
        this.f62638m = aVar;
        this.f62639n = hVar;
        this.f62640o = vVar;
        this.f62641p = z13;
        this.f62642q = selectorCardType;
        this.f62643r = selectorCardState;
        this.f62644s = mVar;
        this.f62645t = c22096n;
        this.f62646u = i12;
        this.f62647v = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f62646u | 1);
        SelectorCardState selectorCardState = this.f62643r;
        g.a(this.f62637l, this.f62638m, this.f62639n, this.f62640o, this.f62641p, this.f62642q, selectorCardState, this.f62644s, this.f62645t, a12, iA2, this.f62647v);
        return G0.f406611a;
    }
}
