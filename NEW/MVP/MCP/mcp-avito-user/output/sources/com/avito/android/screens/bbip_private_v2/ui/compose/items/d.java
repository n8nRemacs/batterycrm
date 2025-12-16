package com.avito.android.screens.bbip_private_v2.ui.compose.items;

import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.C22066f2;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BbipPrivateV2BudgetSetting.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class d extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C20644z f261231l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BbipPrivateV2State.a f261232m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Float, G0> f261233n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f261234o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C20644z c20644z, BbipPrivateV2State.a aVar, Y41.l lVar, int i12) {
        super(2);
        this.f261231l = c20644z;
        this.f261232m = aVar;
        this.f261233n = lVar;
        this.f261234o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f261234o | 1);
        Y41.l<Float, G0> lVar = this.f261233n;
        C34527c.c(this.f261231l, this.f261232m, lVar, a12, iA2);
        return G0.f406611a;
    }
}
