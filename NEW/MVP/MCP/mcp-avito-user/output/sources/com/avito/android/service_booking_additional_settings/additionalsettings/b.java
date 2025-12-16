package com.avito.android.service_booking_additional_settings.additionalsettings;

import Ls0.AbstractC14436a;
import Os0.InterfaceC14732a;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.select.bottom_sheet.result.SelectBottomSheetResult;
import com.avito.android.service_booking_additional_settings.additionalsettings.ServiceBookingAdditionalSettingsFragment;
import com.avito.android.util.V2;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingAdditionalSettingsFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class b extends N implements Y41.p<String, Bundle, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ServiceBookingAdditionalSettingsFragment f274833l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ServiceBookingAdditionalSettingsFragment serviceBookingAdditionalSettingsFragment) {
        super(2);
        this.f274833l = serviceBookingAdditionalSettingsFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.p
    public final G0 invoke(String str, Bundle bundle) {
        Bundle bundle2 = bundle;
        SelectBottomSheetResult selectBottomSheetResult = (SelectBottomSheetResult) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle2.getParcelable("REQUEST_ITEM_SELECTION_DATA", SelectBottomSheetResult.class) : bundle2.getParcelable("REQUEST_ITEM_SELECTION_DATA"));
        boolean z12 = selectBottomSheetResult instanceof SelectBottomSheetResult.Select;
        ServiceBookingAdditionalSettingsFragment serviceBookingAdditionalSettingsFragment = this.f274833l;
        if (z12) {
            SelectBottomSheetResult.Select select = (SelectBottomSheetResult.Select) selectBottomSheetResult;
            String str2 = select.f265326b;
            boolean zF2 = L.f(str2, "TIME_GAP_SELECTION_REQUEST_ID");
            List<ParcelableEntity<String>> list = select.f265327c;
            if (zF2) {
                ServiceBookingAdditionalSettingsFragment.a aVar = ServiceBookingAdditionalSettingsFragment.f274816u0;
                t tVarQ5 = serviceBookingAdditionalSettingsFragment.q5();
                ParcelableEntity parcelableEntity = (ParcelableEntity) C42745f0.G(list);
                tVarQ5.accept(new InterfaceC14732a.f(parcelableEntity != null ? (String) parcelableEntity.getId() : null));
            } else if (L.f(str2, "TECH_BREAK_SELECTION_REQUEST_ID")) {
                ServiceBookingAdditionalSettingsFragment.a aVar2 = ServiceBookingAdditionalSettingsFragment.f274816u0;
                t tVarQ52 = serviceBookingAdditionalSettingsFragment.q5();
                ParcelableEntity parcelableEntity2 = (ParcelableEntity) C42745f0.G(list);
                tVarQ52.accept(new InterfaceC14732a.e(parcelableEntity2 != null ? (String) parcelableEntity2.getId() : null));
            } else {
                V2.f318762a.e("Result with unknown requestId=" + select.f265326b + '.', null);
            }
        } else if (selectBottomSheetResult instanceof SelectBottomSheetResult.Cancel) {
            SelectBottomSheetResult.Cancel cancel = (SelectBottomSheetResult.Cancel) selectBottomSheetResult;
            if (L.f(cancel.f265324b, "TECH_BREAK_SELECTION_REQUEST_ID")) {
                com.avito.android.deeplink_handler.handler.composite.a aVar3 = serviceBookingAdditionalSettingsFragment.f274823t0;
                if (aVar3 == null) {
                    aVar3 = null;
                }
                Ls0.c cVar = serviceBookingAdditionalSettingsFragment.f274818o0;
                if (cVar == null) {
                    cVar = null;
                }
                b.a.a(aVar3, cVar.a(AbstractC14436a.C0635a.f10163b), null, null, 6);
            } else {
                V2.f318762a.e("Result with requestId=" + cancel.f265324b + " for Cancel result could not be processed.", null);
            }
        }
        return G0.f406611a;
    }
}
