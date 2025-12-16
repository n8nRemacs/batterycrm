package com.avito.android.comfortable_deal.date_time_pickers.date;

import Y41.l;
import Y41.p;
import Y61.k;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.FragmentManager;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.comfortable_deal.date_time_pickers.date.model.DatePickerArguments;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.picker.Picker;
import com.avito.android.remote.model.category_parameters.SelectionType;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35966w1;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.e;

/* compiled from: DatePickerDialog.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/date_time_pickers/date/DatePickerDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DatePickerDialog extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: l0, reason: collision with root package name */
    @k
    public static final a f120906l0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    public int f120907h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f120908i0;

    /* renamed from: j0, reason: collision with root package name */
    @k
    public e f120909j0;

    /* renamed from: k0, reason: collision with root package name */
    @k
    public final com.avito.android.comfortable_deal.date_time_pickers.date.d f120910k0;

    /* compiled from: DatePickerDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/date_time_pickers/date/DatePickerDialog$a;", "", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: DatePickerDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.comfortable_deal.date_time_pickers.date.DatePickerDialog$a$a, reason: collision with other inner class name */
        public static final class C3564a extends N implements l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ DatePickerArguments f120911l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3564a(DatePickerArguments datePickerArguments) {
                super(1);
                this.f120911l = datePickerArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("date_picker_arguments", this.f120911l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static DatePickerDialog a(@k DatePickerArguments datePickerArguments) {
            DatePickerDialog datePickerDialog = new DatePickerDialog();
            C35966w1.a(datePickerDialog, -1, new C3564a(datePickerArguments));
            return datePickerDialog;
        }

        public a() {
        }
    }

    /* compiled from: DatePickerDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            DatePickerDialog datePickerDialog = DatePickerDialog.this;
            FragmentManager parentFragmentManager = datePickerDialog.getParentFragmentManager();
            DatePickerArguments datePickerArguments = (DatePickerArguments) datePickerDialog.requireArguments().getParcelable("date_picker_arguments");
            Bundle bundle = new Bundle();
            bundle.putSerializable("result.key", datePickerDialog.f120909j0);
            G0 g02 = G0.f406611a;
            parentFragmentManager.o0(bundle, datePickerArguments.f120920b);
            datePickerDialog.dismiss();
            return G0.f406611a;
        }
    }

    /* compiled from: DatePickerDialog.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", SelectionType.TYPE_DAY, "", SelectionType.TYPE_MONTH, "invoke", "(II)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements p<Integer, Integer, Boolean> {
        public c() {
            super(2);
        }

        @Override // Y41.p
        public final Boolean invoke(Integer num, Integer num2) {
            boolean z12;
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            DatePickerDialog datePickerDialog = DatePickerDialog.this;
            datePickerDialog.f120907h0 = iIntValue;
            datePickerDialog.f120908i0 = iIntValue2;
            try {
                e eVarL = e.L();
                int i12 = eVarL.f421941b;
                e eVarN = e.N(i12, datePickerDialog.f120908i0, datePickerDialog.f120907h0);
                z12 = true;
                if (eVarN.compareTo(eVarL) < 0) {
                    eVarN = e.N(i12 + 1, datePickerDialog.f120908i0, datePickerDialog.f120907h0);
                }
                datePickerDialog.f120909j0 = eVarN;
            } catch (DateTimeException unused) {
                z12 = false;
            }
            return Boolean.valueOf(z12);
        }
    }

    /* compiled from: DatePickerDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements l<View, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            DatePickerDialog datePickerDialog = DatePickerDialog.this;
            com.avito.android.comfortable_deal.date_time_pickers.date.d dVar = datePickerDialog.f120910k0;
            int i12 = datePickerDialog.f120907h0;
            int i13 = datePickerDialog.f120908i0;
            dVar.f120917c = view2;
            TextView textView = (TextView) view2.findViewById(R.id.picker_title);
            if (textView != null) {
                textView.setText(textView.getContext().getString(R.string.stages_transition_date_picker_label));
            }
            Picker picker = (Picker) view2.findViewById(R.id.picker);
            if (picker != null) {
                ArrayList arrayList = dVar.f120918d;
                Picker.d(picker, arrayList, null, 14);
                ArrayList arrayList2 = dVar.f120919e;
                Picker.d(picker, arrayList2, null, 14);
                picker.setFirstWheelValue((com.avito.android.lib.design.picker.k) arrayList.get(i12 - 1));
                picker.setSecondWheelValue((com.avito.android.lib.design.picker.k) arrayList2.get(i13 - 1));
                picker.setOnSelection(new com.avito.android.comfortable_deal.date_time_pickers.date.c(2, dVar, com.avito.android.comfortable_deal.date_time_pickers.date.d.class, "updateDate", "updateDate(Lcom/avito/android/lib/design/picker/WheelData;Lcom/avito/android/lib/design/picker/WheelData;)V", 0));
            }
            Button button = (Button) view2.findViewById(R.id.apply_button);
            if (button != null) {
                button.setOnClickListener(new com.avito.android.autoteka.presentation.reportGeneration.a(dVar, 28));
            }
            return G0.f406611a;
        }
    }

    public DatePickerDialog() {
        super(0, 1, null);
        this.f120909j0 = e.L();
        this.f120910k0 = new com.avito.android.comfortable_deal.date_time_pickers.date.d(new b(), new c());
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        e eVar = ((DatePickerArguments) requireArguments().getParcelable("date_picker_arguments")).f120921c;
        if (eVar == null) {
            eVar = this.f120909j0;
        }
        this.f120909j0 = eVar;
        this.f120907h0 = eVar.f421943d;
        this.f120908i0 = eVar.f421942c;
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, null);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        dVar.C(R.layout.stages_transition_date_time_picker, new d());
        dVar.show();
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@k DialogInterface dialogInterface) {
        this.f120910k0.f120917c = null;
        super.onDismiss(dialogInterface);
    }
}
