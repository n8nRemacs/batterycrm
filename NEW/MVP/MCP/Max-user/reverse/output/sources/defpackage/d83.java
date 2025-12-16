package defpackage;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;

/* loaded from: classes.dex */
public final /* synthetic */ class d83 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d83(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.a) {
            case 0:
                Chip chip = (Chip) this.b;
                sq8 sq8Var = chip.w0;
                if (sq8Var != null) {
                    u73 u73Var = (u73) ((ao6) sq8Var).b;
                    if (!z ? u73Var.h(chip, u73Var.b) : u73Var.a(chip)) {
                        u73Var.g();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.v0;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                    break;
                }
                break;
            case 1:
                ScheduledSendPickerViewModel scheduledSendPickerViewModelA0 = ((ScheduledSendPickerDialogFragment) this.b).A0();
                scheduledSendPickerViewModelA0.o.O(scheduledSendPickerViewModelA0, ScheduledSendPickerViewModel.p[0], Boolean.valueOf(z));
                break;
            default:
                roe roeVar = (roe) this.b;
                if (z) {
                    roeVar.callOnClick();
                    break;
                }
                break;
        }
    }
}
