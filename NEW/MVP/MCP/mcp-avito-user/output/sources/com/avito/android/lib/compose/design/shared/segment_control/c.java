package com.avito.android.lib.compose.design.shared.segment_control;

import Y41.l;
import android.content.Context;
import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.lib.design.segmented_control.SegmentedControl;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SegmentedControlCompose.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/lib/design/segmented_control/SegmentedControl;", "context", "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class c extends N implements l<Context, SegmentedControl> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f177679l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f177680m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Integer f177681n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f177682o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f177683p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ArrayList arrayList, int i12, Integer num, InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12) {
        super(1);
        this.f177679l = arrayList;
        this.f177680m = i12;
        this.f177681n = num;
        this.f177682o = interfaceC22204y1;
        this.f177683p = interfaceC22204y12;
    }

    @Override // Y41.l
    public final SegmentedControl invoke(Context context) {
        SegmentedControl segmentedControl = new SegmentedControl(context, null, 0, 0, 14, null);
        segmentedControl.r(this.f177680m, this.f177679l);
        segmentedControl.setAppearance(this.f177681n.intValue());
        segmentedControl.setOnSegmentClickListener(new b(this.f177682o, this.f177683p));
        return segmentedControl;
    }
}
