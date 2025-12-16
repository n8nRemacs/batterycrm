package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.app.AbstractC19927a;
import androidx.appcompat.widget.AppCompatTextView;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.yandex.div.core.font.DivTypefaceType;
import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;
import j.N;
import j.P;
import j.f0;
import java.util.concurrent.ExecutionException;

/* compiled from: TabView.java */
/* loaded from: classes7.dex */
public final class y extends AppCompatTextView {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f370521l = 0;

    /* renamed from: b, reason: collision with root package name */
    @P
    public com.yandex.div.core.font.a f370522b;

    /* renamed from: c, reason: collision with root package name */
    @f0
    public int f370523c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f370524d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f370525e;

    /* renamed from: f, reason: collision with root package name */
    @N
    public a f370526f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public b f370527g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public BaseIndicatorTabLayout.f f370528h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public DivTypefaceType f370529i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public DivTypefaceType f370530j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f370531k;

    /* compiled from: TabView.java */
    public interface a {
        int d0();
    }

    /* compiled from: TabView.java */
    public interface b {
        void a();
    }

    public y(@N Context context) {
        super(context, null, 0);
        this.f370526f = new w();
        setGravity(8388627);
        setClickable(true);
        setMaxLines(1);
        setSingleLine(true);
        setOnClickListener(new x());
    }

    @P
    private Typeface getDefaultTypeface() {
        com.yandex.div.core.font.a aVar = this.f370522b;
        if (aVar != null) {
            if (this.f370531k) {
                DivTypefaceType divTypefaceType = this.f370530j;
                if (divTypefaceType != null) {
                    int iOrdinal = divTypefaceType.ordinal();
                    return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? aVar.getRegular() : aVar.getLight() : aVar.getBold() : aVar.getMedium();
                }
            } else {
                DivTypefaceType divTypefaceType2 = this.f370529i;
                if (divTypefaceType2 != null) {
                    int iOrdinal2 = divTypefaceType2.ordinal();
                    return iOrdinal2 != 1 ? iOrdinal2 != 2 ? iOrdinal2 != 3 ? aVar.getRegular() : aVar.getLight() : aVar.getBold() : aVar.getMedium();
                }
            }
        }
        if (aVar != null) {
            return aVar.getMedium();
        }
        return null;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(AbstractC19927a.f.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(AbstractC19927a.f.class.getName());
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i12, int i13) throws ExecutionException, InterruptedException {
        BaseIndicatorTabLayout.f fVar;
        CharSequence transformation;
        TextPaint paint;
        Typeface defaultTypeface;
        TextPaint paint2 = getPaint();
        if (paint2 != null && (defaultTypeface = getDefaultTypeface()) != null) {
            paint2.setTypeface(defaultTypeface);
        }
        if (!this.f370525e) {
            super.onMeasure(i12, i13);
            return;
        }
        int size = View.MeasureSpec.getSize(i12);
        int mode = View.MeasureSpec.getMode(i12);
        int iD02 = this.f370526f.d0();
        if (iD02 > 0 && (mode == 0 || size > iD02)) {
            i12 = View.MeasureSpec.makeMeasureSpec(iD02, BeduinInputModel.MIN_TEXT_VERSION);
        }
        super.onMeasure(i12, i13);
        Layout layout = getLayout();
        if (layout == null || layout.getEllipsisCount(0) <= 0 || (fVar = this.f370528h) == null || (transformation = fVar.f370443a) == null || (paint = layout.getPaint()) == null) {
            return;
        }
        TransformationMethod transformationMethod = getTransformationMethod();
        if (transformationMethod != null) {
            transformation = transformationMethod.getTransformation(transformation, this);
        }
        if (transformation == null) {
            return;
        }
        setText(TextUtils.ellipsize(transformation, paint, ((int) layout.getLineMax(0)) - paint.measureText("..."), TextUtils.TruncateAt.END));
        super.onMeasure(i12, i13);
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        BaseIndicatorTabLayout.f fVar = this.f370528h;
        if (fVar == null) {
            return zPerformClick;
        }
        BaseIndicatorTabLayout baseIndicatorTabLayout = fVar.f370445c;
        if (baseIndicatorTabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        baseIndicatorTabLayout.p(fVar, true);
        return true;
    }

    public void setActiveTypefaceType(@P DivTypefaceType divTypefaceType) {
        this.f370530j = divTypefaceType;
    }

    public void setBoldTextOnSelection(boolean z12) {
        this.f370524d = z12;
    }

    public void setEllipsizeEnabled(boolean z12) {
        this.f370525e = z12;
        setEllipsize(z12 ? TextUtils.TruncateAt.END : null);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z12) {
        super.setEnabled(z12);
        setAlpha(z12 ? 1.0f : 0.2f);
    }

    public void setInactiveTypefaceType(@P DivTypefaceType divTypefaceType) {
        this.f370529i = divTypefaceType;
    }

    public void setMaxWidthProvider(@N a aVar) {
        this.f370526f = aVar;
    }

    public void setOnUpdateListener(@P b bVar) {
        this.f370527g = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z12) {
        boolean z13 = isSelected() != z12;
        super.setSelected(z12);
        setTypefaceType(z12);
        if (this.f370524d && z13 && !isSelected()) {
            setTextAppearance(getContext(), this.f370523c);
        }
        if (z13 && z12) {
            sendAccessibilityEvent(4);
        }
    }

    public void setTab(@P BaseIndicatorTabLayout.f fVar) {
        if (fVar != this.f370528h) {
            this.f370528h = fVar;
            setText(fVar == null ? null : fVar.f370443a);
            b bVar = this.f370527g;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public void setTextColorList(@P ColorStateList colorStateList) {
        if (colorStateList != null) {
            setTextColor(colorStateList);
        }
    }

    public void setTypefaceType(boolean z12) {
        boolean z13 = this.f370531k != z12;
        this.f370531k = z12;
        if (z13) {
            requestLayout();
        }
    }
}
