package com.akita.compose.component.gallery;

import androidx.compose.foundation.gestures.InterfaceC20481m2;
import androidx.compose.foundation.lazy.w0;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Gallery.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class j extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v.a f61610l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u f61611m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ w0 f61612n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20481m2 f61613o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ N f61614p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f61615q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(v.a aVar, u uVar, w0 w0Var, InterfaceC20481m2 interfaceC20481m2, Y41.l lVar, int i12, int i13) {
        super(2);
        this.f61610l = aVar;
        this.f61611m = uVar;
        this.f61612n = w0Var;
        this.f61613o = interfaceC20481m2;
        this.f61614p = (N) lVar;
        this.f61615q = i13;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(1);
        ?? r42 = this.f61614p;
        w0 w0Var = this.f61612n;
        int i12 = this.f61615q;
        o.a(this.f61610l, this.f61611m, w0Var, this.f61613o, r42, a12, iA2, i12);
        return G0.f406611a;
    }
}
