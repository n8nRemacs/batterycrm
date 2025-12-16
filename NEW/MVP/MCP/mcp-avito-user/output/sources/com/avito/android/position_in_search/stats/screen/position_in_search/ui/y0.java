package com.avito.android.position_in_search.stats.screen.position_in_search.ui;

import androidx.compose.runtime.C22066f2;
import c90.InterfaceC26960a;
import c90.c;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SearchPositionCompetitors.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class y0 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c.C2034c f221748l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC26960a, G0> f221749m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f221750n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f221751o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(c.C2034c c2034c, Y41.l lVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f221748l = c2034c;
        this.f221749m = lVar;
        this.f221750n = vVar;
        this.f221751o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f221751o | 1);
        androidx.compose.ui.v vVar = this.f221750n;
        z0.a(this.f221748l, this.f221749m, vVar, a12, iA2);
        return G0.f406611a;
    }
}
