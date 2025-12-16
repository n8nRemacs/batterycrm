package com.yandex.mapkit.transport.bicycle;

import com.yandex.runtime.Error;
import j.N;
import j.j0;
import java.util.List;

/* loaded from: classes7.dex */
public interface SummarySession {

    public interface SummaryListener {
        @j0
        void onBicycleSummaries(@N List<Summary> list);

        @j0
        void onBicycleSummariesError(@N Error error);
    }

    void cancel();

    void retry(@N SummaryListener summaryListener);
}
