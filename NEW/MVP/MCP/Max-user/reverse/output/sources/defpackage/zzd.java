package defpackage;

import android.content.res.Resources;
import android.os.Parcelable;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;

/* loaded from: classes2.dex */
public final class zzd extends dtf implements sm6 {
    public final /* synthetic */ ScheduledSendPickerDialogFragment o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzd(ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment, Continuation continuation) {
        super(2, continuation);
        this.o = scheduledSendPickerDialogFragment;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
        zzd zzdVar = (zzd) l((zca) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        zzdVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new zzd(this.o, continuation);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) throws Resources.NotFoundException {
        g8j.b(obj);
        ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment = this.o;
        lf4 lf4Var = (lf4) scheduledSendPickerDialogFragment.A0().f.a.getValue();
        qqg qqgVar = qqg.a;
        if (lf4Var == null) {
            return qqgVar;
        }
        e0e e0eVar = scheduledSendPickerDialogFragment.A0().o;
        yy7 yy7Var = ScheduledSendPickerViewModel.p[0];
        scheduledSendPickerDialogFragment.B0(new tzd(lf4Var, ((Boolean) e0eVar.b).booleanValue(), (Parcelable) scheduledSendPickerDialogFragment.C1.getValue()));
        scheduledSendPickerDialogFragment.s0();
        return qqgVar;
    }
}
