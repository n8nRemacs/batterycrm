package com.avito.android.position_in_search.stats.screen.position_in_search.ui;

import androidx.compose.runtime.C22066f2;
import c90.InterfaceC26960a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PositionInSearchScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class d0 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c90.c f221641l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC26960a, G0> f221642m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Integer, G0> f221643n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f221644o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f221645p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d0(c90.c cVar, Y41.l<? super InterfaceC26960a, G0> lVar, Y41.l<? super Integer, G0> lVar2, float f12, int i12) {
        super(2);
        this.f221641l = cVar;
        this.f221642m = lVar;
        this.f221643n = lVar2;
        this.f221644o = f12;
        this.f221645p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f221645p | 1);
        Y41.l<Integer, G0> lVar = this.f221643n;
        float f12 = this.f221644o;
        i0.c(this.f221641l, this.f221642m, lVar, f12, a12, iA2);
        return G0.f406611a;
    }
}
