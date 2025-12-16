package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;
import ru.ok.utils.widgets.LongRoundedTitleSubtitleButton;

/* loaded from: classes2.dex */
public final class a0e extends dtf implements sm6 {
    public final /* synthetic */ ScheduledSendPickerDialogFragment X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0e(ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment, Continuation continuation) {
        super(2, continuation);
        this.X = scheduledSendPickerDialogFragment;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        a0e a0eVar = (a0e) l((lf4) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        a0eVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        a0e a0eVar = new a0e(this.X, continuation);
        a0eVar.o = obj;
        return a0eVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        lf4 lf4Var = (lf4) this.o;
        ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment = this.X;
        LongRoundedTitleSubtitleButton longRoundedTitleSubtitleButtonC = scheduledSendPickerDialogFragment.z0().c();
        Context contextK0 = scheduledSendPickerDialogFragment.k0();
        lf4Var.getClass();
        longRoundedTitleSubtitleButtonC.setSubtitle(contextK0.getString(fvd.z, lf4Var.a.o, lf4Var.b + ":" + lf4Var.c));
        return qqg.a;
    }
}
