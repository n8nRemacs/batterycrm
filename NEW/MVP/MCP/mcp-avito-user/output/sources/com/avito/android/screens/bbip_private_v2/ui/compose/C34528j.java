package com.avito.android.screens.bbip_private_v2.ui.compose;

import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State;
import kotlin.G0;
import kotlin.Metadata;
import tp0.InterfaceC48700a;

/* compiled from: BbipPrivateV2ScreenContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.screens.bbip_private_v2.ui.compose.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34528j extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BbipPrivateV2State f261312l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC48700a, G0> f261313m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f261314n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f261315o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v.a f261316p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34528j(BbipPrivateV2State bbipPrivateV2State, Y41.l lVar, com.akita.compose.component.toast_bar.u uVar, float f12, v.a aVar, int i12) {
        super(2);
        this.f261312l = bbipPrivateV2State;
        this.f261313m = lVar;
        this.f261314n = uVar;
        this.f261315o = f12;
        this.f261316p = aVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(24577);
        Y41.l<InterfaceC48700a, G0> lVar = this.f261313m;
        com.akita.compose.component.toast_bar.u uVar = this.f261314n;
        C34530l.a(this.f261312l, lVar, uVar, this.f261315o, this.f261316p, a12, iA2);
        return G0.f406611a;
    }
}
