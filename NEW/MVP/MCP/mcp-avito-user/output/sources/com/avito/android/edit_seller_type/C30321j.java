package com.avito.android.edit_seller_type;

import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EditSellerTypeFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.edit_seller_type.j, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30321j extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ EditSellerTypeFragment f146761l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f146762m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f146763n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30321j(EditSellerTypeFragment editSellerTypeFragment, com.akita.compose.component.toast_bar.u uVar, InterfaceC22204y1 interfaceC22204y1) {
        super(2);
        this.f146761l = editSellerTypeFragment;
        this.f146762m = uVar;
        this.f146763n = interfaceC22204y1;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(637142699, new C30320i(this.f146761l, this.f146762m, this.f146763n), a13), a13, 48, 1);
        }
        return G0.f406611a;
    }
}
