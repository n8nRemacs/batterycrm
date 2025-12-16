package ru.ok.android.externcalls.sdk.stat.init;

import defpackage.cm6;
import defpackage.em6;
import defpackage.hn6;
import defpackage.m81;
import defpackage.n81;
import defpackage.qqg;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.stat.internal.SingleShotStat;
import ru.ok.android.externcalls.sdk.stat.internal.StatExtensionsKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/init/CallInitStat;", "Lru/ok/android/externcalls/sdk/stat/internal/SingleShotStat;", "Lru/ok/android/externcalls/sdk/Conversation$CallType;", "callType", "", "isAnon", "Lkotlin/Function0;", "Lm81;", "getEventualStatSender", "<init>", "(Lru/ok/android/externcalls/sdk/Conversation$CallType;ZLcm6;)V", "callEventualStatSender", "Lqqg;", "report", "(Lm81;)V", "onCallInitialized", "()V", "Lru/ok/android/externcalls/sdk/Conversation$CallType;", "Z", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CallInitStat extends SingleShotStat {
    private final Conversation.CallType callType;
    private final boolean isAnon;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.stat.init.CallInitStat$onCallInitialized$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends hn6 implements em6 {
        public AnonymousClass1(Object obj) {
            super(1, 0, CallInitStat.class, obj, "report", "report(Lru/ok/android/webrtc/stat/call/methods/eventual/CallEventualStatSender;)V");
        }

        @Override // defpackage.em6
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((m81) obj);
            return qqg.a;
        }

        public final void invoke(m81 m81Var) {
            ((CallInitStat) this.receiver).report(m81Var);
        }
    }

    public CallInitStat(Conversation.CallType callType, boolean z, cm6 cm6Var) {
        super(cm6Var);
        this.callType = callType;
        this.isAnon = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void report(m81 callEventualStatSender) {
        EventItemValue eventItemValue = EventItemValueKt.toEventItemValue("");
        EventItemsMap eventItemsMap = new EventItemsMap();
        eventItemsMap.set("source", StatExtensionsKt.asString(this.callType, this.isAnon));
        ((n81) callEventualStatSender).c("call_init", eventItemValue, eventItemsMap);
    }

    public final void onCallInitialized() {
        reportOnce(new AnonymousClass1(this));
    }
}
