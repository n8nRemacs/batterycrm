package com.avito.android.lib.design.photo_uploader_appending;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.lib.design.d;
import kotlin.Metadata;

/* compiled from: MaxWidthGridLayoutManager.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/lib/design/photo_uploader_appending/MaxWidthGridLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MaxWidthGridLayoutManager extends GridLayoutManager {

    /* renamed from: O, reason: collision with root package name */
    public final int f179935O;

    /* renamed from: P, reason: collision with root package name */
    public final int f179936P;

    /* renamed from: Q, reason: collision with root package name */
    public final int f179937Q;

    public MaxWidthGridLayoutManager(@l Context context, @l AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12, i13);
        this.f179935O = Integer.MAX_VALUE;
        this.f179936P = Integer.MAX_VALUE;
        this.f179937Q = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178981m0, i12, i13);
        this.f179935O = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, Integer.MAX_VALUE);
        this.f179936P = typedArrayObtainStyledAttributes.getInt(1, Integer.MAX_VALUE);
        this.f179937Q = typedArrayObtainStyledAttributes.getInt(2, 1);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void W0(@k RecyclerView.u uVar, @k RecyclerView.z zVar, int i12, int i13) {
        super.W0(uVar, zVar, i12, i13);
        o2(Math.min(Math.max(View.MeasureSpec.getSize(i12) / this.f179935O, this.f179937Q), this.f179936P));
    }
}
