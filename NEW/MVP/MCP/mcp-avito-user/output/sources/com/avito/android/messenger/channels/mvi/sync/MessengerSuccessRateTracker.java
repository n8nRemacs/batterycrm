package com.avito.android.messenger.channels.mvi.sync;

import com.avito.android.messenger.channels.analytics.MessengerStatsdEventFactory;
import kotlin.Metadata;

/* compiled from: MessengerSuccessRateTracker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/MessengerSuccessRateTracker;", "", "Result", "Scenario", "ScenarioState", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface MessengerSuccessRateTracker {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessengerSuccessRateTracker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/MessengerSuccessRateTracker$Result;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Result {

        /* renamed from: c, reason: collision with root package name */
        public static final Result f188366c;

        /* renamed from: d, reason: collision with root package name */
        public static final Result f188367d;

        /* renamed from: e, reason: collision with root package name */
        public static final Result f188368e;

        /* renamed from: f, reason: collision with root package name */
        public static final Result f188369f;

        /* renamed from: g, reason: collision with root package name */
        public static final Result f188370g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ Result[] f188371h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f188372i;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f188373b;

        static {
            Result result = new Result("OK", 0, "ok");
            Result result2 = new Result("ERROR", 1, "error");
            f188366c = result2;
            Result result3 = new Result("NETWORK_ERROR", 2, "network_error");
            f188367d = result3;
            Result result4 = new Result("AUTH_ERROR", 3, "auth_error");
            f188368e = result4;
            Result result5 = new Result("FORBIDDEN_ERROR", 4, "forbidden_error");
            f188369f = result5;
            Result result6 = new Result("PHONE_VERIFY_ERROR", 5, "phone_verify_error");
            f188370g = result6;
            Result[] resultArr = {result, result2, result3, result4, result5, result6, new Result("DURATION", 6, "duration")};
            f188371h = resultArr;
            f188372i = kotlin.enums.c.a(resultArr);
        }

        public Result(String str, int i12, String str2) {
            this.f188373b = str2;
        }

        public static Result valueOf(String str) {
            return (Result) Enum.valueOf(Result.class, str);
        }

        public static Result[] values() {
            return (Result[]) f188371h.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessengerSuccessRateTracker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/MessengerSuccessRateTracker$Scenario;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Scenario {

        /* renamed from: c, reason: collision with root package name */
        public static final Scenario f188374c;

        /* renamed from: d, reason: collision with root package name */
        public static final Scenario f188375d;

        /* renamed from: e, reason: collision with root package name */
        public static final Scenario f188376e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Scenario[] f188377f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f188378g;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f188379b;

        static {
            Scenario scenario = new Scenario("CHANNEL_LIST", 0, "channel_list");
            Scenario scenario2 = new Scenario("CHANNEL_OPEN", 1, "channel_open");
            Scenario scenario3 = new Scenario("CHANNEL_CREATE_U2I", 2, "channel_create_u2i");
            f188374c = scenario3;
            Scenario scenario4 = new Scenario("CHANNEL_CREATE_A2U", 3, "channel_create_a2u");
            f188375d = scenario4;
            Scenario scenario5 = new Scenario("CHANNEL_CREATE_U2U", 4, "channel_create_u2u");
            f188376e = scenario5;
            Scenario[] scenarioArr = {scenario, scenario2, scenario3, scenario4, scenario5, new Scenario("MESSAGE_SEND", 5, "message_send")};
            f188377f = scenarioArr;
            f188378g = kotlin.enums.c.a(scenarioArr);
        }

        public Scenario(String str, int i12, String str2) {
            this.f188379b = str2;
        }

        public static Scenario valueOf(String str) {
            return (Scenario) Enum.valueOf(Scenario.class, str);
        }

        public static Scenario[] values() {
            return (Scenario[]) f188377f.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessengerSuccessRateTracker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/MessengerSuccessRateTracker$ScenarioState;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ScenarioState {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ScenarioState[] f188380b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f188381c;

        static {
            ScenarioState[] scenarioStateArr = {new ScenarioState("CREATED", 0), new ScenarioState("RENDERED", 1), new ScenarioState("SENT", 2)};
            f188380b = scenarioStateArr;
            f188381c = kotlin.enums.c.a(scenarioStateArr);
        }

        public static ScenarioState valueOf(String str) {
            return (ScenarioState) Enum.valueOf(ScenarioState.class, str);
        }

        public static ScenarioState[] values() {
            return (ScenarioState[]) f188380b.clone();
        }
    }

    void a(@Y61.l MessengerStatsdEventFactory.Companion.ChannelType channelType);

    void b(@Y61.k MessengerStatsdEventFactory.Companion.ChannelType channelType);

    void c(@Y61.k MessengerStatsdEventFactory.Companion.ChannelType channelType, @Y61.k Result result);

    void d(@Y61.l MessengerStatsdEventFactory.Companion.ChannelType channelType);
}
