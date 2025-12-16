package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.r;
import androidx.recyclerview.widget.C23434z;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.android.flexbox.h;
import j.N;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class FlexboxLayoutManager extends RecyclerView.m implements d, RecyclerView.y.b {

    /* renamed from: P, reason: collision with root package name */
    public static final Rect f348443P = new Rect();

    /* renamed from: A, reason: collision with root package name */
    public RecyclerView.z f348444A;

    /* renamed from: B, reason: collision with root package name */
    public c f348445B;

    /* renamed from: D, reason: collision with root package name */
    public I f348447D;

    /* renamed from: E, reason: collision with root package name */
    public I f348448E;

    /* renamed from: F, reason: collision with root package name */
    public SavedState f348449F;

    /* renamed from: L, reason: collision with root package name */
    public final Context f348455L;

    /* renamed from: M, reason: collision with root package name */
    public View f348456M;

    /* renamed from: r, reason: collision with root package name */
    public int f348459r;

    /* renamed from: s, reason: collision with root package name */
    public int f348460s;

    /* renamed from: t, reason: collision with root package name */
    public final int f348461t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f348463v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f348464w;

    /* renamed from: z, reason: collision with root package name */
    public RecyclerView.u f348467z;

    /* renamed from: u, reason: collision with root package name */
    public final int f348462u = -1;

    /* renamed from: x, reason: collision with root package name */
    public List<f> f348465x = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public final h f348466y = new h(this);

    /* renamed from: C, reason: collision with root package name */
    public final b f348446C = new b(null);

    /* renamed from: G, reason: collision with root package name */
    public int f348450G = -1;

    /* renamed from: H, reason: collision with root package name */
    public int f348451H = BeduinInputModel.MIN_TEXT_VERSION;

    /* renamed from: I, reason: collision with root package name */
    public int f348452I = BeduinInputModel.MIN_TEXT_VERSION;

    /* renamed from: J, reason: collision with root package name */
    public int f348453J = BeduinInputModel.MIN_TEXT_VERSION;

    /* renamed from: K, reason: collision with root package name */
    public final SparseArray<View> f348454K = new SparseArray<>();

    /* renamed from: N, reason: collision with root package name */
    public int f348457N = -1;

    /* renamed from: O, reason: collision with root package name */
    public final h.b f348458O = new h.b();

    public static class LayoutParams extends RecyclerView.n implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new a();

        /* renamed from: f, reason: collision with root package name */
        public float f348468f;

        /* renamed from: g, reason: collision with root package name */
        public float f348469g;

        /* renamed from: h, reason: collision with root package name */
        public int f348470h;

        /* renamed from: i, reason: collision with root package name */
        public float f348471i;

        /* renamed from: j, reason: collision with root package name */
        public int f348472j;

        /* renamed from: k, reason: collision with root package name */
        public int f348473k;

        /* renamed from: l, reason: collision with root package name */
        public int f348474l;

        /* renamed from: m, reason: collision with root package name */
        public int f348475m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f348476n;

        public static class a implements Parcelable.Creator<LayoutParams> {
            @Override // android.os.Parcelable.Creator
            public final LayoutParams createFromParcel(Parcel parcel) {
                LayoutParams layoutParams = new LayoutParams(-2, -2);
                layoutParams.f348468f = 0.0f;
                layoutParams.f348469g = 1.0f;
                layoutParams.f348470h = -1;
                layoutParams.f348471i = -1.0f;
                layoutParams.f348474l = 16777215;
                layoutParams.f348475m = 16777215;
                layoutParams.f348468f = parcel.readFloat();
                layoutParams.f348469g = parcel.readFloat();
                layoutParams.f348470h = parcel.readInt();
                layoutParams.f348471i = parcel.readFloat();
                layoutParams.f348472j = parcel.readInt();
                layoutParams.f348473k = parcel.readInt();
                layoutParams.f348474l = parcel.readInt();
                layoutParams.f348475m = parcel.readInt();
                layoutParams.f348476n = parcel.readByte() != 0;
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).height = parcel.readInt();
                ((ViewGroup.MarginLayoutParams) layoutParams).width = parcel.readInt();
                return layoutParams;
            }

            @Override // android.os.Parcelable.Creator
            public final LayoutParams[] newArray(int i12) {
                return new LayoutParams[i12];
            }
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int G0() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int R4() {
            return this.f348470h;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float S1() {
            return this.f348469g;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void a3(int i12) {
            this.f348472j = i12;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int c3() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int d0() {
            return this.f348474l;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void g2(int i12) {
            this.f348473k = i12;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getOrder() {
            return 1;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int i1() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int j3() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float k2() {
            return this.f348468f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int k3() {
            return this.f348473k;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float n5() {
            return this.f348471i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int p3() {
            return this.f348475m;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean r5() {
            return this.f348476n;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i12) {
            parcel.writeFloat(this.f348468f);
            parcel.writeFloat(this.f348469g);
            parcel.writeInt(this.f348470h);
            parcel.writeFloat(this.f348471i);
            parcel.writeInt(this.f348472j);
            parcel.writeInt(this.f348473k);
            parcel.writeInt(this.f348474l);
            parcel.writeInt(this.f348475m);
            parcel.writeByte(this.f348476n ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int z0() {
            return this.f348472j;
        }
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public int f348477b;

        /* renamed from: c, reason: collision with root package name */
        public int f348478c;

        public static class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (a) null);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i12) {
                return new SavedState[i12];
            }
        }

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SavedState{mAnchorPosition=");
            sb2.append(this.f348477b);
            sb2.append(", mAnchorOffset=");
            return r.t(sb2, this.f348478c, '}');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i12) {
            parcel.writeInt(this.f348477b);
            parcel.writeInt(this.f348478c);
        }

        public SavedState(Parcel parcel, a aVar) {
            this.f348477b = parcel.readInt();
            this.f348478c = parcel.readInt();
        }

        public SavedState(SavedState savedState, a aVar) {
            this.f348477b = savedState.f348477b;
            this.f348478c = savedState.f348478c;
        }
    }

    public class b {

        /* renamed from: a, reason: collision with root package name */
        public int f348479a;

        /* renamed from: b, reason: collision with root package name */
        public int f348480b;

        /* renamed from: c, reason: collision with root package name */
        public int f348481c;

        /* renamed from: d, reason: collision with root package name */
        public int f348482d = 0;

        /* renamed from: e, reason: collision with root package name */
        public boolean f348483e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f348484f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f348485g;

        public b(a aVar) {
        }

        public static void a(b bVar) {
            FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
            if (flexboxLayoutManager.B() || !flexboxLayoutManager.f348463v) {
                bVar.f348481c = bVar.f348483e ? flexboxLayoutManager.f348447D.i() : flexboxLayoutManager.f348447D.m();
            } else {
                bVar.f348481c = bVar.f348483e ? flexboxLayoutManager.f348447D.i() : flexboxLayoutManager.f53850p - flexboxLayoutManager.f348447D.m();
            }
        }

        public static void b(b bVar) {
            bVar.f348479a = -1;
            bVar.f348480b = -1;
            bVar.f348481c = BeduinInputModel.MIN_TEXT_VERSION;
            bVar.f348484f = false;
            bVar.f348485g = false;
            FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
            if (flexboxLayoutManager.B()) {
                int i12 = flexboxLayoutManager.f348460s;
                if (i12 == 0) {
                    bVar.f348483e = flexboxLayoutManager.f348459r == 1;
                    return;
                } else {
                    bVar.f348483e = i12 == 2;
                    return;
                }
            }
            int i13 = flexboxLayoutManager.f348460s;
            if (i13 == 0) {
                bVar.f348483e = flexboxLayoutManager.f348459r == 3;
            } else {
                bVar.f348483e = i13 == 2;
            }
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AnchorInfo{mPosition=");
            sb2.append(this.f348479a);
            sb2.append(", mFlexLinePosition=");
            sb2.append(this.f348480b);
            sb2.append(", mCoordinate=");
            sb2.append(this.f348481c);
            sb2.append(", mPerpendicularCoordinate=");
            sb2.append(this.f348482d);
            sb2.append(", mLayoutFromEnd=");
            sb2.append(this.f348483e);
            sb2.append(", mValid=");
            sb2.append(this.f348484f);
            sb2.append(", mAssignedFromSavedState=");
            return r.x(sb2, this.f348485g, '}');
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public int f348487a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f348488b;

        /* renamed from: c, reason: collision with root package name */
        public int f348489c;

        /* renamed from: d, reason: collision with root package name */
        public int f348490d;

        /* renamed from: e, reason: collision with root package name */
        public int f348491e;

        /* renamed from: f, reason: collision with root package name */
        public int f348492f;

        /* renamed from: g, reason: collision with root package name */
        public int f348493g;

        /* renamed from: h, reason: collision with root package name */
        public int f348494h;

        /* renamed from: i, reason: collision with root package name */
        public int f348495i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f348496j;

        public c() {
            this.f348494h = 1;
            this.f348495i = 1;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LayoutState{mAvailable=");
            sb2.append(this.f348487a);
            sb2.append(", mFlexLinePosition=");
            sb2.append(this.f348489c);
            sb2.append(", mPosition=");
            sb2.append(this.f348490d);
            sb2.append(", mOffset=");
            sb2.append(this.f348491e);
            sb2.append(", mScrollingOffset=");
            sb2.append(this.f348492f);
            sb2.append(", mLastScrollDelta=");
            sb2.append(this.f348493g);
            sb2.append(", mItemDirection=");
            sb2.append(this.f348494h);
            sb2.append(", mLayoutDirection=");
            return r.t(sb2, this.f348495i, '}');
        }
    }

    public FlexboxLayoutManager(Context context) {
        Q1(0);
        R1(1);
        if (this.f348461t != 4) {
            b1();
            this.f348465x.clear();
            b bVar = this.f348446C;
            b.b(bVar);
            bVar.f348482d = 0;
            this.f348461t = 4;
            i1();
        }
        this.f53843i = true;
        this.f348455L = context;
    }

    public static boolean y0(int i12, int i13, int i14) {
        int mode = View.MeasureSpec.getMode(i13);
        int size = View.MeasureSpec.getSize(i13);
        if (i14 > 0 && i12 != i14) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i12;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i12;
        }
        return true;
    }

    public final int A1(RecyclerView.z zVar) {
        if (e0() == 0) {
            return 0;
        }
        int iB2 = zVar.b();
        View viewE1 = E1(iB2);
        View viewG1 = G1(iB2);
        if (zVar.b() != 0 && viewE1 != null && viewG1 != null) {
            int iT02 = RecyclerView.m.t0(viewE1);
            int iT03 = RecyclerView.m.t0(viewG1);
            int iAbs = Math.abs(this.f348447D.d(viewG1) - this.f348447D.g(viewE1));
            int i12 = this.f348466y.f348517c[iT02];
            if (i12 != 0 && i12 != -1) {
                return Math.round((i12 * (iAbs / ((r4[iT03] - i12) + 1))) + (this.f348447D.m() - this.f348447D.g(viewE1)));
            }
        }
        return 0;
    }

    @Override // com.google.android.flexbox.d
    public final boolean B() {
        int i12 = this.f348459r;
        return i12 == 0 || i12 == 1;
    }

    public final int B1(RecyclerView.z zVar) {
        if (e0() == 0) {
            return 0;
        }
        int iB2 = zVar.b();
        View viewE1 = E1(iB2);
        View viewG1 = G1(iB2);
        if (zVar.b() == 0 || viewE1 == null || viewG1 == null) {
            return 0;
        }
        View viewI1 = I1(0, e0());
        int iT02 = viewI1 == null ? -1 : RecyclerView.m.t0(viewI1);
        return (int) ((Math.abs(this.f348447D.d(viewG1) - this.f348447D.g(viewE1)) / (((I1(e0() - 1, -1) != null ? RecyclerView.m.t0(r4) : -1) - iT02) + 1)) * zVar.b());
    }

    public final void C1() {
        if (this.f348447D != null) {
            return;
        }
        if (B()) {
            if (this.f348460s == 0) {
                this.f348447D = I.a(this);
                this.f348448E = I.c(this);
                return;
            } else {
                this.f348447D = I.c(this);
                this.f348448E = I.a(this);
                return;
            }
        }
        if (this.f348460s == 0) {
            this.f348447D = I.c(this);
            this.f348448E = I.a(this);
        } else {
            this.f348447D = I.a(this);
            this.f348448E = I.c(this);
        }
    }

    public final int D1(RecyclerView.u uVar, RecyclerView.z zVar, c cVar) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i22;
        int i23;
        h hVar;
        View view;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        h hVar2;
        Rect rect;
        int i32;
        LayoutParams layoutParams;
        int i33 = cVar.f348492f;
        if (i33 != Integer.MIN_VALUE) {
            int i34 = cVar.f348487a;
            if (i34 < 0) {
                cVar.f348492f = i33 + i34;
            }
            P1(uVar, cVar);
        }
        int i35 = cVar.f348487a;
        boolean zB2 = B();
        int i36 = i35;
        int i37 = 0;
        while (true) {
            if (i36 <= 0 && !this.f348445B.f348488b) {
                break;
            }
            List<f> list = this.f348465x;
            int i38 = cVar.f348490d;
            if (i38 < 0 || i38 >= zVar.b() || (i12 = cVar.f348489c) < 0 || i12 >= list.size()) {
                break;
            }
            f fVar = this.f348465x.get(cVar.f348489c);
            cVar.f348490d = fVar.f348511o;
            boolean zB3 = B();
            b bVar = this.f348446C;
            h hVar3 = this.f348466y;
            Rect rect2 = f348443P;
            if (zB3) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int i39 = this.f53850p;
                int i42 = cVar.f348491e;
                if (cVar.f348495i == -1) {
                    i42 -= fVar.f348503g;
                }
                int i43 = i42;
                int i44 = cVar.f348490d;
                float f12 = bVar.f348482d;
                float measuredWidth = paddingLeft - f12;
                float measuredWidth2 = (i39 - paddingRight) - f12;
                float fMax = Math.max(0.0f, 0.0f);
                int i45 = fVar.f348504h;
                i13 = i35;
                int i46 = i44;
                int i47 = 0;
                while (i46 < i44 + i45) {
                    View viewQ = q(i46);
                    if (viewQ == null) {
                        i28 = i46;
                        i29 = i45;
                        rect = rect2;
                        hVar2 = hVar3;
                        i27 = i44;
                    } else {
                        int i48 = i45;
                        i27 = i44;
                        if (cVar.f348495i == 1) {
                            H(viewQ, rect2);
                            D(viewQ);
                        } else {
                            H(viewQ, rect2);
                            E(viewQ, i47, false);
                            i47++;
                        }
                        Rect rect3 = rect2;
                        h hVar4 = hVar3;
                        long j12 = hVar3.f348518d[i46];
                        int i49 = (int) j12;
                        int i52 = (int) (j12 >> 32);
                        LayoutParams layoutParams2 = (LayoutParams) viewQ.getLayoutParams();
                        if (S1(viewQ, i49, i52, layoutParams2)) {
                            viewQ.measure(i49, i52);
                        }
                        float f13 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((RecyclerView.n) viewQ.getLayoutParams()).f53859c.left;
                        float f14 = measuredWidth2 - (((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin + ((RecyclerView.n) viewQ.getLayoutParams()).f53859c.right);
                        int i53 = i43 + ((RecyclerView.n) viewQ.getLayoutParams()).f53859c.top;
                        if (this.f348463v) {
                            i28 = i46;
                            i29 = i48;
                            rect = rect3;
                            hVar2 = hVar4;
                            i32 = i47;
                            layoutParams = layoutParams2;
                            this.f348466y.o(viewQ, fVar, Math.round(f14) - viewQ.getMeasuredWidth(), i53, Math.round(f14), viewQ.getMeasuredHeight() + i53);
                        } else {
                            i28 = i46;
                            i29 = i48;
                            hVar2 = hVar4;
                            rect = rect3;
                            i32 = i47;
                            layoutParams = layoutParams2;
                            this.f348466y.o(viewQ, fVar, Math.round(f13), i53, viewQ.getMeasuredWidth() + Math.round(f13), viewQ.getMeasuredHeight() + i53);
                        }
                        measuredWidth = viewQ.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + ((RecyclerView.n) viewQ.getLayoutParams()).f53859c.right + fMax + f13;
                        measuredWidth2 = f14 - (((viewQ.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) + ((RecyclerView.n) viewQ.getLayoutParams()).f53859c.left) + fMax);
                        i47 = i32;
                    }
                    i46 = i28 + 1;
                    i44 = i27;
                    i45 = i29;
                    rect2 = rect;
                    hVar3 = hVar2;
                }
                cVar.f348489c += this.f348445B.f348495i;
                i18 = fVar.f348503g;
                i16 = i36;
                i17 = i37;
            } else {
                i13 = i35;
                h hVar5 = hVar3;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int i54 = this.f53851q;
                int i55 = cVar.f348491e;
                if (cVar.f348495i == -1) {
                    int i56 = fVar.f348503g;
                    i15 = i55 + i56;
                    i14 = i55 - i56;
                } else {
                    i14 = i55;
                    i15 = i14;
                }
                int i57 = cVar.f348490d;
                float f15 = i54 - paddingBottom;
                float f16 = bVar.f348482d;
                float measuredHeight = paddingTop - f16;
                float measuredHeight2 = f15 - f16;
                float fMax2 = Math.max(0.0f, 0.0f);
                int i58 = fVar.f348504h;
                int i59 = i57;
                int i62 = 0;
                while (i59 < i57 + i58) {
                    View viewQ2 = q(i59);
                    if (viewQ2 == null) {
                        i19 = i36;
                        i22 = i37;
                        i24 = i59;
                        i26 = i58;
                        i25 = i57;
                        hVar = hVar5;
                    } else {
                        int i63 = i58;
                        h hVar6 = hVar5;
                        i19 = i36;
                        i22 = i37;
                        long j13 = hVar6.f348518d[i59];
                        int i64 = (int) j13;
                        int i65 = (int) (j13 >> 32);
                        if (S1(viewQ2, i64, i65, (LayoutParams) viewQ2.getLayoutParams())) {
                            viewQ2.measure(i64, i65);
                        }
                        float f17 = measuredHeight + ((ViewGroup.MarginLayoutParams) r8).topMargin + ((RecyclerView.n) viewQ2.getLayoutParams()).f53859c.top;
                        float f18 = measuredHeight2 - (((ViewGroup.MarginLayoutParams) r8).rightMargin + ((RecyclerView.n) viewQ2.getLayoutParams()).f53859c.bottom);
                        if (cVar.f348495i == 1) {
                            H(viewQ2, rect2);
                            D(viewQ2);
                            i23 = i62;
                        } else {
                            H(viewQ2, rect2);
                            E(viewQ2, i62, false);
                            i23 = i62 + 1;
                        }
                        int i66 = i14 + ((RecyclerView.n) viewQ2.getLayoutParams()).f53859c.left;
                        int i67 = i15 - ((RecyclerView.n) viewQ2.getLayoutParams()).f53859c.right;
                        boolean z12 = this.f348463v;
                        if (!z12) {
                            hVar = hVar6;
                            view = viewQ2;
                            i24 = i59;
                            i25 = i57;
                            i26 = i63;
                            if (this.f348464w) {
                                this.f348466y.p(view, fVar, z12, i66, Math.round(f18) - view.getMeasuredHeight(), view.getMeasuredWidth() + i66, Math.round(f18));
                            } else {
                                this.f348466y.p(view, fVar, z12, i66, Math.round(f17), view.getMeasuredWidth() + i66, view.getMeasuredHeight() + Math.round(f17));
                            }
                        } else if (this.f348464w) {
                            hVar = hVar6;
                            view = viewQ2;
                            i24 = i59;
                            i26 = i63;
                            i25 = i57;
                            this.f348466y.p(viewQ2, fVar, z12, i67 - viewQ2.getMeasuredWidth(), Math.round(f18) - viewQ2.getMeasuredHeight(), i67, Math.round(f18));
                        } else {
                            hVar = hVar6;
                            view = viewQ2;
                            i24 = i59;
                            i25 = i57;
                            i26 = i63;
                            this.f348466y.p(view, fVar, z12, i67 - view.getMeasuredWidth(), Math.round(f17), i67, view.getMeasuredHeight() + Math.round(f17));
                        }
                        measuredHeight2 = f18 - (((view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r8).bottomMargin) + ((RecyclerView.n) view.getLayoutParams()).f53859c.top) + fMax2);
                        measuredHeight = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r8).topMargin + ((RecyclerView.n) view.getLayoutParams()).f53859c.bottom + fMax2 + f17;
                        i62 = i23;
                    }
                    i59 = i24 + 1;
                    i57 = i25;
                    i36 = i19;
                    i37 = i22;
                    hVar5 = hVar;
                    i58 = i26;
                }
                i16 = i36;
                i17 = i37;
                cVar.f348489c += this.f348445B.f348495i;
                i18 = fVar.f348503g;
            }
            i37 = i17 + i18;
            if (zB2 || !this.f348463v) {
                cVar.f348491e = (fVar.f348503g * cVar.f348495i) + cVar.f348491e;
            } else {
                cVar.f348491e -= fVar.f348503g * cVar.f348495i;
            }
            i36 = i16 - fVar.f348503g;
            i35 = i13;
        }
        int i68 = i35;
        int i69 = i37;
        int i72 = cVar.f348487a - i69;
        cVar.f348487a = i72;
        int i73 = cVar.f348492f;
        if (i73 != Integer.MIN_VALUE) {
            int i74 = i73 + i69;
            cVar.f348492f = i74;
            if (i72 < 0) {
                cVar.f348492f = i74 + i72;
            }
            P1(uVar, cVar);
        }
        return i68 - cVar.f348487a;
    }

    public final View E1(int i12) {
        View viewJ1 = J1(0, e0(), i12);
        if (viewJ1 == null) {
            return null;
        }
        int i13 = this.f348466y.f348517c[RecyclerView.m.t0(viewJ1)];
        if (i13 == -1) {
            return null;
        }
        return F1(viewJ1, this.f348465x.get(i13));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View F1(android.view.View r6, com.google.android.flexbox.f r7) {
        /*
            r5 = this;
            boolean r0 = r5.B()
            int r7 = r7.f348504h
            r1 = 1
        L7:
            if (r1 >= r7) goto L3f
            android.view.View r2 = r5.d0(r1)
            if (r2 == 0) goto L3c
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 != r4) goto L18
            goto L3c
        L18:
            boolean r3 = r5.f348463v
            if (r3 == 0) goto L2d
            if (r0 != 0) goto L2d
            androidx.recyclerview.widget.I r3 = r5.f348447D
            int r3 = r3.d(r6)
            androidx.recyclerview.widget.I r4 = r5.f348447D
            int r4 = r4.d(r2)
            if (r3 >= r4) goto L3c
            goto L3b
        L2d:
            androidx.recyclerview.widget.I r3 = r5.f348447D
            int r3 = r3.g(r6)
            androidx.recyclerview.widget.I r4 = r5.f348447D
            int r4 = r4.g(r2)
            if (r3 <= r4) goto L3c
        L3b:
            r6 = r2
        L3c:
            int r1 = r1 + 1
            goto L7
        L3f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.F1(android.view.View, com.google.android.flexbox.f):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void G0() {
        b1();
    }

    public final View G1(int i12) {
        View viewJ1 = J1(e0() - 1, -1, i12);
        if (viewJ1 == null) {
            return null;
        }
        return H1(viewJ1, this.f348465x.get(this.f348466y.f348517c[RecyclerView.m.t0(viewJ1)]));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void H0(RecyclerView recyclerView) {
        this.f348456M = (View) recyclerView.getParent();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View H1(android.view.View r6, com.google.android.flexbox.f r7) {
        /*
            r5 = this;
            boolean r0 = r5.B()
            int r1 = r5.e0()
            int r1 = r1 + (-2)
            int r2 = r5.e0()
            int r7 = r7.f348504h
            int r2 = r2 - r7
            int r2 = r2 + (-1)
        L13:
            if (r1 <= r2) goto L4b
            android.view.View r7 = r5.d0(r1)
            if (r7 == 0) goto L48
            int r3 = r7.getVisibility()
            r4 = 8
            if (r3 != r4) goto L24
            goto L48
        L24:
            boolean r3 = r5.f348463v
            if (r3 == 0) goto L39
            if (r0 != 0) goto L39
            androidx.recyclerview.widget.I r3 = r5.f348447D
            int r3 = r3.g(r6)
            androidx.recyclerview.widget.I r4 = r5.f348447D
            int r4 = r4.g(r7)
            if (r3 <= r4) goto L48
            goto L47
        L39:
            androidx.recyclerview.widget.I r3 = r5.f348447D
            int r3 = r3.d(r6)
            androidx.recyclerview.widget.I r4 = r5.f348447D
            int r4 = r4.d(r7)
            if (r3 >= r4) goto L48
        L47:
            r6 = r7
        L48:
            int r1 = r1 + (-1)
            goto L13
        L4b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.H1(android.view.View, com.google.android.flexbox.f):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean I() {
        if (this.f348460s == 0) {
            return B();
        }
        if (B()) {
            int i12 = this.f53850p;
            View view = this.f348456M;
            if (i12 <= (view != null ? view.getWidth() : 0)) {
                return false;
            }
        }
        return true;
    }

    public final View I1(int i12, int i13) {
        int i14 = i13 > i12 ? 1 : -1;
        while (i12 != i13) {
            View viewD0 = d0(i12);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = this.f53850p - getPaddingRight();
            int paddingBottom = this.f53851q - getPaddingBottom();
            int iJ02 = RecyclerView.m.j0(viewD0) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) viewD0.getLayoutParams())).leftMargin;
            int iN02 = RecyclerView.m.n0(viewD0) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) viewD0.getLayoutParams())).topMargin;
            int iM02 = RecyclerView.m.m0(viewD0) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) viewD0.getLayoutParams())).rightMargin;
            int iH02 = RecyclerView.m.h0(viewD0) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) viewD0.getLayoutParams())).bottomMargin;
            boolean z12 = iJ02 >= paddingRight || iM02 >= paddingLeft;
            boolean z13 = iN02 >= paddingBottom || iH02 >= paddingTop;
            if (z12 && z13) {
                return viewD0;
            }
            i12 += i14;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean J() {
        if (this.f348460s == 0) {
            return !B();
        }
        if (B()) {
            return true;
        }
        int i12 = this.f53851q;
        View view = this.f348456M;
        return i12 > (view != null ? view.getHeight() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View J1(int i12, int i13, int i14) {
        C1();
        View view = null;
        Object[] objArr = 0;
        if (this.f348445B == null) {
            this.f348445B = new c();
        }
        int iM2 = this.f348447D.m();
        int i15 = this.f348447D.i();
        int i16 = i13 > i12 ? 1 : -1;
        View view2 = null;
        while (i12 != i13) {
            View viewD0 = d0(i12);
            int iT02 = RecyclerView.m.t0(viewD0);
            if (iT02 >= 0 && iT02 < i14) {
                if (((RecyclerView.n) viewD0.getLayoutParams()).f53858b.isRemoved()) {
                    if (view2 == null) {
                        view2 = viewD0;
                    }
                } else {
                    if (this.f348447D.g(viewD0) >= iM2 && this.f348447D.d(viewD0) <= i15) {
                        return viewD0;
                    }
                    if (view == null) {
                        view = viewD0;
                    }
                }
            }
            i12 += i16;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean K(RecyclerView.n nVar) {
        return nVar instanceof LayoutParams;
    }

    public final int K1(int i12, RecyclerView.u uVar, RecyclerView.z zVar, boolean z12) {
        int iN1;
        int i13;
        if (B() || !this.f348463v) {
            int i14 = this.f348447D.i() - i12;
            if (i14 <= 0) {
                return 0;
            }
            iN1 = -N1(-i14, uVar, zVar);
        } else {
            int iM2 = i12 - this.f348447D.m();
            if (iM2 <= 0) {
                return 0;
            }
            iN1 = N1(iM2, uVar, zVar);
        }
        int i15 = i12 + iN1;
        if (!z12 || (i13 = this.f348447D.i() - i15) <= 0) {
            return iN1;
        }
        this.f348447D.r(i13);
        return i13 + iN1;
    }

    public final int L1(int i12, RecyclerView.u uVar, RecyclerView.z zVar, boolean z12) {
        int iN1;
        int iM2;
        if (B() || !this.f348463v) {
            int iM3 = i12 - this.f348447D.m();
            if (iM3 <= 0) {
                return 0;
            }
            iN1 = -N1(iM3, uVar, zVar);
        } else {
            int i13 = this.f348447D.i() - i12;
            if (i13 <= 0) {
                return 0;
            }
            iN1 = N1(-i13, uVar, zVar);
        }
        int i14 = i12 + iN1;
        if (!z12 || (iM2 = i14 - this.f348447D.m()) <= 0) {
            return iN1;
        }
        this.f348447D.r(-iM2);
        return iN1 - iM2;
    }

    public final List<f> M1() {
        ArrayList arrayList = new ArrayList(this.f348465x.size());
        int size = this.f348465x.size();
        for (int i12 = 0; i12 < size; i12++) {
            f fVar = this.f348465x.get(i12);
            if (fVar.f348504h != 0) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int N1(int r19, androidx.recyclerview.widget.RecyclerView.u r20, androidx.recyclerview.widget.RecyclerView.z r21) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.N1(int, androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z):int");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int O(RecyclerView.z zVar) {
        return z1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void O0(int i12, int i13) {
        T1(i12);
    }

    public final int O1(int i12) {
        int i13;
        if (e0() == 0 || i12 == 0) {
            return 0;
        }
        C1();
        boolean zB2 = B();
        View view = this.f348456M;
        int width = zB2 ? view.getWidth() : view.getHeight();
        int i14 = zB2 ? this.f53850p : this.f53851q;
        int iQ02 = q0();
        b bVar = this.f348446C;
        if (iQ02 == 1) {
            int iAbs = Math.abs(i12);
            if (i12 < 0) {
                return -Math.min((i14 + bVar.f348482d) - width, iAbs);
            }
            i13 = bVar.f348482d;
            if (i13 + i12 <= 0) {
                return i12;
            }
        } else {
            if (i12 > 0) {
                return Math.min((i14 - bVar.f348482d) - width, i12);
            }
            i13 = bVar.f348482d;
            if (i13 + i12 >= 0) {
                return i12;
            }
        }
        return -i13;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int P(RecyclerView.z zVar) {
        return A1(zVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P1(androidx.recyclerview.widget.RecyclerView.u r10, com.google.android.flexbox.FlexboxLayoutManager.c r11) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.P1(androidx.recyclerview.widget.RecyclerView$u, com.google.android.flexbox.FlexboxLayoutManager$c):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int Q(RecyclerView.z zVar) {
        return B1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void Q0(int i12, int i13) {
        T1(Math.min(i12, i13));
    }

    public final void Q1(int i12) {
        if (this.f348459r != i12) {
            b1();
            this.f348459r = i12;
            this.f348447D = null;
            this.f348448E = null;
            this.f348465x.clear();
            b bVar = this.f348446C;
            b.b(bVar);
            bVar.f348482d = 0;
            i1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int R(RecyclerView.z zVar) {
        return z1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void R0(int i12, int i13) {
        T1(i12);
    }

    public final void R1(int i12) {
        int i13 = this.f348460s;
        if (i13 != 1) {
            if (i13 == 0) {
                b1();
                this.f348465x.clear();
                b bVar = this.f348446C;
                b.b(bVar);
                bVar.f348482d = 0;
            }
            this.f348460s = 1;
            this.f348447D = null;
            this.f348448E = null;
            i1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int S(RecyclerView.z zVar) {
        return A1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void S0(int i12) {
        T1(i12);
    }

    public final boolean S1(View view, int i12, int i13, LayoutParams layoutParams) {
        return (!view.isLayoutRequested() && this.f53844j && y0(view.getWidth(), i12, ((ViewGroup.MarginLayoutParams) layoutParams).width) && y0(view.getHeight(), i13, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int T(RecyclerView.z zVar) {
        return B1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void T0(@N RecyclerView recyclerView, int i12, int i13) {
        T1(i12);
        T1(i12);
    }

    public final void T1(int i12) {
        View viewI1 = I1(e0() - 1, -1);
        if (i12 >= (viewI1 != null ? RecyclerView.m.t0(viewI1) : -1)) {
            return;
        }
        int iE02 = e0();
        h hVar = this.f348466y;
        hVar.j(iE02);
        hVar.k(iE02);
        hVar.i(iE02);
        if (i12 >= hVar.f348517c.length) {
            return;
        }
        this.f348457N = i12;
        View viewD0 = d0(0);
        if (viewD0 == null) {
            return;
        }
        this.f348450G = RecyclerView.m.t0(viewD0);
        if (B() || !this.f348463v) {
            this.f348451H = this.f348447D.g(viewD0) - this.f348447D.m();
        } else {
            this.f348451H = this.f348447D.j() + this.f348447D.d(viewD0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ea  */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U0(androidx.recyclerview.widget.RecyclerView.u r22, androidx.recyclerview.widget.RecyclerView.z r23) {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.U0(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z):void");
    }

    public final void U1(b bVar, boolean z12, boolean z13) {
        int i12;
        if (z13) {
            int i13 = B() ? this.f53849o : this.f53848n;
            this.f348445B.f348488b = i13 == 0 || i13 == Integer.MIN_VALUE;
        } else {
            this.f348445B.f348488b = false;
        }
        if (B() || !this.f348463v) {
            this.f348445B.f348487a = this.f348447D.i() - bVar.f348481c;
        } else {
            this.f348445B.f348487a = bVar.f348481c - getPaddingRight();
        }
        c cVar = this.f348445B;
        cVar.f348490d = bVar.f348479a;
        cVar.f348494h = 1;
        cVar.f348495i = 1;
        cVar.f348491e = bVar.f348481c;
        cVar.f348492f = BeduinInputModel.MIN_TEXT_VERSION;
        cVar.f348489c = bVar.f348480b;
        if (!z12 || this.f348465x.size() <= 1 || (i12 = bVar.f348480b) < 0 || i12 >= this.f348465x.size() - 1) {
            return;
        }
        f fVar = this.f348465x.get(bVar.f348480b);
        c cVar2 = this.f348445B;
        cVar2.f348489c++;
        cVar2.f348490d += fVar.f348504h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void V0(RecyclerView.z zVar) {
        this.f348449F = null;
        this.f348450G = -1;
        this.f348451H = BeduinInputModel.MIN_TEXT_VERSION;
        this.f348457N = -1;
        b.b(this.f348446C);
        this.f348454K.clear();
    }

    public final void V1(b bVar, boolean z12, boolean z13) {
        if (z13) {
            int i12 = B() ? this.f53849o : this.f53848n;
            this.f348445B.f348488b = i12 == 0 || i12 == Integer.MIN_VALUE;
        } else {
            this.f348445B.f348488b = false;
        }
        if (B() || !this.f348463v) {
            this.f348445B.f348487a = bVar.f348481c - this.f348447D.m();
        } else {
            this.f348445B.f348487a = (this.f348456M.getWidth() - bVar.f348481c) - this.f348447D.m();
        }
        c cVar = this.f348445B;
        cVar.f348490d = bVar.f348479a;
        cVar.f348494h = 1;
        cVar.f348495i = -1;
        cVar.f348491e = bVar.f348481c;
        cVar.f348492f = BeduinInputModel.MIN_TEXT_VERSION;
        int i13 = bVar.f348480b;
        cVar.f348489c = i13;
        if (!z12 || i13 <= 0) {
            return;
        }
        int size = this.f348465x.size();
        int i14 = bVar.f348480b;
        if (size > i14) {
            f fVar = this.f348465x.get(i14);
            c cVar2 = this.f348445B;
            cVar2.f348489c--;
            cVar2.f348490d -= fVar.f348504h;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void X0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f348449F = (SavedState) parcelable;
            i1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final Parcelable Y0() {
        if (this.f348449F != null) {
            return new SavedState(this.f348449F, (a) null);
        }
        SavedState savedState = new SavedState();
        if (e0() > 0) {
            View viewD0 = d0(0);
            savedState.f348477b = RecyclerView.m.t0(viewD0);
            savedState.f348478c = this.f348447D.g(viewD0) - this.f348447D.m();
        } else {
            savedState.f348477b = -1;
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n a0() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.f348468f = 0.0f;
        layoutParams.f348469g = 1.0f;
        layoutParams.f348470h = -1;
        layoutParams.f348471i = -1.0f;
        layoutParams.f348474l = 16777215;
        layoutParams.f348475m = 16777215;
        return layoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n b0(Context context, AttributeSet attributeSet) {
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.f348468f = 0.0f;
        layoutParams.f348469g = 1.0f;
        layoutParams.f348470h = -1;
        layoutParams.f348471i = -1.0f;
        layoutParams.f348474l = 16777215;
        layoutParams.f348475m = 16777215;
        return layoutParams;
    }

    @Override // com.google.android.flexbox.d
    public final void d(View view, int i12) {
        this.f348454K.put(i12, view);
    }

    @Override // com.google.android.flexbox.d
    public final int e(View view) {
        return B() ? ((RecyclerView.n) view.getLayoutParams()).f53859c.top + ((RecyclerView.n) view.getLayoutParams()).f53859c.bottom : ((RecyclerView.n) view.getLayoutParams()).f53859c.left + ((RecyclerView.n) view.getLayoutParams()).f53859c.right;
    }

    @Override // com.google.android.flexbox.d
    public final int g(View view, int i12, int i13) {
        return B() ? ((RecyclerView.n) view.getLayoutParams()).f53859c.left + ((RecyclerView.n) view.getLayoutParams()).f53859c.right : ((RecyclerView.n) view.getLayoutParams()).f53859c.top + ((RecyclerView.n) view.getLayoutParams()).f53859c.bottom;
    }

    @Override // com.google.android.flexbox.d
    public final int getAlignContent() {
        return 5;
    }

    @Override // com.google.android.flexbox.d
    public final int getAlignItems() {
        return this.f348461t;
    }

    @Override // com.google.android.flexbox.d
    public final int getFlexDirection() {
        return this.f348459r;
    }

    @Override // com.google.android.flexbox.d
    public final int getFlexItemCount() {
        return this.f348444A.b();
    }

    @Override // com.google.android.flexbox.d
    public final List<f> getFlexLinesInternal() {
        return this.f348465x;
    }

    @Override // com.google.android.flexbox.d
    public final int getFlexWrap() {
        return this.f348460s;
    }

    @Override // com.google.android.flexbox.d
    public final int getLargestMainSize() {
        if (this.f348465x.size() == 0) {
            return 0;
        }
        int size = this.f348465x.size();
        int iMax = BeduinInputModel.MIN_TEXT_VERSION;
        for (int i12 = 0; i12 < size; i12++) {
            iMax = Math.max(iMax, this.f348465x.get(i12).f348501e);
        }
        return iMax;
    }

    @Override // com.google.android.flexbox.d
    public final int getMaxLine() {
        return this.f348462u;
    }

    @Override // com.google.android.flexbox.d
    public final int getSumOfCrossSize() {
        int size = this.f348465x.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            i12 += this.f348465x.get(i13).f348503g;
        }
        return i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int k1(int i12, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (!B() || (this.f348460s == 0 && B())) {
            int iN1 = N1(i12, uVar, zVar);
            this.f348454K.clear();
            return iN1;
        }
        int iO1 = O1(i12);
        this.f348446C.f348482d += iO1;
        this.f348448E.r(-iO1);
        return iO1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void l1(int i12) {
        this.f348450G = i12;
        this.f348451H = BeduinInputModel.MIN_TEXT_VERSION;
        SavedState savedState = this.f348449F;
        if (savedState != null) {
            savedState.f348477b = -1;
        }
        i1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int m1(int i12, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (B() || (this.f348460s == 0 && !B())) {
            int iN1 = N1(i12, uVar, zVar);
            this.f348454K.clear();
            return iN1;
        }
        int iO1 = O1(i12);
        this.f348446C.f348482d += iO1;
        this.f348448E.r(-iO1);
        return iO1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public final PointF o(int i12) {
        if (e0() == 0) {
            return null;
        }
        int i13 = i12 < RecyclerView.m.t0(d0(0)) ? -1 : 1;
        return B() ? new PointF(0.0f, i13) : new PointF(i13, 0.0f);
    }

    @Override // com.google.android.flexbox.d
    public final void p(View view, int i12, int i13, f fVar) {
        H(view, f348443P);
        if (B()) {
            int i14 = ((RecyclerView.n) view.getLayoutParams()).f53859c.left + ((RecyclerView.n) view.getLayoutParams()).f53859c.right;
            fVar.f348501e += i14;
            fVar.f348502f += i14;
        } else {
            int i15 = ((RecyclerView.n) view.getLayoutParams()).f53859c.top + ((RecyclerView.n) view.getLayoutParams()).f53859c.bottom;
            fVar.f348501e += i15;
            fVar.f348502f += i15;
        }
    }

    @Override // com.google.android.flexbox.d
    public final View q(int i12) {
        View view = this.f348454K.get(i12);
        return view != null ? view : this.f348467z.d(i12);
    }

    @Override // com.google.android.flexbox.d
    public final int s(int i12, int i13, int i14) {
        return RecyclerView.m.f0(this.f53851q, this.f53849o, i13, i14, J());
    }

    @Override // com.google.android.flexbox.d
    public final void setFlexLines(List<f> list) {
        this.f348465x = list;
    }

    @Override // com.google.android.flexbox.d
    public final View u(int i12) {
        return q(i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void w1(int i12, RecyclerView recyclerView) {
        C23434z c23434z = new C23434z(recyclerView.getContext());
        c23434z.f53878a = i12;
        x1(c23434z);
    }

    @Override // com.google.android.flexbox.d
    public final int x(int i12, int i13, int i14) {
        return RecyclerView.m.f0(this.f53850p, this.f53848n, i13, i14, I());
    }

    public final int z1(RecyclerView.z zVar) {
        if (e0() == 0) {
            return 0;
        }
        int iB2 = zVar.b();
        C1();
        View viewE1 = E1(iB2);
        View viewG1 = G1(iB2);
        if (zVar.b() == 0 || viewE1 == null || viewG1 == null) {
            return 0;
        }
        return Math.min(this.f348447D.n(), this.f348447D.d(viewG1) - this.f348447D.g(viewE1));
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i12, int i13) {
        RecyclerView.m.d dVarU0 = RecyclerView.m.u0(context, attributeSet, i12, i13);
        int i14 = dVarU0.f53854a;
        if (i14 != 0) {
            if (i14 == 1) {
                if (dVarU0.f53856c) {
                    Q1(3);
                } else {
                    Q1(2);
                }
            }
        } else if (dVarU0.f53856c) {
            Q1(1);
        } else {
            Q1(0);
        }
        R1(1);
        if (this.f348461t != 4) {
            b1();
            this.f348465x.clear();
            b bVar = this.f348446C;
            b.b(bVar);
            bVar.f348482d = 0;
            this.f348461t = 4;
            i1();
        }
        this.f53843i = true;
        this.f348455L = context;
    }

    @Override // com.google.android.flexbox.d
    public final void m(f fVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void I0(RecyclerView recyclerView, RecyclerView.u uVar) {
    }
}
