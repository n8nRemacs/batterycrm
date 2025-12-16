package com.avito.android.rubricator;

import Y61.k;
import android.content.Context;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.GridLayoutManager;
import com.avito.android.R;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: RubricatorDynamicColumnsCountLinearLayoutManager.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rubricator/RubricatorDynamicColumnsCountLinearLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RubricatorDynamicColumnsCountLinearLayoutManager extends GridLayoutManager {

    /* renamed from: O, reason: collision with root package name */
    public final int f255689O;

    /* renamed from: P, reason: collision with root package name */
    public final int f255690P;

    /* renamed from: Q, reason: collision with root package name */
    public final int f255691Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f255692R;

    /* renamed from: S, reason: collision with root package name */
    public final int f255693S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f255694T;

    public RubricatorDynamicColumnsCountLinearLayoutManager(@k Context context) {
        super(1, 0);
        this.f255689O = context.getResources().getDimensionPixelSize(R.dimen.service_linear_rubricator_item_width);
        this.f255690P = context.getResources().getDimensionPixelSize(R.dimen.service_linear_rubricator_item_icon_size);
        this.f255691Q = context.getResources().getInteger(R.integer.rubricator_columns_count);
        this.f255692R = y6.b(16);
        this.f255693S = y6.b(8);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final boolean I() {
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final boolean J() {
        return false;
    }
}
