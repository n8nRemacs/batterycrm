package ru.cyberity.cbr.core.widget;

import X41.j;
import Y61.k;
import Y61.l;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.C22829k0;
import androidx.core.view.C22832m;
import androidx.dynamicanimation.animation.i;
import com.google.android.material.shape.q;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.ranges.s;
import lY0.C43709d;
import ru.cyberity.cbr.core.common.ExtensionsKt;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.theme.CBRColorElement;
import ru.cyberity.cbr.core.theme.CBRMetricElement;

/* compiled from: CBRSegmentedToggleView.kt */
@Metadata(d1 = {"\u0000\u0081\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012*\u0001C\u0018\u0000 Y2\u00020\u00012\u00020\u0002:\u0002YZB1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0016\u001a\u00020\u00152\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001bJ\u0017\u0010\"\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0018H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0018H\u0016¢\u0006\u0004\b$\u0010\u001bJ1\u0010)\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010\u00182\u0006\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\fH\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0018H\u0016¢\u0006\u0004\b+\u0010#J1\u0010.\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010\u00182\u0006\u0010&\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020\fH\u0016¢\u0006\u0004\b.\u0010*R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00106R\u0016\u0010?\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00106R\u0016\u0010@\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00106R\u001e\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR$\u0010J\u001a\u0004\u0018\u00010I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010P\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u00106\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010X\u001a\u00020\u00072\u0006\u0010U\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010R\"\u0004\bW\u0010T¨\u0006["}, d2 = {"Lru/cyberity/cbr/core/widget/CBRSegmentedToggleView;", "Landroid/widget/LinearLayout;", "Landroid/view/GestureDetector$OnGestureListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "x", "", "performTapSelection", "(F)Z", "", "", "items", "selectedIndex", "Lkotlin/G0;", "setItems", "(Ljava/util/List;I)V", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "e", "onDown", "onShowPress", "(Landroid/view/MotionEvent;)V", "onSingleTapUp", "e1", "e2", "distanceX", "distanceY", "onScroll", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z", "onLongPress", "velocityX", "velocityY", "onFling", "Lcom/google/android/material/shape/q;", "shapeAppearance", "Lcom/google/android/material/shape/q;", "Lcom/google/android/material/shape/k;", "selectedItemBackground", "Lcom/google/android/material/shape/k;", "textAppearance", "I", "Landroidx/core/view/m;", "gestureDetector", "Landroidx/core/view/m;", "selected", "F", "isScrolling", "Z", "saveCurrentSelected", "textColor", "selectedTextColor", "segments", "Ljava/util/List;", "ru/cyberity/cbr/core/widget/CBRSegmentedToggleView$selectedPropertyHolder$1", "selectedPropertyHolder", "Lru/cyberity/cbr/core/widget/CBRSegmentedToggleView$selectedPropertyHolder$1;", "Landroidx/dynamicanimation/animation/i;", "animator", "Landroidx/dynamicanimation/animation/i;", "Lru/cyberity/cbr/core/widget/CBRSegmentedToggleView$OnItemSelected;", "onItemSelected", "Lru/cyberity/cbr/core/widget/CBRSegmentedToggleView$OnItemSelected;", "getOnItemSelected", "()Lru/cyberity/cbr/core/widget/CBRSegmentedToggleView$OnItemSelected;", "setOnItemSelected", "(Lru/cyberity/cbr/core/widget/CBRSegmentedToggleView$OnItemSelected;)V", "itemPadding", "getItemPadding", "()I", "setItemPadding", "(I)V", "value", "getSelectedItem", "setSelectedItem", "selectedItem", "Companion", "OnItemSelected", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class CBRSegmentedToggleView extends LinearLayout implements GestureDetector.OnGestureListener {

    @k
    private static final Companion Companion = new Companion(null);

    @k
    @Deprecated
    private static final int[] STATE_SELECTED = {R.attr.state_selected};

    @k
    private final i animator;

    @k
    private final C22832m gestureDetector;
    private boolean isScrolling;
    private int itemPadding;

    @l
    private OnItemSelected onItemSelected;
    private int saveCurrentSelected;

    @l
    private List<String> segments;
    private float selected;

    @k
    private final com.google.android.material.shape.k selectedItemBackground;

    @k
    private final CBRSegmentedToggleView$selectedPropertyHolder$1 selectedPropertyHolder;
    private int selectedTextColor;

    @k
    private final q shapeAppearance;
    private int textAppearance;
    private int textColor;

    /* compiled from: CBRSegmentedToggleView.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0015\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRSegmentedToggleView$Companion;", "", "()V", "ANIMATION_MULTIPLIER", "", "STATE_SELECTED", "", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: CBRSegmentedToggleView.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRSegmentedToggleView$OnItemSelected;", "", "", "index", "Lkotlin/G0;", "onSelected", "(I)V", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface OnItemSelected {
        void onSelected(int index);
    }

    @j
    public CBRSegmentedToggleView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: animator$lambda-2$lambda-1, reason: not valid java name */
    public static final void m301animator$lambda2$lambda1(CBRSegmentedToggleView cBRSegmentedToggleView, androidx.dynamicanimation.animation.c cVar, boolean z12, float f12, float f13) {
        cBRSegmentedToggleView.performClick();
        OnItemSelected onItemSelected = cBRSegmentedToggleView.onItemSelected;
        if (onItemSelected != null) {
            onItemSelected.onSelected(cBRSegmentedToggleView.getSelectedItem());
        }
        Iterator<View> it = new C22829k0(cBRSegmentedToggleView).iterator();
        int i12 = 0;
        while (it.hasNext()) {
            View next = it.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            View view = next;
            TextView textView = view instanceof TextView ? (TextView) view : null;
            if (textView != null) {
                textView.setTextColor(i12 == cBRSegmentedToggleView.getSelectedItem() ? cBRSegmentedToggleView.selectedTextColor : cBRSegmentedToggleView.textColor);
            }
            i12 = i13;
        }
    }

    private final boolean performTapSelection(float x12) {
        Iterator<View> it = new C22829k0(this).iterator();
        int i12 = 0;
        while (it.hasNext()) {
            View next = it.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            View view = next;
            if (view.getLeft() < x12 && view.getRight() > x12 && getSelectedItem() != i12) {
                this.animator.h(i12 * 1000.0f);
                return true;
            }
            i12 = i13;
        }
        return false;
    }

    public final int getItemPadding() {
        return this.itemPadding;
    }

    @l
    public final OnItemSelected getOnItemSelected() {
        return this.onItemSelected;
    }

    public final int getSelectedItem() {
        return (int) this.selected;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(@k MotionEvent e12) {
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(@k Canvas canvas) {
        TextView textView;
        super.onDraw(canvas);
        if (getSelectedItem() <= -1 || getSelectedItem() >= getChildCount()) {
            return;
        }
        C43709d c43709d = C43709d.f413884a;
        int i12 = (int) this.selected;
        Integer numValueOf = Integer.valueOf(i12);
        if (i12 >= getChildCount()) {
            numValueOf = null;
        }
        View childAt = numValueOf != null ? getChildAt(numValueOf.intValue()) : null;
        int iCeil = (int) Math.ceil(this.selected);
        Integer numValueOf2 = Integer.valueOf(iCeil);
        if (iCeil >= getChildCount()) {
            numValueOf2 = null;
        }
        View childAt2 = numValueOf2 != null ? getChildAt(numValueOf2.intValue()) : null;
        float f12 = this.selected % 1;
        if (childAt == null || childAt2 == null || childAt.equals(childAt2)) {
            textView = childAt instanceof TextView ? (TextView) childAt : null;
            if (textView != null) {
                textView.setTextColor(this.selectedTextColor);
            }
            int right = 0;
            int left = childAt != null ? childAt.getLeft() : childAt2 != null ? childAt2.getLeft() : 0;
            if (childAt != null) {
                right = childAt.getRight();
            } else if (childAt2 != null) {
                right = childAt2.getRight();
            }
            this.selectedItemBackground.setBounds(left, getPaddingTop(), right, getHeight() - getPaddingBottom());
        } else {
            this.selectedItemBackground.setBounds((int) (((childAt2.getLeft() - childAt.getLeft()) * f12) + childAt.getLeft()), getPaddingTop(), (int) (((childAt2.getRight() - childAt.getRight()) * f12) + childAt.getRight()), getHeight() - getPaddingBottom());
            TextView textView2 = childAt instanceof TextView ? (TextView) childAt : null;
            if (textView2 != null) {
                Integer numValueOf3 = Integer.valueOf(this.selectedTextColor);
                Integer numValueOf4 = Integer.valueOf(this.textColor);
                c43709d.getClass();
                textView2.setTextColor(C43709d.a(f12, numValueOf3, numValueOf4).intValue());
            }
            textView = childAt2 instanceof TextView ? (TextView) childAt2 : null;
            if (textView != null) {
                Integer numValueOf5 = Integer.valueOf(this.textColor);
                Integer numValueOf6 = Integer.valueOf(this.selectedTextColor);
                c43709d.getClass();
                textView.setTextColor(C43709d.a(f12, numValueOf5, numValueOf6).intValue());
            }
        }
        canvas.save();
        this.selectedItemBackground.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(@l MotionEvent e12, @k MotionEvent e22, float velocityX, float velocityY) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(@l MotionEvent e12, @k MotionEvent e22, float distanceX, float distanceY) {
        View childAt;
        if (!this.isScrolling) {
            this.saveCurrentSelected = getSelectedItem();
            this.isScrolling = true;
        }
        if (e12 == null) {
            return false;
        }
        float x12 = e22.getX() - e12.getX();
        int i12 = this.saveCurrentSelected;
        if (i12 == 0 && x12 < 0.0f) {
            return false;
        }
        if ((i12 == getChildCount() - 1 && x12 > 0.0f) || (childAt = getChildAt(this.saveCurrentSelected)) == null || e12.getX() < childAt.getLeft() || e12.getX() > childAt.getRight()) {
            return false;
        }
        this.selected = s.f(this.saveCurrentSelected + ((x12 / ((getWidth() - getPaddingStart()) - getPaddingEnd())) * getChildCount()), 0.0f, getChildCount() - 1);
        postInvalidateOnAnimation();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(@k MotionEvent e12) {
        return performTapSelection(e12.getX());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@k MotionEvent event) {
        if (event.getAction() == 1 && this.isScrolling) {
            this.isScrolling = false;
            this.selected = kotlin.math.b.b(this.selected);
            this.animator.h(getSelectedItem() * 1000.0f);
            ViewParent parent = getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.requestDisallowInterceptTouchEvent(false);
            }
        }
        if (this.gestureDetector.f45080a.onTouchEvent(event)) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    public final void setItemPadding(int i12) {
        this.itemPadding = i12;
    }

    public final void setItems(@k List<String> items, int selectedIndex) {
        if (items.equals(this.segments)) {
            return;
        }
        removeAllViews();
        ViewGroup.LayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        setGravity(16);
        int i12 = 0;
        for (Object obj : items) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            CBRTextView cBRTextView = new CBRTextView(getContext(), null, 0, 0, null, null, 62, null);
            cBRTextView.setText((String) obj);
            cBRTextView.setTextAppearance(this.textAppearance);
            cBRTextView.setTextColor(this.textColor);
            int i14 = this.itemPadding;
            cBRTextView.setPadding(i14, 0, i14, 0);
            addView(cBRTextView, marginLayoutParams);
            i12 = i13;
        }
        this.animator.f46037g = (items.size() - 1) * 1000.0f;
        this.selected = selectedIndex;
    }

    public final void setOnItemSelected(@l OnItemSelected onItemSelected) {
        this.onItemSelected = onItemSelected;
    }

    public final void setSelectedItem(int i12) {
        if (i12 == ((int) this.selected) || i12 < 0 || i12 >= getChildCount()) {
            return;
        }
        this.animator.h(i12 * 1000.0f);
    }

    public /* synthetic */ CBRSegmentedToggleView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? ru.cyberity.cbr.core.R.attr.cbr_CBRSegmentedToggleViewStyle : i12, (i14 & 8) != 0 ? ru.cyberity.cbr.core.R.style.Widget_CBRSegmentedToggleView : i13);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.dynamicanimation.animation.f, ru.cyberity.cbr.core.widget.CBRSegmentedToggleView$selectedPropertyHolder$1] */
    @j
    public CBRSegmentedToggleView(@k Context context, @l AttributeSet attributeSet, int i12, int i13) {
        Float metricDimension;
        super(context, attributeSet, i12, i13);
        q qVarA = q.c(context, attributeSet, i12, i13).a();
        this.shapeAppearance = qVarA;
        com.google.android.material.shape.k kVar = new com.google.android.material.shape.k(qVarA);
        this.selectedItemBackground = kVar;
        this.textAppearance = -1;
        this.textColor = -1;
        this.selectedTextColor = -16776961;
        ?? r42 = new androidx.dynamicanimation.animation.f<CBRSegmentedToggleView>() { // from class: ru.cyberity.cbr.core.widget.CBRSegmentedToggleView$selectedPropertyHolder$1
            {
                super("selectedItem");
            }

            @Override // androidx.dynamicanimation.animation.f
            public float getValue(@l CBRSegmentedToggleView view) {
                return this.this$0.selected * 1000.0f;
            }

            @Override // androidx.dynamicanimation.animation.f
            public void setValue(@l CBRSegmentedToggleView view, float value) {
                this.this$0.selected = value / 1000.0f;
                this.this$0.postInvalidateOnAnimation();
            }
        };
        this.selectedPropertyHolder = r42;
        i iVar = new i(this, r42, 0.0f);
        iVar.f46047t.a(1.0f);
        iVar.f46047t.b(1500.0f);
        iVar.f46038h = 0.0f;
        iVar.b(new d(this, 2));
        this.animator = iVar;
        setOrientation(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ru.cyberity.cbr.core.R.styleable.CBRSegmentedToggleView, i12, i13);
        com.google.android.material.shape.k kVar2 = new com.google.android.material.shape.k(qVarA);
        kVar2.v(typedArrayObtainStyledAttributes.getDimension(ru.cyberity.cbr.core.R.styleable.CBRSegmentedToggleView_boxStrokeWidth, ExtensionsKt.getDp(1)));
        kVar2.u(typedArrayObtainStyledAttributes.getColorStateList(ru.cyberity.cbr.core.R.styleable.CBRSegmentedToggleView_boxStrokeColor));
        kVar2.n(typedArrayObtainStyledAttributes.getColorStateList(ru.cyberity.cbr.core.R.styleable.CBRSegmentedToggleView_boxBackgroundColor));
        setBackground(kVar2);
        kVar.n(typedArrayObtainStyledAttributes.getColorStateList(ru.cyberity.cbr.core.R.styleable.CBRSegmentedToggleView_cbr_itemBackgroundColor));
        this.itemPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(ru.cyberity.cbr.core.R.styleable.CBRSegmentedToggleView_cbr_itemPadding, 0);
        this.textAppearance = typedArrayObtainStyledAttributes.getResourceId(ru.cyberity.cbr.core.R.styleable.CBRSegmentedToggleView_android_textAppearance, -1);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(ru.cyberity.cbr.core.R.styleable.CBRSegmentedToggleView_cbr_textColor);
        int defaultColor = colorStateList != null ? colorStateList.getDefaultColor() : -1;
        this.textColor = defaultColor;
        this.selectedTextColor = colorStateList != null ? colorStateList.getColorForState(STATE_SELECTED, defaultColor) : -16776961;
        G0 g02 = G0.f406611a;
        typedArrayObtainStyledAttributes.recycle();
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        Integer themeColor = themeHelper.getThemeColor(this, CBRColorElement.CAMERA_CONTENT);
        if (themeColor != null) {
            int iIntValue = themeColor.intValue();
            this.textColor = iIntValue;
            kVar.n(ColorStateList.valueOf(iIntValue));
        }
        Integer themeColor2 = themeHelper.getThemeColor(this, CBRColorElement.CONTENT_LINK);
        if (themeColor2 != null) {
            this.selectedTextColor = themeColor2.intValue();
        }
        Integer themeColor3 = themeHelper.getThemeColor(this, CBRColorElement.CAMERA_BACKGROUND_OVERLAY);
        if (themeColor3 != null) {
            int iIntValue2 = themeColor3.intValue();
            Drawable background = getBackground();
            com.google.android.material.shape.k kVar3 = background instanceof com.google.android.material.shape.k ? (com.google.android.material.shape.k) background : null;
            if (kVar3 != null) {
                kVar3.n(ColorStateList.valueOf(iIntValue2));
            }
        }
        ru.cyberity.cbr.core.theme.d customTheme = themeHelper.getCustomTheme();
        if (customTheme != null && (metricDimension = themeHelper.getMetricDimension(customTheme, CBRMetricElement.SEGMENTED_CONTROL_CORNER_RADIUS)) != null) {
            float fFloatValue = metricDimension.floatValue();
            Drawable background2 = getBackground();
            com.google.android.material.shape.k kVar4 = background2 instanceof com.google.android.material.shape.k ? (com.google.android.material.shape.k) background2 : null;
            if (kVar4 != null) {
                kVar4.l(fFloatValue);
            }
            kVar.l(fFloatValue);
        }
        this.gestureDetector = new C22832m(context, this, null);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(@k MotionEvent e12) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(@k MotionEvent e12) {
    }
}
