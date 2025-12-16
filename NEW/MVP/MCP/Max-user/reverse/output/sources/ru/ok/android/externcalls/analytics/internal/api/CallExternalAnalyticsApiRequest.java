package ru.ok.android.externcalls.analytics.internal.api;

import defpackage.gy7;
import defpackage.jt0;
import defpackage.om;
import defpackage.ox7;
import defpackage.tha;
import defpackage.ul;
import java.io.IOException;
import kotlin.Metadata;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/api/CallExternalAnalyticsApiRequest;", "Lru/ok/android/externcalls/analytics/internal/api/CallAnalyticsApiRequest;", "", "apiMethod", CallAnalyticsApiRequest.KEY_APPLICATION, CallAnalyticsApiRequest.KEY_COLLECTOR, CallAnalyticsApiRequest.KEY_PLATFORM, "Ljt0;", CallAnalyticsApiRequest.KEY_ITEMS, "Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "logger", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljt0;Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;)V", "Lgy7;", "writer", "Lqqg;", "writeParams", "(Lgy7;)V", "Ljava/lang/String;", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CallExternalAnalyticsApiRequest extends CallAnalyticsApiRequest {
    private final String application;
    private final String collector;
    private final String platform;

    public CallExternalAnalyticsApiRequest(String str, String str2, String str3, String str4, jt0 jt0Var, CallAnalyticsLogger callAnalyticsLogger) {
        super(str, jt0Var, callAnalyticsLogger);
        this.application = str2;
        this.collector = str3;
        this.platform = str4;
    }

    @Override // ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest, defpackage.yl
    public /* bridge */ /* synthetic */ ul getConfigExtractor() {
        return ul.f;
    }

    @Override // ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest, defpackage.yl
    public /* bridge */ /* synthetic */ ox7 getFailParser() {
        return tha.c;
    }

    @Override // ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest, defpackage.yl
    public /* bridge */ /* synthetic */ om getScopeAfter() {
        return om.a;
    }

    @Override // ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest, defpackage.hm
    public /* bridge */ /* synthetic */ boolean willWriteParams() {
        return true;
    }

    @Override // ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest, defpackage.hm
    public /* bridge */ /* synthetic */ boolean willWriteSupplyParams() {
        return false;
    }

    @Override // ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest, defpackage.hm
    public void writeParams(gy7 writer) throws JsonSerializeException, IOException {
        CallAnalyticsApiRequest.writeString$default(this, writer, CallAnalyticsApiRequest.KEY_COLLECTOR, this.collector, false, 8, null);
        writer.b0("data");
        writer.p();
        try {
            CallAnalyticsApiRequest.writeString$default(this, writer, CallAnalyticsApiRequest.KEY_APPLICATION, this.application, false, 8, null);
            writeString(writer, CallAnalyticsApiRequest.KEY_PLATFORM, this.platform, true);
            writer.b0(CallAnalyticsApiRequest.KEY_ITEMS);
            getItems().write(writer);
        } finally {
            writer.n();
        }
    }

    @Override // ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest, defpackage.hm
    public /* bridge */ /* synthetic */ void writeSupplyParams(gy7 gy7Var) throws JsonSerializeException, IOException {
    }
}
