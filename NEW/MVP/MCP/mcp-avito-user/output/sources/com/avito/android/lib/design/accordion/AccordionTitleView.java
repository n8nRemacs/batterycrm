package com.avito.android.lib.design.accordion;

import PK0.n;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.lib.design.text_view.e;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AccordionTitleView.kt */
@s0
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0010J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0010J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u0010J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u0010J\u0015\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u001c¢\u0006\u0004\b%\u0010\u001fJ\u0017\u0010(\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)R\u0017\u0010/\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R/\u00108\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u0001008F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b2\u00103\"\u0004\b4\u00105*\u0004\b6\u00107¨\u00069"}, d2 = {"Lcom/avito/android/lib/design/accordion/AccordionTitleView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "LPK0/n;", "textStyle", "Lkotlin/G0;", "setTitleAppearance", "(LPK0/n;)V", "", "value", "setSpinnerHeight", "(I)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setArrowIcon", "(Landroid/graphics/drawable/Drawable;)V", "spacing", "setArrowTextSpacing", "offset", "setArrowVerticalOffset", "inset", "setArrowLeftInset", "setArrowRightInset", "", "isLoading", "setLoading", "(Z)V", "", "title", "setTitle", "(Ljava/lang/String;)V", "isArrowAlignedEnd", "setArrowAlignmentEnd", "Landroid/view/View;", "accessory", "setAccessoryView", "(Landroid/view/View;)V", "Landroid/widget/FrameLayout;", "f", "Landroid/widget/FrameLayout;", "getAccessoryContainer", "()Landroid/widget/FrameLayout;", "accessoryContainer", "", "<set-?>", "getTitleText", "()Ljava/lang/CharSequence;", "setTitleText", "(Ljava/lang/CharSequence;)V", "getTitleText$delegate", "(Lcom/avito/android/lib/design/accordion/AccordionTitleView;)Ljava/lang/Object;", "titleText", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AccordionTitleView extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.text_view.a f178190b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.text_view.a f178191c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImageView f178192d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Spinner f178193e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @k
    public final FrameLayout accessoryContainer;

    /* renamed from: g, reason: collision with root package name */
    public int f178195g;

    /* renamed from: h, reason: collision with root package name */
    public int f178196h;

    /* renamed from: i, reason: collision with root package name */
    public int f178197i;

    /* renamed from: j, reason: collision with root package name */
    public int f178198j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f178199k;

    /* renamed from: l, reason: collision with root package name */
    public int f178200l;

    public /* synthetic */ AccordionTitleView(Context context, AttributeSet attributeSet, int i12, C42822w c42822w) {
        this(context, (i12 & 2) != 0 ? null : attributeSet);
    }

    @k
    public final FrameLayout getAccessoryContainer() {
        return this.accessoryContainer;
    }

    @l
    public final CharSequence getTitleText() {
        return this.f178190b.getText();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int measuredWidth;
        int measuredWidth2;
        com.avito.android.lib.design.text_view.a aVar = this.f178190b;
        int measuredWidth3 = aVar.getMeasuredWidth() + i12;
        aVar.layout(i12, i13, measuredWidth3, aVar.getMeasuredHeight() + i13);
        boolean z13 = this.f178199k || (aVar.getLineCount() > 1);
        ImageView imageView = this.f178192d;
        if (z13) {
            measuredWidth = i14 - imageView.getMeasuredWidth();
            measuredWidth2 = i14;
        } else {
            measuredWidth = measuredWidth3 + this.f178195g;
            measuredWidth2 = imageView.getMeasuredWidth() + measuredWidth;
        }
        int measuredHeight = imageView.getMeasuredHeight() + i13;
        imageView.layout(measuredWidth, i13, measuredWidth2, measuredHeight);
        Spinner spinner = this.f178193e;
        int iMin = Math.min((spinner.getMeasuredWidth() / 2) + ((measuredWidth2 + measuredWidth) / 2), i14);
        int measuredHeight2 = ((measuredHeight + i13) / 2) - (spinner.getMeasuredHeight() / 2);
        spinner.layout(iMin - spinner.getMeasuredWidth(), measuredHeight2, iMin, spinner.getMeasuredHeight() + measuredHeight2);
        FrameLayout frameLayout = this.accessoryContainer;
        if (frameLayout.getChildCount() > 0) {
            int measuredHeight3 = frameLayout.getMeasuredHeight();
            int measuredHeight4 = this.f178191c.getMeasuredHeight();
            if (measuredHeight3 < measuredHeight4) {
                i13 = ((measuredHeight4 / 2) + i13) - (measuredHeight3 / 2);
            }
            int measuredHeight5 = frameLayout.getMeasuredHeight() + i13;
            if (z13) {
                i14 = measuredWidth - this.f178195g;
            }
            frameLayout.layout(i14 - frameLayout.getMeasuredWidth(), i13, i14, measuredHeight5);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int measuredHeight;
        View view = this.f178191c;
        measureChild(view, i12, i13);
        View view2 = this.f178192d;
        measureChild(view2, View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight() / 2, 1073741824), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f178200l, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.f178200l, 1073741824);
        View view3 = this.f178193e;
        measureChild(view3, iMakeMeasureSpec, iMakeMeasureSpec2);
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        FrameLayout frameLayout = this.accessoryContainer;
        int measuredHeight2 = 0;
        boolean z12 = frameLayout.getChildCount() > 0;
        int measuredWidth = view2.getMeasuredWidth() + this.f178195g;
        View view4 = this.f178190b;
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                measureChild(view4, i12, i13);
                if (z12) {
                    measureChild(frameLayout, i12, i13);
                    measuredHeight2 = frameLayout.getMeasuredWidth() + this.f178195g;
                    measuredHeight = frameLayout.getMeasuredHeight();
                } else {
                    measuredHeight = 0;
                }
                setMeasuredDimension(view2.getMeasuredWidth() + view4.getMeasuredWidth() + this.f178195g + measuredHeight2, kotlin.comparisons.a.c(view4.getMeasuredHeight(), view2.getMeasuredHeight(), view3.getMeasuredHeight(), measuredHeight));
                return;
            }
            if (mode != 1073741824) {
                return;
            }
        }
        if (z12) {
            measureChild(frameLayout, View.MeasureSpec.makeMeasureSpec(size - measuredWidth, BeduinInputModel.MIN_TEXT_VERSION), i13);
            measuredWidth += frameLayout.getMeasuredWidth() + this.f178195g;
            measuredHeight2 = frameLayout.getMeasuredHeight();
        }
        measureChild(view4, View.MeasureSpec.makeMeasureSpec(size - measuredWidth, BeduinInputModel.MIN_TEXT_VERSION), i13);
        setMeasuredDimension(size, kotlin.comparisons.a.c(view4.getMeasuredHeight(), view2.getMeasuredHeight(), view3.getMeasuredHeight(), measuredHeight2));
    }

    public final void setAccessoryView(@l View accessory) {
        FrameLayout frameLayout = this.accessoryContainer;
        frameLayout.removeAllViews();
        if (accessory != null) {
            frameLayout.addView(accessory);
        }
    }

    public final void setArrowAlignmentEnd(boolean isArrowAlignedEnd) {
        if (this.f178199k != isArrowAlignedEnd) {
            this.f178199k = isArrowAlignedEnd;
            requestLayout();
        }
    }

    public final void setArrowIcon(@l Drawable drawable) {
        this.f178192d.setImageDrawable(drawable);
    }

    public final void setArrowLeftInset(int inset) {
        this.f178197i = inset;
        ImageView imageView = this.f178192d;
        imageView.setPadding(inset, imageView.getPaddingTop(), imageView.getPaddingRight(), imageView.getPaddingBottom());
    }

    public final void setArrowRightInset(int inset) {
        this.f178198j = inset;
        ImageView imageView = this.f178192d;
        imageView.setPadding(imageView.getPaddingLeft(), imageView.getPaddingTop(), inset, imageView.getPaddingBottom());
    }

    public final void setArrowTextSpacing(int spacing) {
        this.f178195g = spacing;
    }

    public final void setArrowVerticalOffset(int offset) {
        this.f178196h = offset;
        ImageView imageView = this.f178192d;
        imageView.setPadding(imageView.getPaddingLeft(), offset, imageView.getPaddingRight(), imageView.getPaddingBottom());
    }

    public final void setLoading(boolean isLoading) {
        this.f178193e.setVisibility(isLoading ? 0 : 8);
        this.f178192d.setVisibility(isLoading ? 8 : 0);
    }

    public final void setSpinnerHeight(int value) {
        this.f178200l = value;
        this.f178193e.setSize(value);
    }

    public final void setTitle(@k String title) {
        this.f178190b.setText(title);
    }

    public final void setTitleAppearance(@k n textStyle) {
        e.a(this.f178190b, textStyle);
        e.a(this.f178191c, textStyle);
    }

    public final void setTitleText(@l CharSequence charSequence) {
        this.f178190b.setText(charSequence);
    }

    public AccordionTitleView(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(context, null, 0, 0, 14, null);
        aVar.setId(R.id.accordion_title_text);
        aVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        addView(aVar);
        this.f178190b = aVar;
        com.avito.android.lib.design.text_view.a aVar2 = new com.avito.android.lib.design.text_view.a(context, null, 0, 0, 14, null);
        aVar2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        addView(aVar2);
        this.f178191c = aVar2;
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.accordion_arrow);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        imageView.setPadding(this.f178197i, this.f178196h, this.f178198j, 0);
        imageView.setImageTintList(C35835l0.e(R.attr.black, context));
        addView(imageView);
        this.f178192d = imageView;
        Spinner spinner = new Spinner(context);
        spinner.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        spinner.setTintColor(C35835l0.e(R.attr.black, context));
        addView(spinner);
        this.f178193e = spinner;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.accessoryContainer = frameLayout;
        addView(frameLayout);
    }
}
