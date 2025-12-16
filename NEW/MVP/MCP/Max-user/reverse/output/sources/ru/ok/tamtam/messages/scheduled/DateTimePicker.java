package ru.ok.tamtam.messages.scheduled;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.bg4;
import defpackage.bq4;
import defpackage.bwf;
import defpackage.e91;
import defpackage.i00;
import defpackage.n4f;
import defpackage.nca;
import defpackage.o1d;
import defpackage.q1g;
import defpackage.t0d;
import defpackage.tf4;
import defpackage.u1g;
import defpackage.v8g;
import defpackage.vvc;
import defpackage.wkb;
import defpackage.yf4;
import kotlin.Metadata;
import ru.ok.tamtam.messages.scheduled.DateTimePicker;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ok/tamtam/messages/scheduled/DateTimePicker;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lu1g;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ltf4;", "listener", "Lqqg;", "setListener$scheduled_send_picker_dialog_release", "(Ltf4;)V", "setListener", "scheduled-send-picker-dialog_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DateTimePicker extends ConstraintLayout implements u1g {
    public final RecyclerView F0;
    public final RecyclerView G0;
    public final RecyclerView H0;
    public final View I0;
    public final View J0;
    public final TextView K0;
    public tf4 L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public final int P0;

    public DateTimePicker(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        q1g q1gVarD;
        super(context, attributeSet);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(vvc.date_picker_today_margin_top);
        this.P0 = dimensionPixelSize;
        View.inflate(context, o1d.date_time_picker, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(t0d.days_recycler_view);
        this.F0 = recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) findViewById(t0d.hours_recycler_view);
        this.G0 = recyclerView2;
        RecyclerView recyclerView3 = (RecyclerView) findViewById(t0d.minutes_recycler_view);
        this.H0 = recyclerView3;
        this.I0 = findViewById(t0d.top_line);
        this.J0 = findViewById(t0d.bottom_line);
        this.K0 = (TextView) findViewById(t0d.time_divider);
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(vvc.date_picker_item_height);
        bg4 bg4Var = new bg4(yf4.c);
        final int i = 1;
        bg4Var.A(true);
        recyclerView.setAdapter(bg4Var);
        recyclerView.setHasFixedSize(true);
        int i2 = 2;
        recyclerView.j(new e91(dimensionPixelSize, i2));
        recyclerView.setLayoutManager(new SliderLayoutManager(context, new i00(this, 16, bg4Var)));
        recyclerView.setEdgeEffectFactory(new wkb(dimensionPixelSize2));
        final v8g v8gVar = new v8g();
        recyclerView2.setAdapter(v8gVar);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setItemAnimator(null);
        recyclerView2.j(new e91(dimensionPixelSize, i2));
        final int i3 = 0;
        recyclerView2.setLayoutManager(new SliderLayoutManager(context, new n4f(this) { // from class: qf4
            public final /* synthetic */ DateTimePicker b;

            {
                this.b = this;
            }

            @Override // defpackage.n4f
            public final void b(int i4) {
                switch (i3) {
                    case 0:
                        DateTimePicker dateTimePicker = this.b;
                        if (!dateTimePicker.N0) {
                            t8g t8gVar = (t8g) v8gVar.C(i4);
                            tf4 tf4Var = dateTimePicker.L0;
                            if (tf4Var != null) {
                                ScheduledSendPickerViewModel scheduledSendPickerViewModel = (ScheduledSendPickerViewModel) tf4Var;
                                wqi.c("ScheduledSendPickerViewModel", "hour = " + t8gVar, new Object[0]);
                                tcf tcfVar = scheduledSendPickerViewModel.e;
                                lf4 lf4Var = (lf4) tcfVar.getValue();
                                if (lf4Var != null && !fni.a(lf4Var.b, t8gVar)) {
                                    tcfVar.m(null, lf4.a(lf4Var, null, t8gVar, null, 5));
                                    scheduledSendPickerViewModel.f();
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        DateTimePicker dateTimePicker2 = this.b;
                        if (!dateTimePicker2.O0) {
                            t8g t8gVar2 = (t8g) v8gVar.C(i4);
                            tf4 tf4Var2 = dateTimePicker2.L0;
                            if (tf4Var2 != null) {
                                ScheduledSendPickerViewModel scheduledSendPickerViewModel2 = (ScheduledSendPickerViewModel) tf4Var2;
                                wqi.c("ScheduledSendPickerViewModel", "minute = " + t8gVar2, new Object[0]);
                                tcf tcfVar2 = scheduledSendPickerViewModel2.e;
                                lf4 lf4Var2 = (lf4) tcfVar2.getValue();
                                if (lf4Var2 != null && !fni.a(lf4Var2.c, t8gVar2)) {
                                    tcfVar2.m(null, lf4.a(lf4Var2, null, null, t8gVar2, 3));
                                    scheduledSendPickerViewModel2.h();
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        }));
        recyclerView2.setEdgeEffectFactory(new wkb(dimensionPixelSize2));
        final v8g v8gVar2 = new v8g();
        recyclerView3.setAdapter(v8gVar2);
        recyclerView3.setItemAnimator(null);
        recyclerView3.setHasFixedSize(true);
        recyclerView3.j(new e91(dimensionPixelSize, i2));
        recyclerView3.setLayoutManager(new SliderLayoutManager(context, new n4f(this) { // from class: qf4
            public final /* synthetic */ DateTimePicker b;

            {
                this.b = this;
            }

            @Override // defpackage.n4f
            public final void b(int i4) {
                switch (i) {
                    case 0:
                        DateTimePicker dateTimePicker = this.b;
                        if (!dateTimePicker.N0) {
                            t8g t8gVar = (t8g) v8gVar2.C(i4);
                            tf4 tf4Var = dateTimePicker.L0;
                            if (tf4Var != null) {
                                ScheduledSendPickerViewModel scheduledSendPickerViewModel = (ScheduledSendPickerViewModel) tf4Var;
                                wqi.c("ScheduledSendPickerViewModel", "hour = " + t8gVar, new Object[0]);
                                tcf tcfVar = scheduledSendPickerViewModel.e;
                                lf4 lf4Var = (lf4) tcfVar.getValue();
                                if (lf4Var != null && !fni.a(lf4Var.b, t8gVar)) {
                                    tcfVar.m(null, lf4.a(lf4Var, null, t8gVar, null, 5));
                                    scheduledSendPickerViewModel.f();
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        DateTimePicker dateTimePicker2 = this.b;
                        if (!dateTimePicker2.O0) {
                            t8g t8gVar2 = (t8g) v8gVar2.C(i4);
                            tf4 tf4Var2 = dateTimePicker2.L0;
                            if (tf4Var2 != null) {
                                ScheduledSendPickerViewModel scheduledSendPickerViewModel2 = (ScheduledSendPickerViewModel) tf4Var2;
                                wqi.c("ScheduledSendPickerViewModel", "minute = " + t8gVar2, new Object[0]);
                                tcf tcfVar2 = scheduledSendPickerViewModel2.e;
                                lf4 lf4Var2 = (lf4) tcfVar2.getValue();
                                if (lf4Var2 != null && !fni.a(lf4Var2.c, t8gVar2)) {
                                    tcfVar2.m(null, lf4.a(lf4Var2, null, null, t8gVar2, 3));
                                    scheduledSendPickerViewModel2.h();
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        }));
        recyclerView3.setEdgeEffectFactory(new wkb(dimensionPixelSize2));
        if (isInEditMode()) {
            q1gVarD = bq4.e0;
        } else {
            Context context2 = getContext();
            bwf bwfVar = q1g.a0;
            q1gVarD = nca.d(context2);
        }
        k(q1gVarD);
    }

    @Override // defpackage.u1g
    public final void k(q1g q1gVar) {
        setBackgroundColor(q1gVar.m);
        int i = q1gVar.k;
        this.I0.setBackgroundColor(i);
        this.J0.setBackgroundColor(i);
        this.K0.setTextColor(q1gVar.F);
    }

    public final void setListener$scheduled_send_picker_dialog_release(tf4 listener) {
        this.L0 = listener;
    }
}
