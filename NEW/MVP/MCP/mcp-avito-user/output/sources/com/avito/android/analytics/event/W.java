package com.avito.android.analytics.event;

import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SerpDisplayType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LoadSerpEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/W;", "Lcom/avito/android/analytics/provider/clickstream/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class W extends com.avito.android.analytics.provider.clickstream.c {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SearchParams f89991f;

    /* renamed from: g, reason: collision with root package name */
    public final long f89992g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final List<Double> f89993h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final SerpDisplayType f89994i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f89995j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f89996k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final String f89997l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final String f89998m;

    public W() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(long j12, TreeClickStreamParent treeClickStreamParent, SearchParams searchParams, long j13, List list, SerpDisplayType serpDisplayType, String str, String str2, String str3, String str4, int i12, C42822w c42822w) {
        super(j12, treeClickStreamParent, 2647, 11);
        String str5 = (i12 & 64) != 0 ? null : str;
        String str6 = (i12 & 128) != 0 ? null : str2;
        String str7 = (i12 & 256) != 0 ? null : str3;
        String str8 = (i12 & 512) == 0 ? str4 : null;
        this.f89991f = searchParams;
        this.f89992g = j13;
        this.f89993h = list;
        this.f89994i = serpDisplayType;
        this.f89995j = str5;
        this.f89996k = str6;
        this.f89997l = str7;
        this.f89998m = str8;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0127  */
    @Override // com.avito.android.analytics.provider.clickstream.c
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.Object> i() {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.analytics.event.W.i():java.util.Map");
    }
}
