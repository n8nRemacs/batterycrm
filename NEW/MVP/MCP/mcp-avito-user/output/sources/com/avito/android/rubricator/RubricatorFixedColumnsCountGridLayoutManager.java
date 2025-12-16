package com.avito.android.rubricator;

import Y61.k;
import Y61.l;
import android.content.Context;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.rubricator.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RubricatorFixedColumnsCountGridLayoutManager.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rubricator/RubricatorFixedColumnsCountGridLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RubricatorFixedColumnsCountGridLayoutManager extends GridLayoutManager {

    /* renamed from: O, reason: collision with root package name */
    @l
    public final b.c.a f255695O;

    /* renamed from: P, reason: collision with root package name */
    public final boolean f255696P;

    /* renamed from: Q, reason: collision with root package name */
    public final boolean f255697Q;

    public /* synthetic */ RubricatorFixedColumnsCountGridLayoutManager(Context context, b.c.a aVar, int i12, C42822w c42822w) {
        this(context, (i12 & 2) != 0 ? null : aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void W0(@k RecyclerView.u uVar, @k RecyclerView.z zVar, int i12, int i13) {
        Integer num;
        int iIntValue;
        Integer num2;
        super.W0(uVar, zVar, i12, i13);
        boolean z12 = this.f255697Q;
        boolean z13 = this.f255696P;
        if (!z13 || z12) {
            b.c.a aVar = this.f255695O;
            iIntValue = z13 ? (aVar == null || (num2 = aVar.f255721b) == null) ? 10 : num2.intValue() : z12 ? 6 : (aVar == null || (num = aVar.f255720a) == null) ? 3 : num.intValue();
        } else {
            iIntValue = 8;
        }
        o2(iIntValue);
    }

    public RubricatorFixedColumnsCountGridLayoutManager(@k Context context, @l b.c.a aVar) {
        super(context, null, 0, 0);
        this.f255695O = aVar;
        this.f255696P = context.getResources().getBoolean(R.bool.is_tablet);
        this.f255697Q = context.getResources().getConfiguration().orientation == 2;
    }
}
