package com.avito.android.trx_promo_impl.date_picker;

import Y41.l;
import Y61.k;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.picker.Picker;
import com.avito.android.lib.design.picker.k;
import com.avito.android.lib.design.picker.m;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.tariff_lf.edit_info.item.button.i;
import com.avito.android.trx_promo_impl.data.local.TrxPromoDateValidator;
import com.avito.android.ui.fragments.BaseDialogFragment;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TrxPromoDatePickerFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/trx_promo_impl/date_picker/TrxPromoDatePickerFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TrxPromoDatePickerFragment extends BaseDialogFragment implements InterfaceC28477j.a {

    /* renamed from: m0, reason: collision with root package name */
    @k
    public static final a f303944m0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    public Picker f303945h0;

    /* renamed from: i0, reason: collision with root package name */
    public Button f303946i0;

    /* renamed from: j0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f303947j0;

    /* renamed from: k0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f303948k0;

    /* renamed from: l0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f303949l0;

    /* compiled from: TrxPromoDatePickerFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/trx_promo_impl/date_picker/TrxPromoDatePickerFragment$a;", "", "<init>", "()V", "", "EXTRA_BUTTON_TITLE", "Ljava/lang/String;", "EXTRA_PREDEFINED_SELECTED_DATE", "EXTRA_SCREEN_TITLE", "EXTRA_SELECTED_DATE", "EXTRA_START_DATE", "EXTRA_VALIDATORS", "REQUEST_KEY", "", "YEARS_TO_ADD", "J", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TrxPromoDatePickerFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            TrxPromoDatePickerFragment trxPromoDatePickerFragment = (TrxPromoDatePickerFragment) this.receiver;
            a aVar = TrxPromoDatePickerFragment.f303944m0;
            trxPromoDatePickerFragment.getClass();
            trxPromoDatePickerFragment.f303945h0 = (Picker) view2.findViewById(R.id.trx_promo_date_picker_picker);
            trxPromoDatePickerFragment.f303946i0 = (Button) view2.findViewById(R.id.trx_promo_date_picker_button);
            Picker picker = trxPromoDatePickerFragment.f303945h0;
            if (picker == null) {
                picker = null;
            }
            com.avito.android.lib.design.picker.k.f180042c.getClass();
            Picker.d(picker, k.a.b(), null, 14);
            ArrayList<com.avito.android.lib.design.picker.k<?>> arrayList = com.avito.android.lib.design.picker.k.f180044e;
            Picker.d(picker, arrayList, null, 14);
            InterfaceC42726C interfaceC42726C = trxPromoDatePickerFragment.f303947j0;
            Picker.d(picker, k.a.d(((LocalDate) interfaceC42726C.getValue()).getYear(), ((LocalDate) interfaceC42726C.getValue()).plusYears(10L).getYear()), new m(null, false, 0, 5, null), 12);
            ArrayList arrayListB = k.a.b();
            InterfaceC42726C interfaceC42726C2 = trxPromoDatePickerFragment.f303948k0;
            picker.setFirstWheelValue((com.avito.android.lib.design.picker.k) arrayListB.get(((LocalDate) interfaceC42726C2.getValue()).getDayOfMonth() - 1));
            picker.setSecondWheelValue(arrayList.get(((LocalDate) interfaceC42726C2.getValue()).getMonth().getValue() - 1));
            picker.setThirdWheelValue(new com.avito.android.lib.design.picker.k<>(Integer.valueOf(((LocalDate) interfaceC42726C2.getValue()).getYear()), String.valueOf(((LocalDate) interfaceC42726C2.getValue()).getYear())));
            Button button = trxPromoDatePickerFragment.f303946i0;
            Button button2 = button != null ? button : null;
            String string = trxPromoDatePickerFragment.requireArguments().getString("trx_promo_button_title");
            if (string != null) {
                button2.setText(string);
            } else {
                button2.setText(R.string.continue_string);
            }
            button2.setOnClickListener(new i(trxPromoDatePickerFragment, 16));
            return G0.f406611a;
        }
    }

    /* compiled from: TrxPromoDatePickerFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/time/LocalDate;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<LocalDate> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final LocalDate invoke() {
            Bundle arguments = TrxPromoDatePickerFragment.this.getArguments();
            if (arguments != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable = arguments.getSerializable("trx_promo_predefined_selected_date", LocalDate.class);
                } else {
                    Serializable serializable = arguments.getSerializable("trx_promo_predefined_selected_date");
                    serializable = (LocalDate) (serializable instanceof LocalDate ? serializable : null);
                }
            }
            LocalDate localDate = (LocalDate) serializable;
            return localDate == null ? LocalDate.now() : localDate;
        }
    }

    /* compiled from: TrxPromoDatePickerFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/time/LocalDate;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<LocalDate> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final LocalDate invoke() {
            Bundle arguments = TrxPromoDatePickerFragment.this.getArguments();
            if (arguments != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable = arguments.getSerializable("trx_promo_start_date", LocalDate.class);
                } else {
                    Serializable serializable = arguments.getSerializable("trx_promo_start_date");
                    serializable = (LocalDate) (serializable instanceof LocalDate ? serializable : null);
                }
            }
            LocalDate localDate = (LocalDate) serializable;
            return localDate == null ? LocalDate.now() : localDate;
        }
    }

    /* compiled from: TrxPromoDatePickerFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/trx_promo_impl/data/local/TrxPromoDateValidator;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<List<? extends TrxPromoDateValidator>> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final List<? extends TrxPromoDateValidator> invoke() {
            List<? extends TrxPromoDateValidator> listG0;
            Bundle arguments = TrxPromoDatePickerFragment.this.getArguments();
            Parcelable[] parcelableArr = null;
            if (arguments != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableArr = (Parcelable[]) arguments.getParcelableArray("trx_promo_validators", TrxPromoDateValidator.class);
                } else {
                    Parcelable[] parcelableArray = arguments.getParcelableArray("trx_promo_validators");
                    if (parcelableArray != null) {
                        parcelableArr = parcelableArray;
                    }
                }
            }
            TrxPromoDateValidator[] trxPromoDateValidatorArr = (TrxPromoDateValidator[]) parcelableArr;
            return (trxPromoDateValidatorArr == null || (listG0 = C42756l.g0(trxPromoDateValidatorArr)) == null) ? C42784z0.f406748b : listG0;
        }
    }

    public TrxPromoDatePickerFragment() {
        super(0, 1, null);
        this.f303947j0 = C42727D.c(new d());
        this.f303948k0 = C42727D.c(new c());
        this.f303949l0 = C42727D.c(new e());
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23)), 0, 2, null);
        dVar.E(R.layout.trx_promo_date_picker_fragment, true, new b(1, this, TrxPromoDatePickerFragment.class, "setupViews", "setupViews(Landroid/view/View;)V", 0));
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, requireArguments().getString("trx_promo_screen_title"), true, true, 2);
        return dVar;
    }
}
