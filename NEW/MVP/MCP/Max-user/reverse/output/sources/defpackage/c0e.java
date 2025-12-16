package defpackage;

import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;

/* loaded from: classes2.dex */
public final class c0e extends dtf implements sm6 {
    public final /* synthetic */ ScheduledSendPickerViewModel X;
    public final /* synthetic */ eyd o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0e(eyd eydVar, ScheduledSendPickerViewModel scheduledSendPickerViewModel, Continuation continuation) {
        super(2, continuation);
        this.o = eydVar;
        this.X = scheduledSendPickerViewModel;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        c0e c0eVar = (c0e) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        c0eVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new c0e(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object obj2;
        ozd ozdVarE;
        int i;
        g8j.b(obj);
        eyd eydVar = this.o;
        LinkedHashMap linkedHashMap = eydVar.a;
        try {
            obj2 = linkedHashMap.get("ScheduledSendPickerViewModel:delayed_attrs");
        } catch (ClassCastException unused) {
            linkedHashMap.remove("ScheduledSendPickerViewModel:delayed_attrs");
            if (eydVar.c.remove("ScheduledSendPickerViewModel:delayed_attrs") != null) {
                throw new ClassCastException();
            }
            eydVar.d.remove("ScheduledSendPickerViewModel:delayed_attrs");
            obj2 = null;
        }
        ss4 ss4Var = obj2 instanceof ss4 ? (ss4) obj2 : null;
        ScheduledSendPickerViewModel scheduledSendPickerViewModel = this.X;
        if (ss4Var != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(ss4Var.a);
            int i2 = calendar.get(5);
            int i3 = calendar.get(2);
            int i4 = calendar.get(1);
            int i5 = calendar.get(11);
            int i6 = calendar.get(12);
            List list = ScheduledSendPickerViewModel.e(scheduledSendPickerViewModel).a;
            List list2 = ScheduledSendPickerViewModel.e(scheduledSendPickerViewModel).b;
            List list3 = ScheduledSendPickerViewModel.e(scheduledSendPickerViewModel).c;
            Iterator it = list.iterator();
            int i7 = 0;
            while (true) {
                i = -1;
                if (!it.hasNext()) {
                    i7 = -1;
                    break;
                }
                xf4 xf4Var = (xf4) it.next();
                if (xf4Var.d == i4 && xf4Var.c == i3 && xf4Var.b == i2) {
                    break;
                }
                i7++;
            }
            if (i7 < 0) {
                i7 = 0;
            }
            Iterator it2 = list2.iterator();
            int i8 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i8 = -1;
                    break;
                }
                if (((t8g) it2.next()).a == i5) {
                    break;
                }
                i8++;
            }
            int i9 = i8 < 0 ? 0 : i8;
            Iterator it3 = list3.iterator();
            int i10 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (((t8g) it3.next()).a == i6) {
                    i = i10;
                    break;
                }
                i10++;
            }
            if (i < 0) {
                i = 0;
            }
            ozdVarE = new ozd(list, list2, list3, i7, i9, i);
        } else {
            ozdVarE = ScheduledSendPickerViewModel.e(scheduledSendPickerViewModel);
        }
        scheduledSendPickerViewModel.e.m(null, new lf4((xf4) ozdVarE.a.get(ozdVarE.d), (t8g) ozdVarE.b.get(ozdVarE.e), (t8g) ozdVarE.c.get(ozdVarE.f)));
        scheduledSendPickerViewModel.c.m(null, ozdVarE);
        return qqg.a;
    }
}
