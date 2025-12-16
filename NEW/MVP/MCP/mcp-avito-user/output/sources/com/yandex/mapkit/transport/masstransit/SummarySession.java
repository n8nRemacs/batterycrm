package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.Error;
import j.N;
import j.j0;
import java.util.List;

/* loaded from: classes7.dex */
public interface SummarySession {

    public interface SummaryListener {
        @j0
        void onMasstransitSummaries(@N List<Summary> list);

        @j0
        void onMasstransitSummariesError(@N Error error);
    }

    void cancel();

    void retry(@N SummaryListener summaryListener);
}
