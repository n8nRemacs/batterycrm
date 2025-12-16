package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.b;
import androidx.constraintlayout.core.widgets.m;
import androidx.constraintlayout.widget.h;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static j sSharedValues;
    SparseArray<View> mChildrenByIds;
    private ArrayList<androidx.constraintlayout.widget.a> mConstraintHelpers;
    protected androidx.constraintlayout.widget.b mConstraintLayoutSpec;
    private d mConstraintSet;
    private int mConstraintSetId;
    private f mConstraintsChangedListener;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected androidx.constraintlayout.core.widgets.d mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    c mMeasurer;
    private int mMinHeight;
    private int mMinWidth;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<ConstraintWidget> mTempMapIdToWidget;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44153a;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            f44153a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44153a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44153a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44153a[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class c implements b.InterfaceC1703b {

        /* renamed from: a, reason: collision with root package name */
        public final ConstraintLayout f44224a;

        /* renamed from: b, reason: collision with root package name */
        public int f44225b;

        /* renamed from: c, reason: collision with root package name */
        public int f44226c;

        /* renamed from: d, reason: collision with root package name */
        public int f44227d;

        /* renamed from: e, reason: collision with root package name */
        public int f44228e;

        /* renamed from: f, reason: collision with root package name */
        public int f44229f;

        /* renamed from: g, reason: collision with root package name */
        public int f44230g;

        public c(ConstraintLayout constraintLayout) {
            this.f44224a = constraintLayout;
        }

        public static boolean c(int i12, int i13, int i14) {
            if (i12 == i13) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i12);
            View.MeasureSpec.getSize(i12);
            int mode2 = View.MeasureSpec.getMode(i13);
            int size = View.MeasureSpec.getSize(i13);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i14 == size;
            }
            return false;
        }

        @Override // androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC1703b
        @SuppressLint({"WrongCall"})
        public final void a(ConstraintWidget constraintWidget, b.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int iMax;
            int i12;
            int iMakeMeasureSpec3;
            boolean z12;
            int measuredWidth;
            int baseline;
            int i13;
            if (constraintWidget == null) {
                return;
            }
            if (constraintWidget.f43446i0 == 8 && !constraintWidget.f43408F) {
                aVar.f43493e = 0;
                aVar.f43494f = 0;
                aVar.f43495g = 0;
                return;
            }
            if (constraintWidget.f43424V == null) {
                return;
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.f43489a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = aVar.f43490b;
            int i14 = aVar.f43491c;
            int i15 = aVar.f43492d;
            int i16 = this.f44225b + this.f44226c;
            int i17 = this.f44227d;
            View view = constraintWidget.f43444h0;
            int iOrdinal = dimensionBehaviour.ordinal();
            ConstraintAnchor constraintAnchor = constraintWidget.f43414L;
            ConstraintAnchor constraintAnchor2 = constraintWidget.f43412J;
            if (iOrdinal == 0) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
            } else if (iOrdinal == 1) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f44229f, i17, -2);
            } else if (iOrdinal == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f44229f, i17, -2);
                boolean z13 = constraintWidget.f43463r == 1;
                int i18 = aVar.f43498j;
                if (i18 == 1 || i18 == 2) {
                    boolean z14 = view.getMeasuredHeight() == constraintWidget.o();
                    if (aVar.f43498j == 2 || !z13 || ((z13 && z14) || (view instanceof g) || constraintWidget.E())) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(constraintWidget.u(), 1073741824);
                    }
                }
            } else if (iOrdinal != 3) {
                iMakeMeasureSpec = 0;
            } else {
                int i19 = this.f44229f;
                int i22 = constraintAnchor2 != null ? constraintAnchor2.f43390g : 0;
                if (constraintAnchor != null) {
                    i22 += constraintAnchor.f43390g;
                }
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i19, i17 + i22, -1);
            }
            int iOrdinal2 = dimensionBehaviour2.ordinal();
            if (iOrdinal2 == 0) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
            } else if (iOrdinal2 == 1) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f44230g, i16, -2);
            } else if (iOrdinal2 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f44230g, i16, -2);
                boolean z15 = constraintWidget.f43465s == 1;
                int i23 = aVar.f43498j;
                if (i23 == 1 || i23 == 2) {
                    boolean z16 = view.getMeasuredWidth() == constraintWidget.u();
                    if (aVar.f43498j == 2 || !z15 || ((z15 && z16) || (view instanceof g) || constraintWidget.F())) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(constraintWidget.o(), 1073741824);
                    }
                }
            } else if (iOrdinal2 != 3) {
                iMakeMeasureSpec2 = 0;
            } else {
                int i24 = this.f44230g;
                int i25 = constraintAnchor2 != null ? constraintWidget.f43413K.f43390g : 0;
                if (constraintAnchor != null) {
                    i25 += constraintWidget.f43415M.f43390g;
                }
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i24, i16 + i25, -1);
            }
            androidx.constraintlayout.core.widgets.d dVar = (androidx.constraintlayout.core.widgets.d) constraintWidget.f43424V;
            ConstraintLayout constraintLayout = ConstraintLayout.this;
            if (dVar != null && androidx.constraintlayout.core.widgets.i.b(constraintLayout.mOptimizationLevel, 256) && view.getMeasuredWidth() == constraintWidget.u() && view.getMeasuredWidth() < dVar.u() && view.getMeasuredHeight() == constraintWidget.o() && view.getMeasuredHeight() < dVar.o() && view.getBaseline() == constraintWidget.f43434c0 && !constraintWidget.D() && c(constraintWidget.f43410H, iMakeMeasureSpec, constraintWidget.u()) && c(constraintWidget.f43411I, iMakeMeasureSpec2, constraintWidget.o())) {
                aVar.f43493e = constraintWidget.u();
                aVar.f43494f = constraintWidget.o();
                aVar.f43495g = constraintWidget.f43434c0;
                return;
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f43477d;
            boolean z17 = dimensionBehaviour == dimensionBehaviour3;
            boolean z18 = dimensionBehaviour2 == dimensionBehaviour3;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.f43478e;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.f43475b;
            boolean z19 = dimensionBehaviour2 == dimensionBehaviour4 || dimensionBehaviour2 == dimensionBehaviour5;
            boolean z22 = dimensionBehaviour == dimensionBehaviour4 || dimensionBehaviour == dimensionBehaviour5;
            boolean z23 = z17 && constraintWidget.f43427Y > 0.0f;
            boolean z24 = z18 && constraintWidget.f43427Y > 0.0f;
            if (view == null) {
                return;
            }
            b bVar = (b) view.getLayoutParams();
            int i26 = aVar.f43498j;
            if (i26 != 1 && i26 != 2 && z17 && constraintWidget.f43463r == 0 && z18 && constraintWidget.f43465s == 0) {
                z12 = false;
                measuredWidth = 0;
                i13 = -1;
                baseline = 0;
                iMax = 0;
            } else {
                if ((view instanceof l) && (constraintWidget instanceof androidx.constraintlayout.core.widgets.l)) {
                    ((l) view).s((androidx.constraintlayout.core.widgets.l) constraintWidget, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                constraintWidget.f43410H = iMakeMeasureSpec;
                constraintWidget.f43411I = iMakeMeasureSpec2;
                constraintWidget.f43441g = false;
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                int baseline2 = view.getBaseline();
                int i27 = constraintWidget.f43469u;
                int iMax2 = i27 > 0 ? Math.max(i27, measuredWidth2) : measuredWidth2;
                int i28 = constraintWidget.f43470v;
                if (i28 > 0) {
                    iMax2 = Math.min(i28, iMax2);
                }
                int i29 = constraintWidget.f43472x;
                iMax = i29 > 0 ? Math.max(i29, measuredHeight) : measuredHeight;
                int i32 = iMakeMeasureSpec;
                int i33 = constraintWidget.f43473y;
                if (i33 > 0) {
                    iMax = Math.min(i33, iMax);
                }
                if (!androidx.constraintlayout.core.widgets.i.b(constraintLayout.mOptimizationLevel, 1)) {
                    if (z23 && z19) {
                        iMax2 = (int) ((iMax * constraintWidget.f43427Y) + 0.5f);
                    } else if (z24 && z22) {
                        iMax = (int) ((iMax2 / constraintWidget.f43427Y) + 0.5f);
                    }
                }
                if (measuredWidth2 == iMax2 && measuredHeight == iMax) {
                    baseline = baseline2;
                    measuredWidth = iMax2;
                    z12 = false;
                } else {
                    if (measuredWidth2 != iMax2) {
                        i12 = 1073741824;
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                    } else {
                        i12 = 1073741824;
                        iMakeMeasureSpec3 = i32;
                    }
                    if (measuredHeight != iMax) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax, i12);
                    }
                    view.measure(iMakeMeasureSpec3, iMakeMeasureSpec2);
                    constraintWidget.f43410H = iMakeMeasureSpec3;
                    constraintWidget.f43411I = iMakeMeasureSpec2;
                    z12 = false;
                    constraintWidget.f43441g = false;
                    measuredWidth = view.getMeasuredWidth();
                    int measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    iMax = measuredHeight2;
                }
                i13 = -1;
            }
            boolean z25 = baseline != i13 ? true : z12;
            if (measuredWidth != aVar.f43491c || iMax != aVar.f43492d) {
                z12 = true;
            }
            aVar.f43497i = z12;
            boolean z26 = bVar.f44186d0 ? true : z25;
            if (z26 && baseline != -1 && constraintWidget.f43434c0 != baseline) {
                aVar.f43497i = true;
            }
            aVar.f43493e = measuredWidth;
            aVar.f43494f = iMax;
            aVar.f43496h = z26;
            aVar.f43495g = baseline;
        }

        @Override // androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC1703b
        public final void b() {
            ConstraintLayout constraintLayout = this.f44224a;
            int childCount = constraintLayout.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = constraintLayout.getChildAt(i12);
                if (childAt instanceof g) {
                    g gVar = (g) childAt;
                    if (gVar.f44402c != null) {
                        b bVar = (b) gVar.getLayoutParams();
                        b bVar2 = (b) gVar.f44402c.getLayoutParams();
                        ConstraintWidget constraintWidget = bVar2.f44214r0;
                        constraintWidget.f43446i0 = 0;
                        ConstraintWidget constraintWidget2 = bVar.f44214r0;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget2.f43423U[0];
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f43475b;
                        if (dimensionBehaviour != dimensionBehaviour2) {
                            constraintWidget2.S(constraintWidget.u());
                        }
                        ConstraintWidget constraintWidget3 = bVar.f44214r0;
                        if (constraintWidget3.f43423U[1] != dimensionBehaviour2) {
                            constraintWidget3.P(bVar2.f44214r0.o());
                        }
                        bVar2.f44214r0.f43446i0 = 8;
                    }
                }
            }
            int size = constraintLayout.mConstraintHelpers.size();
            if (size > 0) {
                for (int i13 = 0; i13 < size; i13++) {
                    ((androidx.constraintlayout.widget.a) constraintLayout.mConstraintHelpers.get(i13)).getClass();
                }
            }
        }
    }

    public ConstraintLayout(@N Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new androidx.constraintlayout.core.widgets.d();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(null, 0, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static j getSharedValues() {
        if (sSharedValues == null) {
            sSharedValues = new j();
        }
        return sSharedValues;
    }

    private final ConstraintWidget getTargetWidget(int i12) {
        if (i12 == 0) {
            return this.mLayoutWidget;
        }
        View viewFindViewById = this.mChildrenByIds.get(i12);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i12)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.mLayoutWidget;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((b) viewFindViewById.getLayoutParams()).f44214r0;
    }

    private void init(AttributeSet attributeSet, int i12, int i13) {
        androidx.constraintlayout.core.widgets.d dVar = this.mLayoutWidget;
        dVar.f43444h0 = this;
        c cVar = this.mMeasurer;
        dVar.f43595y0 = cVar;
        dVar.f43593w0.f43506f = cVar;
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.m.f44405b, i12, i13);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i14 = 0; i14 < indexCount; i14++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i14);
                if (index == 16) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == 17) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == 14) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == 15) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == 113) {
                    this.mOptimizationLevel = typedArrayObtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        d dVar2 = new d();
                        this.mConstraintSet = dVar2;
                        dVar2.r(resourceId2, getContext());
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        androidx.constraintlayout.core.widgets.d dVar3 = this.mLayoutWidget;
        dVar3.f43583H0 = this.mOptimizationLevel;
        androidx.constraintlayout.core.e.f43211p = dVar3.Z(512);
    }

    private void markHierarchyDirty() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    private void setChildrenConstraints() throws Resources.NotFoundException {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            ConstraintWidget viewWidget = getViewWidget(getChildAt(i12));
            if (viewWidget != null) {
                viewWidget.G();
            }
        }
        if (zIsInEditMode) {
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    getTargetWidget(childAt.getId()).f43450k0 = resourceName;
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt2 = getChildAt(i14);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof e)) {
                    this.mConstraintSet = ((e) childAt2).getConstraintSet();
                }
            }
        }
        d dVar = this.mConstraintSet;
        if (dVar != null) {
            dVar.d(this);
        }
        this.mLayoutWidget.f43661u0.clear();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                androidx.constraintlayout.widget.a aVar = this.mConstraintHelpers.get(i15);
                if (aVar.isInEditMode()) {
                    aVar.setIds(aVar.f44237f);
                }
                androidx.constraintlayout.core.widgets.h hVar = aVar.f44236e;
                if (hVar != null) {
                    hVar.a();
                    for (int i16 = 0; i16 < aVar.f44234c; i16++) {
                        int i17 = aVar.f44233b[i16];
                        View viewById = getViewById(i17);
                        if (viewById == null) {
                            Integer numValueOf = Integer.valueOf(i17);
                            HashMap<Integer, String> map = aVar.f44240i;
                            String str = map.get(numValueOf);
                            int i18 = aVar.i(this, str);
                            if (i18 != 0) {
                                aVar.f44233b[i16] = i18;
                                map.put(Integer.valueOf(i18), str);
                                viewById = getViewById(i18);
                            }
                        }
                        if (viewById != null) {
                            aVar.f44236e.c(getViewWidget(viewById));
                        }
                    }
                    aVar.f44236e.b();
                }
            }
        }
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt3 = getChildAt(i19);
            if (childAt3 instanceof g) {
                g gVar = (g) childAt3;
                if (gVar.f44401b == -1 && !gVar.isInEditMode()) {
                    gVar.setVisibility(gVar.f44403d);
                }
                View viewFindViewById = findViewById(gVar.f44401b);
                gVar.f44402c = viewFindViewById;
                if (viewFindViewById != null) {
                    ((b) viewFindViewById.getLayoutParams()).f44192g0 = true;
                    gVar.f44402c.setVisibility(0);
                    gVar.setVisibility(0);
                }
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt4 = getChildAt(i22);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt5 = getChildAt(i23);
            ConstraintWidget viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                androidx.constraintlayout.core.widgets.d dVar2 = this.mLayoutWidget;
                dVar2.f43661u0.add(viewWidget2);
                ConstraintWidget constraintWidget = viewWidget2.f43424V;
                if (constraintWidget != null) {
                    ((m) constraintWidget).f43661u0.remove(viewWidget2);
                    viewWidget2.G();
                }
                viewWidget2.f43424V = dVar2;
                applyConstraintsFromLayoutParams(zIsInEditMode, childAt5, viewWidget2, bVar, this.mTempMapIdToWidget);
            }
        }
    }

    private void setWidgetBaseline(ConstraintWidget constraintWidget, b bVar, SparseArray<ConstraintWidget> sparseArray, int i12, ConstraintAnchor.Type type) {
        View view = this.mChildrenByIds.get(i12);
        ConstraintWidget constraintWidget2 = sparseArray.get(i12);
        if (constraintWidget2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.f44186d0 = true;
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.f43397f;
        if (type == type2) {
            b bVar2 = (b) view.getLayoutParams();
            bVar2.f44186d0 = true;
            bVar2.f44214r0.f43407E = true;
        }
        constraintWidget.m(type2).b(constraintWidget2.m(type), bVar.f44158E, bVar.f44157D, true);
        constraintWidget.f43407E = true;
        constraintWidget.m(ConstraintAnchor.Type.f43394c).j();
        constraintWidget.m(ConstraintAnchor.Type.f43396e).j();
    }

    private boolean updateHierarchy() throws Resources.NotFoundException {
        int childCount = getChildCount();
        boolean z12 = false;
        int i12 = 0;
        while (true) {
            if (i12 >= childCount) {
                break;
            }
            if (getChildAt(i12).isLayoutRequested()) {
                z12 = true;
                break;
            }
            i12++;
        }
        if (z12) {
            setChildrenConstraints();
        }
        return z12;
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02ef  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:156:0x02ea -> B:157:0x02eb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void applyConstraintsFromLayoutParams(boolean r21, android.view.View r22, androidx.constraintlayout.core.widgets.ConstraintWidget r23, androidx.constraintlayout.widget.ConstraintLayout.b r24, android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> r25) {
        /*
            Method dump skipped, instructions count: 856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.applyConstraintsFromLayoutParams(boolean, android.view.View, androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.a> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i12 = 0; i12 < size; i12++) {
                this.mConstraintHelpers.get(i12).p(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i14 = Integer.parseInt(strArrSplit[0]);
                        int i15 = Integer.parseInt(strArrSplit[1]);
                        int i16 = Integer.parseInt(strArrSplit[2]);
                        int i17 = (int) ((i14 / 1080.0f) * width);
                        int i18 = (int) ((i15 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f12 = i17;
                        float f13 = i18;
                        float f14 = i17 + ((int) ((i16 / 1080.0f) * width));
                        canvas.drawLine(f12, f13, f14, f13, paint);
                        float f15 = i18 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f14, f13, f14, f15, paint);
                        canvas.drawLine(f14, f15, f12, f15, paint);
                        canvas.drawLine(f12, f15, f12, f13, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f12, f13, f14, f15, paint);
                        canvas.drawLine(f12, f15, f14, f13, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void forceLayout() {
        markHierarchyDirty();
        super.forceLayout();
    }

    public Object getDesignInformation(int i12, Object obj) {
        if (i12 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.mDesignIds;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.f43583H0;
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.mLayoutWidget.f43447j == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.mLayoutWidget.f43447j = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.mLayoutWidget.f43447j = "parent";
            }
        }
        androidx.constraintlayout.core.widgets.d dVar = this.mLayoutWidget;
        if (dVar.f43450k0 == null) {
            dVar.f43450k0 = dVar.f43447j;
        }
        Iterator<ConstraintWidget> it = dVar.f43661u0.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            View view = next.f43444h0;
            if (view != null) {
                if (next.f43447j == null && (id2 = view.getId()) != -1) {
                    next.f43447j = getContext().getResources().getResourceEntryName(id2);
                }
                if (next.f43450k0 == null) {
                    next.f43450k0 = next.f43447j;
                }
            }
        }
        this.mLayoutWidget.r(sb2);
        return sb2.toString();
    }

    public View getViewById(int i12) {
        return this.mChildrenByIds.get(i12);
    }

    public final ConstraintWidget getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f44214r0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f44214r0;
        }
        return null;
    }

    public boolean isRtl() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            b bVar = (b) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = bVar.f44214r0;
            if ((childAt.getVisibility() != 8 || bVar.f44188e0 || bVar.f44190f0 || zIsInEditMode) && !bVar.f44192g0) {
                int iV2 = constraintWidget.v();
                int iW2 = constraintWidget.w();
                int iU2 = constraintWidget.u() + iV2;
                int iO2 = constraintWidget.o() + iW2;
                childAt.layout(iV2, iW2, iU2, iO2);
                if ((childAt instanceof g) && (content = ((g) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iV2, iW2, iU2, iO2);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i17 = 0; i17 < size; i17++) {
                this.mConstraintHelpers.get(i17).o();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i12, int i13) {
        if (this.mOnMeasureWidthMeasureSpec == i12) {
            int i14 = this.mOnMeasureHeightMeasureSpec;
        }
        if (!this.mDirtyHierarchy) {
            int childCount = getChildCount();
            int i15 = 0;
            while (true) {
                if (i15 >= childCount) {
                    break;
                }
                if (getChildAt(i15).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                }
                i15++;
            }
        }
        this.mOnMeasureWidthMeasureSpec = i12;
        this.mOnMeasureHeightMeasureSpec = i13;
        this.mLayoutWidget.f43596z0 = isRtl();
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (updateHierarchy()) {
                androidx.constraintlayout.core.widgets.d dVar = this.mLayoutWidget;
                dVar.f43592v0.c(dVar);
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i12, i13);
        int iU2 = this.mLayoutWidget.u();
        int iO2 = this.mLayoutWidget.o();
        androidx.constraintlayout.core.widgets.d dVar2 = this.mLayoutWidget;
        resolveMeasuredDimension(i12, i13, iU2, iO2, dVar2.f43584I0, dVar2.f43585J0);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof androidx.constraintlayout.core.widgets.f)) {
            b bVar = (b) view.getLayoutParams();
            androidx.constraintlayout.core.widgets.f fVar = new androidx.constraintlayout.core.widgets.f();
            bVar.f44214r0 = fVar;
            bVar.f44188e0 = true;
            fVar.W(bVar.f44176W);
        }
        if (view instanceof androidx.constraintlayout.widget.a) {
            androidx.constraintlayout.widget.a aVar = (androidx.constraintlayout.widget.a) view;
            aVar.r();
            ((b) view.getLayoutParams()).f44190f0 = true;
            if (!this.mConstraintHelpers.contains(aVar)) {
                this.mConstraintHelpers.add(aVar);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        ConstraintWidget viewWidget = getViewWidget(view);
        this.mLayoutWidget.f43661u0.remove(viewWidget);
        viewWidget.G();
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void parseLayoutDescription(int i12) {
        this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.b(getContext(), this, i12);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        markHierarchyDirty();
        super.requestLayout();
    }

    public void resolveMeasuredDimension(int i12, int i13, int i14, int i15, boolean z12, boolean z13) {
        c cVar = this.mMeasurer;
        int i16 = cVar.f44228e;
        int iResolveSizeAndState = View.resolveSizeAndState(i14 + cVar.f44227d, i12, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i15 + i16, i13, 0) & 16777215;
        int iMin = Math.min(this.mMaxWidth, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.mMaxHeight, iResolveSizeAndState2);
        if (z12) {
            iMin |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        if (z13) {
            iMin2 |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        setMeasuredDimension(iMin, iMin2);
        this.mLastMeasureWidth = iMin;
        this.mLastMeasureHeight = iMin2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0103 A[PHI: r7
  0x0103: PHI (r7v3 boolean) = (r7v2 boolean), (r7v46 boolean) binds: [B:19:0x00a5, B:255:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f9  */
    /* JADX WARN: Type inference failed for: r12v4, types: [int] */
    /* JADX WARN: Type inference failed for: r12v53 */
    /* JADX WARN: Type inference failed for: r12v54 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void resolveSystem(androidx.constraintlayout.core.widgets.d r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.resolveSystem(androidx.constraintlayout.core.widgets.d, int, int, int):void");
    }

    public void setConstraintSet(d dVar) {
        this.mConstraintSet = dVar;
    }

    public void setDesignInformation(int i12, Object obj, Object obj2) {
        if (i12 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.mDesignIds.put(strSubstring, num);
        }
    }

    @Override // android.view.View
    public void setId(int i12) {
        this.mChildrenByIds.remove(getId());
        super.setId(i12);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i12) {
        if (i12 == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i12;
        requestLayout();
    }

    public void setMaxWidth(int i12) {
        if (i12 == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i12;
        requestLayout();
    }

    public void setMinHeight(int i12) {
        if (i12 == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i12;
        requestLayout();
    }

    public void setMinWidth(int i12) {
        if (i12 == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i12;
        requestLayout();
    }

    public void setOnConstraintsChanged(f fVar) {
        this.mConstraintsChangedListener = fVar;
    }

    public void setOptimizationLevel(int i12) {
        this.mOptimizationLevel = i12;
        androidx.constraintlayout.core.widgets.d dVar = this.mLayoutWidget;
        dVar.f43583H0 = i12;
        androidx.constraintlayout.core.e.f43211p = dVar.Z(512);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSelfDimensionBehaviour(androidx.constraintlayout.core.widgets.d r9, int r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            androidx.constraintlayout.widget.ConstraintLayout$c r0 = r8.mMeasurer
            int r1 = r0.f44228e
            int r0 = r0.f44227d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.f43475b
            int r3 = r8.getChildCount()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.f43476c
            r5 = 0
            r6 = 1073741824(0x40000000, float:2.0)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r7) goto L31
            if (r10 == 0) goto L25
            if (r10 == r6) goto L1c
            r10 = r2
        L1a:
            r11 = r5
            goto L3a
        L1c:
            int r10 = r8.mMaxWidth
            int r10 = r10 - r0
            int r11 = java.lang.Math.min(r10, r11)
            r10 = r2
            goto L3a
        L25:
            if (r3 != 0) goto L2f
            int r10 = r8.mMinWidth
            int r11 = java.lang.Math.max(r5, r10)
        L2d:
            r10 = r4
            goto L3a
        L2f:
            r10 = r4
            goto L1a
        L31:
            if (r3 != 0) goto L2d
            int r10 = r8.mMinWidth
            int r11 = java.lang.Math.max(r5, r10)
            goto L2d
        L3a:
            if (r12 == r7) goto L56
            if (r12 == 0) goto L4a
            if (r12 == r6) goto L42
        L40:
            r13 = r5
            goto L5f
        L42:
            int r12 = r8.mMaxHeight
            int r12 = r12 - r1
            int r13 = java.lang.Math.min(r12, r13)
            goto L5f
        L4a:
            if (r3 != 0) goto L54
            int r12 = r8.mMinHeight
            int r13 = java.lang.Math.max(r5, r12)
        L52:
            r2 = r4
            goto L5f
        L54:
            r2 = r4
            goto L40
        L56:
            if (r3 != 0) goto L52
            int r12 = r8.mMinHeight
            int r13 = java.lang.Math.max(r5, r12)
            goto L52
        L5f:
            int r12 = r9.u()
            r3 = 1
            if (r11 != r12) goto L6c
            int r12 = r9.o()
            if (r13 == r12) goto L70
        L6c:
            androidx.constraintlayout.core.widgets.analyzer.e r12 = r9.f43593w0
            r12.f43503c = r3
        L70:
            r9.f43430a0 = r5
            r9.f43432b0 = r5
            int r12 = r8.mMaxWidth
            int r12 = r12 - r0
            int[] r4 = r9.f43405C
            r4[r5] = r12
            int r12 = r8.mMaxHeight
            int r12 = r12 - r1
            r4[r3] = r12
            r9.f43436d0 = r5
            r9.f43438e0 = r5
            r9.Q(r10)
            r9.S(r11)
            r9.R(r2)
            r9.P(r13)
            int r10 = r8.mMinWidth
            int r10 = r10 - r0
            if (r10 >= 0) goto L98
            r9.f43436d0 = r5
            goto L9a
        L98:
            r9.f43436d0 = r10
        L9a:
            int r10 = r8.mMinHeight
            int r10 = r10 - r1
            if (r10 >= 0) goto La2
            r9.f43438e0 = r5
            goto La4
        La2:
            r9.f43438e0 = r10
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.setSelfDimensionBehaviour(androidx.constraintlayout.core.widgets.d, int, int, int, int):void");
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new androidx.constraintlayout.core.widgets.d();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, 0, 0);
    }

    public ConstraintLayout(@N Context context, @P AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new androidx.constraintlayout.core.widgets.d();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i12, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(@N Context context, @P AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12, i13);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new androidx.constraintlayout.core.widgets.d();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i12, i13);
    }

    public static class b extends ViewGroup.MarginLayoutParams {

        /* renamed from: A, reason: collision with root package name */
        public int f44154A;

        /* renamed from: B, reason: collision with root package name */
        public int f44155B;

        /* renamed from: C, reason: collision with root package name */
        public int f44156C;

        /* renamed from: D, reason: collision with root package name */
        public final int f44157D;

        /* renamed from: E, reason: collision with root package name */
        public final int f44158E;

        /* renamed from: F, reason: collision with root package name */
        public float f44159F;

        /* renamed from: G, reason: collision with root package name */
        public float f44160G;

        /* renamed from: H, reason: collision with root package name */
        public String f44161H;

        /* renamed from: I, reason: collision with root package name */
        public float f44162I;

        /* renamed from: J, reason: collision with root package name */
        public float f44163J;

        /* renamed from: K, reason: collision with root package name */
        public int f44164K;

        /* renamed from: L, reason: collision with root package name */
        public int f44165L;

        /* renamed from: M, reason: collision with root package name */
        public int f44166M;

        /* renamed from: N, reason: collision with root package name */
        public int f44167N;

        /* renamed from: O, reason: collision with root package name */
        public int f44168O;

        /* renamed from: P, reason: collision with root package name */
        public int f44169P;

        /* renamed from: Q, reason: collision with root package name */
        public int f44170Q;

        /* renamed from: R, reason: collision with root package name */
        public int f44171R;

        /* renamed from: S, reason: collision with root package name */
        public float f44172S;

        /* renamed from: T, reason: collision with root package name */
        public float f44173T;

        /* renamed from: U, reason: collision with root package name */
        public int f44174U;

        /* renamed from: V, reason: collision with root package name */
        public int f44175V;

        /* renamed from: W, reason: collision with root package name */
        public int f44176W;

        /* renamed from: X, reason: collision with root package name */
        public boolean f44177X;

        /* renamed from: Y, reason: collision with root package name */
        public boolean f44178Y;

        /* renamed from: Z, reason: collision with root package name */
        public String f44179Z;

        /* renamed from: a0, reason: collision with root package name */
        public int f44180a0;

        /* renamed from: b, reason: collision with root package name */
        public int f44181b;

        /* renamed from: b0, reason: collision with root package name */
        public boolean f44182b0;

        /* renamed from: c, reason: collision with root package name */
        public int f44183c;

        /* renamed from: c0, reason: collision with root package name */
        public boolean f44184c0;

        /* renamed from: d, reason: collision with root package name */
        public float f44185d;

        /* renamed from: d0, reason: collision with root package name */
        public boolean f44186d0;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f44187e;

        /* renamed from: e0, reason: collision with root package name */
        public boolean f44188e0;

        /* renamed from: f, reason: collision with root package name */
        public int f44189f;

        /* renamed from: f0, reason: collision with root package name */
        public boolean f44190f0;

        /* renamed from: g, reason: collision with root package name */
        public int f44191g;

        /* renamed from: g0, reason: collision with root package name */
        public boolean f44192g0;

        /* renamed from: h, reason: collision with root package name */
        public int f44193h;

        /* renamed from: h0, reason: collision with root package name */
        public int f44194h0;

        /* renamed from: i, reason: collision with root package name */
        public int f44195i;

        /* renamed from: i0, reason: collision with root package name */
        public int f44196i0;

        /* renamed from: j, reason: collision with root package name */
        public int f44197j;

        /* renamed from: j0, reason: collision with root package name */
        public int f44198j0;

        /* renamed from: k, reason: collision with root package name */
        public int f44199k;

        /* renamed from: k0, reason: collision with root package name */
        public int f44200k0;

        /* renamed from: l, reason: collision with root package name */
        public int f44201l;

        /* renamed from: l0, reason: collision with root package name */
        public int f44202l0;

        /* renamed from: m, reason: collision with root package name */
        public int f44203m;

        /* renamed from: m0, reason: collision with root package name */
        public int f44204m0;

        /* renamed from: n, reason: collision with root package name */
        public int f44205n;

        /* renamed from: n0, reason: collision with root package name */
        public float f44206n0;

        /* renamed from: o, reason: collision with root package name */
        public int f44207o;

        /* renamed from: o0, reason: collision with root package name */
        public int f44208o0;

        /* renamed from: p, reason: collision with root package name */
        public int f44209p;

        /* renamed from: p0, reason: collision with root package name */
        public int f44210p0;

        /* renamed from: q, reason: collision with root package name */
        public int f44211q;

        /* renamed from: q0, reason: collision with root package name */
        public float f44212q0;

        /* renamed from: r, reason: collision with root package name */
        public int f44213r;

        /* renamed from: r0, reason: collision with root package name */
        public ConstraintWidget f44214r0;

        /* renamed from: s, reason: collision with root package name */
        public float f44215s;

        /* renamed from: t, reason: collision with root package name */
        public int f44216t;

        /* renamed from: u, reason: collision with root package name */
        public int f44217u;

        /* renamed from: v, reason: collision with root package name */
        public int f44218v;

        /* renamed from: w, reason: collision with root package name */
        public int f44219w;

        /* renamed from: x, reason: collision with root package name */
        public final int f44220x;

        /* renamed from: y, reason: collision with root package name */
        public int f44221y;

        /* renamed from: z, reason: collision with root package name */
        public final int f44222z;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f44223a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f44223a = sparseIntArray;
                sparseIntArray.append(98, 64);
                sparseIntArray.append(75, 65);
                sparseIntArray.append(84, 8);
                sparseIntArray.append(85, 9);
                sparseIntArray.append(87, 10);
                sparseIntArray.append(88, 11);
                sparseIntArray.append(94, 12);
                sparseIntArray.append(93, 13);
                sparseIntArray.append(65, 14);
                sparseIntArray.append(64, 15);
                sparseIntArray.append(60, 16);
                sparseIntArray.append(62, 52);
                sparseIntArray.append(61, 53);
                sparseIntArray.append(66, 2);
                sparseIntArray.append(68, 3);
                sparseIntArray.append(67, 4);
                sparseIntArray.append(103, 49);
                sparseIntArray.append(104, 50);
                sparseIntArray.append(72, 5);
                sparseIntArray.append(73, 6);
                sparseIntArray.append(74, 7);
                sparseIntArray.append(55, 67);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(89, 17);
                sparseIntArray.append(90, 18);
                sparseIntArray.append(71, 19);
                sparseIntArray.append(70, 20);
                sparseIntArray.append(108, 21);
                sparseIntArray.append(111, 22);
                sparseIntArray.append(109, 23);
                sparseIntArray.append(106, 24);
                sparseIntArray.append(110, 25);
                sparseIntArray.append(107, 26);
                sparseIntArray.append(105, 55);
                sparseIntArray.append(112, 54);
                sparseIntArray.append(80, 29);
                sparseIntArray.append(95, 30);
                sparseIntArray.append(69, 44);
                sparseIntArray.append(82, 45);
                sparseIntArray.append(97, 46);
                sparseIntArray.append(81, 47);
                sparseIntArray.append(96, 48);
                sparseIntArray.append(58, 27);
                sparseIntArray.append(57, 28);
                sparseIntArray.append(99, 31);
                sparseIntArray.append(76, 32);
                sparseIntArray.append(UpdateStatusCode.DialogButton.CONFIRM, 33);
                sparseIntArray.append(100, 34);
                sparseIntArray.append(102, 35);
                sparseIntArray.append(78, 36);
                sparseIntArray.append(77, 37);
                sparseIntArray.append(79, 38);
                sparseIntArray.append(83, 39);
                sparseIntArray.append(92, 40);
                sparseIntArray.append(86, 41);
                sparseIntArray.append(63, 42);
                sparseIntArray.append(59, 43);
                sparseIntArray.append(91, 51);
                sparseIntArray.append(114, 66);
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f44181b = -1;
            this.f44183c = -1;
            this.f44185d = -1.0f;
            this.f44187e = true;
            this.f44189f = -1;
            this.f44191g = -1;
            this.f44193h = -1;
            this.f44195i = -1;
            this.f44197j = -1;
            this.f44199k = -1;
            this.f44201l = -1;
            this.f44203m = -1;
            this.f44205n = -1;
            this.f44207o = -1;
            this.f44209p = -1;
            this.f44211q = -1;
            this.f44213r = 0;
            this.f44215s = 0.0f;
            this.f44216t = -1;
            this.f44217u = -1;
            this.f44218v = -1;
            this.f44219w = -1;
            this.f44220x = BeduinInputModel.MIN_TEXT_VERSION;
            this.f44221y = BeduinInputModel.MIN_TEXT_VERSION;
            this.f44222z = BeduinInputModel.MIN_TEXT_VERSION;
            this.f44154A = BeduinInputModel.MIN_TEXT_VERSION;
            this.f44155B = BeduinInputModel.MIN_TEXT_VERSION;
            this.f44156C = BeduinInputModel.MIN_TEXT_VERSION;
            this.f44157D = BeduinInputModel.MIN_TEXT_VERSION;
            this.f44158E = 0;
            this.f44159F = 0.5f;
            this.f44160G = 0.5f;
            this.f44161H = null;
            this.f44162I = -1.0f;
            this.f44163J = -1.0f;
            this.f44164K = 0;
            this.f44165L = 0;
            this.f44166M = 0;
            this.f44167N = 0;
            this.f44168O = 0;
            this.f44169P = 0;
            this.f44170Q = 0;
            this.f44171R = 0;
            this.f44172S = 1.0f;
            this.f44173T = 1.0f;
            this.f44174U = -1;
            this.f44175V = -1;
            this.f44176W = -1;
            this.f44177X = false;
            this.f44178Y = false;
            this.f44179Z = null;
            this.f44180a0 = 0;
            this.f44182b0 = true;
            this.f44184c0 = true;
            this.f44186d0 = false;
            this.f44188e0 = false;
            this.f44190f0 = false;
            this.f44192g0 = false;
            this.f44194h0 = -1;
            this.f44196i0 = -1;
            this.f44198j0 = -1;
            this.f44200k0 = -1;
            this.f44202l0 = BeduinInputModel.MIN_TEXT_VERSION;
            this.f44204m0 = BeduinInputModel.MIN_TEXT_VERSION;
            this.f44206n0 = 0.5f;
            this.f44214r0 = new ConstraintWidget();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.m.f44405b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                int i13 = a.f44223a.get(index);
                switch (i13) {
                    case 1:
                        this.f44176W = typedArrayObtainStyledAttributes.getInt(index, this.f44176W);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f44211q);
                        this.f44211q = resourceId;
                        if (resourceId == -1) {
                            this.f44211q = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f44213r = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f44213r);
                        break;
                    case 4:
                        float f12 = typedArrayObtainStyledAttributes.getFloat(index, this.f44215s) % 360.0f;
                        this.f44215s = f12;
                        if (f12 < 0.0f) {
                            this.f44215s = (360.0f - f12) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f44181b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f44181b);
                        break;
                    case 6:
                        this.f44183c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f44183c);
                        break;
                    case 7:
                        this.f44185d = typedArrayObtainStyledAttributes.getFloat(index, this.f44185d);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f44189f);
                        this.f44189f = resourceId2;
                        if (resourceId2 == -1) {
                            this.f44189f = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f44191g);
                        this.f44191g = resourceId3;
                        if (resourceId3 == -1) {
                            this.f44191g = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f44193h);
                        this.f44193h = resourceId4;
                        if (resourceId4 == -1) {
                            this.f44193h = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f44195i);
                        this.f44195i = resourceId5;
                        if (resourceId5 == -1) {
                            this.f44195i = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f44197j);
                        this.f44197j = resourceId6;
                        if (resourceId6 == -1) {
                            this.f44197j = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f44199k);
                        this.f44199k = resourceId7;
                        if (resourceId7 == -1) {
                            this.f44199k = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f44201l);
                        this.f44201l = resourceId8;
                        if (resourceId8 == -1) {
                            this.f44201l = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f44203m);
                        this.f44203m = resourceId9;
                        if (resourceId9 == -1) {
                            this.f44203m = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f44205n);
                        this.f44205n = resourceId10;
                        if (resourceId10 == -1) {
                            this.f44205n = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f44216t);
                        this.f44216t = resourceId11;
                        if (resourceId11 == -1) {
                            this.f44216t = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f44217u);
                        this.f44217u = resourceId12;
                        if (resourceId12 == -1) {
                            this.f44217u = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f44218v);
                        this.f44218v = resourceId13;
                        if (resourceId13 == -1) {
                            this.f44218v = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f44219w);
                        this.f44219w = resourceId14;
                        if (resourceId14 == -1) {
                            this.f44219w = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f44220x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f44220x);
                        break;
                    case 22:
                        this.f44221y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f44221y);
                        break;
                    case 23:
                        this.f44222z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f44222z);
                        break;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        this.f44154A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f44154A);
                        break;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        this.f44155B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f44155B);
                        break;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        this.f44156C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f44156C);
                        break;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        this.f44177X = typedArrayObtainStyledAttributes.getBoolean(index, this.f44177X);
                        break;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        this.f44178Y = typedArrayObtainStyledAttributes.getBoolean(index, this.f44178Y);
                        break;
                    case AvailableCode.HMS_IS_SPOOF /* 29 */:
                        this.f44159F = typedArrayObtainStyledAttributes.getFloat(index, this.f44159F);
                        break;
                    case 30:
                        this.f44160G = typedArrayObtainStyledAttributes.getFloat(index, this.f44160G);
                        break;
                    case 31:
                        this.f44166M = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 32:
                        this.f44167N = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.f44168O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f44168O);
                            break;
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f44168O) == -2) {
                                this.f44168O = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f44170Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f44170Q);
                            break;
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f44170Q) == -2) {
                                this.f44170Q = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.f44172S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f44172S));
                        this.f44166M = 2;
                        break;
                    case 36:
                        try {
                            this.f44169P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f44169P);
                            break;
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f44169P) == -2) {
                                this.f44169P = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f44171R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f44171R);
                            break;
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f44171R) == -2) {
                                this.f44171R = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.f44173T = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f44173T));
                        this.f44167N = 2;
                        break;
                    default:
                        switch (i13) {
                            case 44:
                                d.v(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.f44162I = typedArrayObtainStyledAttributes.getFloat(index, this.f44162I);
                                break;
                            case 46:
                                this.f44163J = typedArrayObtainStyledAttributes.getFloat(index, this.f44163J);
                                break;
                            case 47:
                                this.f44164K = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f44165L = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f44174U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f44174U);
                                break;
                            case 50:
                                this.f44175V = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f44175V);
                                break;
                            case 51:
                                this.f44179Z = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f44207o);
                                this.f44207o = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f44207o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f44209p);
                                this.f44209p = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f44209p = typedArrayObtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                this.f44158E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f44158E);
                                break;
                            case 55:
                                this.f44157D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f44157D);
                                break;
                            default:
                                switch (i13) {
                                    case 64:
                                        d.u(this, typedArrayObtainStyledAttributes, index, 0);
                                        break;
                                    case 65:
                                        d.u(this, typedArrayObtainStyledAttributes, index, 1);
                                        break;
                                    case 66:
                                        this.f44180a0 = typedArrayObtainStyledAttributes.getInt(index, this.f44180a0);
                                        break;
                                    case 67:
                                        this.f44187e = typedArrayObtainStyledAttributes.getBoolean(index, this.f44187e);
                                        break;
                                }
                        }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            b();
        }

        public final void b() {
            this.f44188e0 = false;
            this.f44182b0 = true;
            this.f44184c0 = true;
            int i12 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i12 == -2 && this.f44177X) {
                this.f44182b0 = false;
                if (this.f44166M == 0) {
                    this.f44166M = 1;
                }
            }
            int i13 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i13 == -2 && this.f44178Y) {
                this.f44184c0 = false;
                if (this.f44167N == 0) {
                    this.f44167N = 1;
                }
            }
            if (i12 == 0 || i12 == -1) {
                this.f44182b0 = false;
                if (i12 == 0 && this.f44166M == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f44177X = true;
                }
            }
            if (i13 == 0 || i13 == -1) {
                this.f44184c0 = false;
                if (i13 == 0 && this.f44167N == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f44178Y = true;
                }
            }
            if (this.f44185d == -1.0f && this.f44181b == -1 && this.f44183c == -1) {
                return;
            }
            this.f44188e0 = true;
            this.f44182b0 = true;
            this.f44184c0 = true;
            if (!(this.f44214r0 instanceof androidx.constraintlayout.core.widgets.f)) {
                this.f44214r0 = new androidx.constraintlayout.core.widgets.f();
            }
            ((androidx.constraintlayout.core.widgets.f) this.f44214r0).W(this.f44176W);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instructions count: 259
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(int i12, int i13) {
            super(i12, i13);
            this.f44181b = -1;
            this.f44183c = -1;
            this.f44185d = -1.0f;
            this.f44187e = true;
            this.f44189f = -1;
            this.f44191g = -1;
            this.f44193h = -1;
            this.f44195i = -1;
            this.f44197j = -1;
            this.f44199k = -1;
            this.f44201l = -1;
            this.f44203m = -1;
            this.f44205n = -1;
            this.f44207o = -1;
            this.f44209p = -1;
            this.f44211q = -1;
            this.f44213r = 0;
            this.f44215s = 0.0f;
            this.f44216t = -1;
            this.f44217u = -1;
            this.f44218v = -1;
            this.f44219w = -1;
            this.f44220x = BeduinInputModel.MIN_TEXT_VERSION;
            this.f44221y = BeduinInputModel.MIN_TEXT_VERSION;
            this.f44222z = BeduinInputModel.MIN_TEXT_VERSION;
            this.f44154A = BeduinInputModel.MIN_TEXT_VERSION;
            this.f44155B = BeduinInputModel.MIN_TEXT_VERSION;
            this.f44156C = BeduinInputModel.MIN_TEXT_VERSION;
            this.f44157D = BeduinInputModel.MIN_TEXT_VERSION;
            this.f44158E = 0;
            this.f44159F = 0.5f;
            this.f44160G = 0.5f;
            this.f44161H = null;
            this.f44162I = -1.0f;
            this.f44163J = -1.0f;
            this.f44164K = 0;
            this.f44165L = 0;
            this.f44166M = 0;
            this.f44167N = 0;
            this.f44168O = 0;
            this.f44169P = 0;
            this.f44170Q = 0;
            this.f44171R = 0;
            this.f44172S = 1.0f;
            this.f44173T = 1.0f;
            this.f44174U = -1;
            this.f44175V = -1;
            this.f44176W = -1;
            this.f44177X = false;
            this.f44178Y = false;
            this.f44179Z = null;
            this.f44180a0 = 0;
            this.f44182b0 = true;
            this.f44184c0 = true;
            this.f44186d0 = false;
            this.f44188e0 = false;
            this.f44190f0 = false;
            this.f44192g0 = false;
            this.f44194h0 = -1;
            this.f44196i0 = -1;
            this.f44198j0 = -1;
            this.f44200k0 = -1;
            this.f44202l0 = BeduinInputModel.MIN_TEXT_VERSION;
            this.f44204m0 = BeduinInputModel.MIN_TEXT_VERSION;
            this.f44206n0 = 0.5f;
            this.f44214r0 = new ConstraintWidget();
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f44181b = -1;
            this.f44183c = -1;
            this.f44185d = -1.0f;
            this.f44187e = true;
            this.f44189f = -1;
            this.f44191g = -1;
            this.f44193h = -1;
            this.f44195i = -1;
            this.f44197j = -1;
            this.f44199k = -1;
            this.f44201l = -1;
            this.f44203m = -1;
            this.f44205n = -1;
            this.f44207o = -1;
            this.f44209p = -1;
            this.f44211q = -1;
            this.f44213r = 0;
            this.f44215s = 0.0f;
            this.f44216t = -1;
            this.f44217u = -1;
            this.f44218v = -1;
            this.f44219w = -1;
            this.f44220x = BeduinInputModel.MIN_TEXT_VERSION;
            this.f44221y = BeduinInputModel.MIN_TEXT_VERSION;
            this.f44222z = BeduinInputModel.MIN_TEXT_VERSION;
            this.f44154A = BeduinInputModel.MIN_TEXT_VERSION;
            this.f44155B = BeduinInputModel.MIN_TEXT_VERSION;
            this.f44156C = BeduinInputModel.MIN_TEXT_VERSION;
            this.f44157D = BeduinInputModel.MIN_TEXT_VERSION;
            this.f44158E = 0;
            this.f44159F = 0.5f;
            this.f44160G = 0.5f;
            this.f44161H = null;
            this.f44162I = -1.0f;
            this.f44163J = -1.0f;
            this.f44164K = 0;
            this.f44165L = 0;
            this.f44166M = 0;
            this.f44167N = 0;
            this.f44168O = 0;
            this.f44169P = 0;
            this.f44170Q = 0;
            this.f44171R = 0;
            this.f44172S = 1.0f;
            this.f44173T = 1.0f;
            this.f44174U = -1;
            this.f44175V = -1;
            this.f44176W = -1;
            this.f44177X = false;
            this.f44178Y = false;
            this.f44179Z = null;
            this.f44180a0 = 0;
            this.f44182b0 = true;
            this.f44184c0 = true;
            this.f44186d0 = false;
            this.f44188e0 = false;
            this.f44190f0 = false;
            this.f44192g0 = false;
            this.f44194h0 = -1;
            this.f44196i0 = -1;
            this.f44198j0 = -1;
            this.f44200k0 = -1;
            this.f44202l0 = BeduinInputModel.MIN_TEXT_VERSION;
            this.f44204m0 = BeduinInputModel.MIN_TEXT_VERSION;
            this.f44206n0 = 0.5f;
            this.f44214r0 = new ConstraintWidget();
        }
    }
}
