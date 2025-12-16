package com.avito.android.beduin.view.recyclerview;

import Y61.k;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RecyclerViews.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/t4", "Landroidx/recyclerview/widget/RecyclerView$r;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f105196b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f105197c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.beduin_shared.model.action.custom.f f105198d;

    public c(f fVar, int i12, com.avito.android.beduin_shared.model.action.custom.f fVar2) {
        this.f105196b = fVar;
        this.f105197c = i12;
        this.f105198d = fVar2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void i(int i12, @k RecyclerView recyclerView) {
        if (i12 == 0) {
            f.a(this.f105196b, recyclerView, this.f105197c, this.f105198d.f105295c);
            recyclerView.v0(this);
        }
    }
}
