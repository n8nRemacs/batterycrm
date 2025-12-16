package com.avito.android.user_address.map;

import Y41.l;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UserAddressMapFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class a extends N implements l<View, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f307512l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ UserAddressMapFragment f307513m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.avito.android.lib.design.bottom_sheet.d dVar, UserAddressMapFragment userAddressMapFragment) {
        super(1);
        this.f307512l = dVar;
        this.f307513m = userAddressMapFragment;
    }

    @Override // Y41.l
    public final G0 invoke(View view) {
        View view2 = view;
        Button button = (Button) view2.findViewById(R.id.delete_button);
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f307512l;
        button.setOnClickListener(new com.avito.android.tariff.cpx.configure.levels.d(12, dVar, this.f307513m));
        ((Button) view2.findViewById(R.id.cancel_dialog_button)).setOnClickListener(new S7.a(dVar, 18));
        return G0.f406611a;
    }
}
