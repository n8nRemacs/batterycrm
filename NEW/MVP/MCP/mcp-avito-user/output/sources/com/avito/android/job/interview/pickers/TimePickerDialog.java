package com.avito.android.job.interview.pickers;

import Y41.l;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.avito.android.lib.design.picker.Picker;
import com.avito.android.lib.design.picker.k;
import com.avito.android.lib.design.picker.m;
import com.avito.android.util.D6;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import vQ.InterfaceC49249a;

/* compiled from: TimePickerDialog.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/job/interview/pickers/TimePickerDialog;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "Mode", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TimePickerDialog extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ int f174636M = 0;

    /* renamed from: E, reason: collision with root package name */
    public final int f174637E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final l<InterfaceC49249a.j, G0> f174638F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public Mode f174639G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final String f174640H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final Object f174641I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final Object f174642J;

    /* renamed from: K, reason: collision with root package name */
    public final Calendar f174643K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final Button f174644L;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TimePickerDialog.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/interview/pickers/TimePickerDialog$Mode;", "", "_avito_job_interview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Mode {

        /* renamed from: b, reason: collision with root package name */
        public static final Mode f174645b;

        /* renamed from: c, reason: collision with root package name */
        public static final Mode f174646c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Mode[] f174647d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f174648e;

        static {
            Mode mode = new Mode("INTERVAL", 0);
            f174645b = mode;
            Mode mode2 = new Mode("SPECIFIC", 1);
            f174646c = mode2;
            Mode[] modeArr = {mode, mode2};
            f174647d = modeArr;
            f174648e = kotlin.enums.c.a(modeArr);
        }

        public Mode() {
            throw null;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) f174647d.clone();
        }
    }

    /* compiled from: TimePickerDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Mode mode = Mode.f174645b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public TimePickerDialog() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerDialog(Context context, int i12, l lVar, Mode mode, int i13, C42822w c42822w) {
        super(context, 0, 2, null);
        mode = (i13 & 8) != 0 ? Mode.f174645b : mode;
        this.f174637E = i12;
        this.f174638F = lVar;
        this.f174639G = mode;
        this.f174640H = context.getString(R.string.interview_invitation_picker_apply);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f174641I = C42727D.b(lazyThreadSafetyMode, new h(this));
        this.f174642J = C42727D.b(lazyThreadSafetyMode, new i(this));
        this.f174643K = Calendar.getInstance();
        D(R.layout.interview_invitation_time_picker, true);
        com.avito.android.lib.design.bottom_sheet.j.c(this, context.getString(R.string.interview_invitation_time_picker_title), true, 0, 0, 0, 120);
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.time_picker_container);
        ListItemSwitcher listItemSwitcher = (ListItemSwitcher) findViewById(R.id.mode_switcher);
        listItemSwitcher.setTitle(context.getString(R.string.interview_invitation_time_picker_switcher));
        listItemSwitcher.setOnClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.h(3, viewGroup, this));
        X(viewGroup);
        this.f174644L = (Button) findViewById(R.id.apply);
    }

    public static final ArrayList V(TimePickerDialog timePickerDialog, int i12) {
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        while (i13 < i12) {
            arrayList.add(new com.avito.android.lib.design.picker.k(Integer.valueOf(i13), i13 < 10 ? AK.c.g(i13, "0") : String.valueOf(i13)));
            i13++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void W(TimePickerDialog timePickerDialog, Picker picker, com.avito.android.lib.design.picker.k kVar, com.avito.android.lib.design.picker.k kVar2) {
        timePickerDialog.getClass();
        if (kVar == null || kVar2 == null) {
            return;
        }
        com.avito.android.lib.design.picker.k.f180042c.getClass();
        int iIntValue = ((Integer) kVar.f180046a).intValue();
        int iIntValue2 = ((Integer) kVar2.f180046a).intValue();
        Button button = timePickerDialog.f174644L;
        if (iIntValue < iIntValue2) {
            D6.k(button);
            button.setText(timePickerDialog.f174640H);
        } else {
            D6.h(button);
            button.setText(picker.getContext().getString(R.string.interview_invitation_picker_select_valid_interval));
        }
    }

    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, kotlin.C] */
    public final void X(ViewGroup viewGroup) {
        Picker picker;
        int iOrdinal = this.f174639G.ordinal();
        Calendar calendar = this.f174643K;
        if (iOrdinal == 0) {
            picker = new Picker(getContext(), null, 0, 0, 14, null);
            com.avito.android.lib.design.picker.k.f180042c.getClass();
            Picker.d(picker, k.a.c(), null, 14);
            com.avito.android.lib.design.picker.l lVar = new com.avito.android.lib.design.picker.l(picker.getContext(), null, R.drawable.design_interval_divider, 2, null);
            lVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
            picker.f179979c.addView(lVar);
            Picker.d(picker, k.a.c(), new m(null, false, 0, 7, null), 12);
            int i12 = calendar.get(11);
            com.avito.android.lib.design.picker.k<?> kVar = (com.avito.android.lib.design.picker.k) k.a.c().get(i12 == 0 ? 0 : (i12 * 2) - 1);
            com.avito.android.lib.design.picker.k<?> kVar2 = (com.avito.android.lib.design.picker.k) k.a.c().get(i12 == 0 ? 1 : i12 * 2);
            picker.setFirstWheelValue(kVar);
            picker.setSecondWheelValue(kVar2);
            picker.setOnSelection(new d(this, picker, kVar, kVar2));
            e eVar = new e(this);
            picker.setOnScrollStartedCallback(eVar);
            picker.setOnSecondScrollStartedCallback(eVar);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            picker = new Picker(getContext(), null, 0, 0, 14, null);
            ?? r62 = this.f174641I;
            Picker.d(picker, (List) r62.getValue(), null, 14);
            picker.a(":");
            ?? r72 = this.f174642J;
            Picker.d(picker, (List) r72.getValue(), null, 14);
            picker.setFirstWheelValue((com.avito.android.lib.design.picker.k) ((List) r62.getValue()).get(calendar.get(11)));
            picker.setSecondWheelValue((com.avito.android.lib.design.picker.k) C42745f0.E((List) r72.getValue()));
            Button button = this.f174644L;
            D6.k(button);
            button.setText(this.f174640H);
            g gVar = new g(this);
            picker.setOnScrollStartedCallback(gVar);
            picker.setOnSecondScrollStartedCallback(gVar);
            picker.setOnSelection(new f(this));
        }
        picker.setTag("picker_view");
        viewGroup.addView(picker, viewGroup.indexOfChild(findViewById(R.id.mode_switcher)) + 1);
        ((Button) findViewById(R.id.apply)).setOnClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.h(4, this, picker));
    }
}
