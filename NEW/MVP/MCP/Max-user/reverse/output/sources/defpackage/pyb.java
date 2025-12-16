package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.contacts.PickerContactsListWidget;

/* loaded from: classes2.dex */
public final class pyb extends dtf implements sm6 {
    public final /* synthetic */ PickerContactsListWidget X;
    public final /* synthetic */ View Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pyb(Continuation continuation, PickerContactsListWidget pickerContactsListWidget, View view) {
        super(2, continuation);
        this.X = pickerContactsListWidget;
        this.Y = view;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        pyb pybVar = (pyb) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        pybVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        pyb pybVar = new pyb(continuation, this.X, this.Y);
        pybVar.o = obj;
        return pybVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        List list = (List) this.o;
        PickerContactsListWidget pickerContactsListWidget = this.X;
        sn0 sn0Var = pickerContactsListWidget.t0;
        pickerContactsListWidget.Y.E(list);
        if (vmf.F((CharSequence) pickerContactsListWidget.z0().t0.a.getValue())) {
            pickerContactsListWidget.A0().setVisibility(0);
            ((x3b) sn0Var.getValue()).setVisibility(4);
        } else {
            View view = this.Y;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                fqi.c(viewGroup, (View) sn0Var.getValue(), -1);
            }
            pickerContactsListWidget.A0().setVisibility((list == null || !list.isEmpty()) ? 0 : 4);
            ((x3b) sn0Var.getValue()).setVisibility((list == null || !list.isEmpty()) ? 4 : 0);
        }
        return qqg.a;
    }
}
