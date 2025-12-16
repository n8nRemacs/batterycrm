package com.vk.id.analytics.stat;

import Y41.p;
import Y41.t;
import Y61.k;
import Y61.l;
import android.content.Context;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.vk.id.analytics.VKIDAnalytics;
import com.vk.id.analytics.stat.StatTracker;
import com.vk.id.common.InternalVKIDApi;
import com.vk.id.logger.InternalVKIDLog;
import com.vk.id.logger.InternalVKIDLogger;
import com.vk.id.network.InternalVKIDApiContract;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.time.DurationUnit;
import kotlin.time.e;
import kotlin.time.g;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.M;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.t1;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: StatTracker.kt */
@s0
@InternalVKIDApi
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001<B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ³\u0001\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u008b\u0001\u0010\u001a\u001a\u0086\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00190\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ5\u0010!\u001a\u00020\u001b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0012\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0\u001e\"\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010+R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, d2 = {"Lcom/vk/id/analytics/stat/StatTracker;", "Lcom/vk/id/analytics/VKIDAnalytics$Tracker;", "", "clientId", "clientSecret", "Lkotlin/C;", "Lcom/vk/id/network/InternalVKIDApiContract;", "api", "Lkotlinx/coroutines/M;", "dispatcher", "Landroid/content/Context;", "context", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/C;Lkotlinx/coroutines/M;Landroid/content/Context;)V", "accessToken", "Ljava/util/concurrent/LinkedBlockingQueue;", "Lorg/json/JSONObject;", "batchEvents", "Lkotlin/Function6;", "Lkotlin/S;", "name", "versionName", "Lorg/json/JSONArray;", "eventsJson", "externalDeviceId", "Lokhttp3/Call;", "apiMethod", "Lkotlin/G0;", "sendEvents", "(Ljava/lang/String;Ljava/util/concurrent/LinkedBlockingQueue;LY41/t;)V", "", "Lcom/vk/id/analytics/VKIDAnalytics$EventParam;", "params", "trackEvent", "(Ljava/lang/String;Ljava/lang/String;[Lcom/vk/id/analytics/VKIDAnalytics$EventParam;)V", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "Lkotlin/C;", "Lcom/vk/id/analytics/stat/AnalyticsStorage;", "storage", "Lcom/vk/id/analytics/stat/AnalyticsStorage;", "Lkotlinx/coroutines/T;", "trackerScope", "Lkotlinx/coroutines/T;", "Lcom/vk/id/logger/InternalVKIDLogger;", "logger", "Lcom/vk/id/logger/InternalVKIDLogger;", "anonymousBatchEvents", "Ljava/util/concurrent/LinkedBlockingQueue;", "personalizedBatchEvents", "Lcom/vk/id/analytics/stat/EventCounter;", "eventCounter", "Lcom/vk/id/analytics/stat/EventCounter;", "Companion", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StatTracker implements VKIDAnalytics.Tracker {

    @k
    private final InterfaceC42726C<InternalVKIDApiContract> api;

    @k
    private final String clientId;

    @k
    private final String clientSecret;

    @k
    private final AnalyticsStorage storage;

    @k
    private final T trackerScope;

    @k
    private final InternalVKIDLogger logger = InternalVKIDLog.INSTANCE.createLoggerForTag("StatTracker");

    @k
    private final LinkedBlockingQueue<JSONObject> anonymousBatchEvents = new LinkedBlockingQueue<>();

    @k
    private final LinkedBlockingQueue<JSONObject> personalizedBatchEvents = new LinkedBlockingQueue<>();

    @k
    private final EventCounter eventCounter = new EventCounter();

    /* compiled from: StatTracker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.vk.id.analytics.stat.StatTracker$trackEvent$1", f = "StatTracker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.vk.id.analytics.stat.StatTracker$trackEvent$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        final /* synthetic */ String $accessToken;
        final /* synthetic */ String $name;
        final /* synthetic */ VKIDAnalytics.EventParam[] $params;
        int label;
        final /* synthetic */ StatTracker this$0;

        /* compiled from: StatTracker.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.vk.id.analytics.stat.StatTracker$trackEvent$1$1", f = "StatTracker.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.vk.id.analytics.stat.StatTracker$trackEvent$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C108221 extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
            final /* synthetic */ String $accessToken;
            int label;
            final /* synthetic */ StatTracker this$0;

            /* compiled from: StatTracker.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: com.vk.id.analytics.stat.StatTracker$trackEvent$1$1$2, reason: invalid class name */
            public /* synthetic */ class AnonymousClass2 extends H implements t<String, String, String, String, JSONArray, String, Call> {
                public AnonymousClass2(Object obj) {
                    super(6, obj, InternalVKIDApiContract.class, "sendStatEvents", "sendStatEvents(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;)Lokhttp3/Call;", 0);
                }

                @Override // Y41.t
                public final Call invoke(String str, String str2, String str3, String str4, JSONArray jSONArray, String str5) {
                    return ((InternalVKIDApiContract) this.receiver).sendStatEvents(str, str2, str3, str4, jSONArray, str5);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C108221(StatTracker statTracker, String str, Continuation<? super C108221> continuation) {
                super(2, continuation);
                this.this$0 = statTracker;
                this.$accessToken = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Call invokeSuspend$lambda$0(StatTracker statTracker, String str, String str2, String str3, String str4, JSONArray jSONArray, String str5) {
                return ((InternalVKIDApiContract) statTracker.api.getValue()).sendStatEventsAnonymously(str2, str3, str4, jSONArray, str5);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
                return new C108221(this.this$0, this.$accessToken, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.label;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    e.a aVar = e.f410651c;
                    long jG2 = g.g(1, DurationUnit.f410634f);
                    this.label = 1;
                    if (C43131e0.c(jG2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                StatTracker statTracker = this.this$0;
                LinkedBlockingQueue linkedBlockingQueue = statTracker.anonymousBatchEvents;
                final StatTracker statTracker2 = this.this$0;
                statTracker.sendEvents("", linkedBlockingQueue, new t() { // from class: com.vk.id.analytics.stat.a
                    @Override // Y41.t
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                        return StatTracker.AnonymousClass1.C108221.invokeSuspend$lambda$0(statTracker2, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (JSONArray) obj6, (String) obj7);
                    }
                });
                String str = this.$accessToken;
                if (str != null) {
                    StatTracker statTracker3 = this.this$0;
                    statTracker3.sendEvents(str, statTracker3.personalizedBatchEvents, new AnonymousClass2(this.this$0.api.getValue()));
                }
                return G0.f406611a;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C108221) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, VKIDAnalytics.EventParam[] eventParamArr, StatTracker statTracker, String str2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$name = str;
            this.$params = eventParamArr;
            this.this$0 = statTracker;
            this.$accessToken = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$name, this.$params, this.this$0, this.$accessToken, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            StatEventJson statEventJson = new StatEventJson(this.$name, this.$params, this.this$0.eventCounter.getEventId(), this.this$0.eventCounter.getPrevEventId());
            this.this$0.eventCounter.increment();
            (this.$accessToken == null ? this.this$0.anonymousBatchEvents : this.this$0.personalizedBatchEvents).add(statEventJson.getJson());
            C43259k.d(this.this$0.trackerScope, null, null, new C108221(this.this$0, this.$accessToken, null), 3);
            return G0.f406611a;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((AnonymousClass1) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StatTracker(@k String str, @k String str2, @k InterfaceC42726C<? extends InternalVKIDApiContract> interfaceC42726C, @k M m12, @k Context context) {
        this.clientId = str;
        this.clientSecret = str2;
        this.api = interfaceC42726C;
        this.storage = new AnalyticsStorage(context);
        this.trackerScope = U.a(m12.plus(t1.b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendEvents(String accessToken, LinkedBlockingQueue<JSONObject> batchEvents, t<? super String, ? super String, ? super String, ? super String, ? super JSONArray, ? super String, ? extends Call> apiMethod) {
        ResponseBody responseBodyBody;
        ArrayList arrayList = new ArrayList();
        batchEvents.drainTo(arrayList);
        if (arrayList.isEmpty()) {
            return;
        }
        JSONArray jSONArray = new JSONArray((Collection) arrayList);
        try {
            Response responseExecute = apiMethod.invoke(accessToken, this.clientId, this.clientSecret, "2.5.1", jSONArray, this.storage.getExternalDeviceId()).execute();
            this.logger.debug("Send events to stat '" + jSONArray + "': " + responseExecute.code());
            responseBodyBody = responseExecute.body();
        } catch (IOException e12) {
            this.logger.error("Network exception while sending events " + jSONArray, e12);
        }
        String strString = responseBodyBody != null ? responseBodyBody.string() : null;
        if (strString != null) {
            try {
                if (new JSONObject(strString).has("error")) {
                    this.logger.error(strString, null);
                } else {
                    this.logger.debug(strString);
                }
            } catch (JSONException unused) {
                this.logger.debug(strString);
            }
        }
    }

    public boolean equals(@l Object other) {
        return (other instanceof StatTracker) && L.f(this.clientSecret, ((StatTracker) other).clientSecret);
    }

    public int hashCode() {
        return this.clientSecret.hashCode();
    }

    @Override // com.vk.id.analytics.VKIDAnalytics.Tracker
    public void trackEvent(@l String accessToken, @k String name, @k VKIDAnalytics.EventParam... params) {
        C43259k.d(U.a(C43262l0.f411947c), null, null, new AnonymousClass1(name, params, this, accessToken, null), 3);
    }
}
