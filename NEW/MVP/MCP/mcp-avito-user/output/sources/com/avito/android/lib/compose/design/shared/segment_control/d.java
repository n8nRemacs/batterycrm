package com.avito.android.lib.compose.design.shared.segment_control;

import Y41.l;
import com.avito.android.lib.design.segmented_control.SegmentedControl;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: SegmentedControlCompose.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/lib/design/segmented_control/SegmentedControl;", "view", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/segmented_control/SegmentedControl;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class d extends N implements l<SegmentedControl, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f177684l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f177685m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i12, ArrayList arrayList) {
        super(1);
        this.f177684l = arrayList;
        this.f177685m = i12;
    }

    @Override // Y41.l
    public final G0 invoke(SegmentedControl segmentedControl) {
        SegmentedControl segmentedControl2 = segmentedControl;
        List<SegmentedControl.c> currentSegments = segmentedControl2.getCurrentSegments();
        ArrayList arrayList = this.f177684l;
        boolean zF2 = L.f(currentSegments, arrayList);
        int i12 = this.f177685m;
        if (!zF2) {
            segmentedControl2.r(i12, arrayList);
        } else if (segmentedControl2.getCurrentSelected() != i12) {
            segmentedControl2.s(i12, true, false);
        }
        return G0.f406611a;
    }
}
