package com.avito.android.comfortable_deal.date_time_pickers.time;

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
import com.avito.android.comfortable_deal.date_time_pickers.time.model.TimePickerArguments;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.picker.Picker;
import com.avito.android.remote.model.category_parameters.SelectionType;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35966w1;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import org.threeten.bp.g;

/* compiled from: TimePickerDialog.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/date_time_pickers/time/TimePickerDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TimePickerDialog extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: l0, reason: collision with root package name */
    @k
    public static final a f120922l0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    public int f120923h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f120924i0;

    /* renamed from: j0, reason: collision with root package name */
    @k
    public g f120925j0;

    /* renamed from: k0, reason: collision with root package name */
    @k
    public final com.avito.android.comfortable_deal.date_time_pickers.time.d f120926k0;

    /* compiled from: TimePickerDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/date_time_pickers/time/TimePickerDialog$a;", "", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: TimePickerDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.comfortable_deal.date_time_pickers.time.TimePickerDialog$a$a, reason: collision with other inner class name */
        public static final class C3565a extends N implements l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ TimePickerArguments f120927l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3565a(TimePickerArguments timePickerArguments) {
                super(1);
                this.f120927l = timePickerArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("time_picker_arguments", this.f120927l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static TimePickerDialog a(@k TimePickerArguments timePickerArguments) {
            TimePickerDialog timePickerDialog = new TimePickerDialog();
            C35966w1.a(timePickerDialog, -1, new C3565a(timePickerArguments));
            return timePickerDialog;
        }

        public a() {
        }
    }

    /* compiled from: TimePickerDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<View, G0> {
        public b() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.C] */
        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            TimePickerDialog timePickerDialog = TimePickerDialog.this;
            com.avito.android.comfortable_deal.date_time_pickers.time.d dVar = timePickerDialog.f120926k0;
            int i12 = timePickerDialog.f120923h0;
            int i13 = timePickerDialog.f120924i0;
            dVar.f120933c = view2;
            TextView textView = (TextView) view2.findViewById(R.id.picker_title);
            if (textView != null) {
                textView.setText(textView.getContext().getString(R.string.stages_transition_time_picker_label));
            }
            Picker picker = (Picker) view2.findViewById(R.id.picker);
            if (picker != null) {
                ?? r22 = dVar.f120934d;
                Picker.d(picker, (List) r22.getValue(), null, 14);
                picker.a(":");
                ?? r32 = dVar.f120935e;
                Picker.d(picker, (List) r32.getValue(), null, 14);
                picker.setFirstWheelValue((com.avito.android.lib.design.picker.k) ((List) r22.getValue()).get(i12));
                picker.setSecondWheelValue((com.avito.android.lib.design.picker.k) ((List) r32.getValue()).get(i13));
                picker.setOnSelection(new com.avito.android.comfortable_deal.date_time_pickers.time.c(2, dVar, com.avito.android.comfortable_deal.date_time_pickers.time.d.class, "updateTime", "updateTime(Lcom/avito/android/lib/design/picker/WheelData;Lcom/avito/android/lib/design/picker/WheelData;)V", 0));
            }
            Button button = (Button) view2.findViewById(R.id.apply_button);
            if (button != null) {
                button.setOnClickListener(new com.avito.android.autoteka.presentation.reportGeneration.a(dVar, 29));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TimePickerDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            TimePickerDialog timePickerDialog = TimePickerDialog.this;
            FragmentManager parentFragmentManager = timePickerDialog.getParentFragmentManager();
            TimePickerArguments timePickerArguments = (TimePickerArguments) timePickerDialog.requireArguments().getParcelable("time_picker_arguments");
            Bundle bundle = new Bundle();
            bundle.putSerializable("result.key", timePickerDialog.f120925j0);
            G0 g02 = G0.f406611a;
            parentFragmentManager.o0(bundle, timePickerArguments.f120938b);
            timePickerDialog.dismiss();
            return G0.f406611a;
        }
    }

    /* compiled from: TimePickerDialog.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", SelectionType.TYPE_HOUR, SelectionType.TYPE_MINUTE, "Lkotlin/G0;", "invoke", "(II)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements p<Integer, Integer, G0> {
        public d() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(Integer num, Integer num2) {
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            TimePickerDialog timePickerDialog = TimePickerDialog.this;
            timePickerDialog.f120923h0 = iIntValue;
            timePickerDialog.f120924i0 = iIntValue2;
            timePickerDialog.f120925j0 = g.u(iIntValue, iIntValue2);
            return G0.f406611a;
        }
    }

    public TimePickerDialog() {
        super(0, 1, null);
        this.f120925j0 = g.t();
        this.f120926k0 = new com.avito.android.comfortable_deal.date_time_pickers.time.d(new c(), new d());
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        g gVar = ((TimePickerArguments) requireArguments().getParcelable("time_picker_arguments")).f120939c;
        if (gVar == null) {
            gVar = this.f120925j0;
        }
        this.f120925j0 = gVar;
        this.f120923h0 = gVar.f422072b;
        this.f120924i0 = gVar.f422073c;
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, null);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        dVar.C(R.layout.stages_transition_date_time_picker, new b());
        dVar.show();
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@k DialogInterface dialogInterface) {
        this.f120926k0.getClass();
        super.onDismiss(dialogInterface);
    }
}
