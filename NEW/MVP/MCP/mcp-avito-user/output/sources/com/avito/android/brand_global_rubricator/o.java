package com.avito.android.brand_global_rubricator;

import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BrandGlobalRubricatorViewImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class o extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q f107461l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<h, G0> f107462m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(q qVar, Y41.l<? super h, G0> lVar) {
        super(2);
        this.f107461l = qVar;
        this.f107462m = lVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            com.akita.compose.theme.re23.c.a(false, r.c(-1624072244, new n(this.f107461l, this.f107462m), a13), a13, 48, 1);
        }
        return G0.f406611a;
    }
}
