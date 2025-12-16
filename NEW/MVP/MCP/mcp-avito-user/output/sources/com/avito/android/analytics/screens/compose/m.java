package com.avito.android.analytics.screens.compose;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ScreenTracker.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class m extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f90586l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22096n f90587m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(a aVar, C22096n c22096n, int i12) {
        super(2);
        this.f90586l = aVar;
        this.f90587m = c22096n;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(49);
        C22096n c22096n = this.f90587m;
        q.b(this.f90586l, c22096n, a12, iA2);
        return G0.f406611a;
    }
}
