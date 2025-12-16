package ru.ok.tamtam.messages.scheduled;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import defpackage.bwf;
import defpackage.c0e;
import defpackage.cxi;
import defpackage.d0e;
import defpackage.dnf;
import defpackage.e0e;
import defpackage.efd;
import defpackage.eyd;
import defpackage.fvd;
import defpackage.gy4;
import defpackage.hbd;
import defpackage.ho7;
import defpackage.jvc;
import defpackage.lf4;
import defpackage.ozd;
import defpackage.prd;
import defpackage.svi;
import defpackage.t8g;
import defpackage.tcf;
import defpackage.tf4;
import defpackage.u45;
import defpackage.ucf;
import defpackage.uni;
import defpackage.vid;
import defpackage.wqi;
import defpackage.xf4;
import defpackage.yy7;
import defpackage.z8a;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ok/tamtam/messages/scheduled/ScheduledSendPickerViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Ltf4;", "Landroid/app/Application;", "app", "Leyd;", "savedStateHandle", "<init>", "(Landroid/app/Application;Leyd;)V", "scheduled-send-picker-dialog_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScheduledSendPickerViewModel extends AndroidViewModel implements tf4 {
    public static final /* synthetic */ yy7[] p = {new z8a(ScheduledSendPickerViewModel.class, "sendWithNotification", "getSendWithNotification()Z"), u45.h(vid.a, ScheduledSendPickerViewModel.class, "allowWorkHours", "getAllowWorkHours()Z")};
    public final tcf c;
    public final hbd d;
    public final tcf e;
    public final hbd f;
    public final bwf g;
    public final bwf h;
    public final bwf i;
    public final bwf j;
    public final tcf k;
    public final hbd l;
    public final tcf m;
    public final hbd n;
    public final e0e o;

    public ScheduledSendPickerViewModel(Application application, eyd eydVar) {
        super(application);
        tcf tcfVarA = ucf.a(null);
        this.c = tcfVarA;
        this.d = new hbd(tcfVarA);
        tcf tcfVarA2 = ucf.a(null);
        this.e = tcfVarA2;
        this.f = new hbd(tcfVarA2);
        this.g = new bwf(new prd(6, application));
        this.h = new bwf(new efd(7));
        this.i = new bwf(new efd(8));
        this.j = new bwf(new prd(7, this));
        svi.e(uni.e(this), gy4.a, null, new c0e(eydVar, this, null), 2);
        Boolean bool = Boolean.TRUE;
        tcf tcfVarA3 = ucf.a(bool);
        this.k = tcfVarA3;
        this.l = new hbd(tcfVarA3);
        tcf tcfVarA4 = ucf.a(null);
        this.m = tcfVarA4;
        this.n = new hbd(tcfVarA4);
        this.o = new e0e(12, bool);
    }

    public static final ozd e(ScheduledSendPickerViewModel scheduledSendPickerViewModel) {
        int i;
        int i2;
        t8g t8gVar;
        t8g t8gVar2;
        tcf tcfVar = scheduledSendPickerViewModel.e;
        Calendar calendar = Calendar.getInstance();
        if (!scheduledSendPickerViewModel.b.getResources().getBoolean(jvc.small_time_offset)) {
            calendar.add(12, 5);
        } else if (calendar.get(13) > 35) {
            calendar.add(12, 2);
        } else {
            calendar.add(12, 1);
        }
        int i3 = calendar.get(11);
        lf4 lf4Var = (lf4) tcfVar.getValue();
        int i4 = 0;
        int i5 = (lf4Var == null || (t8gVar2 = lf4Var.b) == null) ? 0 : t8gVar2.a;
        if (i5 < i3) {
            i5 = i3;
        }
        ArrayList arrayListA = cxi.a(i3);
        Iterator it = arrayListA.iterator();
        int i6 = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((t8g) it.next()).a == i5) {
                i = i6;
                break;
            }
            i6++;
        }
        int i7 = calendar.get(12);
        lf4 lf4Var2 = (lf4) tcfVar.getValue();
        int i8 = (lf4Var2 == null || (t8gVar = lf4Var2.c) == null) ? 0 : t8gVar.a;
        if (i5 == i3) {
            i8 = i7;
        }
        if (i5 != i3) {
            i7 = 0;
        }
        ArrayList arrayListB = cxi.b(i7);
        Iterator it2 = arrayListB.iterator();
        while (true) {
            if (!it2.hasNext()) {
                i2 = -1;
                break;
            }
            if (((t8g) it2.next()).a == i8) {
                i2 = i4;
                break;
            }
            i4++;
        }
        return new ozd((List) scheduledSendPickerViewModel.j.getValue(), arrayListA, arrayListB, 0, i, i2);
    }

    public final void f() {
        xf4 xf4Var;
        t8g t8gVar;
        t8g t8gVar2;
        tcf tcfVar = this.e;
        lf4 lf4Var = (lf4) tcfVar.getValue();
        if (lf4Var == null || (xf4Var = lf4Var.a) == null) {
            return;
        }
        Integer num = null;
        if (dnf.n(xf4Var.o, this.b.getString(fvd.C), true)) {
            svi.e(uni.e(this), gy4.a, null, new d0e(this, null), 2);
            return;
        }
        lf4 lf4Var2 = (lf4) tcfVar.getValue();
        xf4 xf4Var2 = lf4Var2 != null ? lf4Var2.a : null;
        bwf bwfVar = this.j;
        if (xf4Var2 != null) {
            int iIndexOf = ((List) bwfVar.getValue()).indexOf(xf4Var2);
            Integer numValueOf = Integer.valueOf(iIndexOf);
            if (iIndexOf >= 0) {
                num = numValueOf;
            }
        } else {
            num = 0;
        }
        lf4 lf4Var3 = (lf4) tcfVar.getValue();
        int i = (lf4Var3 == null || (t8gVar2 = lf4Var3.b) == null) ? 0 : t8gVar2.a;
        lf4 lf4Var4 = (lf4) tcfVar.getValue();
        g(new ozd((List) bwfVar.getValue(), (List) this.h.getValue(), (List) this.i.getValue(), num != null ? num.intValue() : 0, i, (lf4Var4 == null || (t8gVar = lf4Var4.c) == null) ? 0 : t8gVar.a));
    }

    public final void g(ozd ozdVar) {
        wqi.c("ScheduledSendPickerViewModel", "setData %s", ozdVar);
        this.c.m(null, ozdVar);
        this.e.m(null, new lf4((xf4) ozdVar.a.get(ozdVar.d), (t8g) ozdVar.b.get(ozdVar.e), (t8g) ozdVar.c.get(ozdVar.f)));
        h();
    }

    public final boolean h() {
        wqi.c("ScheduledSendPickerViewModel", "validateSelectedTime", new Object[0]);
        lf4 lf4Var = (lf4) this.e.getValue();
        if (lf4Var == null) {
            return false;
        }
        boolean z = System.currentTimeMillis() < lf4Var.b();
        ho7.q("validateSelectedTime: ", "ScheduledSendPickerViewModel", z);
        this.k.m(null, Boolean.valueOf(z));
        return z;
    }
}
