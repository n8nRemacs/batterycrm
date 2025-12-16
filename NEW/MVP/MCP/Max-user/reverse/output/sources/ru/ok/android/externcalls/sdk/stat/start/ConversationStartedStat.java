package ru.ok.android.externcalls.sdk.stat.start;

import defpackage.cm6;
import defpackage.em6;
import defpackage.hn6;
import defpackage.m81;
import defpackage.n81;
import defpackage.qqg;
import defpackage.tk4;
import defpackage.ve3;
import defpackage.vmf;
import defpackage.we3;
import defpackage.y8g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.stat.internal.SingleShotStat;
import ru.ok.android.externcalls.sdk.stat.internal.StatExtensionsKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/start/ConversationStartedStat;", "Lru/ok/android/externcalls/sdk/stat/internal/SingleShotStat;", "Lru/ok/android/externcalls/sdk/Conversation$CallType;", "callType", "Ly8g;", "timeProvider", "Lkotlin/Function0;", "Lm81;", "getEventualStatSender", "<init>", "(Lru/ok/android/externcalls/sdk/Conversation$CallType;Ly8g;Lcm6;)V", "callEventualStatSender", "Lqqg;", "report", "(Lm81;)V", "", "getWarmupStatusString", "()Ljava/lang/String;", "onConversationStarted", "()V", "Lru/ok/android/externcalls/sdk/Conversation$CallType;", "Ly8g;", "", "startTimeMs", "J", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ConversationStartedStat extends SingleShotStat {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String STATUS_FINISHED = "warmup_finished";

    @Deprecated
    public static final String STATUS_IN_PROGRESS = "warmup_inprogress";

    @Deprecated
    public static final String STATUS_STARTED = "warmup_start";
    private final Conversation.CallType callType;
    private final long startTimeMs;
    private final y8g timeProvider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/start/ConversationStartedStat$Companion;", "", "()V", "STATUS_FINISHED", "", "STATUS_IN_PROGRESS", "STATUS_STARTED", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(tk4 tk4Var) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.stat.start.ConversationStartedStat$onConversationStarted$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends hn6 implements em6 {
        public AnonymousClass1(Object obj) {
            super(1, 0, ConversationStartedStat.class, obj, "report", "report(Lru/ok/android/webrtc/stat/call/methods/eventual/CallEventualStatSender;)V");
        }

        @Override // defpackage.em6
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((m81) obj);
            return qqg.a;
        }

        public final void invoke(m81 m81Var) {
            ((ConversationStartedStat) this.receiver).report(m81Var);
        }
    }

    public ConversationStartedStat(Conversation.CallType callType, y8g y8gVar, cm6 cm6Var) {
        super(cm6Var);
        this.callType = callType;
        this.timeProvider = y8gVar;
        this.startTimeMs = y8gVar.getMsSinceBoot();
    }

    private final String getWarmupStatusString() {
        return STATUS_STARTED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void report(m81 callEventualStatSender) {
        EventItemValue eventItemValue = EventItemValueKt.toEventItemValue(this.timeProvider.getMsSinceBoot() - this.startTimeMs);
        EventItemsMap eventItemsMap = new EventItemsMap();
        List listJ = ve3.j(StatExtensionsKt.asString$default(this.callType, false, 1, null), getWarmupStatusString());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listJ) {
            if (!vmf.F((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(we3.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(EventItemValue.StringValue.m90boximpl(EventItemValue.StringValue.m91constructorimpl((String) it.next())));
        }
        if (!arrayList2.isEmpty()) {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next());
            }
            eventItemsMap.set(SdkMetricStatEvent.STRING_VALUE_KEY, jSONObject.put("labels", jSONArray).toString());
        }
        ((n81) callEventualStatSender).c("call_start", eventItemValue, eventItemsMap);
    }

    public final void onConversationStarted() {
        reportOnce(new AnonymousClass1(this));
    }
}
