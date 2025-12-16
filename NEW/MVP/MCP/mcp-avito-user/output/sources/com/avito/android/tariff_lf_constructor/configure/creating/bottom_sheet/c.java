package com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet;

import android.content.DialogInterface;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ConstructorTariffBottomSheetActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class c extends N implements Y41.l<DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ConstructorTariffBottomSheetActivity f299560l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ConstructorTariffBottomSheetActivity constructorTariffBottomSheetActivity) {
        super(1);
        this.f299560l = constructorTariffBottomSheetActivity;
    }

    @Override // Y41.l
    public final G0 invoke(DialogInterface dialogInterface) {
        BottomSheetBehavior<?> bottomSheetBehavior = this.f299560l.f299553p;
        if ((bottomSheetBehavior == null ? null : bottomSheetBehavior).f355975L == 4) {
            if (bottomSheetBehavior == null) {
                bottomSheetBehavior = null;
            }
            bottomSheetBehavior.b(3);
        }
        return G0.f406611a;
    }
}
