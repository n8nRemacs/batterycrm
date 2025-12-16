package com.akita.compose.component.scaffold.internal;

import Y41.p;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.layout.Z0;
import androidx.compose.ui.unit.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ScaffoldLayout.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class a extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z0 f62507l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f62508m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f62509n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22096n f62510o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Z0 z02, int i12, int i13, C22096n c22096n) {
        super(2);
        this.f62507l = z02;
        this.f62508m = i12;
        this.f62509n = i13;
        this.f62510o = c22096n;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            int i12 = this.f62508m;
            Z0 z02 = this.f62507l;
            float fJ2 = z02.J(this.f62509n) + z02.J(i12);
            h.a aVar = h.f42849c;
            this.f62510o.invoke(R1.e(0.0f, 0.0f, 0.0f, fJ2, 7), a13, 0);
        }
        return G0.f406611a;
    }
}
