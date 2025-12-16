package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.a;
import ru.ok.messages.views.dialogs.ConfirmationDialog;
import ru.ok.messages.views.dialogs.VideoQualityPickerDialog;

/* loaded from: classes2.dex */
public final /* synthetic */ class uq3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ DialogFragment b;

    public /* synthetic */ uq3(DialogFragment dialogFragment, int i) {
        this.a = i;
        this.b = dialogFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                ConfirmationDialog confirmationDialog = (ConfirmationDialog) this.b;
                Bundle bundle = confirmationDialog.X;
                Bundle bundle2 = bundle != null ? bundle.getBundle("oneme:share:data") : null;
                confirmationDialog.x().b0("ConfirmationDialog:request_key", gwi.b(new imb("POSITIVE", wq3.a)));
                a aVarZ = confirmationDialog.z(true);
                if (aVarZ == 0) {
                    dz7 dz7VarT = confirmationDialog.t();
                    if (dz7VarT instanceof vq3) {
                        ((vq3) dz7VarT).q(bundle2);
                    } else if (dz7VarT instanceof d6) {
                        Intent intent = new Intent();
                        intent.putExtra("oneme:share:data", bundle2);
                        ((d6) dz7VarT).onActivityResult(confirmationDialog.A(), -1, intent);
                    }
                } else if (aVarZ instanceof vq3) {
                    ((vq3) aVarZ).q(bundle2);
                } else {
                    Intent intent2 = new Intent();
                    intent2.putExtra("oneme:share:data", bundle2);
                    aVarZ.J(confirmationDialog.A(), -1, intent2);
                }
                confirmationDialog.y1 = true;
                break;
            case 1:
                ((ConfirmationDialog) this.b).y0();
                break;
            default:
                ((VideoQualityPickerDialog) this.b).y0(pbh.a);
                break;
        }
    }
}
