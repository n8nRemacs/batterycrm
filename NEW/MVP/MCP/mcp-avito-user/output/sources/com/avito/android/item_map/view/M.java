package com.avito.android.item_map.view;

import android.content.res.Resources;
import android.util.TypedValue;
import com.avito.android.avito_map.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ItemMapResourceProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/view/M;", "Lcom/avito/android/item_map/view/L;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class M implements L {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f173482a;

    @Inject
    public M(@Y61.k Resources resources) {
        this.f173482a = resources;
    }

    @Override // com.avito.android.item_map.view.L
    public final int a() {
        int i12 = R.color.expected_blue_alpha_20;
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        return this.f173482a.getColor(i12, null);
    }

    @Override // com.avito.android.item_map.view.L
    public final int b() {
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        return this.f173482a.getColor(com.avito.android.R.color.legacy_blue, null);
    }

    @Override // com.avito.android.item_map.view.L
    public final boolean c() {
        return this.f173482a.getBoolean(com.avito.android.R.bool.is_tablet);
    }

    @Override // com.avito.android.item_map.view.L
    public final boolean d() {
        return this.f173482a.getConfiguration().orientation == 2;
    }

    @Override // com.avito.android.item_map.view.L
    public final int e() {
        int i12 = R.color.fill_approximate_color_with_opacity;
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        return this.f173482a.getColor(i12, null);
    }

    @Override // com.avito.android.item_map.view.L
    public final int f() {
        Resources resources = this.f173482a;
        return Math.min(resources.getDisplayMetrics().heightPixels, resources.getDisplayMetrics().widthPixels) / 4;
    }

    @Override // com.avito.android.item_map.view.L
    public final int g() {
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        return this.f173482a.getColor(com.avito.android.R.color.legacy_warm_gray_24, null);
    }

    @Override // com.avito.android.item_map.view.L
    public final int getOutlineColor() {
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        return this.f173482a.getColor(com.avito.android.R.color.legacy_white, null);
    }

    @Override // com.avito.android.item_map.view.L
    public final int h() {
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        return this.f173482a.getColor(com.avito.android.R.color.legacy_blue, null);
    }
}
