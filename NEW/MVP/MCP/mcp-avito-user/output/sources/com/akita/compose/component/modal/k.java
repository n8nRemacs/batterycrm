package com.akita.compose.component.modal;

import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import com.akita.compose.foundation.modifier.e;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Modal.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class k extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C f62079l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f62080m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f62081n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f62082o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C22096n f62083p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ v.a f62084q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C22096n f62085r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(C c12, boolean z12, boolean z13, Y41.a aVar, C22096n c22096n, v.a aVar2, C22096n c22096n2) {
        super(2);
        this.f62079l = c12;
        this.f62080m = z12;
        this.f62081n = z13;
        this.f62082o = aVar;
        this.f62083p = c22096n;
        this.f62084q = aVar2;
        this.f62085r = c22096n2;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            C c12 = this.f62079l;
            float f12 = c12.f61983a;
            C22096n c22096nC = androidx.compose.runtime.internal.r.c(-1773332925, new j(this.f62085r), a13);
            e.a aVar = com.akita.compose.foundation.modifier.e.f63615e;
            B.a(f12, c12.f61989g, c12.f61990h, this.f62080m, this.f62081n, c12.f61998p, this.f62082o, c12.f62000r, c12.f62001s, this.f62083p, this.f62084q, c22096nC, a13, 0, 48);
        }
        return G0.f406611a;
    }
}
