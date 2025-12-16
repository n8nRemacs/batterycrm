package com.avito.android.str_insurance.screen;

import Zy0.InterfaceC19622a;
import android.content.Context;
import com.avito.android.R;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: StrInsuranceFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_insurance/screen/a;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ StrInsuranceFragment f288648E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(StrInsuranceFragment strInsuranceFragment, Context context) {
        super(context, R.style.Re23_BottomSheet_Default);
        this.f288648E = strInsuranceFragment;
    }

    @Override // androidx.view.r, android.app.Dialog
    @InterfaceC42830m
    public final void onBackPressed() {
        super.onBackPressed();
        StrInsuranceFragment.f5(this.f288648E).accept(InterfaceC19622a.C1473a.f20594a);
    }
}
