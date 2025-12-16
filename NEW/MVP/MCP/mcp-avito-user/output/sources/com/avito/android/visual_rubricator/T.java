package com.avito.android.visual_rubricator;

import com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import js0.d;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.d2;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: VisualRubricatorWidgetItemPresenterImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/visual_rubricator/T;", "Lcom/avito/android/visual_rubricator/Q;", "_avito_bx-content_widget_visual-rubricator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class T implements Q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.visual_rubricator.element.i f327311b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.analytics.widgets_tracker.g f327312c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<L> f327313d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final e2 f327314e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public List<? extends VisualRubricatorWidgetElementItem> f327315f;

    /* renamed from: g, reason: collision with root package name */
    public int f327316g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f327317h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f327318i;

    /* compiled from: VisualRubricatorWidgetItemPresenterImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Integer> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f327319l = 0;

        static {
            new a();
        }

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ Integer invoke() {
            return 9999999;
        }
    }

    /* compiled from: VisualRubricatorWidgetItemPresenterImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<Integer> {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f327320l = 0;

        static {
            new b();
        }

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ Integer invoke() {
            return 9999999;
        }
    }

    public T(@Y61.k com.avito.android.visual_rubricator.element.i iVar, @Y61.k com.avito.android.serp.analytics.widgets_tracker.g gVar) {
        this.f327311b = iVar;
        this.f327312c = gVar;
        int i12 = a.f327319l;
        this.f327313d = new com.jakewharton.rxrelay3.c<>();
        this.f327314e = f2.b(0, 1, BufferOverflow.f410778c, 1);
        this.f327315f = C42784z0.f406748b;
        this.f327317h = new LinkedHashSet();
        this.f327318i = new LinkedHashSet();
    }

    public static kotlin.ranges.l V(kotlin.Q q12) {
        A a12 = q12.f406619b;
        B b12 = q12.f406620c;
        if (kotlin.jvm.internal.L.f(a12, b12)) {
            List list = (List) a12;
            return new kotlin.ranges.l(((Number) C42745f0.E(list)).intValue(), ((Number) C42745f0.Q(list)).intValue(), 1);
        }
        List list2 = (List) a12;
        List list3 = (List) b12;
        return ((Number) C42745f0.E(list2)).intValue() <= ((Number) C42745f0.E(list3)).intValue() ? new kotlin.ranges.l(((Number) C42745f0.E(list2)).intValue(), ((Number) C42745f0.Q(list3)).intValue(), 1) : new kotlin.ranges.l(((Number) C42745f0.E(list3)).intValue(), ((Number) C42745f0.Q(list2)).intValue(), 1);
    }

    @Override // com.avito.android.visual_rubricator.G
    public final void O(@Y61.k H h12) {
        kotlin.ranges.l lVarV = V(h12.f327282a);
        kotlin.ranges.l lVarV2 = V(h12.f327283b);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        kotlin.ranges.k it = lVarV.iterator();
        while (it.f406910d) {
            int iA2 = it.a();
            LinkedHashSet linkedHashSet = this.f327317h;
            if (!linkedHashSet.contains(Integer.valueOf(iA2))) {
                arrayList.add(Integer.valueOf(iA2));
                linkedHashSet.add(Integer.valueOf(iA2));
            }
        }
        kotlin.ranges.k it2 = lVarV2.iterator();
        while (it2.f406910d) {
            int iA3 = it2.a();
            LinkedHashSet linkedHashSet2 = this.f327318i;
            if (!linkedHashSet2.contains(Integer.valueOf(iA3))) {
                arrayList2.add(Integer.valueOf(iA3));
                linkedHashSet2.add(Integer.valueOf(iA3));
            }
        }
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            return;
        }
        this.f327314e.K5(new kotlin.Q(arrayList, arrayList2));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    @Override // TV0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O5(TV0.e r7, TV0.a r8, int r9) {
        /*
            r6 = this;
            com.avito.android.visual_rubricator.V r7 = (com.avito.android.visual_rubricator.V) r7
            com.avito.android.visual_rubricator.VisualRubricatorWidgetItem r8 = (com.avito.android.visual_rubricator.VisualRubricatorWidgetItem) r8
            com.avito.android.visual_rubricator.element.i r9 = r6.f327311b
            r9.l4(r6)
            com.avito.android.visual_rubricator.Space r9 = r8.getF327323d()
            boolean r9 = r9.a()
            r4 = r9 ^ 1
            java.util.List r9 = r8.h6()
            java.util.List<? extends com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem> r0 = r6.f327315f
            boolean r9 = kotlin.jvm.internal.L.f(r9, r0)
            if (r9 == 0) goto L36
            boolean r9 = r7.K10()
            if (r9 == 0) goto L26
            goto L36
        L26:
            java.util.List r9 = r8.h6()
            com.avito.android.visual_rubricator.Space r8 = r8.getF327324e()
            boolean r8 = r8.b()
            r7.MV(r9, r6, r4, r8)
            goto L98
        L36:
            java.util.List<? extends com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem> r9 = r6.f327315f
            java.lang.Object r9 = kotlin.collections.C42745f0.G(r9)
            com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem r9 = (com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem) r9
            java.util.List r0 = r8.h6()
            java.lang.Object r0 = kotlin.collections.C42745f0.E(r0)
            com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem r0 = (com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem) r0
            if (r9 != 0) goto L4b
            goto L7c
        L4b:
            com.avito.android.deep_linking.links.DeepLink r9 = r9.getF327362e()
            boolean r1 = r9 instanceof com.avito.android.deep_linking.links.ItemsSearchLink
            r2 = 0
            if (r1 == 0) goto L57
            com.avito.android.deep_linking.links.ItemsSearchLink r9 = (com.avito.android.deep_linking.links.ItemsSearchLink) r9
            goto L58
        L57:
            r9 = r2
        L58:
            if (r9 == 0) goto L61
            com.avito.android.remote.model.SearchParams r9 = r9.f133403b
            java.lang.String r9 = r9.getLocationId()
            goto L62
        L61:
            r9 = r2
        L62:
            com.avito.android.deep_linking.links.DeepLink r0 = r0.getF327362e()
            boolean r1 = r0 instanceof com.avito.android.deep_linking.links.ItemsSearchLink
            if (r1 == 0) goto L6d
            com.avito.android.deep_linking.links.ItemsSearchLink r0 = (com.avito.android.deep_linking.links.ItemsSearchLink) r0
            goto L6e
        L6d:
            r0 = r2
        L6e:
            if (r0 == 0) goto L76
            com.avito.android.remote.model.SearchParams r0 = r0.f133403b
            java.lang.String r2 = r0.getLocationId()
        L76:
            boolean r9 = kotlin.jvm.internal.L.f(r2, r9)
            if (r9 != 0) goto L7f
        L7c:
            r9 = 0
            r6.f327316g = r9
        L7f:
            java.util.List r9 = r8.h6()
            r6.f327315f = r9
            java.util.List r1 = r8.h6()
            int r3 = r6.f327316g
            com.avito.android.visual_rubricator.Space r8 = r8.getF327324e()
            boolean r5 = r8.b()
            r0 = r7
            r2 = r6
            r0.gy(r1, r2, r3, r4, r5)
        L98:
            com.avito.android.visual_rubricator.S r8 = new com.avito.android.visual_rubricator.S
            r8.<init>(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.visual_rubricator.T.O5(TV0.e, TV0.a, int):void");
    }

    @Override // com.avito.android.visual_rubricator.Q
    public final void invalidate() {
        int i12 = b.f327320l;
    }

    @Override // com.avito.android.visual_rubricator.I
    public final void k(@Y61.k VisualRubricatorWidgetElementItem visualRubricatorWidgetElementItem, @Y61.l Integer num) {
        if (!visualRubricatorWidgetElementItem.u1()) {
            int iIntValue = num != null ? num.intValue() : 0;
            String str = visualRubricatorWidgetElementItem.getF327374q().b() ? "shortcuts_widget" : visualRubricatorWidgetElementItem.getF327374q().a() ? "salesHeader_widget" : "";
            d.a.a(this.f327312c, Integer.valueOf(iIntValue), str, visualRubricatorWidgetElementItem.getF327360c(), null, null, null, visualRubricatorWidgetElementItem.b0(), visualRubricatorWidgetElementItem.getF327376s(), 56);
        }
        this.f327313d.accept(new L(visualRubricatorWidgetElementItem, num));
    }

    @Override // com.avito.android.visual_rubricator.Q
    @Y61.k
    public final d2<kotlin.Q<List<Integer>, List<Integer>>> m1() {
        return C43175k.a(this.f327314e);
    }

    @Override // com.avito.android.visual_rubricator.Q
    @Y61.k
    public final C41981q0 u2() {
        com.jakewharton.rxrelay3.c<L> cVar = this.f327313d;
        return com.avito.android.advert.item.delivery_suggests.l.l(cVar, cVar);
    }

    @Override // com.avito.android.visual_rubricator.Q
    public final void x(int i12) {
        this.f327316g = i12;
    }
}
