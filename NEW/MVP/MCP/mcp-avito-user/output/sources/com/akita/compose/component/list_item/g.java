package com.akita.compose.component.list_item;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.text.C22602e;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ListItemCheckmark.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class g extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22602e f61882l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f61883m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s f61884n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f61885o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.p<A, Integer, G0> f61886p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.p<A, Integer, G0> f61887q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f61888r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C22602e c22602e, boolean z12, s sVar, androidx.compose.ui.v vVar, Y41.p pVar, Y41.p pVar2, int i12) {
        super(2);
        this.f61882l = c22602e;
        this.f61883m = z12;
        this.f61884n = sVar;
        this.f61885o = vVar;
        this.f61886p = pVar;
        this.f61887q = pVar2;
        this.f61888r = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f61888r | 1);
        C22602e c22602e = this.f61882l;
        s sVar = this.f61884n;
        androidx.compose.ui.v vVar = this.f61885o;
        h.a(c22602e, this.f61883m, sVar, vVar, this.f61886p, this.f61887q, a12, iA2);
        return G0.f406611a;
    }
}
