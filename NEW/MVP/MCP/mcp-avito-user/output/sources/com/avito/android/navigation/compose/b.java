package com.avito.android.navigation.compose;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.view.C23404y0;
import androidx.view.compose.C23359y;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BaseNavActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class b extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C23404y0 f207193l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f207194m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C23404y0 c23404y0, d dVar) {
        super(2);
        this.f207193l = c23404y0;
        this.f207194m = dVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            d dVar = this.f207194m;
            C23359y.b(this.f207193l, dVar.getF116303n(), new a(dVar), a13, 8);
        }
        return G0.f406611a;
    }
}
