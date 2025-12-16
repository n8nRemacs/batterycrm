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
final class e extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<m> f62382l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f62383m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f62384n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f62385o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List list, v vVar, float f12, float f13, int i12) {
        super(2);
        this.f62382l = list;
        this.f62383m = vVar;
        this.f62384n = f12;
        this.f62385o = f13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(9);
        v vVar = this.f62383m;
        float f12 = this.f62384n;
        j.c(this.f62382l, vVar, f12, this.f62385o, a12, iA2);
        return G0.f406611a;
    }
}
