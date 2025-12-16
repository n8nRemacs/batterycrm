package com.akita.compose.component.tooltip;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.text.C22602e;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Tooltip.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class q extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r f63536l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f63537m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22602e f63538n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22602e f63539o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f63540p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f63541q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f63542r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f63543s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f63544t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, androidx.compose.ui.v vVar, C22602e c22602e, C22602e c22602e2, String str, Y41.a aVar, Y41.a aVar2, boolean z12, int i12) {
        super(2);
        this.f63536l = rVar;
        this.f63537m = vVar;
        this.f63538n = c22602e;
        this.f63539o = c22602e2;
        this.f63540p = str;
        this.f63541q = aVar;
        this.f63542r = aVar2;
        this.f63543s = z12;
        this.f63544t = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f63544t | 1);
        String str = this.f63540p;
        Y41.a<G0> aVar = this.f63541q;
        k.c(this.f63536l, this.f63537m, this.f63538n, this.f63539o, str, aVar, this.f63542r, this.f63543s, a12, iA2);
        return G0.f406611a;
    }
}
