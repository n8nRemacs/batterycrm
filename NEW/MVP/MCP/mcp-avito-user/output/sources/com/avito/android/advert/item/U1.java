package com.avito.android.advert.item;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.C23434z;
import kotlin.Metadata;

/* compiled from: AdvertDetailsView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/U1;", "Landroidx/recyclerview/widget/z;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class U1 extends C23434z {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f72270p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f72271q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U1(Context context, int i12, boolean z12) {
        super(context);
        this.f72270p = i12;
        this.f72271q = z12;
    }

    @Override // androidx.recyclerview.widget.C23434z
    public final int i(@Y61.l View view, int i12) {
        int i13 = super.i(view, i12);
        if (view != null && view.getTop() > 0 && view.getTop() < Math.abs(i13)) {
            i13 = -view.getTop();
        }
        return i13 + this.f72270p;
    }

    @Override // androidx.recyclerview.widget.C23434z
    public final float j(@Y61.l DisplayMetrics displayMetrics) {
        return (this.f72271q ? 25.0f : 80.0f) / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.C23434z
    public final int m() {
        return -1;
    }

    @Override // androidx.recyclerview.widget.C23434z
    public final int n() {
        return -1;
    }
}
