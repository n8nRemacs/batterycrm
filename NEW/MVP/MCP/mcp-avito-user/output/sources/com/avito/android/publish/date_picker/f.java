package com.avito.android.publish.date_picker;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.lib.design.bottom_sheet.j;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.picker.Picker;
import com.avito.android.lib.design.picker.k;
import com.avito.android.lib.design.picker.m;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: DayMonthYearDatePicker.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/date_picker/f;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ int f232498I = 0;

    /* renamed from: E, reason: collision with root package name */
    @k
    public final ParameterElement.C29377e f232499E;

    /* renamed from: F, reason: collision with root package name */
    @k
    public final l<Long, G0> f232500F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.l
    public Picker f232501G;

    /* renamed from: H, reason: collision with root package name */
    @k
    public final GregorianCalendar f232502H;

    /* compiled from: DayMonthYearDatePicker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            f fVar = (f) this.receiver;
            int i12 = f.f232498I;
            fVar.getClass();
            Picker picker = (Picker) view.findViewById(R.id.date_picker);
            fVar.f232501G = picker;
            ParameterElement.C29377e c29377e = fVar.f232499E;
            if (picker != null) {
                com.avito.android.lib.design.picker.k.f180042c.getClass();
                Picker.d(picker, k.a.b(), null, 14);
                Picker.d(picker, com.avito.android.lib.design.picker.k.f180044e, null, 14);
                long j12 = c29377e.f117409f;
                GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getDefault());
                gregorianCalendar.setTimeInMillis(j12);
                int i13 = gregorianCalendar.get(1);
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(TimeZone.getDefault());
                gregorianCalendar2.setTimeInMillis(c29377e.f117410g);
                Picker.d(picker, k.a.d(i13, gregorianCalendar2.get(1)), new m(null, false, 0, 5, null), 12);
            }
            Long l12 = c29377e.f117408e;
            GregorianCalendar gregorianCalendar3 = fVar.f232502H;
            if (l12 != null) {
                gregorianCalendar3.setTimeInMillis(l12.longValue());
            }
            int i14 = gregorianCalendar3.get(1);
            Picker picker2 = fVar.f232501G;
            if (picker2 != null) {
                com.avito.android.lib.design.picker.k.f180042c.getClass();
                picker2.setFirstWheelValue((com.avito.android.lib.design.picker.k) k.a.b().get(gregorianCalendar3.get(5) - 1));
                picker2.setSecondWheelValue(com.avito.android.lib.design.picker.k.f180044e.get(gregorianCalendar3.get(2)));
                picker2.setThirdWheelValue(new com.avito.android.lib.design.picker.k<>(Integer.valueOf(i14), String.valueOf(i14)));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DayMonthYearDatePicker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            f fVar = (f) this.receiver;
            int i12 = f.f232498I;
            fVar.getClass();
            Button button = (Button) view.findViewById(R.id.main_button);
            button.setText(button.getContext().getResources().getString(R.string.button_ready));
            button.setOnClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.a(fVar, 10));
            return G0.f406611a;
        }
    }

    public /* synthetic */ f(Context context, ParameterElement.C29377e c29377e, l lVar, boolean z12, int i12, C42822w c42822w) {
        this(context, c29377e, lVar, (i12 & 8) != 0 ? false : z12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@Y61.k Context context, @Y61.k ParameterElement.C29377e c29377e, @Y61.k l<? super Long, G0> lVar, boolean z12) {
        super(context, 0, 2, null);
        this.f232499E = c29377e;
        this.f232500F = lVar;
        this.f232502H = new GregorianCalendar(TimeZone.getDefault());
        B(z12 ? R.layout.date_picker_dialog_re23 : R.layout.date_picker_dialog, R.layout.bottom_sheet_button, new a(1, this, f.class, "setContent", "setContent(Landroid/view/View;)V", 0), new b(1, this, f.class, "setFooter", "setFooter(Landroid/view/View;)V", 0), false);
        if (z12) {
            j.c(this, c29377e.f117407d, false, 0, 0, 0, 60);
        } else {
            j.c(this, c29377e.f117407d, false, 0, 0, 0, WebSocketProtocol.PAYLOAD_SHORT);
        }
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
        setCancelable(true);
        T();
        setCanceledOnTouchOutside(true);
    }
}
