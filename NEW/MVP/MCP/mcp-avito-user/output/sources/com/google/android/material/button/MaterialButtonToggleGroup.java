package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.core.view.A0;
import androidx.core.view.C22808a;
import androidx.core.view.C22823h0;
import androidx.core.view.accessibility.f;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.G;
import com.google.android.material.internal.O;
import com.google.android.material.shape.q;
import j.D;
import j.InterfaceC42152h;
import j.N;
import j.P;
import j.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: l, reason: collision with root package name */
    public static final int f356069l = R.style.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f356070b;

    /* renamed from: c, reason: collision with root package name */
    public final e f356071c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet<d> f356072d;

    /* renamed from: e, reason: collision with root package name */
    public final Comparator<MaterialButton> f356073e;

    /* renamed from: f, reason: collision with root package name */
    public Integer[] f356074f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f356075g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f356076h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f356077i;

    /* renamed from: j, reason: collision with root package name */
    @D
    public final int f356078j;

    /* renamed from: k, reason: collision with root package name */
    public HashSet f356079k;

    public class a implements Comparator<MaterialButton> {
        public a() {
        }

        @Override // java.util.Comparator
        public final int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            MaterialButton materialButton3 = materialButton;
            MaterialButton materialButton4 = materialButton2;
            int iCompareTo = Boolean.valueOf(materialButton3.isChecked()).compareTo(Boolean.valueOf(materialButton4.isChecked()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton3)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton4)));
        }
    }

    public class b extends C22808a {
        public b() {
        }

        @Override // androidx.core.view.C22808a
        public final void d(View view, @N f fVar) {
            this.f44991a.onInitializeAccessibilityNodeInfo(view, fVar.f44999a);
            int i12 = MaterialButtonToggleGroup.f356069l;
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            int i13 = -1;
            if (view instanceof MaterialButton) {
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    if (i14 >= materialButtonToggleGroup.getChildCount()) {
                        break;
                    }
                    if (materialButtonToggleGroup.getChildAt(i14) == view) {
                        i13 = i15;
                        break;
                    }
                    if ((materialButtonToggleGroup.getChildAt(i14) instanceof MaterialButton) && materialButtonToggleGroup.c(i14)) {
                        i15++;
                    }
                    i14++;
                }
            }
            fVar.n(f.g.a(0, 1, i13, 1, ((MaterialButton) view).isChecked()));
        }
    }

    public static class c {

        /* renamed from: e, reason: collision with root package name */
        public static final com.google.android.material.shape.a f356082e = new com.google.android.material.shape.a(0.0f);

        /* renamed from: a, reason: collision with root package name */
        public final com.google.android.material.shape.e f356083a;

        /* renamed from: b, reason: collision with root package name */
        public final com.google.android.material.shape.e f356084b;

        /* renamed from: c, reason: collision with root package name */
        public final com.google.android.material.shape.e f356085c;

        /* renamed from: d, reason: collision with root package name */
        public final com.google.android.material.shape.e f356086d;

        public c(com.google.android.material.shape.e eVar, com.google.android.material.shape.e eVar2, com.google.android.material.shape.e eVar3, com.google.android.material.shape.e eVar4) {
            this.f356083a = eVar;
            this.f356084b = eVar3;
            this.f356085c = eVar4;
            this.f356086d = eVar2;
        }
    }

    public interface d {
        void a(@D int i12, boolean z12);
    }

    public class e implements MaterialButton.c {
        public e(a aVar) {
        }

        @Override // com.google.android.material.button.MaterialButton.c
        public final void a() {
            MaterialButtonToggleGroup.this.invalidate();
        }
    }

    public MaterialButtonToggleGroup(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonToggleGroupStyle);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            if (c(i12)) {
                return i12;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i12 = 0;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            if ((getChildAt(i13) instanceof MaterialButton) && c(i13)) {
                i12++;
            }
        }
        return i12;
    }

    private void setGeneratedIdIfNeeded(@N MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(@N MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f356071c);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i12 = firstVisibleChildIndex + 1; i12 < getChildCount(); i12++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i12);
            int iMin = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i12 - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i12, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i12, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            setupButtonChild(materialButton);
            b(materialButton.getId(), materialButton.isChecked());
            q shapeAppearanceModel = materialButton.getShapeAppearanceModel();
            this.f356070b.add(new c(shapeAppearanceModel.f357085e, shapeAppearanceModel.f357088h, shapeAppearanceModel.f357086f, shapeAppearanceModel.f357087g));
            materialButton.setEnabled(isEnabled());
            C22823h0.C(materialButton, new b());
        }
    }

    public final void b(@D int i12, boolean z12) {
        if (i12 == -1) {
            return;
        }
        HashSet hashSet = new HashSet(this.f356079k);
        if (z12 && !hashSet.contains(Integer.valueOf(i12))) {
            if (this.f356076h && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i12));
        } else {
            if (z12 || !hashSet.contains(Integer.valueOf(i12))) {
                return;
            }
            if (!this.f356077i || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i12));
            }
        }
        d(hashSet);
    }

    public final boolean c(int i12) {
        return getChildAt(i12).getVisibility() != 8;
    }

    public final void d(Set<Integer> set) {
        HashSet hashSet = this.f356079k;
        this.f356079k = new HashSet(set);
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            int id2 = ((MaterialButton) getChildAt(i12)).getId();
            boolean zContains = set.contains(Integer.valueOf(id2));
            View viewFindViewById = findViewById(id2);
            if (viewFindViewById instanceof MaterialButton) {
                this.f356075g = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f356075g = false;
            }
            if (hashSet.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                boolean zContains2 = set.contains(Integer.valueOf(id2));
                Iterator<d> it = this.f356072d.iterator();
                while (it.hasNext()) {
                    it.next().a(id2, zContains2);
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(@N Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f356073e);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            treeMap.put((MaterialButton) getChildAt(i12), Integer.valueOf(i12));
        }
        this.f356074f = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    @k0
    public final void e() {
        c cVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i12 = 0; i12 < childCount; i12++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i12);
            if (materialButton.getVisibility() != 8) {
                q.b bVarF = materialButton.getShapeAppearanceModel().f();
                c cVar2 = (c) this.f356070b.get(i12);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z12 = getOrientation() == 0;
                    com.google.android.material.shape.a aVar = c.f356082e;
                    if (i12 == firstVisibleChildIndex) {
                        cVar = z12 ? O.f(this) ? new c(aVar, aVar, cVar2.f356084b, cVar2.f356085c) : new c(cVar2.f356083a, cVar2.f356086d, aVar, aVar) : new c(cVar2.f356083a, aVar, cVar2.f356084b, aVar);
                    } else if (i12 == lastVisibleChildIndex) {
                        cVar = z12 ? O.f(this) ? new c(cVar2.f356083a, cVar2.f356086d, aVar, aVar) : new c(aVar, aVar, cVar2.f356084b, cVar2.f356085c) : new c(aVar, cVar2.f356086d, aVar, cVar2.f356085c);
                    } else {
                        cVar2 = null;
                    }
                    cVar2 = cVar;
                }
                if (cVar2 == null) {
                    bVarF.c(0.0f);
                } else {
                    bVarF.f357097e = cVar2.f356083a;
                    bVarF.f357100h = cVar2.f356086d;
                    bVarF.f357098f = cVar2.f356084b;
                    bVarF.f357099g = cVar2.f356085c;
                }
                materialButton.setShapeAppearanceModel(bVarF.a());
            }
        }
    }

    @D
    public int getCheckedButtonId() {
        if (!this.f356076h || this.f356079k.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f356079k.iterator().next()).intValue();
    }

    @N
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            int id2 = ((MaterialButton) getChildAt(i12)).getId();
            if (this.f356079k.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i12, int i13) {
        Integer[] numArr = this.f356074f;
        return (numArr == null || i13 >= numArr.length) ? i13 : numArr[i13].intValue();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i12 = this.f356078j;
        if (i12 != -1) {
            d(Collections.singleton(Integer.valueOf(i12)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@N AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new f(accessibilityNodeInfo).m(f.C1754f.a(1, getVisibleButtonCount(), this.f356076h ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        e();
        a();
        super.onMeasure(i12, i13);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f356070b.remove(iIndexOfChild);
        }
        e();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z12) {
        super.setEnabled(z12);
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            ((MaterialButton) getChildAt(i12)).setEnabled(z12);
        }
    }

    public void setSelectionRequired(boolean z12) {
        this.f356077i = z12;
    }

    public void setSingleSelection(boolean z12) {
        if (this.f356076h != z12) {
            this.f356076h = z12;
            d(new HashSet());
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            ((MaterialButton) getChildAt(i12)).setA11yClassName((this.f356076h ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(@N Context context, @P AttributeSet attributeSet, int i12) {
        int i13 = f356069l;
        super(BY0.a.a(context, attributeSet, i12, i13), attributeSet, i12);
        this.f356070b = new ArrayList();
        this.f356071c = new e(null);
        this.f356072d = new LinkedHashSet<>();
        this.f356073e = new a();
        this.f356075g = false;
        this.f356079k = new HashSet();
        TypedArray typedArrayD = G.d(getContext(), attributeSet, R.styleable.MaterialButtonToggleGroup, i12, i13, new int[0]);
        setSingleSelection(typedArrayD.getBoolean(R.styleable.MaterialButtonToggleGroup_singleSelection, false));
        this.f356078j = typedArrayD.getResourceId(R.styleable.MaterialButtonToggleGroup_checkedButton, -1);
        this.f356077i = typedArrayD.getBoolean(R.styleable.MaterialButtonToggleGroup_selectionRequired, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayD.getBoolean(R.styleable.MaterialButtonToggleGroup_android_enabled, true));
        typedArrayD.recycle();
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        setImportantForAccessibility(1);
    }

    public void setSingleSelection(@InterfaceC42152h int i12) {
        setSingleSelection(getResources().getBoolean(i12));
    }
}
