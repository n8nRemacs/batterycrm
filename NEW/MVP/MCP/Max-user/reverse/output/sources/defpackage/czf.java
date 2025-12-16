package defpackage;

import android.app.Dialog;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;

/* loaded from: classes2.dex */
public final class czf extends dtf implements sm6 {
    public final /* synthetic */ ScheduledSendPickerDialogFragment X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czf(ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment, Continuation continuation) {
        super(2, continuation);
        this.X = scheduledSendPickerDialogFragment;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        czf czfVar = (czf) l((q1g) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        czfVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        czf czfVar = new czf(this.X, continuation);
        czfVar.o = obj;
        return czfVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Window window;
        g8j.b(obj);
        q1g q1gVar = (q1g) this.o;
        ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment = this.X;
        Dialog dialog = scheduledSendPickerDialogFragment.t1;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.addFlags(Integer.MIN_VALUE);
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            window.getDecorView().setSystemUiVisibility(q1gVar.c ? systemUiVisibility & (-17) : systemUiVisibility | 16);
            window.setNavigationBarColor(q1gVar.H);
        }
        View view = scheduledSendPickerDialogFragment.S0;
        ViewParent parent = view != null ? view.getParent() : null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.setBackgroundTintList(ColorStateList.valueOf(q1gVar.m));
        }
        scheduledSendPickerDialogFragment.k(q1gVar);
        return qqg.a;
    }
}
