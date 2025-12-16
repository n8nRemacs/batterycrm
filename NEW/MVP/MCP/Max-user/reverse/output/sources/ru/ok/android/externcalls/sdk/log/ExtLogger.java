package ru.ok.android.externcalls.sdk.log;

import android.content.Context;
import defpackage.b7d;
import defpackage.hcf;
import defpackage.tk4;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;
import ru.ok.android.externcalls.sdk.log.LogItem;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u0001:\u0002'(B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0016\u0010\u0017\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0016¢\u0006\u0004\b\u0014\u0010\u0018J5\u0010\u0014\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\fH\u0015¢\u0006\u0004\b\u0014\u0010\u001cJ\u000f\u0010\u001a\u001a\u00020\u0019H\u0015¢\u0006\u0004\b\u001a\u0010\u001dJ;\u0010\u0014\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\u0010\u0017\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0016H\u0016¢\u0006\u0004\b\u0014\u0010\u001fJO\u0010\u0014\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\u0010\u0017\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00162\b\u0010 \u001a\u0004\u0018\u00010\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u0014\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010#\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&¨\u0006)"}, d2 = {"Lru/ok/android/externcalls/sdk/log/ExtLogger;", "Lb7d;", "Landroid/content/Context;", "context", "Lru/ok/android/externcalls/sdk/log/ExtLogger$TimeProvider;", "timeProvider", "Lru/ok/android/externcalls/sdk/log/ItemToLogConverter;", "itemLogger", "<init>", "(Landroid/content/Context;Lru/ok/android/externcalls/sdk/log/ExtLogger$TimeProvider;Lru/ok/android/externcalls/sdk/log/ItemToLogConverter;)V", "Lhcf;", "operation", "", "cid", "param", "Lqqg;", "logSimple", "(Lhcf;Ljava/lang/String;Ljava/lang/String;)V", "Lru/ok/android/externcalls/sdk/log/LogItem;", "item", "log", "(Lru/ok/android/externcalls/sdk/log/LogItem;)V", "", "custom", "(Lhcf;Ljava/util/Map;)V", "", "time", "statType", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "()J", CallAnalyticsApiRequest.KEY_COLLECTOR, "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "participantId", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Long;)V", "Lru/ok/android/externcalls/sdk/log/ItemToLogConverter;", "place", "Ljava/lang/String;", "Lru/ok/android/externcalls/sdk/log/TimeProviderAdapter;", "Lru/ok/android/externcalls/sdk/log/TimeProviderAdapter;", "Companion", "TimeProvider", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExtLogger extends b7d {
    private static final String COLLECTOR = "ok.mobile.apps.video";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ItemToLogConverter itemLogger;
    private final String place;
    private final TimeProviderAdapter timeProvider;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ok/android/externcalls/sdk/log/ExtLogger$Companion;", "", "<init>", "()V", "Lhcf;", "operation", "Lru/ok/android/externcalls/sdk/log/LogItem$Builder;", "simpleBuilder", "(Lhcf;)Lru/ok/android/externcalls/sdk/log/LogItem$Builder;", "", "simpleBuilderAny", "(Ljava/lang/String;)Lru/ok/android/externcalls/sdk/log/LogItem$Builder;", "COLLECTOR", "Ljava/lang/String;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(tk4 tk4Var) {
            this();
        }

        public final LogItem.Builder simpleBuilder(hcf operation) {
            return new LogItem.Builder().setCollector(ExtLogger.COLLECTOR).setType(1).setOperation(operation).setCount(1);
        }

        public final LogItem.Builder simpleBuilderAny(String operation) {
            return new LogItem.Builder().setCollector(ExtLogger.COLLECTOR).setType(1).setOperation(operation).setCount(1);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/log/ExtLogger$TimeProvider;", "", "currentTimeMillis", "", "getCurrentTimeMillis", "()J", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface TimeProvider {
        long getCurrentTimeMillis();
    }

    public ExtLogger(Context context, TimeProvider timeProvider, ItemToLogConverter itemToLogConverter) {
        this.conversationId = "";
        this.itemLogger = itemToLogConverter;
        this.place = context.getApplicationInfo().packageName;
        this.timeProvider = new TimeProviderAdapter(timeProvider);
    }

    public static final LogItem.Builder simpleBuilder(hcf hcfVar) {
        return INSTANCE.simpleBuilder(hcfVar);
    }

    public static final LogItem.Builder simpleBuilderAny(String str) {
        return INSTANCE.simpleBuilderAny(str);
    }

    public final void log(LogItem item) {
        this.itemLogger.log(item);
    }

    public void logSimple(hcf operation, String cid, String param) {
        log(INSTANCE.simpleBuilder(operation).setCustom("vcid", cid).setCustom("param", param).setTime(this.timeProvider.utcTimeMs()).build());
    }

    @Override // defpackage.b7d
    public long time() {
        return this.timeProvider.utcTimeMs();
    }

    public final void log(hcf operation, Map<String, String> custom) {
        log(COLLECTOR, operation.a, custom);
    }

    @Override // defpackage.b7d
    public void log(String operation, long time, String param, String statType) {
        LogItem.Builder time2 = new LogItem.Builder().setCollector(COLLECTOR).setType(1).setOperation(operation).setCount(1).setTime(time);
        if (param != null) {
            time2.setCustom("param", param);
        }
        if ("callStart".equals(operation)) {
            time2.setCustom("place", this.place);
        }
        if (statType != null) {
            time2.setCustom("stat_type", statType);
        }
        log(time2.build());
    }

    @Override // defpackage.b7d
    public void log(String collector, String operation, Map<String, String> custom) {
        log(collector, operation, custom, null, null);
    }

    public void log(String collector, String operation, Map<String, String> custom, String participantId, Long time) {
        LogItem.Builder count = new LogItem.Builder().setCollector(collector).setType(1).setOperation(operation).setCount(1);
        if (participantId != null) {
            count.setUid(participantId);
        }
        if (time != null) {
            count.setTime(time.longValue());
        } else {
            count.setTime(this.timeProvider.utcTimeMs());
        }
        for (Map.Entry<String, String> entry : custom.entrySet()) {
            count.setCustom(entry.getKey(), entry.getValue());
        }
        log(count.build());
    }
}
