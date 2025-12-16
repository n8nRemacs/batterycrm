package com.akita.compose.component.accordion.internal;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.v;
import com.akita.compose.foundation.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HeaderTextLayout.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class b extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22602e f60215l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r f60216m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p<A, Integer, G0> f60217n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p<A, Integer, G0> f60218o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f60219p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f60220q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ v f60221r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f60222s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C22602e c22602e, r rVar, p pVar, p pVar2, boolean z12, float f12, v vVar, int i12) {
        super(2);
        this.f60215l = c22602e;
        this.f60216m = rVar;
        this.f60217n = pVar;
        this.f60218o = pVar2;
        this.f60219p = z12;
        this.f60220q = f12;
        this.f60221r = vVar;
        this.f60222s = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f60222s | 1);
        C22602e c22602e = this.f60215l;
        p<A, Integer, G0> pVar = this.f60218o;
        boolean z12 = this.f60219p;
        d.a(c22602e, this.f60216m, this.f60217n, pVar, z12, this.f60220q, this.f60221r, a12, iA2);
        return G0.f406611a;
    }
}
