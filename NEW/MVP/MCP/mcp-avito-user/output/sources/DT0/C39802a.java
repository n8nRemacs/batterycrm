package dt0;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.d;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import et0.C40156a;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import kotlin.Metadata;

/* compiled from: TimeSlotItemDecorator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ldt0/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "a", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dt0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39802a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f394162b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f394163c;

    /* renamed from: d, reason: collision with root package name */
    public final int f394164d;

    /* renamed from: e, reason: collision with root package name */
    public final int f394165e;

    /* renamed from: f, reason: collision with root package name */
    public final int f394166f;

    /* renamed from: g, reason: collision with root package name */
    public final int f394167g;

    /* renamed from: h, reason: collision with root package name */
    public final DateTimeFormatter f394168h = DateTimeFormatter.ofPattern("HH:mm");

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Drawable f394169i;

    /* compiled from: TimeSlotItemDecorator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldt0/a$a;", "", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dt0.a$a, reason: collision with other inner class name */
    public interface InterfaceC11044a {
        /* renamed from: JB */
        int getF275435d();

        /* renamed from: vQ */
        long getF275436e();
    }

    public C39802a(@k Context context, boolean z12, @k Resources resources) {
        this.f394162b = context;
        this.f394163c = z12;
        this.f394164d = resources.getDimensionPixelSize(R.dimen.day_schedule_timeslot_section_height);
        this.f394165e = resources.getDimensionPixelSize(R.dimen.day_schedule_top_padding);
        this.f394166f = resources.getDimensionPixelSize(R.dimen.day_schedule_bottom_padding);
        this.f394167g = resources.getDimensionPixelSize(R.dimen.day_schedule_timeslot_border_width);
        this.f394169i = d.getDrawable(context, R.drawable.current_time_line);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        recyclerView.getClass();
        int iU2 = RecyclerView.U(view);
        int i12 = this.f394167g;
        int i13 = iU2 == 0 ? this.f394165e : i12;
        if (iU2 == (recyclerView.getAdapter() != null ? r5.getItemCount() : 0) - 1) {
            i12 = this.f394166f;
        }
        rect.set(0, i13, 0, i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void onDraw(@k Canvas canvas, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        DateTimeFormatter dateTimeFormatter;
        super.onDraw(canvas, recyclerView, zVar);
        C40156a c40156a = new C40156a(this.f394162b, null, 0, 6, null);
        c40156a.measure(View.MeasureSpec.makeMeasureSpec(recyclerView.getRight() - recyclerView.getLeft(), BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(0, 0));
        c40156a.layout(0, 0, c40156a.getMeasuredWidth(), c40156a.getMeasuredHeight());
        int childCount = recyclerView.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = recyclerView.getChildAt(i12);
            Object objW = recyclerView.W(childAt);
            LocalTime localTimeOfSecondOfDay = LocalTime.ofSecondOfDay(objW instanceof InterfaceC11044a ? ((InterfaceC11044a) objW).getF275436e() : 0L);
            int f275435d = objW instanceof InterfaceC11044a ? ((InterfaceC11044a) objW).getF275435d() : 0;
            float x12 = childAt.getX();
            float y12 = childAt.getY() - (c40156a.getMeasuredHeight() / 2);
            int i13 = 0;
            while (true) {
                dateTimeFormatter = this.f394168h;
                if (i13 >= f275435d) {
                    break;
                }
                c40156a.getTitleView().setText(localTimeOfSecondOfDay.format(dateTimeFormatter));
                canvas.save();
                canvas.translate(x12, y12);
                c40156a.draw(canvas);
                canvas.restore();
                localTimeOfSecondOfDay = localTimeOfSecondOfDay.plusSeconds(900L);
                y12 += this.f394164d;
                i13++;
            }
            if (RecyclerView.U(childAt) == (recyclerView.getAdapter() != null ? r4.getItemCount() : 0) - 1) {
                c40156a.getTitleView().setText(localTimeOfSecondOfDay.format(dateTimeFormatter));
                canvas.save();
                canvas.translate(x12, y12);
                c40156a.draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void onDrawOver(@k Canvas canvas, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        Drawable drawable;
        super.onDrawOver(canvas, recyclerView, zVar);
        if (!this.f394163c || (drawable = this.f394169i) == null || recyclerView.getChildCount() == 0) {
            return;
        }
        int secondOfDay = LocalTime.now().toSecondOfDay();
        View childAt = recyclerView.getChildAt(0);
        View childAt2 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
        Object objW = recyclerView.W(childAt);
        Object objW2 = recyclerView.W(childAt2);
        long f275436e = objW instanceof InterfaceC11044a ? ((InterfaceC11044a) objW).getF275436e() : 0L;
        long f275435d = ((objW2 instanceof InterfaceC11044a ? ((InterfaceC11044a) objW2).getF275435d() : 0) * 900) + (objW2 instanceof InterfaceC11044a ? ((InterfaceC11044a) objW2).getF275436e() : 0L);
        long j12 = secondOfDay;
        if (f275436e > j12 || j12 > f275435d) {
            return;
        }
        float y12 = (((j12 - f275436e) / 900) * this.f394164d) + (childAt.getY() - (drawable.getIntrinsicHeight() / 2));
        canvas.save();
        canvas.translate(0.0f, y12);
        drawable.setBounds(0, 0, recyclerView.getWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        canvas.restore();
    }
}
