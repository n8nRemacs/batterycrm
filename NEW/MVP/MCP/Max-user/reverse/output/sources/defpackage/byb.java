package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.chats.PickerChatsListWidget;

/* loaded from: classes2.dex */
public final class byb extends dtf implements sm6 {
    public final /* synthetic */ PickerChatsListWidget X;
    public final /* synthetic */ View Y;
    public final /* synthetic */ Object Z;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byb(Continuation continuation, PickerChatsListWidget pickerChatsListWidget, View view, k18 k18Var) {
        super(2, continuation);
        this.X = pickerChatsListWidget;
        this.Y = view;
        this.Z = k18Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        byb bybVar = (byb) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        bybVar.n(qqgVar);
        return qqgVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        byb bybVar = new byb(continuation, this.X, this.Y, this.Z);
        bybVar.o = obj;
        return bybVar;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        List list = (List) this.o;
        PickerChatsListWidget pickerChatsListWidget = this.X;
        pickerChatsListWidget.x0.E(list);
        if (pickerChatsListWidget.getView() != null) {
            pickerChatsListWidget.C0().setRefreshingNext(false);
        }
        if (fni.a(pickerChatsListWidget.b, "all.chat.folder")) {
            View view = this.Y;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            ?? r3 = this.Z;
            if (viewGroup != null) {
                fqi.c(viewGroup, (x3b) r3.getValue(), -1);
            }
            pickerChatsListWidget.C0().setVisibility((list == null || !list.isEmpty()) ? 0 : 4);
            ((x3b) r3.getValue()).setVisibility((list == null || !list.isEmpty()) ? 4 : 0);
        }
        return qqg.a;
    }
}
