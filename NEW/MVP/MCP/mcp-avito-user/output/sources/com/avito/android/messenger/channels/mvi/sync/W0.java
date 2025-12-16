package com.avito.android.messenger.channels.mvi.sync;

import android.os.Parcelable;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.channels.analytics.MessengerStatsdEventFactory;
import com.avito.android.messenger.channels.mvi.sync.MessengerSuccessRateTracker;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;

/* compiled from: MessengerSuccessRateTracker.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/W0;", "Lcom/avito/android/messenger/channels/mvi/sync/MessengerSuccessRateTracker;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class W0 implements MessengerSuccessRateTracker {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f188412a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final MessengerStatsdEventFactory f188413b;

    /* compiled from: MessengerSuccessRateTracker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/W0$a;", "", "<init>", "()V", "", "SCENARIO", "Ljava/lang/String;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: MessengerSuccessRateTracker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[MessengerStatsdEventFactory.Companion.ChannelType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Parcelable.Creator<MessengerStatsdEventFactory.Companion.ChannelType> creator = MessengerStatsdEventFactory.Companion.ChannelType.CREATOR;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Parcelable.Creator<MessengerStatsdEventFactory.Companion.ChannelType> creator2 = MessengerStatsdEventFactory.Companion.ChannelType.CREATOR;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        new a(null);
    }

    @Inject
    public W0(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k MessengerStatsdEventFactory messengerStatsdEventFactory) {
        this.f188412a = interfaceC28373a;
        this.f188413b = messengerStatsdEventFactory;
    }

    @Override // com.avito.android.messenger.channels.mvi.sync.MessengerSuccessRateTracker
    public final void a(@Y61.l MessengerStatsdEventFactory.Companion.ChannelType channelType) {
        MessengerSuccessRateTracker.Scenario scenario;
        if (channelType != null) {
            int iOrdinal = channelType.ordinal();
            if (iOrdinal == 0) {
                scenario = MessengerSuccessRateTracker.Scenario.f188374c;
            } else if (iOrdinal == 1) {
                scenario = MessengerSuccessRateTracker.Scenario.f188376e;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                scenario = MessengerSuccessRateTracker.Scenario.f188375d;
            }
            MessengerSuccessRateTracker.ScenarioState[] scenarioStateArr = MessengerSuccessRateTracker.ScenarioState.f188380b;
            MessengerSuccessRateTracker.Result result = MessengerSuccessRateTracker.Result.f188366c;
            this.f188412a.c(MessengerStatsdEventFactory.b(this.f188413b, new String[]{"scenario", scenario.f188379b, "rendered", "ok"}));
        }
    }

    @Override // com.avito.android.messenger.channels.mvi.sync.MessengerSuccessRateTracker
    public final void b(@Y61.k MessengerStatsdEventFactory.Companion.ChannelType channelType) {
        MessengerSuccessRateTracker.Scenario scenario;
        int iOrdinal = channelType.ordinal();
        if (iOrdinal == 0) {
            scenario = MessengerSuccessRateTracker.Scenario.f188374c;
        } else if (iOrdinal == 1) {
            scenario = MessengerSuccessRateTracker.Scenario.f188376e;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            scenario = MessengerSuccessRateTracker.Scenario.f188375d;
        }
        MessengerSuccessRateTracker.ScenarioState[] scenarioStateArr = MessengerSuccessRateTracker.ScenarioState.f188380b;
        MessengerSuccessRateTracker.Result result = MessengerSuccessRateTracker.Result.f188366c;
        this.f188412a.c(MessengerStatsdEventFactory.b(this.f188413b, new String[]{"scenario", scenario.f188379b, "created", "ok"}));
    }

    @Override // com.avito.android.messenger.channels.mvi.sync.MessengerSuccessRateTracker
    public final void c(@Y61.k MessengerStatsdEventFactory.Companion.ChannelType channelType, @Y61.k MessengerSuccessRateTracker.Result result) {
        MessengerSuccessRateTracker.Scenario scenario;
        int iOrdinal = channelType.ordinal();
        if (iOrdinal == 0) {
            scenario = MessengerSuccessRateTracker.Scenario.f188374c;
        } else if (iOrdinal == 1) {
            scenario = MessengerSuccessRateTracker.Scenario.f188376e;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            scenario = MessengerSuccessRateTracker.Scenario.f188375d;
        }
        MessengerSuccessRateTracker.ScenarioState[] scenarioStateArr = MessengerSuccessRateTracker.ScenarioState.f188380b;
        this.f188412a.c(MessengerStatsdEventFactory.b(this.f188413b, new String[]{"scenario", scenario.f188379b, "created", result.f188373b}));
    }

    @Override // com.avito.android.messenger.channels.mvi.sync.MessengerSuccessRateTracker
    public final void d(@Y61.l MessengerStatsdEventFactory.Companion.ChannelType channelType) {
        MessengerSuccessRateTracker.Scenario scenario;
        MessengerSuccessRateTracker.Result result = MessengerSuccessRateTracker.Result.f188366c;
        if (channelType != null) {
            int iOrdinal = channelType.ordinal();
            if (iOrdinal == 0) {
                scenario = MessengerSuccessRateTracker.Scenario.f188374c;
            } else if (iOrdinal == 1) {
                scenario = MessengerSuccessRateTracker.Scenario.f188376e;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                scenario = MessengerSuccessRateTracker.Scenario.f188375d;
            }
            MessengerSuccessRateTracker.ScenarioState[] scenarioStateArr = MessengerSuccessRateTracker.ScenarioState.f188380b;
            this.f188412a.c(MessengerStatsdEventFactory.b(this.f188413b, new String[]{"scenario", scenario.f188379b, "rendered", "error"}));
        }
    }
}
