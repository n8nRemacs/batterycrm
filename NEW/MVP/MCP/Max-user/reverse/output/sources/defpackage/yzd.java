package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;

/* loaded from: classes2.dex */
public final class yzd extends dtf implements sm6 {
    public final /* synthetic */ View X;
    public final /* synthetic */ ScheduledSendPickerDialogFragment Y;
    public /* synthetic */ boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yzd(View view, ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment, Continuation continuation) {
        super(2, continuation);
        this.X = view;
        this.Y = scheduledSendPickerDialogFragment;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.getClass();
        yzd yzdVar = (yzd) l(bool, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        yzdVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        yzd yzdVar = new yzd(this.X, this.Y, continuation);
        yzdVar.o = ((Boolean) obj).booleanValue();
        return yzdVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        boolean z = this.o;
        View view = this.X;
        boolean z2 = view instanceof ViewGroup;
        qqg qqgVar = qqg.a;
        if (!z2) {
            return qqgVar;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        zhg.b(viewGroup);
        sp5 sp5Var = new sp5(z ? 2 : 1);
        ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment = this.Y;
        fs4 fs4Var = ((t1b) ((qm3) ((zm) ((ah) scheduledSendPickerDialogFragment.k0().getApplicationContext())).c.getValue())).b().a;
        sp5Var.c = 150L;
        zhg.a(viewGroup, sp5Var);
        wzd wzdVarZ0 = scheduledSendPickerDialogFragment.z0();
        wzdVarZ0.c().setAlpha(z ? 1.0f : 0.3f);
        wzdVarZ0.c().setEnabled(z);
        wzd wzdVarZ02 = scheduledSendPickerDialogFragment.z0();
        ((AppCompatTextView) wzdVarZ02.Z.D(wzdVarZ02, wzd.s0[5])).setVisibility(!z ? 0 : 8);
        return qqgVar;
    }
}
