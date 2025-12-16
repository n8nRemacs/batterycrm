package io.ktor.websocket;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: WebSocketExtensionHeader.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/websocket/O;", "", "ktor-websockets"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f401436a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f401437b;

    public O(@Y61.k String str, @Y61.k ArrayList arrayList) {
        this.f401436a = str;
        this.f401437b = arrayList;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f401436a);
        sb2.append(' ');
        ArrayList arrayList = this.f401437b;
        sb2.append(arrayList.isEmpty() ? "" : ", ".concat(C42745f0.O(arrayList, ",", null, null, null, 62)));
        return sb2.toString();
    }
}
