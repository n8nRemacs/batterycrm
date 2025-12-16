package com.akita.compose.component.navbar.internal;

import Y41.p;
import Y41.q;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NavBarActionsLayout.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class b extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f62230l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q<com.akita.compose.component.navbar.i, A, Integer, G0> f62231m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(v vVar, q qVar, int i12) {
        super(2);
        this.f62230l = vVar;
        this.f62231m = qVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(1);
        c.a(this.f62230l, this.f62231m, a12, iA2);
        return G0.f406611a;
    }
}
