package com.avito.android.lib.compose.design.shared.segment_control;

import Y41.p;
import Y61.k;
import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.lib.design.segmented_control.SegmentedControl;
import kotlin.Metadata;

/* compiled from: SegmentedControlCompose.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/compose/design/shared/segment_control/b;", "Lcom/avito/android/lib/design/segmented_control/SegmentedControl$b;", "_design-modules_compose_shared_segmented-control_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements SegmentedControl.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f177677b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f177678c;

    public b(InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12) {
        this.f177677b = interfaceC22204y1;
        this.f177678c = interfaceC22204y12;
    }

    @Override // com.avito.android.lib.design.segmented_control.SegmentedControl.b
    public final void KT(int i12, @k CharSequence charSequence) {
        ((p) this.f177678c.getF42167b()).invoke(Integer.valueOf(i12), charSequence.toString());
    }

    @Override // com.avito.android.lib.design.segmented_control.SegmentedControl.b
    public final void kJ(int i12, @k CharSequence charSequence) {
        ((p) this.f177677b.getF42167b()).invoke(Integer.valueOf(i12), charSequence.toString());
    }
}
