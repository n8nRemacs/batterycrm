package com.avito.android.service_orders.plates;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.avito.android.R;
import com.avito.android.service_orders.a;
import com.avito.android.util.I5;
import j.InterfaceC42150f;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingPlateView.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\u0006R\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0015\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001b\u0010\u0018\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u001b\u0010\u001b\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/avito/android/service_orders/plates/ServiceBookingPlateView;", "Landroidx/cardview/widget/CardView;", "", "text", "Lkotlin/G0;", "setFirstLineText", "(Ljava/lang/String;)V", "", "icon", "setIcon", "(Ljava/lang/Integer;)V", "setSecondLineText", "setBoldLineText", "Landroid/widget/TextView;", "b", "Lkotlin/C;", "getFirstLineText", "()Landroid/widget/TextView;", "firstLineText", "c", "getIconLineText", "iconLineText", "d", "getSecondLineText", "secondLineText", "e", "getBoldLineText", "boldLineText", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ServiceBookingPlateView extends CardView {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Object f279679b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Object f279680c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Object f279681d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Object f279682e;

    /* compiled from: ServiceBookingPlateView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    final class a extends N implements Y41.a<TextView> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final TextView invoke() {
            View viewFindViewById = ServiceBookingPlateView.this.findViewById(R.id.plate_bold_line);
            if (viewFindViewById != null) {
                return (TextView) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    /* compiled from: ServiceBookingPlateView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    final class b extends N implements Y41.a<TextView> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final TextView invoke() {
            View viewFindViewById = ServiceBookingPlateView.this.findViewById(R.id.plate_first_line);
            if (viewFindViewById != null) {
                return (TextView) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    /* compiled from: ServiceBookingPlateView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    final class c extends N implements Y41.a<TextView> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final TextView invoke() {
            View viewFindViewById = ServiceBookingPlateView.this.findViewById(R.id.plate_icon_line);
            if (viewFindViewById != null) {
                return (TextView) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    /* compiled from: ServiceBookingPlateView.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    final class d extends N implements Y41.a<TextView> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final TextView invoke() {
            View viewFindViewById = ServiceBookingPlateView.this.findViewById(R.id.plate_second_line);
            if (viewFindViewById != null) {
                return (TextView) viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    @j
    public ServiceBookingPlateView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    private final TextView getBoldLineText() {
        return (TextView) this.f279682e.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    private final TextView getFirstLineText() {
        return (TextView) this.f279679b.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    private final TextView getIconLineText() {
        return (TextView) this.f279680c.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    private final TextView getSecondLineText() {
        return (TextView) this.f279681d.getValue();
    }

    public final void setBoldLineText(@l String text) {
        I5.a(getBoldLineText(), text, false);
    }

    public final void setFirstLineText(@l String text) {
        I5.a(getFirstLineText(), text, false);
    }

    public final void setIcon(@InterfaceC42150f @l Integer icon) {
        FV.a.a(FV.a.f4720a, getIconLineText(), icon);
    }

    public final void setSecondLineText(@l String text) {
        I5.a(getSecondLineText(), text, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ServiceBookingPlateView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        attributeSet = (i13 & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, (i13 & 4) != 0 ? 0 : i12);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f279679b = C42727D.b(lazyThreadSafetyMode, new b());
        this.f279680c = C42727D.b(lazyThreadSafetyMode, new c());
        this.f279681d = C42727D.b(lazyThreadSafetyMode, new d());
        this.f279682e = C42727D.b(lazyThreadSafetyMode, new a());
        LayoutInflater.from(context).inflate(R.layout.service_orders_plate, (ViewGroup) this, true);
        setCardElevation(0.0f);
        setPreventCornerOverlap(false);
        setUseCompatPadding(false);
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, a.g.f279061a, 0, 0);
        try {
            String string = typedArrayObtainStyledAttributes.getString(2);
            String string2 = typedArrayObtainStyledAttributes.getString(3);
            String string3 = typedArrayObtainStyledAttributes.getString(0);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            I5.a(getFirstLineText(), string, false);
            I5.a(getSecondLineText(), string2, false);
            I5.a(getBoldLineText(), string3, false);
            FV.a.a(FV.a.f4720a, getIconLineText(), Integer.valueOf(resourceId));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
