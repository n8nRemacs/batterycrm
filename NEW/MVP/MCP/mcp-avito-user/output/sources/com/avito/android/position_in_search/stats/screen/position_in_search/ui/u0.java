package com.avito.android.position_in_search.stats.screen.position_in_search.ui;

import androidx.compose.runtime.C22066f2;
import c90.InterfaceC26960a;
import c90.c;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SearchPositionCompetitors.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class u0 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c.C2034c.a f221730l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f221731m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.graphics.painter.e f221732n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC26960a, G0> f221733o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f221734p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u0(c.C2034c.a aVar, float f12, androidx.compose.ui.graphics.painter.e eVar, Y41.l<? super InterfaceC26960a, G0> lVar, int i12) {
        super(2);
        this.f221730l = aVar;
        this.f221731m = f12;
        this.f221732n = eVar;
        this.f221733o = lVar;
        this.f221734p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f221734p | 1);
        androidx.compose.ui.graphics.painter.e eVar = this.f221732n;
        Y41.l<InterfaceC26960a, G0> lVar = this.f221733o;
        z0.b(this.f221730l, this.f221731m, eVar, lVar, a12, iA2);
        return G0.f406611a;
    }
}
