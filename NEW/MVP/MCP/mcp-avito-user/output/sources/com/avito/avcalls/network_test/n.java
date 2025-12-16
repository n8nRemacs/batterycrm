package com.avito.avcalls.network_test;

import com.avito.avcalls.network_test.NetworkTestResultReport;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: NetworkTestResultFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/network_test/n;", "", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class n {
    public static NetworkTestResultReport.Stats a(List list) {
        if (list.isEmpty()) {
            return new NetworkTestResultReport.Stats(0, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, WebSocketProtocol.PAYLOAD_SHORT, (C42822w) null);
        }
        int size = list.size();
        Double dValueOf = Double.valueOf(((Number) C42745f0.Q(list)).doubleValue());
        Double dValueOf2 = Double.valueOf(((Number) C42745f0.E(list)).doubleValue());
        Iterator it = list.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += ((Number) it.next()).doubleValue();
        }
        return new NetworkTestResultReport.Stats(size, dValueOf, dValueOf2, Double.valueOf(dDoubleValue / list.size()), Double.valueOf(((Number) list.get((list.size() * 99) / 100)).doubleValue()), Double.valueOf(((Number) list.get((list.size() * 90) / 100)).doubleValue()), Double.valueOf(((Number) list.get((list.size() * 50) / 100)).doubleValue()));
    }
}
