package com.avito.android.edit_seller_type;

import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EditSellerTypeFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.edit_seller_type.g, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30318g extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ EditSellerTypeFragment f146745l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f146746m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f146747n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30318g(EditSellerTypeFragment editSellerTypeFragment, com.akita.compose.component.toast_bar.u uVar, int i12) {
        super(2);
        this.f146745l = editSellerTypeFragment;
        this.f146746m = uVar;
        this.f146747n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f146747n | 1);
        EditSellerTypeFragment.q5(this.f146745l, this.f146746m, a12, iA2);
        return G0.f406611a;
    }
}
