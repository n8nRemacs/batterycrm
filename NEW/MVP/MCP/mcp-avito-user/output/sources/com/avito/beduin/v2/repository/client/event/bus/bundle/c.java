package com.avito.beduin.v2.repository.client.event.bus.bundle;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import dU0.f;
import dV0.C39630a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ClientEventBusRepositoryBundle.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/repository/client/event/bus/bundle/c;", "", "client-event-bus_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C39630a f338174a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Y41.a<f> f338175b;

    public c(@k C39630a c39630a, @k Y41.a<f> aVar) {
        this.f338174a = c39630a;
        this.f338175b = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f338174a, cVar.f338174a) && L.f(this.f338175b, cVar.f338175b);
    }

    public final int hashCode() {
        return this.f338175b.hashCode() + (this.f338174a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClientEventBusRepositoryProperties(event=");
        sb2.append(this.f338174a);
        sb2.append(", onDisconnect=");
        return r.v(sb2, this.f338175b, ')');
    }
}
