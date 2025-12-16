package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.c;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class lq8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ MaterialCalendar c;

    public /* synthetic */ lq8(MaterialCalendar materialCalendar, c cVar, int i) {
        this.a = i;
        this.c = materialCalendar;
        this.b = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                MaterialCalendar materialCalendar = this.c;
                int iZ0 = ((LinearLayoutManager) materialCalendar.p1.getLayoutManager()).Z0() - 1;
                if (iZ0 >= 0) {
                    Calendar calendarA = vxg.a(this.b.d.a.a);
                    calendarA.add(2, iZ0);
                    materialCalendar.s0(new g2a(calendarA));
                    break;
                }
                break;
            default:
                MaterialCalendar materialCalendar2 = this.c;
                int iX0 = ((LinearLayoutManager) materialCalendar2.p1.getLayoutManager()).X0() + 1;
                if (iX0 < materialCalendar2.p1.getAdapter().j()) {
                    Calendar calendarA2 = vxg.a(this.b.d.a.a);
                    calendarA2.add(2, iX0);
                    materialCalendar2.s0(new g2a(calendarA2));
                    break;
                }
                break;
        }
    }
}
