package ru.ok.android.externcalls.analytics.internal.api;

import android.net.Uri;
import defpackage.gy7;
import defpackage.jt0;
import defpackage.nm;
import defpackage.om;
import defpackage.ox7;
import defpackage.tha;
import defpackage.ul;
import defpackage.wm;
import defpackage.xx7;
import defpackage.yl;
import java.io.IOException;
import kotlin.Metadata;
import org.apache.commons.logging.LogFactory;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000 22\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u00012B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\rJ3\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u001e\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00063"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/api/CallAnalyticsApiRequest;", "Lyl;", "Ljava/lang/Void;", "", "apiMethod", "Ljt0;", CallAnalyticsApiRequest.KEY_ITEMS, "Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "logger", "<init>", "(Ljava/lang/String;Ljt0;Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;)V", "", "shouldPost", "()Z", "shouldGzip", "shouldReport", "canRepeat", "Lgy7;", "writer", SdkMetricStatEvent.NAME_KEY, SdkMetricStatEvent.VALUE_KEY, "requireNotEmpty", "Lqqg;", "writeString", "(Lgy7;Ljava/lang/String;Ljava/lang/String;Z)V", "Ljava/lang/String;", "getApiMethod", "()Ljava/lang/String;", "Ljt0;", "getItems", "()Ljt0;", "Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "getLogger", "()Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "uri", "Lnm;", "getScope", "()Lnm;", "scope", "", "getPriority", "()I", LogFactory.PRIORITY_KEY, "Lox7;", "getOkParser", "()Lox7;", "okParser", "Companion", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class CallAnalyticsApiRequest implements yl {
    public static final String KEY_APPLICATION = "application";
    public static final String KEY_APP_VERSION = "app_version";
    public static final String KEY_COLLECTOR = "collector";
    public static final String KEY_DATA = "data";
    public static final String KEY_ITEMS = "items";
    public static final String KEY_PLATFORM = "platform";
    public static final String KEY_SDK_TYPE = "sdk_type";
    public static final String KEY_SDK_VERSION = "sdk_version";
    public static final String KEY_VERSION = "version";
    private static final String LOG_TAG = "CallAnalyticsApiRequest";
    private final String apiMethod;
    private final jt0 items;
    private final CallAnalyticsLogger logger;

    public CallAnalyticsApiRequest(String str, jt0 jt0Var, CallAnalyticsLogger callAnalyticsLogger) {
        this.apiMethod = str;
        this.items = jt0Var;
        this.logger = callAnalyticsLogger;
    }

    public static /* synthetic */ void writeString$default(CallAnalyticsApiRequest callAnalyticsApiRequest, gy7 gy7Var, String str, String str2, boolean z, int i, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: writeString");
        }
        if ((i & 8) != 0) {
            z = false;
        }
        callAnalyticsApiRequest.writeString(gy7Var, str, str2, z);
    }

    public boolean canRepeat() {
        return this.items.canRepeat();
    }

    public final String getApiMethod() {
        return this.apiMethod;
    }

    @Override // defpackage.yl
    public /* bridge */ /* synthetic */ ul getConfigExtractor() {
        return ul.f;
    }

    @Override // defpackage.yl
    public /* bridge */ /* synthetic */ ox7 getFailParser() {
        return tha.c;
    }

    public final jt0 getItems() {
        return this.items;
    }

    public final CallAnalyticsLogger getLogger() {
        return this.logger;
    }

    @Override // defpackage.yl
    public ox7 getOkParser() {
        return new ox7() { // from class: ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest$okParser$1
            @Override // defpackage.ox7
            public final Void parse(xx7 xx7Var) {
                try {
                } catch (IOException e) {
                    this.this$0.getLogger().e("CallAnalyticsApiRequest", "Can't parse response", e);
                }
                if (xx7Var.peek() == 0) {
                    this.this$0.getLogger().d("CallAnalyticsApiRequest", "Got empty response");
                    return null;
                }
                this.this$0.getLogger().d("CallAnalyticsApiRequest", "Got response: " + xx7Var.B());
                return null;
            }
        };
    }

    @Override // defpackage.hm
    public int getPriority() {
        return 2;
    }

    @Override // defpackage.hm
    public nm getScope() {
        return nm.c;
    }

    @Override // defpackage.yl
    public /* bridge */ /* synthetic */ om getScopeAfter() {
        return om.a;
    }

    @Override // defpackage.hm
    public Uri getUri() {
        return wm.a(this.apiMethod);
    }

    @Override // defpackage.hm
    public boolean shouldGzip() {
        return true;
    }

    @Override // defpackage.hm
    public boolean shouldPost() {
        return true;
    }

    public boolean shouldReport() {
        return false;
    }

    @Override // defpackage.hm
    public /* bridge */ /* synthetic */ boolean willWriteParams() {
        return true;
    }

    @Override // defpackage.hm
    public /* bridge */ /* synthetic */ boolean willWriteSupplyParams() {
        return false;
    }

    @Override // defpackage.hm
    public abstract /* synthetic */ void writeParams(gy7 gy7Var) throws JsonSerializeException, IOException;

    public final void writeString(gy7 writer, String name, String value, boolean requireNotEmpty) throws IOException {
        if (value != null) {
            if (requireNotEmpty && value.length() == 0) {
                return;
            }
            writer.b0(name);
            writer.h(value);
        }
    }

    @Override // defpackage.hm
    public /* bridge */ /* synthetic */ void writeSupplyParams(gy7 gy7Var) throws JsonSerializeException, IOException {
    }
}
