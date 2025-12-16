package com.avito.android.iac_dialer_ui.pub.call_screen.wait_bottom_sheet;

import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacUIWaitBottomSheet.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class p extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ J f167448l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ IacUIWaitBottomSheetType f167449m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f167450n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f167451o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f167452p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f167453q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f167454r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(J j12, IacUIWaitBottomSheetType iacUIWaitBottomSheetType, Y41.a<G0> aVar, Y41.a<G0> aVar2, Y41.a<G0> aVar3, Y41.a<G0> aVar4, int i12) {
        super(2);
        this.f167448l = j12;
        this.f167449m = iacUIWaitBottomSheetType;
        this.f167450n = aVar;
        this.f167451o = aVar2;
        this.f167452p = aVar3;
        this.f167453q = aVar4;
        this.f167454r = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f167454r | 1);
        Y41.a<G0> aVar = this.f167452p;
        Y41.a<G0> aVar2 = this.f167453q;
        B.b(this.f167448l, this.f167449m, this.f167450n, this.f167451o, aVar, aVar2, a12, iA2);
        return G0.f406611a;
    }
}
