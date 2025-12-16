package com.avito.android.map_core.analytics.event;

import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.remote.model.SearchParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SearchByMapEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map_core/analytics/event/p;", "Lcom/avito/android/analytics/provider/clickstream/c;", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class p extends com.avito.android.analytics.provider.clickstream.c {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SearchParams f185632f;

    /* renamed from: g, reason: collision with root package name */
    public final long f185633g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final List<Double> f185634h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final String f185635i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Integer f185636j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f185637k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final SourceAction f185638l;

    public /* synthetic */ p(long j12, TreeClickStreamParent treeClickStreamParent, SearchParams searchParams, long j13, List list, String str, Integer num, String str2, SourceAction sourceAction, int i12, C42822w c42822w) {
        this(j12, treeClickStreamParent, searchParams, j13, list, str, num, (i12 & 128) != 0 ? null : str2, (i12 & 256) != 0 ? null : sourceAction);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    @Override // com.avito.android.analytics.provider.clickstream.c
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.Object> i() {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.map_core.analytics.event.p.i():java.util.Map");
    }

    public p(long j12, @Y61.l TreeClickStreamParent treeClickStreamParent, @Y61.k SearchParams searchParams, long j13, @Y61.l List<Double> list, @Y61.k String str, @Y61.l Integer num, @Y61.l String str2, @Y61.l SourceAction sourceAction) {
        super(j12, treeClickStreamParent, 2743, 9);
        this.f185632f = searchParams;
        this.f185633g = j13;
        this.f185634h = list;
        this.f185635i = str;
        this.f185636j = num;
        this.f185637k = str2;
        this.f185638l = sourceAction;
    }
}
