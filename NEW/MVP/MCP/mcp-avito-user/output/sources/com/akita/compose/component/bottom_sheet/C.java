package com.akita.compose.component.bottom_sheet;

import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BottomSheet.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class C extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f60509l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f60510m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Boolean> f60511n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f60512o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(long j12, Y41.a<G0> aVar, Y41.a<Boolean> aVar2, int i12) {
        super(2);
        this.f60509l = j12;
        this.f60510m = aVar;
        this.f60511n = aVar2;
        this.f60512o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f60512o | 1);
        Y41.a<G0> aVar = this.f60510m;
        Y41.a<Boolean> aVar2 = this.f60511n;
        H.e(this.f60509l, aVar, aVar2, a12, iA2);
        return G0.f406611a;
    }
}
