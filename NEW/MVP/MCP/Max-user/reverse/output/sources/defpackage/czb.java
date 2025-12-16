package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.members.PickerMembersListWidget;

/* loaded from: classes2.dex */
public final class czb extends dtf implements sm6 {
    public final /* synthetic */ PickerMembersListWidget X;
    public final /* synthetic */ View Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czb(Continuation continuation, PickerMembersListWidget pickerMembersListWidget, View view) {
        super(2, continuation);
        this.X = pickerMembersListWidget;
        this.Y = view;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        czb czbVar = (czb) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        czbVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        czb czbVar = new czb(continuation, this.X, this.Y);
        czbVar.o = obj;
        return czbVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        List list = (List) this.o;
        PickerMembersListWidget pickerMembersListWidget = this.X;
        sn0 sn0Var = pickerMembersListWidget.t0;
        pickerMembersListWidget.s0.E(list);
        View view = this.Y;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            fqi.c(viewGroup, (View) sn0Var.getValue(), -1);
        }
        pickerMembersListWidget.B0().setVisibility((list == null || !list.isEmpty()) ? 0 : 4);
        ((x3b) sn0Var.getValue()).setVisibility((list == null || !list.isEmpty()) ? 4 : 0);
        return qqg.a;
    }
}
