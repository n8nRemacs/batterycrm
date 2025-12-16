package com.avito.android.edit_seller_type;

import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EditSellerTypeScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class n extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.edit_seller_type.mvi.entity.a, G0> f146847l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f146848m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f146849n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f146850o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(int i12, Y41.l lVar, androidx.compose.ui.v vVar, String str) {
        super(2);
        this.f146847l = lVar;
        this.f146848m = str;
        this.f146849n = vVar;
        this.f146850o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f146850o | 1);
        androidx.compose.ui.v vVar = this.f146849n;
        o.e(iA2, this.f146847l, a12, vVar, this.f146848m);
        return G0.f406611a;
    }
}
