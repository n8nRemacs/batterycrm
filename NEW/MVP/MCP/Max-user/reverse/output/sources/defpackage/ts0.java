package defpackage;

import android.view.View;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;

/* loaded from: classes.dex */
public final class ts0 extends qs0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ts0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }

    @Override // defpackage.qs0
    public final void b(View view) {
        int i = this.a;
    }

    @Override // defpackage.qs0
    public final void c(View view, int i) {
        switch (this.a) {
            case 0:
                if (i == 5) {
                    ((vs0) this.b).cancel();
                    break;
                }
                break;
            default:
                if (i == 5) {
                    ((ScheduledSendPickerDialogFragment) this.b).y0();
                    break;
                }
                break;
        }
    }
}
