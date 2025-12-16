package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.android.flexbox.h;
import com.google.android.flexbox.k;
import j.P;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes6.dex */
public class FlexboxLayout extends ViewGroup implements d {

    /* renamed from: b, reason: collision with root package name */
    public int f348416b;

    /* renamed from: c, reason: collision with root package name */
    public int f348417c;

    /* renamed from: d, reason: collision with root package name */
    public int f348418d;

    /* renamed from: e, reason: collision with root package name */
    public int f348419e;

    /* renamed from: f, reason: collision with root package name */
    public int f348420f;

    /* renamed from: g, reason: collision with root package name */
    public int f348421g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public Drawable f348422h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public Drawable f348423i;

    /* renamed from: j, reason: collision with root package name */
    public int f348424j;

    /* renamed from: k, reason: collision with root package name */
    public int f348425k;

    /* renamed from: l, reason: collision with root package name */
    public int f348426l;

    /* renamed from: m, reason: collision with root package name */
    public int f348427m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f348428n;

    /* renamed from: o, reason: collision with root package name */
    public SparseIntArray f348429o;

    /* renamed from: p, reason: collision with root package name */
    public final h f348430p;

    /* renamed from: q, reason: collision with root package name */
    public List<f> f348431q;

    /* renamed from: r, reason: collision with root package name */
    public final h.b f348432r;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public int f348433b;

        /* renamed from: c, reason: collision with root package name */
        public float f348434c;

        /* renamed from: d, reason: collision with root package name */
        public float f348435d;

        /* renamed from: e, reason: collision with root package name */
        public int f348436e;

        /* renamed from: f, reason: collision with root package name */
        public float f348437f;

        /* renamed from: g, reason: collision with root package name */
        public int f348438g;

        /* renamed from: h, reason: collision with root package name */
        public int f348439h;

        /* renamed from: i, reason: collision with root package name */
        public int f348440i;

        /* renamed from: j, reason: collision with root package name */
        public int f348441j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f348442k;

