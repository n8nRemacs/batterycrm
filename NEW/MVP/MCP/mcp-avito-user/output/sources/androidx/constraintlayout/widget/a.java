package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.e;
import androidx.constraintlayout.widget.h;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: ConstraintHelper.java */
/* loaded from: classes.dex */
public abstract class a extends View {

    /* renamed from: b, reason: collision with root package name */
    public int[] f44233b;

    /* renamed from: c, reason: collision with root package name */
    public int f44234c;

    /* renamed from: d, reason: collision with root package name */
    public Context f44235d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.h f44236e;

    /* renamed from: f, reason: collision with root package name */
    public String f44237f;

    /* renamed from: g, reason: collision with root package name */
    public String f44238g;

    /* renamed from: h, reason: collision with root package name */
    public View[] f44239h;

    /* renamed from: i, reason: collision with root package name */
    public HashMap<Integer, String> f44240i;

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44233b = new int[32];
        this.f44239h = null;
        this.f44240i = new HashMap<>();
        this.f44235d = context;
        l(attributeSet);
    }

    public final void c(String str) throws IllegalAccessException, IllegalArgumentException {
        if (str == null || str.length() == 0 || this.f44235d == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iJ2 = j(strTrim);
        if (iJ2 != 0) {
            this.f44240i.put(Integer.valueOf(iJ2), strTrim);
            d(iJ2);
        }
    }

    public final void d(int i12) {
        if (i12 == getId()) {
            return;
        }
        int i13 = this.f44234c + 1;
        int[] iArr = this.f44233b;
        if (i13 > iArr.length) {
            this.f44233b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f44233b;
        int i14 = this.f44234c;
        iArr2[i14] = i12;
        this.f44234c = i14 + 1;
    }

    public final void e(String str) {
        if (str == null || str.length() == 0 || this.f44235d == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = constraintLayout.getChildAt(i12);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && strTrim.equals(((ConstraintLayout.b) layoutParams).f44179Z) && childAt.getId() != -1) {
                d(childAt.getId());
            }
        }
    }

    public final void f() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        g((ConstraintLayout) parent);
    }

    public final void g(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i12 = 0; i12 < this.f44234c; i12++) {
            View viewById = constraintLayout.getViewById(this.f44233b[i12]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f44233b, this.f44234c);
    }

    public final int i(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || (resources = this.f44235d.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = constraintLayout.getChildAt(i12);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public final int j(String str) throws IllegalAccessException, IllegalArgumentException {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i12 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                i12 = ((Integer) designInformation).intValue();
            }
        }
        if (i12 == 0 && constraintLayout != null) {
            i12 = i(constraintLayout, str);
        }
        if (i12 == 0) {
            try {
                i12 = h.g.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (i12 != 0) {
            return i12;
        }
        Context context = this.f44235d;
        return context.getResources().getIdentifier(str, "id", context.getPackageName());
    }

    public final View[] k(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f44239h;
        if (viewArr == null || viewArr.length != this.f44234c) {
            this.f44239h = new View[this.f44234c];
        }
        for (int i12 = 0; i12 < this.f44234c; i12++) {
            this.f44239h[i12] = constraintLayout.getViewById(this.f44233b[i12]);
        }
        return this.f44239h;
    }

    public void l(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.m.f44405b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f44237f = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f44238g = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void m(d.a aVar, androidx.constraintlayout.core.widgets.h hVar, e.a aVar2, SparseArray sparseArray) {
        d.b bVar = aVar.f44269e;
        int[] iArr = bVar.f44331j0;
        int i12 = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar.f44333k0;
            if (str != null) {
                if (str.length() > 0) {
                    String[] strArrSplit = bVar.f44333k0.split(",");
                    getContext();
                    int[] iArrCopyOf = new int[strArrSplit.length];
                    int i13 = 0;
                    for (String str2 : strArrSplit) {
                        int iJ2 = j(str2.trim());
                        if (iJ2 != 0) {
                            iArrCopyOf[i13] = iJ2;
                            i13++;
                        }
                    }
                    if (i13 != strArrSplit.length) {
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i13);
                    }
                    bVar.f44331j0 = iArrCopyOf;
                } else {
                    bVar.f44331j0 = null;
                }
            }
        }
        hVar.a();
        if (bVar.f44331j0 == null) {
            return;
        }
        while (true) {
            int[] iArr2 = bVar.f44331j0;
            if (i12 >= iArr2.length) {
                return;
            }
            ConstraintWidget constraintWidget = (ConstraintWidget) sparseArray.get(iArr2[i12]);
            if (constraintWidget != null) {
                hVar.c(constraintWidget);
            }
            i12++;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f44237f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f44238g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i12, int i13) {
        setMeasuredDimension(0, 0);
    }

    public void q(androidx.constraintlayout.core.widgets.g gVar, SparseArray sparseArray) {
        gVar.a();
        for (int i12 = 0; i12 < this.f44234c; i12++) {
            gVar.c((ConstraintWidget) sparseArray.get(this.f44233b[i12]));
        }
    }

    public final void r() {
        if (this.f44236e == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f44214r0 = this.f44236e;
        }
    }

    public void setIds(String str) {
        this.f44237f = str;
        if (str == null) {
            return;
        }
        int i12 = 0;
        this.f44234c = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i12);
            if (iIndexOf == -1) {
                c(str.substring(i12));
                return;
            } else {
                c(str.substring(i12, iIndexOf));
                i12 = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f44238g = str;
        if (str == null) {
            return;
        }
        int i12 = 0;
        this.f44234c = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i12);
            if (iIndexOf == -1) {
                e(str.substring(i12));
                return;
            } else {
                e(str.substring(i12, iIndexOf));
                i12 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f44237f = null;
        this.f44234c = 0;
        for (int i12 : iArr) {
            d(i12);
        }
    }

    @Override // android.view.View
    public final void setTag(int i12, Object obj) {
        super.setTag(i12, obj);
        if (obj == null && this.f44237f == null) {
            d(i12);
        }
    }

    public void o() {
    }

    public void h(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public void p(ConstraintLayout constraintLayout) {
    }

    public void n(ConstraintWidget constraintWidget, boolean z12) {
    }
}
