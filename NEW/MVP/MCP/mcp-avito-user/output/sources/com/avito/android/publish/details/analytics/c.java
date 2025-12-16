package com.avito.android.publish.details.analytics;

import Pd0.j;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.details.analytics.PublishDetailsFlowTracker;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PublishDetailsFlowTrackerImpl.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/analytics/c;", "Lcom/avito/android/publish/details/analytics/PublishDetailsFlowTracker;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements PublishDetailsFlowTracker {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final a f233462a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinkedHashMap f233463b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    @k
    public final HashSet<PublishDetailsFlowTracker.FlowContext> f233464c = new HashSet<>();

    @Inject
    public c(@k a aVar) {
        this.f233462a = aVar;
    }

    @Override // com.avito.android.publish.details.analytics.PublishDetailsFlowTracker
    public final void a(@k PublishDetailsFlowTracker.FlowContext... flowContextArr) {
        for (PublishDetailsFlowTracker.FlowContext flowContext : flowContextArr) {
            j jVarA = this.f233462a.a(flowContext);
            if (jVarA != null) {
                this.f233463b.put(flowContext, jVarA);
                jVarA.g();
                this.f233464c.add(flowContext);
            }
        }
    }

    @Override // com.avito.android.publish.details.analytics.PublishDetailsFlowTracker
    public final void b() {
        HashSet<PublishDetailsFlowTracker.FlowContext> hashSet = this.f233464c;
        Iterator<PublishDetailsFlowTracker.FlowContext> it = hashSet.iterator();
        while (it.hasNext()) {
            PublishDetailsFlowTracker.FlowContext next = it.next();
            LinkedHashMap linkedHashMap = this.f233463b;
            j jVar = (j) linkedHashMap.get(next);
            if (jVar != null) {
                jVar.b();
            }
            linkedHashMap.remove(next);
        }
        hashSet.clear();
    }
}
