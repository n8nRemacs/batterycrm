package com.avito.android.iac_dialer_ui.pub.util;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LiveCallTimer.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class e extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Long f167763l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Long f167764m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Long> f167765n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v.a f167766o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C22096n f167767p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f167768q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Long l12, Long l13, Y41.a aVar, v.a aVar2, C22096n c22096n, int i12) {
        super(2);
        this.f167763l = l12;
        this.f167764m = l13;
        this.f167765n = aVar;
        this.f167766o = aVar2;
        this.f167767p = c22096n;
        this.f167768q = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f167768q | 1);
        Long l12 = this.f167764m;
        Y41.a<Long> aVar = this.f167765n;
        f.a(this.f167763l, l12, aVar, this.f167766o, this.f167767p, a12, iA2);
        return G0.f406611a;
    }
}
