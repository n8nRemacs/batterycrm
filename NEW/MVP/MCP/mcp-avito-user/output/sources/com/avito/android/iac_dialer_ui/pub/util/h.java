package com.avito.android.iac_dialer_ui.pub.util;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LiveDataUpdater.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class h extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Object> f167773l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f167774m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f167775n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22096n f167776o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f167777p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Y41.a aVar, long j12, v vVar, C22096n c22096n, int i12) {
        super(2);
        this.f167773l = aVar;
        this.f167774m = j12;
        this.f167775n = vVar;
        this.f167776o = c22096n;
        this.f167777p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f167777p | 1);
        C22096n c22096n = this.f167776o;
        i.a(this.f167773l, this.f167774m, this.f167775n, c22096n, a12, iA2);
        return G0.f406611a;
    }
}
