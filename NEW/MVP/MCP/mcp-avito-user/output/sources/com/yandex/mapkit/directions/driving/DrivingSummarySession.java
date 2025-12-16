package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.Error;
import j.N;
import j.j0;
import java.util.List;

/* loaded from: classes7.dex */
public interface DrivingSummarySession {

    public interface DrivingSummaryListener {
        @j0
        void onDrivingSummaries(@N List<Summary> list);

        @j0
        void onDrivingSummariesError(@N Error error);
    }

    void cancel();

    void retry(@N DrivingSummaryListener drivingSummaryListener);
}
