package com.avito.android.lib.design.master_plan_view;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.inline_filters.dialog.select.ViewOnClickListenerC31042l;
import com.avito.android.util.y6;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: MasterPlanView.kt */
@s0
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0014J\u0017\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/avito/android/lib/design/master_plan_view/MasterPlanView;", "Landroid/widget/HorizontalScrollView;", "", "scroll", "Lkotlin/G0;", "setScroll", "(F)V", "Lcom/avito/android/lib/design/master_plan_view/MasterPlanPin;", "pin", "setSelectedPin", "(Lcom/avito/android/lib/design/master_plan_view/MasterPlanPin;)V", "Lcom/avito/android/lib/design/master_plan_view/MasterPlanView$a;", "pinClickListener", "setOnPinClickListener", "(Lcom/avito/android/lib/design/master_plan_view/MasterPlanView$a;)V", "Lkotlin/Function0;", "listener", "setInteractionListener", "(LY41/a;)V", "setSwipeListener", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MasterPlanView extends HorizontalScrollView {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f179664q = 0;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final ImageView f179665b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final FrameLayout f179666c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public ImageView f179667d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public TextView f179668e;

    /* renamed from: f, reason: collision with root package name */
    public int f179669f;

    /* renamed from: g, reason: collision with root package name */
    public int f179670g;

    /* renamed from: h, reason: collision with root package name */
    public int f179671h;

    /* renamed from: i, reason: collision with root package name */
    public float f179672i;

    /* renamed from: j, reason: collision with root package name */
    public float f179673j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final LinkedHashMap f179674k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final LinkedHashMap f179675l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public a f179676m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public Y41.a<G0> f179677n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public Y41.a<G0> f179678o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final Y41.l<View, G0> f179679p;

    /* compiled from: MasterPlanView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/master_plan_view/MasterPlanView$a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void a(@k MasterPlanPin masterPlanPin, float f12);
    }

    @j
    public MasterPlanView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void a(@k List<MasterPlanPin> list) {
        FrameLayout frameLayout;
        LinkedHashMap linkedHashMap = this.f179675l;
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            frameLayout = this.f179666c;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (frameLayout != null) {
                frameLayout.removeView((View) entry.getValue());
            }
        }
        if (this.f179671h == 0) {
            int i12 = getLayoutParams().height;
            this.f179671h = i12;
            this.f179670g = (i12 * 16) / 9;
        }
        for (MasterPlanPin masterPlanPin : list) {
            this.f179674k.put(masterPlanPin.getId(), masterPlanPin);
            ImageView imageView = new ImageView(getContext());
            if (frameLayout != null) {
                frameLayout.addView(imageView);
                imageView.setTag(masterPlanPin.getId());
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(R.drawable.master_plan_pin_default);
                imageView.setOnClickListener(new ViewOnClickListenerC31042l(8, this.f179679p));
                int x12 = (int) (masterPlanPin.getCenter().getX() * this.f179670g);
                int y12 = (int) (masterPlanPin.getCenter().getY() * this.f179671h);
                imageView.getLayoutParams().height = y6.b(44);
                imageView.getLayoutParams().width = y6.b(44);
                ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).setMarginStart(x12 - y6.b(22));
                ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).topMargin = y12 - y6.b(22);
                linkedHashMap.put(masterPlanPin.getId(), imageView);
            }
        }
        if (frameLayout != null) {
            frameLayout.requestLayout();
        }
    }

    public final void setInteractionListener(@k Y41.a<G0> listener) {
        this.f179677n = listener;
    }

    public final void setOnPinClickListener(@k a pinClickListener) {
        this.f179676m = pinClickListener;
    }

    public final void setScroll(float scroll) {
        post(new com.avito.android.lib.design.master_plan_view.a(scroll, 0, this));
    }

    public final void setSelectedPin(@k MasterPlanPin pin) {
        ImageView imageView = this.f179667d;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.master_plan_pin_viewed);
        }
        ImageView imageView2 = (ImageView) this.f179675l.get(pin.getId());
        this.f179667d = imageView2;
        if (imageView2 != null) {
            imageView2.setImageResource(R.drawable.master_plan_pin_selected);
        }
        String name = pin.getName();
        if (name == null || name.length() == 0) {
            return;
        }
        TextView textView = this.f179668e;
        FrameLayout frameLayout = this.f179666c;
        if (textView != null && frameLayout != null) {
            frameLayout.removeView(textView);
        }
        TextView textView2 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.view_master_plan_label, (ViewGroup) null);
        this.f179668e = textView2;
        if (frameLayout != null) {
            frameLayout.addView(textView2);
            TextView textView3 = this.f179668e;
            if (textView3 != null) {
                String name2 = pin.getName();
                if (name2 != null && name2.length() > 20) {
                    name2 = name2.substring(0, 19).concat("...");
                }
                textView3.setText(name2);
            }
            TextView textView4 = this.f179668e;
            if (textView4 != null) {
                int x12 = (int) (pin.getCenter().getX() * this.f179670g);
                int y12 = (int) (pin.getCenter().getY() * this.f179671h);
                textView4.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                ViewGroup.LayoutParams layoutParams = textView4.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = y6.b(28);
                }
                ViewGroup.LayoutParams layoutParams2 = textView4.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = textView4.getMeasuredWidth();
                }
                ((ViewGroup.MarginLayoutParams) textView4.getLayoutParams()).leftMargin = x12 - (textView4.getMeasuredWidth() / 2);
                ((ViewGroup.MarginLayoutParams) textView4.getLayoutParams()).topMargin = y12 - y6.b(38);
            }
            TextView textView5 = this.f179668e;
            if (textView5 != null) {
                textView5.requestLayout();
            }
        }
    }

    public final void setSwipeListener(@k Y41.a<G0> listener) {
        this.f179678o = listener;
    }

    public MasterPlanView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f179674k = new LinkedHashMap();
        this.f179675l = new LinkedHashMap();
        this.f179679p = new b(this);
        View.inflate(context, R.layout.view_master_plan, this);
        this.f179665b = (ImageView) findViewById(R.id.master_plan_image);
        this.f179666c = (FrameLayout) findViewById(R.id.buttons_container);
    }
}
