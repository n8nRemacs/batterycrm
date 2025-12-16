package com.akita.compose.component.bottom_sheet;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BottomSheet.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class x extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f60703l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.window.H f60704m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ I f60705n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f60706o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C22096n f60707p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C22096n f60708q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f60709r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Y41.a aVar, androidx.compose.ui.window.H h12, I i12, com.akita.compose.component.toast_bar.u uVar, C22096n c22096n, C22096n c22096n2, int i13) {
        super(2);
        this.f60703l = aVar;
        this.f60704m = h12;
        this.f60705n = i12;
        this.f60706o = uVar;
        this.f60707p = c22096n;
        this.f60708q = c22096n2;
        this.f60709r = i13;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f60709r | 1);
        C22096n c22096n = this.f60708q;
        com.akita.compose.component.toast_bar.u uVar = this.f60706o;
        C22096n c22096n2 = this.f60707p;
        H.c(this.f60703l, this.f60704m, this.f60705n, uVar, c22096n2, c22096n, a12, iA2);
        return G0.f406611a;
    }
}
