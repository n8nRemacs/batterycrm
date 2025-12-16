package et0;

import Y61.k;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: TimeSlotSeparatorView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Let0/a;", "Landroid/widget/LinearLayout;", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "getTitleView", "()Landroid/widget/TextView;", "titleView", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: et0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40156a extends LinearLayout {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    public final TextView titleView;

    public C40156a(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        setOrientation(0);
        View viewFindViewById = LayoutInflater.from(context).inflate(R.layout.view_timeslot_separator, (ViewGroup) this, true).findViewById(R.id.timeslot_separator_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.titleView = (TextView) viewFindViewById;
    }

    @k
    public final TextView getTitleView() {
        return this.titleView;
    }
}
