package com.avito.android.beduin.ui.screen.fragment.tabs.tabs_wrapper;

import Y41.l;
import Y41.p;
import Y61.k;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.avito.android.R;
import com.avito.android.beduin.ui.screen.fragment.tabs.tabs_wrapper.e;
import com.avito.android.lib.design.segmented_control.SegmentedControl;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import wi.C49626b;

/* compiled from: SegmentControlTabsWrapper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/tabs/tabs_wrapper/b;", "Lcom/avito/android/beduin/ui/screen/fragment/tabs/tabs_wrapper/e;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SegmentedControl f104377b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public Object f104378c = C42784z0.f406748b;

    /* compiled from: SegmentControlTabsWrapper.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "segmentPosition", "", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(ILjava/lang/CharSequence;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<Integer, CharSequence, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l<String, G0> f104380m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super String, G0> lVar) {
            super(2);
            this.f104380m = lVar;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
        @Override // Y41.p
        public final G0 invoke(Integer num, CharSequence charSequence) {
            String str;
            e.b bVar = (e.b) C42745f0.K(num.intValue(), b.this.f104378c);
            if (bVar != null && (str = bVar.f104389a) != null) {
                this.f104380m.invoke(str);
            }
            return G0.f406611a;
        }
    }

    public b(@k Context context, @k FrameLayout.LayoutParams layoutParams, @k C49626b c49626b) {
        e.f104386a.getClass();
        int i12 = e.a.f104388b;
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i12;
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i12;
        SegmentedControl segmentedControl = new SegmentedControl(context, null, 0, 0, 14, null);
        segmentedControl.setId(R.id.beduin_segmented_control);
        segmentedControl.setLayoutParams(layoutParams);
        segmentedControl.q(0, C42745f0.U("1", "2"));
        segmentedControl.setAppearance(com.avito.android.lib.util.f.k(context, c49626b.a()));
        this.f104377b = segmentedControl;
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.tabs.tabs_wrapper.e
    public final void a(@k l<? super String, G0> lVar) {
        this.f104377b.setOnSegmentClickListener(new a(lVar));
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.tabs.tabs_wrapper.e
    public final void b(@k ArrayList arrayList) {
        this.f104378c = arrayList;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e.b bVar = (e.b) it.next();
            arrayList2.add(new SegmentedControl.c(bVar.f104392d, bVar.f104390b));
        }
        int i12 = SegmentedControl.f180174N;
        this.f104377b.r(0, arrayList2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.beduin.ui.screen.fragment.tabs.tabs_wrapper.e
    public final void c(@k String str) {
        Iterator it = this.f104378c.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (L.f(((e.b) it.next()).f104389a, str)) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 < 0) {
            i12 = 0;
        }
        SegmentedControl segmentedControl = this.f104377b;
        if (i12 == segmentedControl.getCurrentSelected()) {
            return;
        }
        SegmentedControl.t(segmentedControl, i12, false, 2);
    }

    @Override // com.avito.android.beduin.ui.screen.fragment.tabs.tabs_wrapper.e
    @k
    public final View getView() {
        return this.f104377b;
    }
}
