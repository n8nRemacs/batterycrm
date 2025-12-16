package com.akita.compose.component.close_button;

import Y41.p;
import androidx.compose.foundation.layout.V1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CloseButton.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class a extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f61026l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f61027m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f61028n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f61029o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.foundation.p f61030p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ V1 f61031q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f61032r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f61033s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Y41.a aVar, c cVar, v vVar, boolean z12, com.akita.compose.foundation.p pVar, V1 v12, int i12, int i13) {
        super(2);
        this.f61026l = aVar;
        this.f61027m = cVar;
        this.f61028n = vVar;
        this.f61029o = z12;
        this.f61030p = pVar;
        this.f61031q = v12;
        this.f61032r = i12;
        this.f61033s = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f61032r | 1);
        boolean z12 = this.f61029o;
        b.a(this.f61026l, this.f61027m, this.f61028n, z12, this.f61030p, this.f61031q, a12, iA2, this.f61033s);
        return G0.f406611a;
    }
}
