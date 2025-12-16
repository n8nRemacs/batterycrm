package com.avito.android.beduin.common.component.segmented_control;

import Y41.l;
import com.avito.android.beduin.common.component.select_option.Option;
import com.avito.android.lib.design.segmented_control.SegmentedControl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinSegmentedControlComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/segmented_control/SegmentedControlChange;", "change", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/component/segmented_control/SegmentedControlChange;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements l<SegmentedControlChange, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SegmentedControl f102391l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.beduin.common.component.segmented_control.a f102392m;

    /* compiled from: BeduinSegmentedControlComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[SegmentedControlChange.values().length];
            try {
                iArr[SegmentedControlChange.f102377c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SegmentedControlChange.f102378d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SegmentedControl segmentedControl, com.avito.android.beduin.common.component.segmented_control.a aVar) {
        super(1);
        this.f102391l = segmentedControl;
        this.f102392m = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(SegmentedControlChange segmentedControlChange) {
        int iOrdinal = segmentedControlChange.ordinal();
        SegmentedControl segmentedControl = this.f102391l;
        com.avito.android.beduin.common.component.segmented_control.a aVar = this.f102392m;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                Boolean boolIsEnabled = aVar.f102389g.isEnabled();
                segmentedControl.setEnabled(boolIsEnabled != null ? boolIsEnabled.booleanValue() : true);
            }
        } else {
            List<Option> options = aVar.f102389g.getOptions();
            ArrayList arrayList = new ArrayList(C42745f0.q(options, 10));
            Iterator<T> it = options.iterator();
            while (it.hasNext()) {
                arrayList.add(((Option) it.next()).getName());
            }
            BeduinSegmentedControlModel beduinSegmentedControlModel = aVar.f102389g;
            segmentedControl.q(f.a(beduinSegmentedControlModel.getSelectedId(), beduinSegmentedControlModel.getOptions()), arrayList);
        }
        return G0.f406611a;
    }
}
