package com.akita.compose.component.tooltip;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TooltipBox.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class f extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22096n f63478l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t f63479m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ w f63480n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f63481o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ TooltipToAnchorPosition f63482p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ TooltipTailPosition f63483q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ TooltipTailToAnchorPosition f63484r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f63485s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f63486t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C22096n f63487u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f63488v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f63489w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C22096n c22096n, t tVar, w wVar, androidx.compose.ui.v vVar, TooltipToAnchorPosition tooltipToAnchorPosition, TooltipTailPosition tooltipTailPosition, TooltipTailToAnchorPosition tooltipTailToAnchorPosition, long j12, boolean z12, C22096n c22096n2, int i12, int i13) {
        super(2);
        this.f63478l = c22096n;
        this.f63479m = tVar;
        this.f63480n = wVar;
        this.f63481o = vVar;
        this.f63482p = tooltipToAnchorPosition;
        this.f63483q = tooltipTailPosition;
        this.f63484r = tooltipTailToAnchorPosition;
        this.f63485s = j12;
        this.f63486t = z12;
        this.f63487u = c22096n2;
        this.f63488v = i12;
        this.f63489w = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) throws Throwable {
        num.intValue();
        int iA2 = C22066f2.a(this.f63488v | 1);
        C22096n c22096n = this.f63487u;
        C22096n c22096n2 = this.f63478l;
        long j12 = this.f63485s;
        int i12 = this.f63489w;
        c.a(c22096n2, this.f63479m, this.f63480n, this.f63481o, this.f63482p, this.f63483q, this.f63484r, j12, this.f63486t, c22096n, a12, iA2, i12);
        return G0.f406611a;
    }
}
