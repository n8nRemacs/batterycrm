package com.avito.android.advert_core.specifications;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.advert_core.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: SpecificationView.kt */
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/advert_core/specifications/SpecificationView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "getMinColumnIndex", "()I", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SpecificationView extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public final int f84375b;

    /* renamed from: c, reason: collision with root package name */
    public final int f84376c;

    /* renamed from: d, reason: collision with root package name */
    public final int f84377d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f84378e;

    /* renamed from: f, reason: collision with root package name */
    public int f84379f;

    /* renamed from: g, reason: collision with root package name */
    public int f84380g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f84381h;

    /* renamed from: i, reason: collision with root package name */
    public int f84382i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public List<? extends a> f84383j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public Integer[] f84384k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public Integer[] f84385l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public Integer[] f84386m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public Integer[] f84387n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public Integer[] f84388o;

    public SpecificationView(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f84375b = getResources().getDimensionPixelOffset(R.dimen.rds_column_offset);
        this.f84376c = getResources().getDimensionPixelOffset(R.dimen.advert_specification_row_offset);
        this.f84377d = getResources().getDimensionPixelOffset(R.dimen.rds_horizontal_edge_offset);
        this.f84378e = LayoutInflater.from(getContext());
        this.f84381h = true;
        this.f84382i = 1;
        this.f84383j = C42784z0.f406748b;
        this.f84384k = new Integer[0];
        this.f84385l = new Integer[0];
        this.f84386m = new Integer[0];
        this.f84387n = new Integer[0];
        this.f84388o = new Integer[0];
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.l.f82419a, 0, 0);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i12 = 0; i12 < indexCount; i12++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i12);
            if (index == 0) {
                this.f84377d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f84377d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private final int getMinColumnIndex() {
        Integer[] numArr = this.f84386m;
        int length = numArr.length;
        int i12 = Integer.MAX_VALUE;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < length) {
            int i16 = i15 + 1;
            int iIntValue = numArr[i13].intValue();
            if (iIntValue < i12) {
                i14 = i15;
                i12 = iIntValue;
            }
            i13++;
            i15 = i16;
        }
        return i14;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int size = this.f84383j.size();
        for (int i16 = 0; i16 < size; i16++) {
            View childAt = getChildAt(i16);
            int iIntValue = this.f84387n[i16].intValue();
            int iIntValue2 = this.f84388o[i16].intValue();
            childAt.layout(iIntValue, iIntValue2, childAt.getMeasuredWidth() + iIntValue, childAt.getMeasuredHeight() + iIntValue2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int size = View.MeasureSpec.getSize(i12);
        if (this.f84379f != size || this.f84381h) {
            this.f84379f = size;
            this.f84381h = false;
            int i14 = this.f84377d;
            int i15 = this.f84382i;
            int i16 = this.f84375b;
            int i17 = (size - (i14 * 2)) - ((i15 - 1) * i16);
            int i18 = i17 / i15;
            int i19 = i17 % i15;
            this.f84384k[0] = Integer.valueOf(i14);
            int i22 = this.f84382i;
            int i23 = 1;
            while (i23 < i22) {
                int i24 = i23 <= i19 ? 1 : 0;
                Integer[] numArr = this.f84384k;
                numArr[i23] = Integer.valueOf(numArr[i23 - 1].intValue() + i18 + i16 + i24);
                i23++;
            }
            Integer[] numArr2 = this.f84384k;
            int length = numArr2.length;
            int i25 = 0;
            int i26 = 0;
            while (i25 < length) {
                this.f84385l[i26] = Integer.valueOf(numArr2[i25].intValue() + i18);
                i25++;
                i26++;
            }
            C42756l.y(Integer.valueOf(this.f84377d), this.f84386m);
            int size2 = this.f84383j.size();
            for (int i27 = 0; i27 < size2; i27++) {
                int i28 = this.f84383j.get(i27).f84389a;
                int minColumnIndex = getMinColumnIndex();
                int iMin = Math.min(i28, this.f84382i - minColumnIndex) + minColumnIndex;
                int iIntValue = this.f84385l[iMin - 1].intValue() - this.f84384k[minColumnIndex].intValue();
                View childAt = getChildAt(i27);
                childAt.measure(View.MeasureSpec.makeMeasureSpec(iIntValue, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                int iIntValue2 = this.f84386m[minColumnIndex].intValue();
                if (iIntValue2 > this.f84377d) {
                    iIntValue2 += this.f84376c;
                }
                this.f84387n[i27] = this.f84384k[minColumnIndex];
                this.f84388o[i27] = Integer.valueOf(iIntValue2);
                int measuredHeight = childAt.getMeasuredHeight() + iIntValue2;
                while (minColumnIndex < iMin) {
                    this.f84386m[minColumnIndex] = Integer.valueOf(measuredHeight);
                    minColumnIndex++;
                }
            }
            Integer num = (Integer) C42756l.R(this.f84386m);
            int iIntValue3 = num != null ? num.intValue() : this.f84377d;
            int i29 = this.f84377d;
            this.f84380g = iIntValue3 > i29 ? iIntValue3 + i29 : 0;
        }
        setMeasuredDimension(this.f84379f, this.f84380g);
    }
}
