package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;

/* loaded from: classes2.dex */
public final class d0e extends dtf implements sm6 {
    public final /* synthetic */ ScheduledSendPickerViewModel o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0e(ScheduledSendPickerViewModel scheduledSendPickerViewModel, Continuation continuation) {
        super(2, continuation);
        this.o = scheduledSendPickerViewModel;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        d0e d0eVar = (d0e) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        d0eVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new d0e(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ScheduledSendPickerViewModel scheduledSendPickerViewModel = this.o;
        scheduledSendPickerViewModel.g(ScheduledSendPickerViewModel.e(scheduledSendPickerViewModel));
        return qqg.a;
    }
}
