package com.avito.android.service_booking_calendar.flexible.header.view;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.service_booking_calendar.q;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import j.InterfaceC42150f;
import j.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DayOfWeekView.kt */
@s0
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/view/DayOfWeekView;", "Landroid/widget/FrameLayout;", "", "text", "Lkotlin/G0;", "setText", "(Ljava/lang/String;)V", "", "colorAttr", "setDotColor", "(I)V", "", "visible", "setDotVisibility", "(Z)V", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "setAppearance", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DayOfWeekView extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f276092b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final View f276093c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final View f276094d;

    @j
    public DayOfWeekView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public final void a(TypedArray typedArray) {
        if (typedArray.hasValue(0)) {
            this.f276093c.setBackground(typedArray.getDrawable(0));
        }
        if (typedArray.hasValue(1)) {
            this.f276092b.setTextColor(typedArray.getColor(1, C35835l0.d(R.attr.black, getContext())));
        }
    }

    public final void setAppearance(@f0 int style) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, q.i.f276169a);
        a(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        invalidate();
    }

    public final void setDotColor(@InterfaceC42150f int colorAttr) {
        this.f276094d.setBackgroundTintList(C35835l0.e(colorAttr, getContext()));
    }

    public final void setDotVisibility(boolean visible) {
        D6.G(this.f276094d, visible);
    }

    public final void setText(@k String text) {
        this.f276092b.setText(text);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DayOfWeekView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? 0 : i12;
        i13 = (i14 & 8) != 0 ? 0 : i13;
        super(context, attributeSet, i12);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.view_day_of_week, (ViewGroup) this, true);
        View viewFindViewById = viewInflate.findViewById(R.id.flexible_calendar_day_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f276092b = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.flexible_calendar_day_text_background);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f276093c = viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.flexible_calendar_day_dot);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f276094d = viewFindViewById3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.i.f276169a, i12, i13);
        a(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }
}
