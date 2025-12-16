package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Locale;

/* loaded from: classes.dex */
public final class g7i extends phd {
    public final MaterialCalendar d;

    public g7i(MaterialCalendar materialCalendar) {
        this.d = materialCalendar;
    }

    @Override // defpackage.phd
    public final int j() {
        return this.d.k1.X;
    }

    @Override // defpackage.phd
    public final void r(mid midVar, int i) {
        MaterialCalendar materialCalendar = this.d;
        int i2 = materialCalendar.k1.a.c + i;
        TextView textView = ((f7i) midVar).E0;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        Context context = textView.getContext();
        textView.setContentDescription(vxg.b().get(1) == i2 ? String.format(context.getString(s2d.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(s2d.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        i5i i5iVar = materialCalendar.n1;
        if (vxg.b().get(1) == i2) {
            Object obj = i5iVar.b;
        } else {
            Object obj2 = i5iVar.a;
        }
        throw null;
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        return new f7i((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(k1d.mtrl_calendar_year, viewGroup, false));
    }
}
