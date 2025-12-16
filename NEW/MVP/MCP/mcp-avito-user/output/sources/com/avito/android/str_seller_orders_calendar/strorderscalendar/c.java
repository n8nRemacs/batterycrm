package com.avito.android.str_seller_orders_calendar.strorderscalendar;

import Uz0.b;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.C;
import com.avito.android.str_calendar.common.models.UpdatedParametersInfo;
import kotlin.jvm.internal.L;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements C {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f290587b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StrOrdersCalendarFragment f290588c;

    public /* synthetic */ c(StrOrdersCalendarFragment strOrdersCalendarFragment, int i12) {
        this.f290587b = i12;
        this.f290588c = strOrdersCalendarFragment;
    }

    @Override // androidx.fragment.app.C
    public final void k(Bundle bundle, String str) {
        StrOrdersCalendarFragment strOrdersCalendarFragment = this.f290588c;
        switch (this.f290587b) {
            case 0:
                kotlin.reflect.n<Object>[] nVarArr = StrOrdersCalendarFragment.f290490A0;
                String string = bundle.getString("selected_month_id");
                if (string != null) {
                    strOrdersCalendarFragment.r5().accept(new b.j(string));
                    break;
                }
                break;
            default:
                kotlin.reflect.n<Object>[] nVarArr2 = StrOrdersCalendarFragment.f290490A0;
                boolean zF2 = L.f(bundle.containsKey("clearOrdersCalendarSelectionKey") ? Boolean.valueOf(bundle.getBoolean("clearOrdersCalendarSelectionKey")) : null, Boolean.TRUE);
                if (!bundle.containsKey("updatedDateRangeInfoKey")) {
                    if (zF2) {
                        strOrdersCalendarFragment.r5().accept(b.s.f16836a);
                        break;
                    }
                } else {
                    strOrdersCalendarFragment.r5().accept(new b.t((UpdatedParametersInfo) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("updatedDateRangeInfoKey", UpdatedParametersInfo.class) : bundle.getParcelable("updatedDateRangeInfoKey"))));
                    break;
                }
                break;
        }
    }
}
