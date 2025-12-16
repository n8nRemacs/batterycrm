package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.cu3;
import defpackage.d58;
import defpackage.h6d;
import defpackage.hz6;
import defpackage.it3;
import defpackage.jt3;
import defpackage.kt3;
import defpackage.poc;
import defpackage.s7c;
import defpackage.ut3;
import defpackage.wve;
import defpackage.yt3;
import defpackage.zt3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.webrtc.EglBase;
import org.xmlpull.v1.XmlPullParserException;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static wve E0;
    public final SparseArray A0;
    public final poc B0;
    public int C0;
    public int D0;
    public final SparseArray a;
    public final ArrayList b;
    public final zt3 c;
    public int d;
    public int o;
    public int s0;
    public int t0;
    public boolean u0;
    public int v0;
    public ut3 w0;
    public s7c x0;
    public int y0;
    public HashMap z0;

    public ConstraintLayout(Context context) throws XmlPullParserException, IOException {
        super(context);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new zt3();
        this.d = 0;
        this.o = 0;
        this.s0 = Integer.MAX_VALUE;
        this.t0 = Integer.MAX_VALUE;
        this.u0 = true;
        this.v0 = 257;
        this.w0 = null;
        this.x0 = null;
        this.y0 = -1;
        this.z0 = new HashMap();
        this.A0 = new SparseArray();
        this.B0 = new poc(this, this);
        this.C0 = 0;
        this.D0 = 0;
        r(null, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static wve getSharedValues() {
        if (E0 == null) {
            wve wveVar = new wve();
            new SparseIntArray();
            new HashMap();
            E0 = wveVar;
        }
        return E0;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof kt3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((it3) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.u0 = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new kt3(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        kt3 kt3Var = new kt3(context, attributeSet);
        kt3Var.a = -1;
        kt3Var.b = -1;
        kt3Var.c = -1.0f;
        kt3Var.d = true;
        kt3Var.e = -1;
        kt3Var.f = -1;
        kt3Var.g = -1;
        kt3Var.h = -1;
        kt3Var.i = -1;
        kt3Var.j = -1;
        kt3Var.k = -1;
        kt3Var.l = -1;
        kt3Var.m = -1;
        kt3Var.n = -1;
        kt3Var.o = -1;
        kt3Var.p = -1;
        kt3Var.q = 0;
        kt3Var.r = 0.0f;
        kt3Var.s = -1;
        kt3Var.t = -1;
        kt3Var.u = -1;
        kt3Var.v = -1;
        kt3Var.w = Integer.MIN_VALUE;
        kt3Var.x = Integer.MIN_VALUE;
        kt3Var.y = Integer.MIN_VALUE;
        kt3Var.z = Integer.MIN_VALUE;
        kt3Var.A = Integer.MIN_VALUE;
        kt3Var.B = Integer.MIN_VALUE;
        kt3Var.C = Integer.MIN_VALUE;
        kt3Var.D = 0;
        kt3Var.E = 0.5f;
        kt3Var.F = 0.5f;
        kt3Var.G = null;
        kt3Var.H = -1.0f;
        kt3Var.I = -1.0f;
        kt3Var.J = 0;
        kt3Var.K = 0;
        kt3Var.L = 0;
        kt3Var.M = 0;
        kt3Var.N = 0;
        kt3Var.O = 0;
        kt3Var.P = 0;
        kt3Var.Q = 0;
        kt3Var.R = 1.0f;
        kt3Var.S = 1.0f;
        kt3Var.T = -1;
        kt3Var.U = -1;
        kt3Var.V = -1;
        kt3Var.W = false;
        kt3Var.X = false;
        kt3Var.Y = null;
        kt3Var.Z = 0;
        kt3Var.a0 = true;
        kt3Var.b0 = true;
        kt3Var.c0 = false;
        kt3Var.d0 = false;
        kt3Var.e0 = false;
        kt3Var.f0 = -1;
        kt3Var.g0 = -1;
        kt3Var.h0 = -1;
        kt3Var.i0 = -1;
        kt3Var.j0 = Integer.MIN_VALUE;
        kt3Var.k0 = Integer.MIN_VALUE;
        kt3Var.l0 = 0.5f;
        kt3Var.p0 = new yt3();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h6d.ConstraintLayout_Layout);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i2 = jt3.a.get(index);
            switch (i2) {
                case 1:
                    kt3Var.V = typedArrayObtainStyledAttributes.getInt(index, kt3Var.V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, kt3Var.p);
                    kt3Var.p = resourceId;
                    if (resourceId == -1) {
                        kt3Var.p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    kt3Var.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kt3Var.q);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, kt3Var.r) % 360.0f;
                    kt3Var.r = f;
                    if (f < 0.0f) {
                        kt3Var.r = (360.0f - f) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    kt3Var.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, kt3Var.a);
                    break;
                case 6:
                    kt3Var.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, kt3Var.b);
                    break;
                case 7:
                    kt3Var.c = typedArrayObtainStyledAttributes.getFloat(index, kt3Var.c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, kt3Var.e);
                    kt3Var.e = resourceId2;
                    if (resourceId2 == -1) {
                        kt3Var.e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, kt3Var.f);
                    kt3Var.f = resourceId3;
                    if (resourceId3 == -1) {
                        kt3Var.f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, kt3Var.g);
                    kt3Var.g = resourceId4;
                    if (resourceId4 == -1) {
                        kt3Var.g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, kt3Var.h);
                    kt3Var.h = resourceId5;
                    if (resourceId5 == -1) {
                        kt3Var.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, kt3Var.i);
                    kt3Var.i = resourceId6;
                    if (resourceId6 == -1) {
                        kt3Var.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, kt3Var.j);
                    kt3Var.j = resourceId7;
                    if (resourceId7 == -1) {
                        kt3Var.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case Protos.Attaches.Attach.LOCATION /* 14 */:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, kt3Var.k);
                    kt3Var.k = resourceId8;
                    if (resourceId8 == -1) {
                        kt3Var.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, kt3Var.l);
                    kt3Var.l = resourceId9;
                    if (resourceId9 == -1) {
                        kt3Var.l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, kt3Var.m);
                    kt3Var.m = resourceId10;
                    if (resourceId10 == -1) {
                        kt3Var.m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case LangUtils.HASH_SEED /* 17 */:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, kt3Var.s);
                    kt3Var.s = resourceId11;
                    if (resourceId11 == -1) {
                        kt3Var.s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, kt3Var.t);
                    kt3Var.t = resourceId12;
                    if (resourceId12 == -1) {
                        kt3Var.t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, kt3Var.u);
                    kt3Var.u = resourceId13;
                    if (resourceId13 == -1) {
                        kt3Var.u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, kt3Var.v);
                    kt3Var.v = resourceId14;
                    if (resourceId14 == -1) {
                        kt3Var.v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    kt3Var.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kt3Var.w);
                    break;
                case 22:
                    kt3Var.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kt3Var.x);
                    break;
                case 23:
                    kt3Var.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kt3Var.y);
                    break;
                case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                    kt3Var.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kt3Var.z);
                    break;
                case 25:
                    kt3Var.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kt3Var.A);
                    break;
                case 26:
                    kt3Var.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kt3Var.B);
                    break;
                case 27:
                    kt3Var.W = typedArrayObtainStyledAttributes.getBoolean(index, kt3Var.W);
                    break;
                case 28:
                    kt3Var.X = typedArrayObtainStyledAttributes.getBoolean(index, kt3Var.X);
                    break;
                case 29:
                    kt3Var.E = typedArrayObtainStyledAttributes.getFloat(index, kt3Var.E);
                    break;
                case 30:
                    kt3Var.F = typedArrayObtainStyledAttributes.getFloat(index, kt3Var.F);
                    break;
                case 31:
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    kt3Var.L = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    kt3Var.M = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        kt3Var.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kt3Var.N);
                        break;
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, kt3Var.N) == -2) {
                            kt3Var.N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        kt3Var.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kt3Var.P);
                        break;
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, kt3Var.P) == -2) {
                            kt3Var.P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    kt3Var.R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, kt3Var.R));
                    kt3Var.L = 2;
                    break;
                case 36:
                    try {
                        kt3Var.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kt3Var.O);
                        break;
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, kt3Var.O) == -2) {
                            kt3Var.O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case LangUtils.HASH_OFFSET /* 37 */:
                    try {
                        kt3Var.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kt3Var.Q);
                        break;
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, kt3Var.Q) == -2) {
                            kt3Var.Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    kt3Var.S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, kt3Var.S));
                    kt3Var.M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            ut3.k(kt3Var, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            kt3Var.H = typedArrayObtainStyledAttributes.getFloat(index, kt3Var.H);
                            break;
                        case 46:
                            kt3Var.I = typedArrayObtainStyledAttributes.getFloat(index, kt3Var.I);
                            break;
                        case 47:
                            kt3Var.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            kt3Var.K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            kt3Var.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, kt3Var.T);
                            break;
                        case 50:
                            kt3Var.U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, kt3Var.U);
                            break;
                        case 51:
                            kt3Var.Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, kt3Var.n);
                            kt3Var.n = resourceId15;
                            if (resourceId15 == -1) {
                                kt3Var.n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, kt3Var.o);
                            kt3Var.o = resourceId16;
                            if (resourceId16 == -1) {
                                kt3Var.o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            kt3Var.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kt3Var.D);
                            break;
                        case 55:
                            kt3Var.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, kt3Var.C);
                            break;
                        default:
                            switch (i2) {
                                case EglBase.EGL_OPENGL_ES3_BIT /* 64 */:
                                    ut3.j(kt3Var, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    ut3.j(kt3Var, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    kt3Var.Z = typedArrayObtainStyledAttributes.getInt(index, kt3Var.Z);
                                    break;
                                case 67:
                                    kt3Var.d = typedArrayObtainStyledAttributes.getBoolean(index, kt3Var.d);
                                    break;
                            }
                    }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        kt3Var.a();
        return kt3Var;
    }

    public int getMaxHeight() {
        return this.t0;
    }

    public int getMaxWidth() {
        return this.s0;
    }

    public int getMinHeight() {
        return this.o;
    }

    public int getMinWidth() {
        return this.d;
    }

    public int getOptimizationLevel() {
        return this.c.D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        zt3 zt3Var = this.c;
        if (zt3Var.j == null) {
            int id2 = getId();
            if (id2 != -1) {
                zt3Var.j = getContext().getResources().getResourceEntryName(id2);
            } else {
                zt3Var.j = "parent";
            }
        }
        if (zt3Var.h0 == null) {
            zt3Var.h0 = zt3Var.j;
            Log.v("ConstraintLayout", " setDebugName " + zt3Var.h0);
        }
        Iterator it = zt3Var.q0.iterator();
        while (it.hasNext()) {
            yt3 yt3Var = (yt3) it.next();
            View view = yt3Var.f0;
            if (view != null) {
                if (yt3Var.j == null && (id = view.getId()) != -1) {
                    yt3Var.j = getContext().getResources().getResourceEntryName(id);
                }
                if (yt3Var.h0 == null) {
                    yt3Var.h0 = yt3Var.j;
                    Log.v("ConstraintLayout", " setDebugName " + yt3Var.h0);
                }
            }
        }
        zt3Var.n(sb);
        return sb.toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            kt3 kt3Var = (kt3) childAt.getLayoutParams();
            yt3 yt3Var = kt3Var.p0;
            if (childAt.getVisibility() != 8 || kt3Var.d0 || kt3Var.e0 || zIsInEditMode) {
                int iR = yt3Var.r();
                int iS = yt3Var.s();
                childAt.layout(iR, iS, yt3Var.q() + iR, yt3Var.k() + iS);
            }
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((it3) arrayList.get(i6)).j();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x055a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r35, int r36) throws android.content.res.Resources.NotFoundException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        yt3 yt3VarQ = q(view);
        if ((view instanceof Guideline) && !(yt3VarQ instanceof hz6)) {
            kt3 kt3Var = (kt3) view.getLayoutParams();
            hz6 hz6Var = new hz6();
            kt3Var.p0 = hz6Var;
            kt3Var.d0 = true;
            hz6Var.S(kt3Var.V);
        }
        if (view instanceof it3) {
            it3 it3Var = (it3) view;
            it3Var.k();
            ((kt3) view.getLayoutParams()).e0 = true;
            ArrayList arrayList = this.b;
            if (!arrayList.contains(it3Var)) {
                arrayList.add(it3Var);
            }
        }
        this.a.put(view.getId(), view);
        this.u0 = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        yt3 yt3VarQ = q(view);
        this.c.q0.remove(yt3VarQ);
        yt3VarQ.C();
        this.b.remove(view);
        this.u0 = true;
    }

    public final yt3 q(View view) {
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof kt3) {
            return ((kt3) view.getLayoutParams()).p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof kt3) {
            return ((kt3) view.getLayoutParams()).p0;
        }
        return null;
    }

    public final void r(AttributeSet attributeSet, int i) throws XmlPullParserException, IOException {
        zt3 zt3Var = this.c;
        zt3Var.f0 = this;
        poc pocVar = this.B0;
        zt3Var.u0 = pocVar;
        zt3Var.s0.f = pocVar;
        this.a.put(getId(), this);
        this.w0 = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h6d.ConstraintLayout_Layout, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == h6d.ConstraintLayout_Layout_android_minWidth) {
                    this.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                } else if (index == h6d.ConstraintLayout_Layout_android_minHeight) {
                    this.o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.o);
                } else if (index == h6d.ConstraintLayout_Layout_android_maxWidth) {
                    this.s0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.s0);
                } else if (index == h6d.ConstraintLayout_Layout_android_maxHeight) {
                    this.t0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.t0);
                } else if (index == h6d.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.v0 = typedArrayObtainStyledAttributes.getInt(index, this.v0);
                } else if (index == h6d.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            s(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.x0 = null;
                        }
                    }
                } else if (index == h6d.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        ut3 ut3Var = new ut3();
                        this.w0 = ut3Var;
                        ut3Var.h(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.w0 = null;
                    }
                    this.y0 = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        zt3Var.D0 = this.v0;
        d58.p = zt3Var.W(512);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.u0 = true;
        super.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(int r10) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            r9 = this;
            s7c r0 = new s7c
            android.content.Context r1 = r9.getContext()
            r0.<init>()
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.a = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.b = r2
            android.content.res.Resources r2 = r1.getResources()
            android.content.res.XmlResourceParser r10 = r2.getXml(r10)
            int r2 = r10.getEventType()     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            r3 = 0
        L24:
            r4 = 1
            if (r2 == r4) goto Lab
            if (r2 == 0) goto L9c
            r5 = 2
            if (r2 == r5) goto L2e
            goto L9f
        L2e:
            java.lang.String r2 = r10.getName()     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            int r6 = r2.hashCode()     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            r7 = 4
            r8 = 3
            switch(r6) {
                case -1349929691: goto L68;
                case 80204913: goto L5e;
                case 1382829617: goto L55;
                case 1657696882: goto L4b;
                case 1901439077: goto L3c;
                default: goto L3b;
            }     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
        L3b:
            goto L72
        L3c:
            java.lang.String r4 = "Variant"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            if (r2 == 0) goto L72
            r4 = r8
            goto L73
        L46:
            r10 = move-exception
            goto La4
        L48:
            r10 = move-exception
            goto La8
        L4b:
            java.lang.String r4 = "layoutDescription"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            if (r2 == 0) goto L72
            r4 = 0
            goto L73
        L55:
            java.lang.String r6 = "StateSet"
            boolean r2 = r2.equals(r6)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            if (r2 == 0) goto L72
            goto L73
        L5e:
            java.lang.String r4 = "State"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            if (r2 == 0) goto L72
            r4 = r5
            goto L73
        L68:
            java.lang.String r4 = "ConstraintSet"
            boolean r2 = r2.equals(r4)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            if (r2 == 0) goto L72
            r4 = r7
            goto L73
        L72:
            r4 = -1
        L73:
            if (r4 == r5) goto L8d
            if (r4 == r8) goto L7e
            if (r4 == r7) goto L7a
            goto L9f
        L7a:
            r0.B(r1, r10)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            goto L9f
        L7e:
            lt3 r2 = new lt3     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            r2.<init>(r1, r10)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            if (r3 == 0) goto L9f
            java.lang.Object r4 = r3.d     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            r4.add(r2)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            goto L9f
        L8d:
            fua r3 = new fua     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            r3.<init>(r1, r10)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            java.lang.Object r2 = r0.a     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            int r4 = r3.b     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            r2.put(r4, r3)     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            goto L9f
        L9c:
            r10.getName()     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
        L9f:
            int r2 = r10.next()     // Catch: java.io.IOException -> L46 org.xmlpull.v1.XmlPullParserException -> L48
            goto L24
        La4:
            r10.printStackTrace()
            goto Lab
        La8:
            r10.printStackTrace()
        Lab:
            r9.x0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.s(int):void");
    }

    public void setConstraintSet(ut3 ut3Var) {
        this.w0 = ut3Var;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.t0) {
            return;
        }
        this.t0 = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.s0) {
            return;
        }
        this.s0 = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.o) {
            return;
        }
        this.o = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.d) {
            return;
        }
        this.d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(cu3 cu3Var) {
        s7c s7cVar = this.x0;
        if (s7cVar != null) {
            s7cVar.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.v0 = i;
        zt3 zt3Var = this.c;
        zt3Var.D0 = i;
        d58.p = zt3Var.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x036c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(defpackage.zt3 r28, int r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 1761
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.t(zt3, int, int, int):void");
    }

    public final void u(yt3 yt3Var, kt3 kt3Var, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.a.get(i);
        yt3 yt3Var2 = (yt3) sparseArray.get(i);
        if (yt3Var2 == null || view == null || !(view.getLayoutParams() instanceof kt3)) {
            return;
        }
        kt3Var.c0 = true;
        if (i2 == 6) {
            kt3 kt3Var2 = (kt3) view.getLayoutParams();
            kt3Var2.c0 = true;
            kt3Var2.p0.E = true;
        }
        yt3Var.i(6).b(yt3Var2.i(i2), kt3Var.D, kt3Var.C, true);
        yt3Var.E = true;
        yt3Var.i(3).j();
        yt3Var.i(5).j();
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new zt3();
        this.d = 0;
        this.o = 0;
        this.s0 = Integer.MAX_VALUE;
        this.t0 = Integer.MAX_VALUE;
        this.u0 = true;
        this.v0 = 257;
        this.w0 = null;
        this.x0 = null;
        this.y0 = -1;
        this.z0 = new HashMap();
        this.A0 = new SparseArray();
        this.B0 = new poc(this, this);
        this.C0 = 0;
        this.D0 = 0;
        r(attributeSet, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException {
        super(context, attributeSet, i);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new zt3();
        this.d = 0;
        this.o = 0;
        this.s0 = Integer.MAX_VALUE;
        this.t0 = Integer.MAX_VALUE;
        this.u0 = true;
        this.v0 = 257;
        this.w0 = null;
        this.x0 = null;
        this.y0 = -1;
        this.z0 = new HashMap();
        this.A0 = new SparseArray();
        this.B0 = new poc(this, this);
        this.C0 = 0;
        this.D0 = 0;
        r(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        kt3 kt3Var = new kt3(layoutParams);
        kt3Var.a = -1;
        kt3Var.b = -1;
        kt3Var.c = -1.0f;
        kt3Var.d = true;
        kt3Var.e = -1;
        kt3Var.f = -1;
        kt3Var.g = -1;
        kt3Var.h = -1;
        kt3Var.i = -1;
        kt3Var.j = -1;
        kt3Var.k = -1;
        kt3Var.l = -1;
        kt3Var.m = -1;
        kt3Var.n = -1;
        kt3Var.o = -1;
        kt3Var.p = -1;
        kt3Var.q = 0;
        kt3Var.r = 0.0f;
        kt3Var.s = -1;
        kt3Var.t = -1;
        kt3Var.u = -1;
        kt3Var.v = -1;
        kt3Var.w = Integer.MIN_VALUE;
        kt3Var.x = Integer.MIN_VALUE;
        kt3Var.y = Integer.MIN_VALUE;
        kt3Var.z = Integer.MIN_VALUE;
        kt3Var.A = Integer.MIN_VALUE;
        kt3Var.B = Integer.MIN_VALUE;
        kt3Var.C = Integer.MIN_VALUE;
        kt3Var.D = 0;
        kt3Var.E = 0.5f;
        kt3Var.F = 0.5f;
        kt3Var.G = null;
        kt3Var.H = -1.0f;
        kt3Var.I = -1.0f;
        kt3Var.J = 0;
        kt3Var.K = 0;
        kt3Var.L = 0;
        kt3Var.M = 0;
        kt3Var.N = 0;
        kt3Var.O = 0;
        kt3Var.P = 0;
        kt3Var.Q = 0;
        kt3Var.R = 1.0f;
        kt3Var.S = 1.0f;
        kt3Var.T = -1;
        kt3Var.U = -1;
        kt3Var.V = -1;
        kt3Var.W = false;
        kt3Var.X = false;
        kt3Var.Y = null;
        kt3Var.Z = 0;
        kt3Var.a0 = true;
        kt3Var.b0 = true;
        kt3Var.c0 = false;
        kt3Var.d0 = false;
        kt3Var.e0 = false;
        kt3Var.f0 = -1;
        kt3Var.g0 = -1;
        kt3Var.h0 = -1;
        kt3Var.i0 = -1;
        kt3Var.j0 = Integer.MIN_VALUE;
        kt3Var.k0 = Integer.MIN_VALUE;
        kt3Var.l0 = 0.5f;
        kt3Var.p0 = new yt3();
        return kt3Var;
    }
}
