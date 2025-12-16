package com.akita.compose.component.scaffold.internal;

import Y41.p;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.Z0;
import androidx.compose.ui.unit.C22712b;
import com.akita.compose.component.toast_bar.ToastBarPosition;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;

/* compiled from: ScaffoldLayout.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/Z0;", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "invoke-0kLqBqw", "(Landroidx/compose/ui/layout/Z0;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class c extends N implements p<Z0, C22712b, InterfaceC22367j0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22096n f62521l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22096n f62522m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f62523n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22096n f62524o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<ToastBarPosition> f62525p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ f f62526q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C22096n f62527r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C22096n c22096n, C22096n c22096n2, C22096n c22096n3, C22096n c22096n4, Y41.a aVar, f fVar, C22096n c22096n5) {
        super(2);
        this.f62521l = c22096n;
        this.f62522m = c22096n2;
        this.f62523n = c22096n3;
        this.f62524o = c22096n4;
        this.f62525p = aVar;
        this.f62526q = fVar;
        this.f62527r = c22096n5;
    }

    @Override // Y41.p
    public final InterfaceC22367j0 invoke(Z0 z02, C22712b c22712b) {
        Z0 z03 = z02;
        long j12 = c22712b.f42843a;
        int iJ2 = C22712b.j(j12);
        int i12 = C22712b.i(j12);
        long jC2 = C22712b.c(j12, 0, 0, 0, 0, 10);
        return z03.L0(iJ2, i12, P0.c(), new b(z03, this.f62521l, this.f62522m, this.f62523n, i12, this.f62524o, this.f62525p, this.f62526q, jC2, this.f62527r));
    }
}
