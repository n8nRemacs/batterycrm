package ru.ok.android.externcalls.sdk.dev;

import defpackage.em6;
import defpackage.hcf;
import defpackage.k01;
import defpackage.udf;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006'À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/dev/DebugManager;", "", "Lhcf;", "operation", "", "param", "Lqqg;", "report", "(Lhcf;Ljava/lang/String;)V", "", NegotiationErrorStat.KEY_ERROR, "reportError", "(Ljava/lang/Throwable;)V", "Lkotlin/Function1;", "Lk32;", "updater", "updateCameraToggles", "(Lem6;)V", "dumpPath", "enableFullAudioDump", "(Ljava/lang/String;)V", "Ludf;", "listener", "", "period", "Ljava/util/concurrent/TimeUnit;", "unit", "registerStatListener", "(Ludf;ILjava/util/concurrent/TimeUnit;)V", "removeStatListener", "(Ludf;)V", "Lru/ok/android/externcalls/sdk/dev/MediaDumpManager;", "getMediaDumpManager", "()Lru/ok/android/externcalls/sdk/dev/MediaDumpManager;", "mediaDumpManager", "Lk01;", "getUnderlyingCall", "()Lk01;", "underlyingCall", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface DebugManager {
    void enableFullAudioDump(String dumpPath);

    MediaDumpManager getMediaDumpManager();

    k01 getUnderlyingCall();

    void registerStatListener(udf listener, int period, TimeUnit unit);

    void removeStatListener(udf listener);

    void report(hcf operation, String param);

    void reportError(Throwable error);

    void updateCameraToggles(em6 updater);
}
