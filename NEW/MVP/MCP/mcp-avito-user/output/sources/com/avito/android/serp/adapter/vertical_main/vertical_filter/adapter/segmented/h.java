package com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.segmented;

import Y41.l;
import Y41.p;
import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.segmented_control.SegmentedControl;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: VerticalSearchFilterSegmentedItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/adapter/segmented/h;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/adapter/segmented/g;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends com.avito.konveyor.adapter.b implements TV0.e, g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SegmentedControl f273512b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public Object f273513c;

    /* renamed from: d, reason: collision with root package name */
    public int f273514d;

    /* compiled from: VerticalSearchFilterSegmentedItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "position", "", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(ILjava/lang/CharSequence;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<Integer, CharSequence, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l<Integer, G0> f273515l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super Integer, G0> lVar) {
            super(2);
            this.f273515l = lVar;
        }

        @Override // Y41.p
        public final G0 invoke(Integer num, CharSequence charSequence) {
            this.f273515l.invoke(Integer.valueOf(num.intValue()));
            return G0.f406611a;
        }
    }

    public h(@k View view) {
        super(view);
        this.f273512b = (SegmentedControl) view;
        this.f273513c = C42784z0.f406748b;
    }

    public static boolean B80(ArrayList arrayList, List list) {
        if (list.size() != arrayList.size()) {
            return false;
        }
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            if (!L.f((String) obj, arrayList.get(i12))) {
                return false;
            }
            i12 = i13;
        }
        return true;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.segmented.g
    public final void A8(@Y61.l Integer num) {
        this.f273512b.setAppearanceFromAttr(num != null ? num.intValue() : R.attr.segmentedControl);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.segmented.g
    public final void I(boolean z12) {
        this.f273512b.setEnabled(z12);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.segmented.g
    public final void l0(@k l<? super Integer, G0> lVar) {
        this.f273512b.setOnSegmentClickListener(new a(lVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.segmented.g
    public final void yw(int i12, @k ArrayList arrayList) {
        if (B80(arrayList, this.f273513c) && this.f273514d == i12) {
            return;
        }
        boolean zB80 = B80(arrayList, this.f273513c);
        SegmentedControl segmentedControl = this.f273512b;
        if (!zB80 || this.f273514d == i12) {
            segmentedControl.q(i12, arrayList);
        } else {
            SegmentedControl.t(segmentedControl, i12, false, 6);
        }
        this.f273513c = arrayList;
        this.f273514d = i12;
    }
}
