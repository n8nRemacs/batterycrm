package com.akita.compose.component.progress_bar;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ProgressBar.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class b extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Float> f62370l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f62371m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f62372n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f62373o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Y41.a aVar, k kVar, v vVar, int i12) {
        super(2);
        this.f62370l = aVar;
        this.f62371m = kVar;
        this.f62372n = vVar;
        this.f62373o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f62373o | 1);
        v vVar = this.f62372n;
        j.a(this.f62370l, this.f62371m, vVar, a12, iA2);
        return G0.f406611a;
    }
}
