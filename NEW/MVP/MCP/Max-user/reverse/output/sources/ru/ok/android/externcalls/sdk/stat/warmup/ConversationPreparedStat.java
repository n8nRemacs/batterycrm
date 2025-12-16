package ru.ok.android.externcalls.sdk.stat.warmup;

import defpackage.cm6;
import defpackage.em6;
import defpackage.hn6;
import defpackage.m81;
import defpackage.qqg;
import defpackage.y8g;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.sdk.stat.internal.SingleShotStat;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/warmup/ConversationPreparedStat;", "Lru/ok/android/externcalls/sdk/stat/internal/SingleShotStat;", "Ly8g;", "timeProvider", "Lkotlin/Function0;", "Lm81;", "getEventualStatSender", "<init>", "(Ly8g;Lcm6;)V", "callEventualStatSender", "Lqqg;", "report", "(Lm81;)V", "onConversationPrepared", "()V", "Ly8g;", "", "startTimeMs", "J", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ConversationPreparedStat extends SingleShotStat {
    private final long startTimeMs;
    private final y8g timeProvider;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.stat.warmup.ConversationPreparedStat$onConversationPrepared$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends hn6 implements em6 {
        public AnonymousClass1(Object obj) {
            super(1, 0, ConversationPreparedStat.class, obj, "report", "report(Lru/ok/android/webrtc/stat/call/methods/eventual/CallEventualStatSender;)V");
        }

        @Override // defpackage.em6
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((m81) obj);
            return qqg.a;
        }

        public final void invoke(m81 m81Var) {
            ((ConversationPreparedStat) this.receiver).report(m81Var);
        }
    }

    public ConversationPreparedStat(y8g y8gVar, cm6 cm6Var) {
        super(cm6Var);
        this.timeProvider = y8gVar;
        this.startTimeMs = y8gVar.getMsSinceBoot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void report(m81 callEventualStatSender) {
        m81.a(callEventualStatSender, "call_warmup", EventItemValueKt.toEventItemValue(this.timeProvider.getMsSinceBoot() - this.startTimeMs), null, 4);
    }

    public final void onConversationPrepared() {
        reportOnce(new AnonymousClass1(this));
    }
}
