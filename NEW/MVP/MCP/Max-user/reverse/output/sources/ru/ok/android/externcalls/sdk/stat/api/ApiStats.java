package ru.ok.android.externcalls.sdk.stat.api;

import defpackage.cm6;
import defpackage.m81;
import defpackage.n81;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/api/ApiStats;", "", "Lkotlin/Function0;", "Lm81;", "getEventualStatSender", "<init>", "(Lcm6;)V", "", "methodName", "", "executionTime", "Lqqg;", "reportExecutionTime", "(Ljava/lang/String;J)V", "Lcm6;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ApiStats {
    private final cm6 getEventualStatSender;

    public ApiStats(cm6 cm6Var) {
        this.getEventualStatSender = cm6Var;
    }

    public final void reportExecutionTime(String methodName, long executionTime) {
        m81 m81Var = (m81) this.getEventualStatSender.invoke();
        if (m81Var != null) {
            ((n81) m81Var).c("api_call", EventItemValueKt.toEventItemValue(executionTime), new EventItemsMap((Map<String, ? extends EventItemValue>) Collections.singletonMap("api_method", EventItemValueKt.toEventItemValue(methodName))));
        }
    }
}
