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
final class q extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C f62109l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f62110m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f62111n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f62112o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C22096n f62113p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C22096n f62114q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ v.a f62115r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C22096n f62116s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(C c12, Y41.a aVar, boolean z12, boolean z13, C22096n c22096n, C22096n c22096n2, v.a aVar2, C22096n c22096n3) {
        super(2);
        this.f62109l = c12;
        this.f62110m = aVar;
        this.f62111n = z12;
        this.f62112o = z13;
        this.f62113p = c22096n;
        this.f62114q = c22096n2;
        this.f62115r = aVar2;
        this.f62116s = c22096n3;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            e.a aVar = com.akita.compose.foundation.modifier.e.f63615e;
            B.f(this.f62109l, this.f62110m, this.f62111n, this.f62112o, this.f62113p, this.f62114q, this.f62115r, this.f62116s, a13, 8);
        }
        return G0.f406611a;
    }
}
