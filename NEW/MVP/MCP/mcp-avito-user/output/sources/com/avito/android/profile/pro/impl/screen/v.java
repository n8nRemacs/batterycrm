package com.avito.android.profile.pro.impl.screen;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileProFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "height", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class v extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f223749l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f223750m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(int i12, RecyclerView recyclerView) {
        super(1);
        this.f223749l = i12;
        this.f223750m = recyclerView;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        int i12 = this.f223749l;
        int iMax = Math.max(iIntValue + i12, i12);
        RecyclerView recyclerView = this.f223750m;
        recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), recyclerView.getPaddingTop(), recyclerView.getPaddingEnd(), iMax);
        return G0.f406611a;
    }
}
