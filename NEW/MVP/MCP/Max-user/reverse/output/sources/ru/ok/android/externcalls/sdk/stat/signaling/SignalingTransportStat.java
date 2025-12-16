package ru.ok.android.externcalls.sdk.stat.signaling;

import defpackage.cm6;
import defpackage.l0f;
import defpackage.m0f;
import defpackage.m81;
import defpackage.vmf;
import defpackage.y8g;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;
import org.apache.http.HttpStatus;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u0017J\u001f\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010\u0017R\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/signaling/SignalingTransportStat;", "Lm0f;", "Lkotlin/Function0;", "Lm81;", "getEventualStatSender", "Ly8g;", "timeProvider", "<init>", "(Lcm6;Ly8g;)V", "Lqqg;", "onFailed", "()V", "", "eventName", "", SdkMetricStatEvent.VALUE_KEY, "report", "(Ljava/lang/String;Ljava/lang/Integer;)V", "stringValue", "(Ljava/lang/String;Ljava/lang/String;)V", "Ll0f;", "type", "onRestart", "(Ll0f;)V", "onConnect", "onConnected", "onMessageReceived", "onFailedByPings", "", "t", "onFailedByException", "(Ll0f;Ljava/lang/Throwable;)V", "onTimeout", "Lcm6;", "Ly8g;", "", "connectedAtLeastOnceInCall", "Z", "", "startConnectTime", "J", "lastMessageReceived", "firstFailTime", "Ljava/lang/Long;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SignalingTransportStat implements m0f {
    private boolean connectedAtLeastOnceInCall;
    private Long firstFailTime;
    private final cm6 getEventualStatSender;
    private long lastMessageReceived;
    private long startConnectTime;
    private final y8g timeProvider;

    public SignalingTransportStat(cm6 cm6Var, y8g y8gVar) {
        this.getEventualStatSender = cm6Var;
        this.timeProvider = y8gVar;
    }

    private final void onFailed() {
        if (this.firstFailTime == null) {
            this.firstFailTime = Long.valueOf(this.timeProvider.getMsSinceBoot());
        }
    }

    private final void report(String eventName, Integer value) {
        m81 m81Var = (m81) this.getEventualStatSender.invoke();
        if (m81Var != null) {
            m81.a(m81Var, eventName, value != null ? EventItemValueKt.toEventItemValue(value.intValue()) : null, null, 4);
        }
    }

    public static /* synthetic */ void report$default(SignalingTransportStat signalingTransportStat, String str, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        signalingTransportStat.report(str, num);
    }

    @Override // defpackage.m0f
    public void onConnect(l0f type) {
        this.startConnectTime = this.timeProvider.getMsSinceBoot();
    }

    @Override // defpackage.m0f
    public void onConnected(l0f type) {
        this.firstFailTime = null;
        this.lastMessageReceived = 0L;
        long msSinceBoot = this.timeProvider.getMsSinceBoot() - this.startConnectTime;
        if (this.connectedAtLeastOnceInCall) {
            report(type.a(3), Integer.valueOf((int) msSinceBoot));
        } else {
            this.connectedAtLeastOnceInCall = true;
            report(type.a(2), Integer.valueOf((int) msSinceBoot));
        }
    }

    @Override // defpackage.m0f
    public void onFailedByException(l0f type, Throwable t) {
        onFailed();
        String message = t.getMessage();
        if (message == null) {
            StringWriter stringWriter = new StringWriter();
            t.printStackTrace(new PrintWriter(stringWriter));
            message = stringWriter.toString();
        }
        report(type.a(5), vmf.Z(HttpStatus.SC_MULTIPLE_CHOICES, message));
    }

    @Override // defpackage.m0f
    public void onFailedByPings(l0f type) {
        long msSinceBoot = this.timeProvider.getMsSinceBoot() - this.lastMessageReceived;
        onFailed();
        report(type.a(4), Integer.valueOf((int) msSinceBoot));
    }

    @Override // defpackage.m0f
    public void onMessageReceived(l0f type) {
        this.lastMessageReceived = this.timeProvider.getMsSinceBoot();
    }

    @Override // defpackage.m0f
    public void onRestart(l0f type) {
        report$default(this, type.a(1), null, 2, null);
    }

    @Override // defpackage.m0f
    public void onTimeout(l0f type) {
        Long l = this.firstFailTime;
        Long lValueOf = l != null ? Long.valueOf(this.timeProvider.getMsSinceBoot() - l.longValue()) : null;
        report(type.a(6), lValueOf != null ? Integer.valueOf((int) lValueOf.longValue()) : null);
    }

    private final void report(String eventName, String stringValue) {
        m81 m81Var = (m81) this.getEventualStatSender.invoke();
        if (m81Var != null) {
            m81.a(m81Var, eventName, EventItemValueKt.toEventItemValue(stringValue), null, 4);
        }
    }
}
