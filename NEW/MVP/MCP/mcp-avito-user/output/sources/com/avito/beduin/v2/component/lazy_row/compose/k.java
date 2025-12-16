package com.avito.beduin.v2.component.lazy_row.compose;

import Y41.p;
import Y41.q;
import androidx.compose.foundation.lazy.w0;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.render.compose.n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LazyRowComponent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class k extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f336062l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC36249i f336063m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q<com.avito.beduin.v2.component.lazy_row.state.a, A, Integer, w0> f336064n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f336065o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i12, q qVar, InterfaceC36249i interfaceC36249i, n nVar) {
        super(2);
        this.f336062l = nVar;
        this.f336063m = interfaceC36249i;
        this.f336064n = qVar;
        this.f336065o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f336065o | 1);
        n nVar = this.f336062l;
        InterfaceC36249i interfaceC36249i = this.f336063m;
        b.b(iA2, this.f336064n, a12, interfaceC36249i, nVar);
        return G0.f406611a;
    }
}
