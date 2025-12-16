package ru.ok.android.externcalls.sdk.stat.finish;

import defpackage.cm6;
import defpackage.em6;
import defpackage.m81;
import defpackage.n81;
import defpackage.qqg;
import defpackage.u08;
import defpackage.ue3;
import defpackage.we3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;
import ru.ok.android.externcalls.sdk.rate.RateHint;
import ru.ok.android.externcalls.sdk.stat.candidateschanged.IceCandidatePairChangedStat;
import ru.ok.android.externcalls.sdk.stat.internal.SingleShotStat;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006JA\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0014\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/finish/CallFinishStat;", "Lru/ok/android/externcalls/sdk/stat/internal/SingleShotStat;", "Lkotlin/Function0;", "Lm81;", "getEventualStatSender", "<init>", "(Lcm6;)V", "callEventualStatSender", "Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;", IceCandidatePairChangedStat.KEY_REASON, "", "Lru/ok/android/externcalls/sdk/rate/RateHint;", "rateReasons", "", "errorText", "", "isCaller", "Lqqg;", "report", "(Lm81;Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;Ljava/util/List;Ljava/lang/String;Z)V", "onCallFinished", "(Lru/ok/android/externcalls/sdk/events/end/ConversationEndReason;Ljava/util/List;Ljava/lang/String;Z)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CallFinishStat extends SingleShotStat {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm81;", "callEventualStatSender", "Lqqg;", "invoke", "(Lm81;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.stat.finish.CallFinishStat$onCallFinished$1, reason: invalid class name */
    public static final class AnonymousClass1 extends u08 implements em6 {
        final /* synthetic */ String $errorText;
        final /* synthetic */ boolean $isCaller;
        final /* synthetic */ List<RateHint> $rateReasons;
        final /* synthetic */ ConversationEndReason $reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConversationEndReason conversationEndReason, List<RateHint> list, String str, boolean z) {
            super(1);
            this.$reason = conversationEndReason;
            this.$rateReasons = list;
            this.$errorText = str;
            this.$isCaller = z;
        }

        @Override // defpackage.em6
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((m81) obj);
            return qqg.a;
        }

        public final void invoke(m81 m81Var) {
            CallFinishStat.this.report(m81Var, this.$reason, this.$rateReasons, this.$errorText, this.$isCaller);
        }
    }

    public CallFinishStat(cm6 cm6Var) {
        super(cm6Var);
    }

    public static /* synthetic */ void onCallFinished$default(CallFinishStat callFinishStat, ConversationEndReason conversationEndReason, List list, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        callFinishStat.onCallFinished(conversationEndReason, list, str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void report(m81 callEventualStatSender, ConversationEndReason reason, List<RateHint> rateReasons, String errorText, boolean isCaller) {
        if ((reason instanceof ConversationEndReason.Missed) && isCaller) {
            reason = ConversationEndReason.CallTimeout.INSTANCE;
        }
        if (errorText == null) {
            errorText = "";
        }
        EventItemValue eventItemValue = EventItemValueKt.toEventItemValue(errorText);
        EventItemsMap eventItemsMap = new EventItemsMap();
        eventItemsMap.set(IceCandidatePairChangedStat.KEY_REASON, reason.getKey());
        ArrayList arrayList = new ArrayList(we3.q(rateReasons, 10));
        Iterator<T> it = rateReasons.iterator();
        while (it.hasNext()) {
            arrayList.add(((RateHint) it.next()).getReason());
        }
        eventItemsMap.set("rate_reasons", ue3.N(ue3.W(arrayList), ",", null, null, null, 62));
        ((n81) callEventualStatSender).c("call_finish", eventItemValue, eventItemsMap);
    }

    public static /* synthetic */ void report$default(CallFinishStat callFinishStat, m81 m81Var, ConversationEndReason conversationEndReason, List list, String str, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            str = null;
        }
        callFinishStat.report(m81Var, conversationEndReason, list, str, z);
    }

    public final void onCallFinished(ConversationEndReason reason, List<RateHint> rateReasons, String errorText, boolean isCaller) {
        reportOnce(new AnonymousClass1(reason, rateReasons, errorText, isCaller));
    }
}
