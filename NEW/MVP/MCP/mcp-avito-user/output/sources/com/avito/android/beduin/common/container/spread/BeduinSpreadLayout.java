package com.avito.android.beduin.common.container.spread;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.beduin.common.alignment.VerticalAlignment;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinSpreadLayout.kt */
@s0
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001,R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010#\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010+\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020$8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/avito/android/beduin/common/container/spread/BeduinSpreadLayout;", "Landroid/view/ViewGroup;", "Lcom/avito/android/beduin/common/container/spread/m;", "b", "Lcom/avito/android/beduin/common/container/spread/m;", "getLeftPart", "()Lcom/avito/android/beduin/common/container/spread/m;", "leftPart", "c", "getRightPart", "rightPart", "Lcom/avito/android/beduin/common/container/spread/BeduinSpreadLayout$Priority;", "d", "Lcom/avito/android/beduin/common/container/spread/BeduinSpreadLayout$Priority;", "getPriority", "()Lcom/avito/android/beduin/common/container/spread/BeduinSpreadLayout$Priority;", "setPriority", "(Lcom/avito/android/beduin/common/container/spread/BeduinSpreadLayout$Priority;)V", "priority", "Lcom/avito/android/beduin/common/container/spread/Alignment;", "e", "Lcom/avito/android/beduin/common/container/spread/Alignment;", "getAlignment", "()Lcom/avito/android/beduin/common/container/spread/Alignment;", "setAlignment", "(Lcom/avito/android/beduin/common/container/spread/Alignment;)V", "alignment", "Lcom/avito/android/beduin/common/alignment/VerticalAlignment;", "value", "f", "Lcom/avito/android/beduin/common/alignment/VerticalAlignment;", "getVerticalAlignment", "()Lcom/avito/android/beduin/common/alignment/VerticalAlignment;", "setVerticalAlignment", "(Lcom/avito/android/beduin/common/alignment/VerticalAlignment;)V", "verticalAlignment", "", "g", "I", "getItemSpacingPx", "()I", "setItemSpacingPx", "(I)V", "itemSpacingPx", "Priority", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinSpreadLayout extends ViewGroup {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final m leftPart;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final m rightPart;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public Priority priority;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public Alignment alignment;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public VerticalAlignment verticalAlignment;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int itemSpacingPx;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinSpreadLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/container/spread/BeduinSpreadLayout$Priority;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Priority {

        /* renamed from: b, reason: collision with root package name */
        public static final Priority f103185b;

        /* renamed from: c, reason: collision with root package name */
        public static final Priority f103186c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Priority[] f103187d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f103188e;

        static {
            Priority priority = new Priority("LEFT", 0);
            f103185b = priority;
            Priority priority2 = new Priority("RIGHT", 1);
            f103186c = priority2;
            Priority[] priorityArr = {priority, priority2};
            f103187d = priorityArr;
            f103188e = kotlin.enums.c.a(priorityArr);
        }

        public Priority() {
            throw null;
        }

        public static Priority valueOf(String str) {
            return (Priority) Enum.valueOf(Priority.class, str);
        }

        public static Priority[] values() {
            return (Priority[]) f103187d.clone();
        }
    }

    /* compiled from: BeduinSpreadLayout.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f103189a;

        static {
            int[] iArr = new int[Alignment.values().length];
            try {
                iArr[Alignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Alignment.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Alignment.SPREAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Alignment.CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f103189a = iArr;
            int[] iArr2 = new int[Priority.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Priority priority = Priority.f103185b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BeduinSpreadLayout(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        Context context2;
        int i14;
        AttributeSet attributeSet2 = (i13 & 2) != 0 ? null : attributeSet;
        if ((i13 & 4) != 0) {
            i14 = 0;
            context2 = context;
        } else {
            context2 = context;
            i14 = i12;
        }
        super(context2, attributeSet2, i14);
        m mVar = new m(getContext(), null, 0, false, 6, null);
        addView(mVar);
        this.leftPart = mVar;
        m mVar2 = new m(getContext(), null, 0, true, 6, null);
        addView(mVar2);
        this.rightPart = mVar2;
        this.priority = Priority.f103185b;
        this.alignment = Alignment.SPREAD;
        this.verticalAlignment = VerticalAlignment.TOP;
    }

    public final p a(m mVar, int i12, int i13, int i14) {
        if (i12 < (View.MeasureSpec.getMode(i13) == 0 ? Integer.MAX_VALUE : (View.MeasureSpec.getSize(i13) - getPaddingStart()) - getPaddingEnd())) {
            measureChildWithMargins(mVar, i13, i12, i14, 0);
        } else {
            mVar.measure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        }
        int measuredWidth = mVar.getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = mVar.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i15 = measuredWidth + (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0);
        ViewGroup.LayoutParams layoutParams2 = mVar.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        return new p(i15 + (marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0));
    }

    public final int b(int i12, int i13, int i14, View view) {
        int measuredWidth = view.getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i15 = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i16 = marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0;
        int i17 = measuredWidth + i12;
        view.layout(i12 + i15, h.b(view, this, this.verticalAlignment, i13, i14), i17 + i15, h.a(view, this, this.verticalAlignment, i13, i14));
        return i17 + this.itemSpacingPx + i15 + i16;
    }

    public final int c(View view, int i12, int i13, int i14, int i15, int i16) {
        int i17 = i15 - i13;
        int measuredWidth = view.getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i18 = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i19 = marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0;
        view.layout(((i17 - measuredWidth) - i12) - i19, h.b(view, this, this.verticalAlignment, i14, i16), (i17 - i12) - i19, h.a(view, this, this.verticalAlignment, i14, i16));
        return i12 + measuredWidth + this.itemSpacingPx + i18 + i19;
    }

    @Override // android.view.ViewGroup
    @Y61.k
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    @Y61.k
    public final ViewGroup.LayoutParams generateLayoutParams(@Y61.l AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Y61.k
    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final int getItemSpacingPx() {
        return this.itemSpacingPx;
    }

    @Y61.k
    public final m getLeftPart() {
        return this.leftPart;
    }

    @Y61.k
    public final Priority getPriority() {
        return this.priority;
    }

    @Y61.k
    public final m getRightPart() {
        return this.rightPart;
    }

    @Y61.k
    public final VerticalAlignment getVerticalAlignment() {
        return this.verticalAlignment;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i16 = a.f103189a[this.alignment.ordinal()];
        m mVar = this.leftPart;
        m mVar2 = this.rightPart;
        if (i16 == 1) {
            b(b(paddingLeft, i13, i15, mVar), i13, i15, mVar2);
            return;
        }
        if (i16 == 2) {
            c(this.leftPart, c(this.rightPart, paddingRight, i12, i13, i14, i15), i12, i13, i14, i15);
            return;
        }
        if (i16 == 3) {
            b(paddingLeft, i13, i15, mVar);
            c(this.rightPart, paddingRight, i12, i13, i14, i15);
        } else {
            if (i16 != 4) {
                return;
            }
            int width = (this.itemSpacingPx / 2) + (getWidth() / 2);
            c(this.leftPart, (paddingRight + width) - paddingLeft, i12, i13, i14, i15);
            b((paddingLeft + width) - paddingRight, i13, i15, mVar2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int iOrdinal = this.priority.ordinal();
        m mVar = this.leftPart;
        m mVar2 = this.rightPart;
        if (iOrdinal == 0) {
            p pVarA = a(mVar, 0, i12, i13);
            a(mVar2, pVarA.f103215a + this.itemSpacingPx, i12, i13);
        } else if (iOrdinal == 1) {
            p pVarA2 = a(mVar2, 0, i12, i13);
            a(mVar, pVarA2.f103215a + this.itemSpacingPx, i12, i13);
        }
        int iMax = Math.max(mVar.getMeasuredHeight(), mVar2.getMeasuredHeight());
        setMeasuredDimension(View.resolveSize(getPaddingRight() + getPaddingLeft() + mVar2.getMeasuredWidth() + mVar.getMeasuredWidth() + this.itemSpacingPx, i12), getPaddingBottom() + getPaddingTop() + iMax);
    }

    public final void setAlignment(@Y61.k Alignment alignment) {
        this.alignment = alignment;
    }

    public final void setItemSpacingPx(int i12) {
        this.itemSpacingPx = i12;
        this.leftPart.setItemSpacingPx(i12);
        this.rightPart.setItemSpacingPx(i12);
    }

    public final void setPriority(@Y61.k Priority priority) {
        this.priority = priority;
    }

    public final void setVerticalAlignment(@Y61.k VerticalAlignment verticalAlignment) {
        this.verticalAlignment = verticalAlignment;
        this.leftPart.setVerticalAlignment(verticalAlignment);
        this.rightPart.setVerticalAlignment(verticalAlignment);
    }

    @Override // android.view.ViewGroup
    @Y61.k
    public final ViewGroup.LayoutParams generateLayoutParams(@Y61.l ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }
}
