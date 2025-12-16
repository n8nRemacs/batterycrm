package com.avito.android.component.advert_badge_bar;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import hw.InterfaceC41178c;
import kG0.C42580a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BadgeBarDecoration.kt */
@InterfaceC41178c
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/advert_badge_bar/e;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f124989b;

    /* renamed from: c, reason: collision with root package name */
    public final int f124990c;

    /* renamed from: d, reason: collision with root package name */
    public final int f124991d;

    /* renamed from: e, reason: collision with root package name */
    public final int f124992e;

    /* renamed from: f, reason: collision with root package name */
    public final int f124993f;

    /* renamed from: g, reason: collision with root package name */
    public final int f124994g;

    /* renamed from: h, reason: collision with root package name */
    public final int f124995h;

    /* renamed from: i, reason: collision with root package name */
    public final int f124996i;

    /* renamed from: j, reason: collision with root package name */
    public final int f124997j;

    /* renamed from: k, reason: collision with root package name */
    public int f124998k;

    /* renamed from: l, reason: collision with root package name */
    public int f124999l;

    public /* synthetic */ e(Context context, AttributeSet attributeSet, int i12, int i13, int i14, int i15, C42822w c42822w) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? R.attr.advertBadgeBar : i12, (i15 & 8) != 0 ? R.style.Widget_Avito_AdvertBadgeBar : i13, (i15 & 16) != 0 ? -1 : i14);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        Integer numValueOf;
        recyclerView.getClass();
        int iU2 = RecyclerView.U(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        Integer numValueOf2 = adapter != null ? Integer.valueOf(adapter.getItemViewType(iU2)) : null;
        int i12 = this.f124996i;
        int iIntValue = this.f124995h;
        if (numValueOf2 != null && numValueOf2.intValue() == this.f124989b) {
            rect.top = this.f124992e;
            rect.bottom = this.f124993f;
            rect.left = iIntValue;
            rect.right = i12;
            return;
        }
        int i13 = this.f124998k;
        int i14 = this.f124990c;
        if (i13 == 0) {
            RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
            Object objValueOf = adapter2 != null ? Integer.valueOf(adapter2.getItemCount() - 1) : Boolean.FALSE;
            boolean z12 = (objValueOf instanceof Integer) && iU2 == ((Number) objValueOf).intValue();
            Integer numValueOf3 = Integer.valueOf(i14);
            if (iU2 <= 0) {
                numValueOf3 = null;
            }
            if (numValueOf3 != null) {
                iIntValue = numValueOf3.intValue();
            }
            rect.left = iIntValue;
            numValueOf = z12 ? Integer.valueOf(i12) : null;
            rect.right = numValueOf != null ? numValueOf.intValue() : 0;
            return;
        }
        int i15 = this.f124997j;
        int i16 = iU2 / i15;
        int i17 = iU2 % i15;
        Integer numValueOf4 = Integer.valueOf(i14);
        if (i17 <= 0) {
            numValueOf4 = null;
        }
        if (numValueOf4 != null) {
            iIntValue = numValueOf4.intValue();
        }
        rect.left = iIntValue;
        Integer numValueOf5 = Integer.valueOf(i12);
        if (i17 != i15 - 1) {
            numValueOf5 = null;
        }
        rect.right = numValueOf5 != null ? numValueOf5.intValue() : 0;
        numValueOf = i16 > 0 ? Integer.valueOf(this.f124991d) : null;
        rect.top = numValueOf != null ? numValueOf.intValue() : 0;
        int i18 = this.f124994g;
        if (i18 == 0 || RecyclerView.U(view) != zVar.b() - 1) {
            return;
        }
        rect.bottom = i18;
    }

    public e(@k Context context, @l AttributeSet attributeSet, int i12, int i13, int i14) {
        this.f124989b = i14;
        this.f124999l = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C42580a.o.f406211a, i12, i13);
        this.f124990c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
        this.f124991d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f124995h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0);
        this.f124996i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, 0);
        this.f124992e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
        this.f124993f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f124994g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0);
        this.f124997j = typedArrayObtainStyledAttributes.getInteger(8, this.f124999l);
        typedArrayObtainStyledAttributes.recycle();
    }
}