        public static class a implements Parcelable.Creator<LayoutParams> {
            @Override // android.os.Parcelable.Creator
            public final LayoutParams createFromParcel(Parcel parcel) {
                LayoutParams layoutParams = new LayoutParams(0, 0);
                layoutParams.f348433b = 1;
                layoutParams.f348434c = 0.0f;
                layoutParams.f348435d = 1.0f;
                layoutParams.f348436e = -1;
                layoutParams.f348437f = -1.0f;
                layoutParams.f348438g = -1;
                layoutParams.f348439h = -1;
                layoutParams.f348440i = 16777215;
                layoutParams.f348441j = 16777215;
                layoutParams.f348433b = parcel.readInt();
                layoutParams.f348434c = parcel.readFloat();
                layoutParams.f348435d = parcel.readFloat();
                layoutParams.f348436e = parcel.readInt();
                layoutParams.f348437f = parcel.readFloat();
                layoutParams.f348438g = parcel.readInt();
                layoutParams.f348439h = parcel.readInt();
                layoutParams.f348440i = parcel.readInt();
                layoutParams.f348441j = parcel.readInt();
                layoutParams.f348442k = parcel.readByte() != 0;
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

        public LayoutParams(int i12, int i13) {
            super(new ViewGroup.LayoutParams(i12, i13));
            this.f348433b = 1;
            this.f348434c = 0.0f;
            this.f348435d = 1.0f;
            this.f348436e = -1;
            this.f348437f = -1.0f;
            this.f348438g = -1;
            this.f348439h = -1;
            this.f348440i = 16777215;
            this.f348441j = 16777215;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int G0() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int R4() {
            return this.f348436e;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float S1() {
            return this.f348435d;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void a3(int i12) {
            this.f348438g = i12;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int c3() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int d0() {
            return this.f348440i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void g2(int i12) {
            this.f348439h = i12;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getOrder() {
            return this.f348433b;
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
            return this.f348434c;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int k3() {
            return this.f348439h;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float n5() {
            return this.f348437f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int p3() {
            return this.f348441j;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean r5() {
            return this.f348442k;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i12) {
            parcel.writeInt(this.f348433b);
            parcel.writeFloat(this.f348434c);
            parcel.writeFloat(this.f348435d);
            parcel.writeInt(this.f348436e);
            parcel.writeFloat(this.f348437f);
            parcel.writeInt(this.f348438g);
            parcel.writeInt(this.f348439h);
            parcel.writeInt(this.f348440i);
            parcel.writeInt(this.f348441j);
            parcel.writeByte(this.f348442k ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int z0() {
            return this.f348438g;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.google.android.flexbox.d
    public final boolean B() {
        int i12 = this.f348416b;
        return i12 == 0 || i12 == 1;
    }

    public final void a(Canvas canvas, boolean z12, boolean z13) {
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f348431q.size();
        for (int i12 = 0; i12 < size; i12++) {
            f fVar = this.f348431q.get(i12);
            for (int i13 = 0; i13 < fVar.f348504h; i13++) {
                int i14 = fVar.f348511o + i13;
                View viewH = h(i14);
                if (viewH != null && viewH.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewH.getLayoutParams();
                    if (i(i14, i13)) {
                        f(canvas, z12 ? viewH.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (viewH.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f348427m, fVar.f348498b, fVar.f348503g);
                    }
                    if (i13 == fVar.f348504h - 1 && (this.f348425k & 4) > 0) {
                        f(canvas, z12 ? (viewH.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f348427m : viewH.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, fVar.f348498b, fVar.f348503g);
                    }
                }
            }
            if (j(i12)) {
                c(canvas, paddingLeft, z13 ? fVar.f348500d : fVar.f348498b - this.f348426l, iMax);
            }
            if (k(i12) && (this.f348424j & 4) > 0) {
                c(canvas, paddingLeft, z13 ? fVar.f348498b - this.f348426l : fVar.f348500d, iMax);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i12, ViewGroup.LayoutParams layoutParams) {
        if (this.f348429o == null) {
            this.f348429o = new SparseIntArray(getChildCount());
        }
        SparseIntArray sparseIntArray = this.f348429o;
        h hVar = this.f348430p;
        d dVar = hVar.f348515a;
        int flexItemCount = dVar.getFlexItemCount();
        ArrayList arrayListF = hVar.f(flexItemCount);
        h.c cVar = new h.c();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            cVar.f348523c = 1;
        } else {
            cVar.f348523c = ((FlexItem) layoutParams).getOrder();
        }
        if (i12 == -1 || i12 == flexItemCount || i12 >= dVar.getFlexItemCount()) {
            cVar.f348522b = flexItemCount;
        } else {
            cVar.f348522b = i12;
            for (int i13 = i12; i13 < flexItemCount; i13++) {
                ((h.c) arrayListF.get(i13)).f348522b++;
            }
        }
        arrayListF.add(cVar);
        this.f348428n = h.r(flexItemCount + 1, arrayListF, sparseIntArray);
        super.addView(view, i12, layoutParams);
    }

    public final void b(Canvas canvas, boolean z12, boolean z13) {
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f348431q.size();
        for (int i12 = 0; i12 < size; i12++) {
            f fVar = this.f348431q.get(i12);
            for (int i13 = 0; i13 < fVar.f348504h; i13++) {
                int i14 = fVar.f348511o + i13;
                View viewH = h(i14);
                if (viewH != null && viewH.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewH.getLayoutParams();
                    if (i(i14, i13)) {
                        c(canvas, fVar.f348497a, z13 ? viewH.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : (viewH.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f348426l, fVar.f348503g);
                    }
                    if (i13 == fVar.f348504h - 1 && (this.f348424j & 4) > 0) {
                        c(canvas, fVar.f348497a, z13 ? (viewH.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f348426l : viewH.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, fVar.f348503g);
                    }
                }
            }
            if (j(i12)) {
                f(canvas, z12 ? fVar.f348499c : fVar.f348497a - this.f348427m, paddingTop, iMax);
            }
            if (k(i12) && (this.f348425k & 4) > 0) {
                f(canvas, z12 ? fVar.f348497a - this.f348427m : fVar.f348499c, paddingTop, iMax);
            }
        }
    }

    public final void c(Canvas canvas, int i12, int i13, int i14) {
        Drawable drawable = this.f348422h;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i12, i13, i14 + i12, this.f348426l + i13);
        this.f348422h.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // com.google.android.flexbox.d
    public final int e(View view) {
        return 0;
    }

    public final void f(Canvas canvas, int i12, int i13, int i14) {
        Drawable drawable = this.f348423i;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i12, i13, this.f348427m + i12, i14 + i13);
        this.f348423i.draw(canvas);
    }

    @Override // com.google.android.flexbox.d
    public final int g(View view, int i12, int i13) {
        int i14;
        int i15;
        if (B()) {
            i14 = i(i12, i13) ? this.f348427m : 0;
            if ((this.f348425k & 4) <= 0) {
                return i14;
            }
            i15 = this.f348427m;
        } else {
            i14 = i(i12, i13) ? this.f348426l : 0;
            if ((this.f348424j & 4) <= 0) {
                return i14;
            }
            i15 = this.f348426l;
        }
        return i14 + i15;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.f348433b = 1;
        layoutParams.f348434c = 0.0f;
        layoutParams.f348435d = 1.0f;
        layoutParams.f348436e = -1;
        layoutParams.f348437f = -1.0f;
        layoutParams.f348438g = -1;
        layoutParams.f348439h = -1;
        layoutParams.f348440i = 16777215;
        layoutParams.f348441j = 16777215;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.c.f348525b);
        layoutParams.f348433b = typedArrayObtainStyledAttributes.getInt(8, 1);
        layoutParams.f348434c = typedArrayObtainStyledAttributes.getFloat(2, 0.0f);
        layoutParams.f348435d = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        layoutParams.f348436e = typedArrayObtainStyledAttributes.getInt(0, -1);
        layoutParams.f348437f = typedArrayObtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
        layoutParams.f348438g = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        layoutParams.f348439h = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, -1);
        layoutParams.f348440i = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 16777215);
        layoutParams.f348441j = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 16777215);
        layoutParams.f348442k = typedArrayObtainStyledAttributes.getBoolean(9, false);
        typedArrayObtainStyledAttributes.recycle();
        return layoutParams;
    }

    @Override // com.google.android.flexbox.d
    public int getAlignContent() {
        return this.f348420f;
    }

    @Override // com.google.android.flexbox.d
    public int getAlignItems() {
        return this.f348419e;
    }

    @P
    public Drawable getDividerDrawableHorizontal() {
        return this.f348422h;
    }

    @P
    public Drawable getDividerDrawableVertical() {
        return this.f348423i;
    }

    @Override // com.google.android.flexbox.d
    public int getFlexDirection() {
        return this.f348416b;
    }

    @Override // com.google.android.flexbox.d
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<f> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f348431q.size());
        for (f fVar : this.f348431q) {
            if (fVar.a() != 0) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.d
    public List<f> getFlexLinesInternal() {
        return this.f348431q;
    }

    @Override // com.google.android.flexbox.d
    public int getFlexWrap() {
        return this.f348417c;
    }

    public int getJustifyContent() {
        return this.f348418d;
    }

    @Override // com.google.android.flexbox.d
    public int getLargestMainSize() {
        Iterator<f> it = this.f348431q.iterator();
        int iMax = BeduinInputModel.MIN_TEXT_VERSION;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().f348501e);
        }
        return iMax;
    }

    @Override // com.google.android.flexbox.d
    public int getMaxLine() {
        return this.f348421g;
    }

    public int getShowDividerHorizontal() {
        return this.f348424j;
    }

    public int getShowDividerVertical() {
        return this.f348425k;
    }

    @Override // com.google.android.flexbox.d
    public int getSumOfCrossSize() {
        int size = this.f348431q.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            f fVar = this.f348431q.get(i13);
            if (j(i13)) {
                i12 += B() ? this.f348426l : this.f348427m;
            }
            if (k(i13)) {
                i12 += B() ? this.f348426l : this.f348427m;
            }
            i12 += fVar.f348503g;
        }
        return i12;
    }

    public final View h(int i12) {
        if (i12 < 0) {
            return null;
        }
        int[] iArr = this.f348428n;
        if (i12 >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i12]);
    }

    public final boolean i(int i12, int i13) {
        for (int i14 = 1; i14 <= i13; i14++) {
            View viewH = h(i12 - i14);
            if (viewH != null && viewH.getVisibility() != 8) {
                return B() ? (this.f348425k & 2) != 0 : (this.f348424j & 2) != 0;
            }
        }
        return B() ? (this.f348425k & 1) != 0 : (this.f348424j & 1) != 0;
    }

    public final boolean j(int i12) {
        if (i12 < 0 || i12 >= this.f348431q.size()) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (this.f348431q.get(i13).a() > 0) {
                return B() ? (this.f348424j & 2) != 0 : (this.f348425k & 2) != 0;
            }
        }
        return B() ? (this.f348424j & 1) != 0 : (this.f348425k & 1) != 0;
    }

    public final boolean k(int i12) {
        if (i12 < 0 || i12 >= this.f348431q.size()) {
            return false;
        }
        for (int i13 = i12 + 1; i13 < this.f348431q.size(); i13++) {
            if (this.f348431q.get(i13).a() > 0) {
                return false;
            }
        }
        return B() ? (this.f348424j & 4) != 0 : (this.f348425k & 4) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r29, int r30, int r31, int r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.l(int, int, int, int, boolean):void");
    }

    @Override // com.google.android.flexbox.d
    public final void m(f fVar) {
        if (B()) {
            if ((this.f348425k & 4) > 0) {
                int i12 = fVar.f348501e;
                int i13 = this.f348427m;
                fVar.f348501e = i12 + i13;
                fVar.f348502f += i13;
                return;
            }
            return;
        }
        if ((this.f348424j & 4) > 0) {
            int i14 = fVar.f348501e;
            int i15 = this.f348426l;
            fVar.f348501e = i14 + i15;
            fVar.f348502f += i15;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(int r30, int r31, int r32, int r33, boolean r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.n(int, int, int, int, boolean, boolean):void");
    }

    public final void o(int i12, int i13, int i14, int i15) {
        int paddingBottom;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i13);
        int size = View.MeasureSpec.getSize(i13);
        int mode2 = View.MeasureSpec.getMode(i14);
        int size2 = View.MeasureSpec.getSize(i14);
        if (i12 == 0 || i12 == 1) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            largestMainSize = getLargestMainSize();
        } else {
            if (i12 != 2 && i12 != 3) {
                throw new IllegalArgumentException(AK.c.g(i12, "Invalid flex direction: "));
            }
            paddingBottom = getLargestMainSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i15 = View.combineMeasuredStates(i15, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i13, i15);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i13, i15);
        } else {
            if (mode != 1073741824) {
                throw new IllegalStateException(AK.c.g(mode, "Unknown width mode is set: "));
            }
            if (size < largestMainSize) {
                i15 = View.combineMeasuredStates(i15, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i13, i15);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < paddingBottom) {
                i15 = View.combineMeasuredStates(i15, 256);
            } else {
                size2 = paddingBottom;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i14, i15);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i14, i15);
        } else {
            if (mode2 != 1073741824) {
                throw new IllegalStateException(AK.c.g(mode2, "Unknown height mode is set: "));
            }
            if (size2 < paddingBottom) {
                i15 = View.combineMeasuredStates(i15, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i14, i15);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f348423i == null && this.f348422h == null) {
            return;
        }
        if (this.f348424j == 0 && this.f348425k == 0) {
            return;
        }
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        int layoutDirection = getLayoutDirection();
        int i12 = this.f348416b;
        if (i12 == 0) {
            a(canvas, layoutDirection == 1, this.f348417c == 2);
            return;
        }
        if (i12 == 1) {
            a(canvas, layoutDirection != 1, this.f348417c == 2);
            return;
        }
        if (i12 == 2) {
            boolean z12 = layoutDirection == 1;
            if (this.f348417c == 2) {
                z12 = !z12;
            }
            b(canvas, z12, false);
            return;
        }
        if (i12 != 3) {
            return;
        }
        boolean z13 = layoutDirection == 1;
        if (this.f348417c == 2) {
            z13 = !z13;
        }
        b(canvas, z13, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        boolean z13;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        int layoutDirection = getLayoutDirection();
        int i16 = this.f348416b;
        if (i16 == 0) {
            l(i12, i13, i14, i15, layoutDirection == 1);
            return;
        }
        if (i16 == 1) {
            l(i12, i13, i14, i15, layoutDirection != 1);
            return;
        }
        if (i16 == 2) {
            z13 = layoutDirection == 1;
            n(i12, i13, i14, i15, this.f348417c == 2 ? true ^ z13 : z13, false);
        } else if (i16 == 3) {
            z13 = layoutDirection == 1;
            n(i12, i13, i14, i15, this.f348417c == 2 ? true ^ z13 : z13, true);
        } else {
            throw new IllegalStateException("Invalid flex direction is set: " + this.f348416b);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        if (this.f348429o == null) {
            this.f348429o = new SparseIntArray(getChildCount());
        }
        SparseIntArray sparseIntArray = this.f348429o;
        h hVar = this.f348430p;
        d dVar = hVar.f348515a;
        int flexItemCount = dVar.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            SparseIntArray sparseIntArray2 = this.f348429o;
            int flexItemCount2 = hVar.f348515a.getFlexItemCount();
            this.f348428n = h.r(flexItemCount2, hVar.f(flexItemCount2), sparseIntArray2);
            break;
        }
        for (int i14 = 0; i14 < flexItemCount; i14++) {
            View viewQ = dVar.q(i14);
            if (viewQ != null && ((FlexItem) viewQ.getLayoutParams()).getOrder() != sparseIntArray.get(i14)) {
                SparseIntArray sparseIntArray22 = this.f348429o;
                int flexItemCount22 = hVar.f348515a.getFlexItemCount();
                this.f348428n = h.r(flexItemCount22, hVar.f(flexItemCount22), sparseIntArray22);
                break;
            }
        }
        int i15 = this.f348416b;
        h.b bVar = this.f348432r;
        if (i15 != 0 && i15 != 1) {
            if (i15 != 2 && i15 != 3) {
                throw new IllegalStateException("Invalid value for the flex direction is set: " + this.f348416b);
            }
            this.f348431q.clear();
            bVar.f348520a = null;
            bVar.f348521b = 0;
            this.f348430p.b(this.f348432r, i13, i12, Integer.MAX_VALUE, 0, -1, null);
            this.f348431q = bVar.f348520a;
            hVar.h(i12, i13, 0);
            hVar.g(i12, i13, getPaddingRight() + getPaddingLeft());
            hVar.u(0);
            o(this.f348416b, i12, i13, bVar.f348521b);
            return;
        }
        this.f348431q.clear();
        bVar.f348520a = null;
        bVar.f348521b = 0;
        this.f348430p.b(this.f348432r, i12, i13, Integer.MAX_VALUE, 0, -1, null);
        this.f348431q = bVar.f348520a;
        hVar.h(i12, i13, 0);
        if (this.f348419e == 3) {
            for (f fVar : this.f348431q) {
                int iMax = BeduinInputModel.MIN_TEXT_VERSION;
                for (int i16 = 0; i16 < fVar.f348504h; i16++) {
                    View viewH = h(fVar.f348511o + i16);
                    if (viewH != null && viewH.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) viewH.getLayoutParams();
                        iMax = this.f348417c != 2 ? Math.max(iMax, viewH.getMeasuredHeight() + Math.max(fVar.f348508l - viewH.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) : Math.max(iMax, viewH.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max(viewH.getBaseline() + (fVar.f348508l - viewH.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                    }
                }
                fVar.f348503g = iMax;
            }
        }
        hVar.g(i12, i13, getPaddingBottom() + getPaddingTop());
        hVar.u(0);
        o(this.f348416b, i12, i13, bVar.f348521b);
    }

    @Override // com.google.android.flexbox.d
    public final void p(View view, int i12, int i13, f fVar) {
        if (i(i12, i13)) {
            if (B()) {
                int i14 = fVar.f348501e;
                int i15 = this.f348427m;
                fVar.f348501e = i14 + i15;
                fVar.f348502f += i15;
                return;
            }
            int i16 = fVar.f348501e;
            int i17 = this.f348426l;
            fVar.f348501e = i16 + i17;
            fVar.f348502f += i17;
        }
    }

    @Override // com.google.android.flexbox.d
    public final View q(int i12) {
        return getChildAt(i12);
    }

    @Override // com.google.android.flexbox.d
    public final int s(int i12, int i13, int i14) {
        return ViewGroup.getChildMeasureSpec(i12, i13, i14);
    }

    public void setAlignContent(int i12) {
        if (this.f348420f != i12) {
            this.f348420f = i12;
            requestLayout();
        }
    }

    public void setAlignItems(int i12) {
        if (this.f348419e != i12) {
            this.f348419e = i12;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(@P Drawable drawable) {
        if (drawable == this.f348422h) {
            return;
        }
        this.f348422h = drawable;
        if (drawable != null) {
            this.f348426l = drawable.getIntrinsicHeight();
        } else {
            this.f348426l = 0;
        }
        if (this.f348422h == null && this.f348423i == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setDividerDrawableVertical(@P Drawable drawable) {
        if (drawable == this.f348423i) {
            return;
        }
        this.f348423i = drawable;
        if (drawable != null) {
            this.f348427m = drawable.getIntrinsicWidth();
        } else {
            this.f348427m = 0;
        }
        if (this.f348422h == null && this.f348423i == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
        requestLayout();
    }

    public void setFlexDirection(int i12) {
        if (this.f348416b != i12) {
            this.f348416b = i12;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.d
    public void setFlexLines(List<f> list) {
        this.f348431q = list;
    }

    public void setFlexWrap(int i12) {
        if (this.f348417c != i12) {
            this.f348417c = i12;
            requestLayout();
        }
    }

    public void setJustifyContent(int i12) {
        if (this.f348418d != i12) {
            this.f348418d = i12;
            requestLayout();
        }
    }

    public void setMaxLine(int i12) {
        if (this.f348421g != i12) {
            this.f348421g = i12;
            requestLayout();
        }
    }

    public void setShowDivider(int i12) {
        setShowDividerVertical(i12);
        setShowDividerHorizontal(i12);
    }

    public void setShowDividerHorizontal(int i12) {
        if (i12 != this.f348424j) {
            this.f348424j = i12;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i12) {
        if (i12 != this.f348425k) {
            this.f348425k = i12;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.d
    public final View u(int i12) {
        return h(i12);
    }

    @Override // com.google.android.flexbox.d
    public final int x(int i12, int i13, int i14) {
        return ViewGroup.getChildMeasureSpec(i12, i13, i14);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        this.f348421g = -1;
        this.f348430p = new h(this);
        this.f348431q = new ArrayList();
        this.f348432r = new h.b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.c.f348524a, i12, 0);
        this.f348416b = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f348417c = typedArrayObtainStyledAttributes.getInt(6, 0);
        this.f348418d = typedArrayObtainStyledAttributes.getInt(7, 0);
        this.f348419e = typedArrayObtainStyledAttributes.getInt(1, 0);
        this.f348420f = typedArrayObtainStyledAttributes.getInt(0, 0);
        this.f348421g = typedArrayObtainStyledAttributes.getInt(8, -1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i13 = typedArrayObtainStyledAttributes.getInt(9, 0);
        if (i13 != 0) {
            this.f348425k = i13;
            this.f348424j = i13;
        }
        int i14 = typedArrayObtainStyledAttributes.getInt(11, 0);
        if (i14 != 0) {
            this.f348425k = i14;
        }
        int i15 = typedArrayObtainStyledAttributes.getInt(10, 0);
        if (i15 != 0) {
            this.f348424j = i15;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            LayoutParams layoutParams3 = new LayoutParams(layoutParams2);
            layoutParams3.f348433b = 1;
            layoutParams3.f348434c = 0.0f;
            layoutParams3.f348435d = 1.0f;
            layoutParams3.f348436e = -1;
            layoutParams3.f348437f = -1.0f;
            layoutParams3.f348438g = -1;
            layoutParams3.f348439h = -1;
            layoutParams3.f348440i = 16777215;
            layoutParams3.f348441j = 16777215;
            layoutParams3.f348433b = layoutParams2.f348433b;
            layoutParams3.f348434c = layoutParams2.f348434c;
            layoutParams3.f348435d = layoutParams2.f348435d;
            layoutParams3.f348436e = layoutParams2.f348436e;
            layoutParams3.f348437f = layoutParams2.f348437f;
            layoutParams3.f348438g = layoutParams2.f348438g;
            layoutParams3.f348439h = layoutParams2.f348439h;
            layoutParams3.f348440i = layoutParams2.f348440i;
            layoutParams3.f348441j = layoutParams2.f348441j;
            layoutParams3.f348442k = layoutParams2.f348442k;
            return layoutParams3;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams4 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams4.f348433b = 1;
            layoutParams4.f348434c = 0.0f;
            layoutParams4.f348435d = 1.0f;
            layoutParams4.f348436e = -1;
            layoutParams4.f348437f = -1.0f;
            layoutParams4.f348438g = -1;
            layoutParams4.f348439h = -1;
            layoutParams4.f348440i = 16777215;
            layoutParams4.f348441j = 16777215;
            return layoutParams4;
        }
        LayoutParams layoutParams5 = new LayoutParams(layoutParams);
        layoutParams5.f348433b = 1;
        layoutParams5.f348434c = 0.0f;
        layoutParams5.f348435d = 1.0f;
        layoutParams5.f348436e = -1;
        layoutParams5.f348437f = -1.0f;
        layoutParams5.f348438g = -1;
        layoutParams5.f348439h = -1;
        layoutParams5.f348440i = 16777215;
        layoutParams5.f348441j = 16777215;
        return layoutParams5;
    }

    @Override // com.google.android.flexbox.d
    public final void d(View view, int i12) {
    }
}
