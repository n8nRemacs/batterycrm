package com.akita.compose.component.pull_to_refresh;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PullToRefresh.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class c extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f62415l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.spinner.h f62416m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f62417n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f62418o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(j jVar, com.akita.compose.component.spinner.h hVar, v vVar, int i12) {
        super(2);
        this.f62415l = jVar;
        this.f62416m = hVar;
        this.f62417n = vVar;
        this.f62418o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f62418o | 1);
        v vVar = this.f62417n;
        i.c(this.f62415l, this.f62416m, vVar, a12, iA2);
        return G0.f406611a;
    }
}
