package com.avito.beduin.v2.component.aspect_ratio.compose;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import com.avito.beduin.v2.component.aspect_ratio.state.AspectRatioState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AspectRatioComponent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class f extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f335514l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AspectRatioState.b f335515m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f335516n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f335517o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(v vVar, AspectRatioState.b bVar, C22096n c22096n, int i12) {
        super(2);
        this.f335514l = vVar;
        this.f335515m = bVar;
        this.f335516n = c22096n;
        this.f335517o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f335517o | 1);
        AspectRatioState.b bVar = this.f335515m;
        C22096n c22096n = this.f335516n;
        g.a(this.f335514l, bVar, c22096n, a12, iA2);
        return G0.f406611a;
    }
}
