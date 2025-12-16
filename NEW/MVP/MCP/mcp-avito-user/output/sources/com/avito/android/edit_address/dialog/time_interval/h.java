package com.avito.android.edit_address.dialog.time_interval;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.picker.Picker;
import com.avito.android.lib.design.toggle.Checkbox;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import e11.ViewOnClickListenerC39879j1;
import iy.DialogC42133a;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TimeIntervalPickerView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_address/dialog/time_interval/h;", "Lcom/avito/android/edit_address/dialog/time_interval/e;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.bottom_sheet.d f145883a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f145884b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Input f145885c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Input f145886d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f145887e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f145888f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Checkbox f145889g;

    /* compiled from: TimeIntervalPickerView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "picked", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f145890l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super Integer, G0> lVar) {
            super(1);
            this.f145890l = (N) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final G0 invoke(Integer num) {
            this.f145890l.invoke(Integer.valueOf(num.intValue()));
            return G0.f406611a;
        }
    }

    public h(@k View view, @k com.avito.android.lib.design.bottom_sheet.d dVar, boolean z12, @k final b bVar) {
        this.f145883a = dVar;
        this.f145884b = view.getContext();
        View viewFindViewById = view.findViewById(R.id.ext_profile_period_picker_start);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById;
        final int i12 = 0;
        input.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.edit_address.dialog.time_interval.f
            /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
            
                if (r5.f145877l == false) goto L38;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x0069, code lost:
            
                if (r5.f145877l != false) goto L39;
             */
            /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
            /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onClick(android.view.View r5) {
                /*
                    Method dump skipped, instructions count: 268
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.edit_address.dialog.time_interval.f.onClick(android.view.View):void");
            }
        });
        this.f145885c = input;
        View viewFindViewById2 = view.findViewById(R.id.ext_profile_period_picker_end);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input2 = (Input) viewFindViewById2;
        final int i13 = 1;
        input2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.edit_address.dialog.time_interval.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View v12) {
                /*
                    Method dump skipped, instructions count: 268
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.edit_address.dialog.time_interval.f.onClick(android.view.View):void");
            }
        });
        this.f145886d = input2;
        View viewFindViewById3 = view.findViewById(R.id.ext_profile_period_picker_error);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById3;
        this.f145887e = textView;
        View viewFindViewById4 = view.findViewById(R.id.ext_profile_period_picker_title);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f145888f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.ext_profile_period_picker_checkbox);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.toggle.Checkbox");
        }
        Checkbox checkbox = (Checkbox) viewFindViewById5;
        checkbox.setOnStateChangedListener(new g(bVar));
        this.f145889g = checkbox;
        View viewFindViewById6 = view.findViewById(R.id.ext_profile_period_picker_checkbox_label);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView2 = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.ext_profile_period_picker_save_button);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        final int i14 = 2;
        ((Button) viewFindViewById7).setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.edit_address.dialog.time_interval.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View v12) {
                /*
                    Method dump skipped, instructions count: 268
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.edit_address.dialog.time_interval.f.onClick(android.view.View):void");
            }
        });
        View viewFindViewById8 = view.findViewById(R.id.ext_profile_period_picker_reset_link);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        final int i15 = 3;
        ((TextView) viewFindViewById8).setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.edit_address.dialog.time_interval.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View v12) {
                /*
                    Method dump skipped, instructions count: 268
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.edit_address.dialog.time_interval.f.onClick(android.view.View):void");
            }
        });
        View viewFindViewById9 = view.findViewById(R.id.ext_profile_period_picker_close_icon);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        final int i16 = 4;
        viewFindViewById9.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.edit_address.dialog.time_interval.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View v12) {
                /*
                    Method dump skipped, instructions count: 268
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.edit_address.dialog.time_interval.f.onClick(android.view.View):void");
            }
        });
        D6.G(checkbox, z12);
        D6.G(textView2, z12);
        D6.w(textView);
    }

    public final void a(@k String str, @Y61.l Integer num, @k l<? super Integer, G0> lVar) {
        a aVar = new a(lVar);
        DialogC42133a dialogC42133a = new DialogC42133a(this.f145884b, 0, 2, null);
        dialogC42133a.D(R.layout.ext_profile_address_edit_time_picker_dialog, true);
        com.avito.android.lib.design.bottom_sheet.d.I(dialogC42133a, true);
        com.avito.android.lib.design.bottom_sheet.d.M(dialogC42133a, null, false, true, 7);
        I5.a((TextView) dialogC42133a.findViewById(R.id.ext_profile_time_picker_title), str, false);
        Picker picker = (Picker) dialogC42133a.findViewById(R.id.ext_profile_time_picker);
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < 24; i12++) {
            arrayList.add(new com.avito.android.lib.design.picker.k(Integer.valueOf(i12), String.valueOf(i12)));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i13 = 0; i13 < 60; i13++) {
            arrayList2.add(new com.avito.android.lib.design.picker.k(Integer.valueOf(i13), String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i13)}, 1))));
        }
        Picker.d(picker, arrayList, null, 14);
        picker.a(":");
        Picker.d(picker, arrayList2, null, 14);
        int iIntValue = num != null ? num.intValue() : 0;
        picker.setFirstWheelValue((com.avito.android.lib.design.picker.k) arrayList.get(iIntValue / 60));
        picker.setSecondWheelValue((com.avito.android.lib.design.picker.k) arrayList2.get(iIntValue % 60));
        ((Button) dialogC42133a.findViewById(R.id.ext_profile_time_picker_button)).setOnClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.g(picker, (l) aVar, (com.avito.android.lib.design.bottom_sheet.d) dialogC42133a, 26));
        dialogC42133a.findViewById(R.id.ext_profile_time_picker_close_icon).setOnClickListener(new ViewOnClickListenerC39879j1(dialogC42133a, 11));
        com.avito.android.lib.util.g.a(dialogC42133a);
    }

    public final void b(@k String str) {
        Input.t(this.f145886d, str, false, 6);
    }

    public final void c(@Y61.l String str, boolean z12, boolean z13) {
        int[] iArr;
        if (z12) {
            Input.f179303W.getClass();
            iArr = Input.f179305b0;
        } else {
            Input.f179303W.getClass();
            iArr = Input.f179304a0;
        }
        this.f145885c.setState(iArr);
        Input.f179303W.getClass();
        this.f145886d.setState(z13 ? Input.f179305b0 : Input.f179304a0);
        I5.a(this.f145887e, str, false);
    }

    public final void d(@k String str) {
        Input.t(this.f145885c, str, false, 6);
    }
}
