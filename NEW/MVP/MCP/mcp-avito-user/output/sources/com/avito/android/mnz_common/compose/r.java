package com.avito.android.mnz_common.compose;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MnzNavBar.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class r extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f197940l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f197941m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f197942n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Float f197943o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f197944p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f197945q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f197946r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Y41.a aVar, androidx.compose.ui.v vVar, C22096n c22096n, Float f12, boolean z12, boolean z13, int i12) {
        super(2);
        this.f197940l = aVar;
        this.f197941m = vVar;
        this.f197942n = c22096n;
        this.f197943o = f12;
        this.f197944p = z12;
        this.f197945q = z13;
        this.f197946r = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f197946r | 1);
        Float f12 = this.f197943o;
        boolean z12 = this.f197944p;
        n.a(this.f197940l, this.f197941m, this.f197942n, f12, z12, this.f197945q, a12, iA2);
        return G0.f406611a;
    }
}
