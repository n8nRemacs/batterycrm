package androidx.percentlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.percentlayout.widget.b;
import java.util.WeakHashMap;

@Deprecated
/* loaded from: classes.dex */
public class PercentRelativeLayout extends RelativeLayout {

    /* renamed from: b, reason: collision with root package name */
    public final b f53292b;

    @Deprecated
    public static class a extends RelativeLayout.LayoutParams implements b.InterfaceC1879b {

        /* renamed from: b, reason: collision with root package name */
        public b.a f53293b;

        @Override // androidx.percentlayout.widget.b.InterfaceC1879b
        public final b.a a() {
            if (this.f53293b == null) {
                this.f53293b = new b.a();
            }
            return this.f53293b;
        }

        @Override // android.view.ViewGroup.LayoutParams
        public final void setBaseAttributes(TypedArray typedArray, int i12, int i13) {
            ((ViewGroup.LayoutParams) this).width = typedArray.getLayoutDimension(i12, 0);
            ((ViewGroup.LayoutParams) this).height = typedArray.getLayoutDimension(i13, 0);
        }
    }

    public PercentRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53292b = new b(this);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-1, -1);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        a aVar = new a(context, attributeSet);
        aVar.f53293b = b.a(context, attributeSet);
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        b.a aVarA;
        super.onLayout(z12, i12, i13, i14, i15);
        PercentRelativeLayout percentRelativeLayout = this.f53292b.f53295a;
        int childCount = percentRelativeLayout.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            ViewGroup.LayoutParams layoutParams = percentRelativeLayout.getChildAt(i16).getLayoutParams();
            if ((layoutParams instanceof b.InterfaceC1879b) && (aVarA = ((b.InterfaceC1879b) layoutParams).a()) != null) {
                boolean z13 = layoutParams instanceof ViewGroup.MarginLayoutParams;
                b.c cVar = aVarA.f53305j;
                if (z13) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (!cVar.f53307b) {
                        ((ViewGroup.LayoutParams) marginLayoutParams).width = ((ViewGroup.MarginLayoutParams) cVar).width;
                    }
                    if (!cVar.f53306a) {
                        ((ViewGroup.LayoutParams) marginLayoutParams).height = ((ViewGroup.MarginLayoutParams) cVar).height;
                    }
                    cVar.f53307b = false;
                    cVar.f53306a = false;
                    marginLayoutParams.leftMargin = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
                    marginLayoutParams.topMargin = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
                    marginLayoutParams.rightMargin = ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                    marginLayoutParams.bottomMargin = ((ViewGroup.MarginLayoutParams) cVar).bottomMargin;
                    marginLayoutParams.setMarginStart(cVar.getMarginStart());
                    marginLayoutParams.setMarginEnd(cVar.getMarginEnd());
                } else {
                    if (!cVar.f53307b) {
                        layoutParams.width = ((ViewGroup.MarginLayoutParams) cVar).width;
                    }
                    if (!cVar.f53306a) {
                        layoutParams.height = ((ViewGroup.MarginLayoutParams) cVar).height;
                    }
                    cVar.f53307b = false;
                    cVar.f53306a = false;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        b.a aVarA;
        b.a aVarA2;
        boolean z12;
        b bVar = this.f53292b;
        bVar.getClass();
        int size = View.MeasureSpec.getSize(i12);
        PercentRelativeLayout percentRelativeLayout = bVar.f53295a;
        int paddingLeft = (size - percentRelativeLayout.getPaddingLeft()) - percentRelativeLayout.getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i13) - percentRelativeLayout.getPaddingTop()) - percentRelativeLayout.getPaddingBottom();
        int childCount = percentRelativeLayout.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = percentRelativeLayout.getChildAt(i14);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof b.InterfaceC1879b) && (aVarA2 = ((b.InterfaceC1879b) layoutParams).a()) != null) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    aVarA2.a(marginLayoutParams, paddingLeft, size2);
                    int i15 = marginLayoutParams.leftMargin;
                    b.c cVar = aVarA2.f53305j;
                    ((ViewGroup.MarginLayoutParams) cVar).leftMargin = i15;
                    ((ViewGroup.MarginLayoutParams) cVar).topMargin = marginLayoutParams.topMargin;
                    ((ViewGroup.MarginLayoutParams) cVar).rightMargin = marginLayoutParams.rightMargin;
                    ((ViewGroup.MarginLayoutParams) cVar).bottomMargin = marginLayoutParams.bottomMargin;
                    cVar.setMarginStart(marginLayoutParams.getMarginStart());
                    cVar.setMarginEnd(marginLayoutParams.getMarginEnd());
                    float f12 = aVarA2.f53298c;
                    if (f12 >= 0.0f) {
                        marginLayoutParams.leftMargin = Math.round(paddingLeft * f12);
                    }
                    float f13 = aVarA2.f53299d;
                    if (f13 >= 0.0f) {
                        marginLayoutParams.topMargin = Math.round(size2 * f13);
                    }
                    float f14 = aVarA2.f53300e;
                    if (f14 >= 0.0f) {
                        marginLayoutParams.rightMargin = Math.round(paddingLeft * f14);
                    }
                    float f15 = aVarA2.f53301f;
                    if (f15 >= 0.0f) {
                        marginLayoutParams.bottomMargin = Math.round(size2 * f15);
                    }
                    float f16 = aVarA2.f53302g;
                    if (f16 >= 0.0f) {
                        marginLayoutParams.setMarginStart(Math.round(paddingLeft * f16));
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    float f17 = aVarA2.f53303h;
                    if (f17 >= 0.0f) {
                        marginLayoutParams.setMarginEnd(Math.round(paddingLeft * f17));
                        z12 = true;
                    }
                    if (z12) {
                        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                        marginLayoutParams.resolveLayoutDirection(childAt.getLayoutDirection());
                    }
                } else {
                    aVarA2.a(layoutParams, paddingLeft, size2);
                }
            }
        }
        super.onMeasure(i12, i13);
        int childCount2 = percentRelativeLayout.getChildCount();
        boolean z13 = false;
        for (int i16 = 0; i16 < childCount2; i16++) {
            View childAt2 = percentRelativeLayout.getChildAt(i16);
            ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
            if ((layoutParams2 instanceof b.InterfaceC1879b) && (aVarA = ((b.InterfaceC1879b) layoutParams2).a()) != null) {
                int measuredWidthAndState = childAt2.getMeasuredWidthAndState() & (-16777216);
                b.c cVar2 = aVarA.f53305j;
                if (measuredWidthAndState == 16777216 && aVarA.f53296a >= 0.0f && ((ViewGroup.MarginLayoutParams) cVar2).width == -2) {
                    layoutParams2.width = -2;
                    z13 = true;
                }
                if ((childAt2.getMeasuredHeightAndState() & (-16777216)) == 16777216 && aVarA.f53297b >= 0.0f && ((ViewGroup.MarginLayoutParams) cVar2).height == -2) {
                    layoutParams2.height = -2;
                    z13 = true;
                }
            }
        }
        if (z13) {
            super.onMeasure(i12, i13);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public final RelativeLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        a aVar = new a(context, attributeSet);
        aVar.f53293b = b.a(context, attributeSet);
        return aVar;
    }
}
