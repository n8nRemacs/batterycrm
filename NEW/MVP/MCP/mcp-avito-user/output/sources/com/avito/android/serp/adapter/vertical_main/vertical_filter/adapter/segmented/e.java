package com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.segmented;

import Y41.l;
import com.avito.android.remote.model.search.Filter;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: VerticalSearchFilterSegmentedItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "selectedIndex", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class e extends N implements l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f273508l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.e f273509m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f f273510n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List<Filter.InnerOptions.Options> list, com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.e eVar, f fVar) {
        super(1);
        this.f273508l = list;
        this.f273509m = eVar;
        this.f273510n = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    @Override // Y41.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(java.lang.Integer r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = 0
            if (r1 < 0) goto L28
            java.lang.Object r3 = r0.f273508l
            int r4 = r3.size()
            if (r1 >= r4) goto L28
            java.lang.Object r1 = r3.get(r1)
            r3 = r1
            com.avito.android.remote.model.search.Filter$InnerOptions$Options r3 = (com.avito.android.remote.model.search.Filter.InnerOptions.Options) r3
            java.lang.String r3 = r3.getOptionId()
            if (r3 == 0) goto L28
            int r3 = r3.length()
            if (r3 != 0) goto L29
        L28:
            r1 = r2
        L29:
            com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.e r3 = r0.f273509m
            com.avito.android.remote.model.search.Filter r4 = r3.f273466c
            if (r4 == 0) goto L39
            com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.segmented.f r5 = r0.f273510n
            r6 = r1
            com.avito.android.remote.model.search.Filter$InnerOptions$Options r6 = (com.avito.android.remote.model.search.Filter.InnerOptions.Options) r6
            com.avito.android.serp.adapter.vertical_main.p r5 = r5.f273511b
            r5.o(r4, r6)
        L39:
            com.avito.android.remote.model.search.Filter r7 = r3.f273466c
            if (r7 == 0) goto L6b
            com.avito.android.remote.model.search.InlineFilterValue$InlineFilterSelectValue r4 = new com.avito.android.remote.model.search.InlineFilterValue$InlineFilterSelectValue
            com.avito.android.remote.model.search.Filter$InnerOptions$Options r1 = (com.avito.android.remote.model.search.Filter.InnerOptions.Options) r1
            if (r1 == 0) goto L47
            java.lang.String r2 = r1.getOptionId()
        L47:
            r4.<init>(r2)
            r24 = 65279(0xfeff, float:9.1475E-41)
            r25 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r16 = r4
            com.avito.android.remote.model.search.Filter r2 = com.avito.android.remote.model.search.Filter.copy$default(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
        L6b:
            r3.f273466c = r2
            kotlin.G0 r1 = kotlin.G0.f406611a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.segmented.e.invoke(java.lang.Object):java.lang.Object");
    }
}
