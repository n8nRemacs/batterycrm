package com.akita.compose.component.list_item;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ListItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class n extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s f61924l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f61925m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<A, Integer, G0> f61926n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.p<A, Integer, G0> f61927o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.p<A, Integer, G0> f61928p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C22096n f61929q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f61930r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f61931s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(s sVar, androidx.compose.ui.v vVar, Y41.p pVar, Y41.p pVar2, Y41.p pVar3, C22096n c22096n, int i12, int i13) {
        super(2);
        this.f61924l = sVar;
        this.f61925m = vVar;
        this.f61926n = pVar;
        this.f61927o = pVar2;
        this.f61928p = pVar3;
        this.f61929q = c22096n;
        this.f61930r = i12;
        this.f61931s = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f61930r | 1);
        C22096n c22096n = this.f61929q;
        Y41.p<A, Integer, G0> pVar = this.f61927o;
        m.c(this.f61924l, this.f61925m, this.f61926n, pVar, this.f61928p, c22096n, a12, iA2, this.f61931s);
        return G0.f406611a;
    }
}
