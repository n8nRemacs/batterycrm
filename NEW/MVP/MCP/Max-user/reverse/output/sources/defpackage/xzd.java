package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.messages.scheduled.DateTimePicker;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;
import ru.ok.tamtam.messages.scheduled.SliderLayoutManager;

/* loaded from: classes2.dex */
public final class xzd extends dtf implements sm6 {
    public final /* synthetic */ ScheduledSendPickerDialogFragment X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xzd(ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment, Continuation continuation) {
        super(2, continuation);
        this.X = scheduledSendPickerDialogFragment;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        xzd xzdVar = (xzd) l((ozd) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        xzdVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        xzd xzdVar = new xzd(this.X, continuation);
        xzdVar.o = obj;
        return xzdVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ozd ozdVar = (ozd) this.o;
        wqi.c("ScheduledSendPickerDialogFragment", "new data " + ozdVar, new Object[0]);
        ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment = this.X;
        final DateTimePicker dateTimePickerB = scheduledSendPickerDialogFragment.z0().b();
        List list = ozdVar.a;
        final int i = ozdVar.d;
        dateTimePickerB.M0 = true;
        phd adapter = dateTimePickerB.F0.getAdapter();
        bg4 bg4Var = adapter instanceof bg4 ? (bg4) adapter : null;
        if (bg4Var != null) {
            final int i2 = 0;
            bg4Var.F(list, new Runnable() { // from class: rf4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i2) {
                        case 0:
                            final DateTimePicker dateTimePicker = dateTimePickerB;
                            RecyclerView recyclerView = dateTimePicker.F0;
                            ((SliderLayoutManager) recyclerView.getLayoutManager()).o1(i, dateTimePicker.P0);
                            final int i3 = 0;
                            recyclerView.post(new Runnable() { // from class: sf4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i3) {
                                        case 0:
                                            dateTimePicker.M0 = false;
                                            break;
                                        case 1:
                                            dateTimePicker.N0 = false;
                                            break;
                                        default:
                                            dateTimePicker.O0 = false;
                                            break;
                                    }
                                }
                            });
                            break;
                        case 1:
                            final DateTimePicker dateTimePicker2 = dateTimePickerB;
                            RecyclerView recyclerView2 = dateTimePicker2.H0;
                            ((SliderLayoutManager) recyclerView2.getLayoutManager()).o1(i, dateTimePicker2.P0);
                            final int i4 = 2;
                            recyclerView2.post(new Runnable() { // from class: sf4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i4) {
                                        case 0:
                                            dateTimePicker2.M0 = false;
                                            break;
                                        case 1:
                                            dateTimePicker2.N0 = false;
                                            break;
                                        default:
                                            dateTimePicker2.O0 = false;
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final DateTimePicker dateTimePicker3 = dateTimePickerB;
                            RecyclerView recyclerView3 = dateTimePicker3.G0;
                            ((SliderLayoutManager) recyclerView3.getLayoutManager()).o1(i, dateTimePicker3.P0);
                            final int i5 = 1;
                            recyclerView3.post(new Runnable() { // from class: sf4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i5) {
                                        case 0:
                                            dateTimePicker3.M0 = false;
                                            break;
                                        case 1:
                                            dateTimePicker3.N0 = false;
                                            break;
                                        default:
                                            dateTimePicker3.O0 = false;
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
        }
        final DateTimePicker dateTimePickerB2 = scheduledSendPickerDialogFragment.z0().b();
        List list2 = ozdVar.b;
        final int i3 = ozdVar.e;
        dateTimePickerB2.N0 = true;
        phd adapter2 = dateTimePickerB2.G0.getAdapter();
        v8g v8gVar = adapter2 instanceof v8g ? (v8g) adapter2 : null;
        if (v8gVar != null) {
            final int i4 = 2;
            v8gVar.F(list2, new Runnable() { // from class: rf4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i4) {
                        case 0:
                            final DateTimePicker dateTimePicker = dateTimePickerB2;
                            RecyclerView recyclerView = dateTimePicker.F0;
                            ((SliderLayoutManager) recyclerView.getLayoutManager()).o1(i3, dateTimePicker.P0);
                            final int i32 = 0;
                            recyclerView.post(new Runnable() { // from class: sf4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i32) {
                                        case 0:
                                            dateTimePicker.M0 = false;
                                            break;
                                        case 1:
                                            dateTimePicker.N0 = false;
                                            break;
                                        default:
                                            dateTimePicker.O0 = false;
                                            break;
                                    }
                                }
                            });
                            break;
                        case 1:
                            final DateTimePicker dateTimePicker2 = dateTimePickerB2;
                            RecyclerView recyclerView2 = dateTimePicker2.H0;
                            ((SliderLayoutManager) recyclerView2.getLayoutManager()).o1(i3, dateTimePicker2.P0);
                            final int i42 = 2;
                            recyclerView2.post(new Runnable() { // from class: sf4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i42) {
                                        case 0:
                                            dateTimePicker2.M0 = false;
                                            break;
                                        case 1:
                                            dateTimePicker2.N0 = false;
                                            break;
                                        default:
                                            dateTimePicker2.O0 = false;
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final DateTimePicker dateTimePicker3 = dateTimePickerB2;
                            RecyclerView recyclerView3 = dateTimePicker3.G0;
                            ((SliderLayoutManager) recyclerView3.getLayoutManager()).o1(i3, dateTimePicker3.P0);
                            final int i5 = 1;
                            recyclerView3.post(new Runnable() { // from class: sf4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i5) {
                                        case 0:
                                            dateTimePicker3.M0 = false;
                                            break;
                                        case 1:
                                            dateTimePicker3.N0 = false;
                                            break;
                                        default:
                                            dateTimePicker3.O0 = false;
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
        }
        final DateTimePicker dateTimePickerB3 = scheduledSendPickerDialogFragment.z0().b();
        List list3 = ozdVar.c;
        final int i5 = ozdVar.f;
        dateTimePickerB3.O0 = true;
        phd adapter3 = dateTimePickerB3.H0.getAdapter();
        v8g v8gVar2 = adapter3 instanceof v8g ? (v8g) adapter3 : null;
        if (v8gVar2 != null) {
            final int i6 = 1;
            v8gVar2.F(list3, new Runnable() { // from class: rf4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i6) {
                        case 0:
                            final DateTimePicker dateTimePicker = dateTimePickerB3;
                            RecyclerView recyclerView = dateTimePicker.F0;
                            ((SliderLayoutManager) recyclerView.getLayoutManager()).o1(i5, dateTimePicker.P0);
                            final int i32 = 0;
                            recyclerView.post(new Runnable() { // from class: sf4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i32) {
                                        case 0:
                                            dateTimePicker.M0 = false;
                                            break;
                                        case 1:
                                            dateTimePicker.N0 = false;
                                            break;
                                        default:
                                            dateTimePicker.O0 = false;
                                            break;
                                    }
                                }
                            });
                            break;
                        case 1:
                            final DateTimePicker dateTimePicker2 = dateTimePickerB3;
                            RecyclerView recyclerView2 = dateTimePicker2.H0;
                            ((SliderLayoutManager) recyclerView2.getLayoutManager()).o1(i5, dateTimePicker2.P0);
                            final int i42 = 2;
                            recyclerView2.post(new Runnable() { // from class: sf4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i42) {
                                        case 0:
                                            dateTimePicker2.M0 = false;
                                            break;
                                        case 1:
                                            dateTimePicker2.N0 = false;
                                            break;
                                        default:
                                            dateTimePicker2.O0 = false;
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final DateTimePicker dateTimePicker3 = dateTimePickerB3;
                            RecyclerView recyclerView3 = dateTimePicker3.G0;
                            ((SliderLayoutManager) recyclerView3.getLayoutManager()).o1(i5, dateTimePicker3.P0);
                            final int i52 = 1;
                            recyclerView3.post(new Runnable() { // from class: sf4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i52) {
                                        case 0:
                                            dateTimePicker3.M0 = false;
                                            break;
                                        case 1:
                                            dateTimePicker3.N0 = false;
                                            break;
                                        default:
                                            dateTimePicker3.O0 = false;
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
        }
        return qqg.a;
    }
}
