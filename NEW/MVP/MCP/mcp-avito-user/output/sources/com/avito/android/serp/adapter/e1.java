package com.avito.android.serp.adapter;

import androidx.recyclerview.widget.GridLayoutManager;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SpanLookup.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/e1;", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e1 extends GridLayoutManager.c {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final g1 f269898e;

    @Inject
    public e1(@Y61.k g1 g1Var) {
        this.f269898e = g1Var;
        this.f53673c = true;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int f(int i12) {
        return this.f269898e.d(i12);
    }
}
