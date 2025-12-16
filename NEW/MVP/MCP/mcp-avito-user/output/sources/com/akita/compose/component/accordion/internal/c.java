package com.akita.compose.component.accordion.internal;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.ui.text.C22602e;
import com.akita.compose.foundation.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HeaderTextLayout.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class c extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22602e f60223l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r f60224m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C22602e c22602e, r rVar) {
        super(2);
        this.f60223l = c22602e;
        this.f60224m = rVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            com.akita.compose.foundation.ui.p.a(this.f60223l, this.f60224m, null, false, 0L, null, 0, 0, false, null, a13, 0, 1020);
        }
        return G0.f406611a;
    }
}
