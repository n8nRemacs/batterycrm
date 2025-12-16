package com.avito.beduin.v2.component.gridlayout.compose;

import Y41.p;
import Y41.q;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.render.compose.n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GridRowComponent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class h extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC36249i f335829l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f335830m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ N f335831n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f335832o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(int i12, q qVar, InterfaceC36249i interfaceC36249i, n nVar) {
        super(2);
        this.f335829l = interfaceC36249i;
        this.f335830m = nVar;
        this.f335831n = (N) qVar;
        this.f335832o = i12;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.q, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        d.b(C22066f2.a(this.f335832o | 1), this.f335831n, a12, this.f335829l, this.f335830m);
        return G0.f406611a;
    }
}
