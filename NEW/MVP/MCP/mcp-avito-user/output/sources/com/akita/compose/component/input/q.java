package com.akita.compose.component.input;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Input.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class q extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f61774l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22096n f61775m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f61776n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(long j12, C22096n c22096n, int i12) {
        super(2);
        this.f61774l = j12;
        this.f61775m = c22096n;
        this.f61776n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f61776n | 1);
        u.d(this.f61774l, this.f61775m, a12, iA2);
        return G0.f406611a;
    }
}
