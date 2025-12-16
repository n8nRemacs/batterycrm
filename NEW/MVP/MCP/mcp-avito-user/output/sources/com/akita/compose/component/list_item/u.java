package com.akita.compose.component.list_item;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.text.C22602e;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ListItemSwitcher.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class u extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22602e f61967l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f61968m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s f61969n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f61970o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f61971p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.p<A, Integer, G0> f61972q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.p<A, Integer, G0> f61973r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f61974s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(C22602e c22602e, boolean z12, s sVar, androidx.compose.ui.v vVar, boolean z13, Y41.p pVar, Y41.p pVar2, int i12) {
        super(2);
        this.f61967l = c22602e;
        this.f61968m = z12;
        this.f61969n = sVar;
        this.f61970o = vVar;
        this.f61971p = z13;
        this.f61972q = pVar;
        this.f61973r = pVar2;
        this.f61974s = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f61974s | 1);
        C22602e c22602e = this.f61967l;
        androidx.compose.ui.v vVar = this.f61970o;
        boolean z12 = this.f61971p;
        w.a(c22602e, this.f61968m, this.f61969n, vVar, z12, this.f61972q, this.f61973r, a12, iA2);
        return G0.f406611a;
    }
}
