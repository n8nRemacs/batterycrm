package com.avito.android.cart_sheet_after_adding.ui;

import androidx.compose.runtime.C22066f2;
import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CartSheetAfterAddingScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class I extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Stepper f115495l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f115496m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Integer, G0> f115497n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f115498o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f115499p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(Stepper stepper, Y41.a aVar, Y41.l lVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f115495l = stepper;
        this.f115496m = aVar;
        this.f115497n = lVar;
        this.f115498o = vVar;
        this.f115499p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f115499p | 1);
        Y41.l<Integer, G0> lVar = this.f115497n;
        Y41.a<G0> aVar = this.f115496m;
        M.c(this.f115495l, aVar, lVar, a12, iA2);
        return G0.f406611a;
    }
}
