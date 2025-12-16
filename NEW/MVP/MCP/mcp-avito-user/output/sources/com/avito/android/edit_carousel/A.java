package com.avito.android.edit_carousel;

import com.avito.android.edit_carousel.PagingBar;
import com.avito.android.lib.design.segmented_control.SegmentedControl;
import kotlin.Metadata;

/* compiled from: PagingBar.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_carousel/A;", "Lcom/avito/android/lib/design/segmented_control/SegmentedControl$b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class A implements SegmentedControl.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PagingBar f146206b;

    public A(PagingBar pagingBar) {
        this.f146206b = pagingBar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.lib.design.segmented_control.SegmentedControl.b
    public final void kJ(int i12, @Y61.k CharSequence charSequence) {
        PagingBar pagingBar = this.f146206b;
        pagingBar.f146233m = ((PagingBar.a) pagingBar.f146235o.get(i12)).f146238b;
        pagingBar.postDelayed(new com.avito.android.app.coldstart.d(pagingBar, 21), pagingBar.f146225e);
        pagingBar.e();
    }

    @Override // com.avito.android.lib.design.segmented_control.SegmentedControl.b
    public final void KT(int i12, @Y61.k CharSequence charSequence) {
    }
}
