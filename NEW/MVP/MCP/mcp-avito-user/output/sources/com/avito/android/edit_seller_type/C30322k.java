package com.avito.android.edit_seller_type;

import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.edit_seller_type.EditSellerTypeFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: EditSellerTypeFragment.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.edit_seller_type.k, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30322k extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ EditSellerTypeFragment f146764l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30322k(EditSellerTypeFragment editSellerTypeFragment) {
        super(2);
        this.f146764l = editSellerTypeFragment;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            EditSellerTypeFragment.a aVar = EditSellerTypeFragment.f146675s0;
            EditSellerTypeFragment editSellerTypeFragment = this.f146764l;
            InterfaceC22204y1 interfaceC22204y1B = C22126m3.b(editSellerTypeFragment.r5().getState(), a13);
            com.avito.android.analytics.screens.compose.q.b((com.avito.android.analytics.screens.compose.a) editSellerTypeFragment.f146680r0.getValue(), androidx.compose.runtime.internal.r.c(-994040560, new C30321j(editSellerTypeFragment, com.akita.compose.component.toast_bar.w.a(a13), interfaceC22204y1B), a13), a13, 48);
        }
        return G0.f406611a;
    }
}
