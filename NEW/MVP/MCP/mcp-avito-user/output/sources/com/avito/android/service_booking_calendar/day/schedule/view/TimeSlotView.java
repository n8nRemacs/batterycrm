package com.avito.android.service_booking_calendar.day.schedule.view;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.graphics.drawable.d;
import at0.C24173a;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.service_booking_calendar.q;
import com.avito.android.util.C35835l0;
import j.InterfaceC42161q;
import j.f0;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: TimeSlotView.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/service_booking_calendar/day/schedule/view/TimeSlotView;", "Landroid/widget/FrameLayout;", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lkotlin/G0;", "setAppearance", "(I)V", "LayoutType", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TimeSlotView extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public final int f275459b;

    /* renamed from: c, reason: collision with root package name */
    public final float f275460c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final View f275461d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ViewGroup f275462e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f275463f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f275464g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f275465h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final ViewGroup f275466i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final TextView f275467j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final Group f275468k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final Group f275469l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final Group f275470m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final View f275471n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TimeSlotView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/day/schedule/view/TimeSlotView$LayoutType;", "", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LayoutType {

        /* renamed from: b, reason: collision with root package name */
        public static final LayoutType f275472b;

        /* renamed from: c, reason: collision with root package name */
        public static final LayoutType f275473c;

        /* renamed from: d, reason: collision with root package name */
        public static final LayoutType f275474d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ LayoutType[] f275475e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f275476f;

        static {
            LayoutType layoutType = new LayoutType("ONLY_TITLE", 0);
            f275472b = layoutType;
            LayoutType layoutType2 = new LayoutType("TITLE_AND_CONTACT", 1);
            f275473c = layoutType2;
            LayoutType layoutType3 = new LayoutType("EXTENDED", 2);
            f275474d = layoutType3;
            LayoutType[] layoutTypeArr = {layoutType, layoutType2, layoutType3};
            f275475e = layoutTypeArr;
            f275476f = c.a(layoutTypeArr);
        }

        public LayoutType() {
            throw null;
        }

        public static LayoutType valueOf(String str) {
            return (LayoutType) Enum.valueOf(LayoutType.class, str);
        }

        public static LayoutType[] values() {
            return (LayoutType[]) f275475e.clone();
        }
    }

    /* compiled from: TimeSlotView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[LayoutType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LayoutType layoutType = LayoutType.f275472b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LayoutType layoutType2 = LayoutType.f275472b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @j
    public TimeSlotView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public final void a(TypedArray typedArray) {
        C24173a c24173a;
        Bitmap bitmapB;
        if (typedArray.hasValue(0)) {
            setBackground(typedArray.getDrawable(0));
        }
        if (typedArray.hasValue(1)) {
            Drawable drawable = typedArray.getDrawable(1);
            if (drawable == null || (bitmapB = d.b(0, 0, 7, drawable)) == null) {
                c24173a = null;
            } else {
                float f12 = this.f275460c;
                c24173a = new C24173a(bitmapB, new float[]{0.0f, 0.0f, 0.0f, 0.0f, f12, f12, f12, f12});
                setPadding(0, 0, 0, getContext().getResources().getDimensionPixelSize(R.dimen.timeslot_bg_vertical_padding));
            }
            this.f275471n.setBackground(c24173a);
        }
        if (typedArray.hasValue(2)) {
            int color = typedArray.getColor(2, C35835l0.d(R.attr.black, getContext()));
            this.f275463f.setTextColor(color);
            this.f275464g.setTextColor(color);
        }
    }

    public final void b(@InterfaceC42161q int i12, LayoutType layoutType) {
        if (layoutType == LayoutType.f275472b) {
            ((ViewGroup.MarginLayoutParams) this.f275463f.getLayoutParams()).topMargin = getContext().getResources().getDimensionPixelSize(i12);
        } else {
            ((ViewGroup.MarginLayoutParams) this.f275464g.getLayoutParams()).topMargin = getContext().getResources().getDimensionPixelSize(i12);
        }
    }

    public final void setAppearance(@f0 int style) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(style, q.i.f276170b);
        a(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        requestLayout();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TimeSlotView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? 0 : i12;
        i13 = (i14 & 8) != 0 ? 0 : i13;
        super(context, attributeSet, i12);
        this.f275459b = context.getResources().getDimensionPixelSize(R.dimen.day_schedule_timeslot_height);
        this.f275460c = context.getResources().getDimension(R.dimen.timeslot_radius);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.view_timeslot, (ViewGroup) this, true);
        this.f275461d = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.timeslot_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f275462e = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.timeslot_status_type_1);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f275463f = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.timeslot_status_type_2);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f275464g = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R.id.timeslot_contact_name);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f275465h = (TextView) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(R.id.timeslot_contact_services_root);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f275466i = (ViewGroup) viewFindViewById5;
        View viewFindViewById6 = viewInflate.findViewById(R.id.timeslot_total_amount);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f275467j = (TextView) viewFindViewById6;
        View viewFindViewById7 = viewInflate.findViewById(R.id.card_type_1);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.Group");
        }
        this.f275468k = (Group) viewFindViewById7;
        View viewFindViewById8 = viewInflate.findViewById(R.id.card_type_2);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.Group");
        }
        this.f275469l = (Group) viewFindViewById8;
        View viewFindViewById9 = viewInflate.findViewById(R.id.card_type_3);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.Group");
        }
        this.f275470m = (Group) viewFindViewById9;
        View viewFindViewById10 = viewInflate.findViewById(R.id.timeslot_tech_break);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f275471n = viewFindViewById10;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.i.f276170b, i12, i13);
        a(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }
}
