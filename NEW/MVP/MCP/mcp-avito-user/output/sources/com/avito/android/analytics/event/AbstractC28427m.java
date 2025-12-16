package com.avito.android.analytics.event;

import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: BackPressTreeEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/m;", "Lcom/avito/android/analytics/provider/clickstream/c;", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics.event.m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC28427m extends com.avito.android.analytics.provider.clickstream.c {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f90102f;

    public AbstractC28427m(long j12, @Y61.l TreeClickStreamParent treeClickStreamParent, boolean z12) {
        super(j12, treeClickStreamParent, 2782, 3);
        this.f90102f = z12;
    }

    @Override // com.avito.android.analytics.provider.clickstream.c
    @Y61.k
    public final Map<String, Object> i() {
        int i12;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(k());
        j(linkedHashMap, "srcp", l());
        if (this.f90102f) {
            J[] jArr = J.f89953b;
            i12 = 1;
        } else {
            J[] jArr2 = J.f89953b;
            i12 = 0;
        }
        j(linkedHashMap, "from_block", Integer.valueOf(i12));
        return linkedHashMap;
    }

    @Y61.k
    public Map<String, Object> k() {
        return kotlin.collections.P0.c();
    }

    @Y61.l
    public String l() {
        return null;
    }
}
