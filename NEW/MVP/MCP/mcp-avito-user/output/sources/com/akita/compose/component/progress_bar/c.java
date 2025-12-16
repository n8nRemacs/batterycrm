package com.akita.compose.component.progress_bar;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ProgressBar.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class c extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<m> f62374l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f62375m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f62376n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(List list, k kVar, v vVar, int i12) {
        super(2);
        this.f62374l = list;
        this.f62375m = kVar;
        this.f62376n = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(385);
        v vVar = this.f62376n;
        j.b(this.f62374l, this.f62375m, vVar, a12, iA2);
        return G0.f406611a;
    }
}
