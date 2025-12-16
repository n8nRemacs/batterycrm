package defpackage;

import android.view.View;
import one.me.sdk.uikit.common.views.EmptySearchView;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class x6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cm6 b;

    public /* synthetic */ x6(int i, cm6 cm6Var) {
        this.a = i;
        this.b = cm6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        cm6 cm6Var = this.b;
        switch (i) {
            case 0:
                cm6Var.invoke();
                break;
            case 1:
                cm6Var.invoke();
                break;
            case 2:
                cm6Var.invoke();
                break;
            case 3:
                cm6Var.invoke();
                break;
            case 4:
                int i2 = EmptySearchView.o;
                cm6Var.invoke();
                break;
            case 5:
                cm6Var.invoke();
                break;
            case 6:
                cm6Var.invoke();
                break;
            case 7:
                cm6Var.invoke();
                break;
            case 8:
                if (cm6Var != null) {
                    cm6Var.invoke();
                    break;
                }
                break;
            case 9:
                cm6Var.invoke();
                break;
            case 10:
                cm6Var.invoke();
                break;
            case 11:
                cm6Var.invoke();
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                cm6Var.invoke();
                break;
            case 13:
                cm6Var.invoke();
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                cm6Var.invoke();
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                cm6Var.invoke();
                break;
            default:
                cm6Var.invoke();
                break;
        }
    }
}
