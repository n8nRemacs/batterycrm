package defpackage;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.c;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class oq8 extends bid {
    public final /* synthetic */ c a;
    public final /* synthetic */ MaterialButton b;
    public final /* synthetic */ MaterialCalendar c;

    public oq8(MaterialCalendar materialCalendar, c cVar, MaterialButton materialButton) {
        this.c = materialCalendar;
        this.a = cVar;
        this.b = materialButton;
    }

    @Override // defpackage.bid
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.b.getText());
        }
    }

    @Override // defpackage.bid
    public final void b(RecyclerView recyclerView, int i, int i2) {
        mz0 mz0Var = this.a.d;
        MaterialCalendar materialCalendar = this.c;
        int iX0 = i < 0 ? ((LinearLayoutManager) materialCalendar.p1.getLayoutManager()).X0() : ((LinearLayoutManager) materialCalendar.p1.getLayoutManager()).Z0();
        Calendar calendarA = vxg.a(mz0Var.a.a);
        calendarA.add(2, iX0);
        materialCalendar.l1 = new g2a(calendarA);
        Calendar calendarA2 = vxg.a(mz0Var.a.a);
        calendarA2.add(2, iX0);
        calendarA2.set(5, 1);
        Calendar calendarA3 = vxg.a(calendarA2);
        calendarA3.get(2);
        calendarA3.get(1);
        calendarA3.getMaximum(7);
        calendarA3.getActualMaximum(5);
        calendarA3.getTimeInMillis();
        long timeInMillis = calendarA3.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = vxg.a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        this.b.setText(instanceForSkeleton.format(new Date(timeInMillis)));
    }
}
