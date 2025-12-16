package com.akita.compose.component.navbar;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NavBarAction.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class f extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f62213l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f62214m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f62215n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v.a f62216o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ u f62217p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f62218q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f62219r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, String str, Y41.a aVar, v.a aVar2, u uVar, int i12, int i13) {
        super(2);
        this.f62213l = iVar;
        this.f62214m = str;
        this.f62215n = aVar;
        this.f62216o = aVar2;
        this.f62217p = uVar;
        this.f62218q = i12;
        this.f62219r = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f62218q | 1);
        Y41.a<G0> aVar = this.f62215n;
        h.c(this.f62213l, this.f62214m, aVar, this.f62216o, this.f62217p, a12, iA2, this.f62219r);
        return G0.f406611a;
    }
}
