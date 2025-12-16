package com.avito.android.messenger.channels.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.InterfaceC32900o;
import com.avito.android.analytics.H;
import com.avito.android.analytics.statsd.D;
import com.avito.android.analytics.statsd.y;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.util.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: MessengerStatsdEventFactory.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/channels/analytics/MessengerStatsdEventFactory;", "", "Companion", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MessengerStatsdEventFactory {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C f187052a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32900o f187053b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final H f187054c;

    /* compiled from: MessengerStatsdEventFactory.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/avito/android/messenger/channels/analytics/MessengerStatsdEventFactory$Companion;", "", "()V", "MESSENGER_UNIT", "", "PERFORMANCE", "SCENARIO", "STEP", "ChannelType", "Scenario", "Screen", "Step", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MessengerStatsdEventFactory.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/channels/analytics/MessengerStatsdEventFactory$Companion$ChannelType;", "", "Landroid/os/Parcelable;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final class ChannelType implements Parcelable {

            @Y61.k
            public static final Parcelable.Creator<ChannelType> CREATOR;

            /* renamed from: c, reason: collision with root package name */
            public static final ChannelType f187055c;

            /* renamed from: d, reason: collision with root package name */
            public static final ChannelType f187056d;

            /* renamed from: e, reason: collision with root package name */
            public static final ChannelType f187057e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ ChannelType[] f187058f;

            /* renamed from: g, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f187059g;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f187060b;

            /* compiled from: MessengerStatsdEventFactory.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ChannelType> {
                @Override // android.os.Parcelable.Creator
                public final ChannelType createFromParcel(Parcel parcel) {
                    return ChannelType.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ChannelType[] newArray(int i12) {
                    return new ChannelType[i12];
                }
            }

            static {
                ChannelType channelType = new ChannelType("U2I", 0, "u2i");
                f187055c = channelType;
                ChannelType channelType2 = new ChannelType("U2U", 1, "u2u");
                f187056d = channelType2;
                ChannelType channelType3 = new ChannelType("A2U", 2, "a2u");
                f187057e = channelType3;
                ChannelType[] channelTypeArr = {channelType, channelType2, channelType3};
                f187058f = channelTypeArr;
                f187059g = kotlin.enums.c.a(channelTypeArr);
                CREATOR = new a();
            }

            public ChannelType(String str, int i12, String str2) {
                this.f187060b = str2;
            }

            public static ChannelType valueOf(String str) {
                return (ChannelType) Enum.valueOf(ChannelType.class, str);
            }

            public static ChannelType[] values() {
                return (ChannelType[]) f187058f.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(name());
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MessengerStatsdEventFactory.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/analytics/MessengerStatsdEventFactory$Companion$Scenario;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Scenario {

            /* renamed from: c, reason: collision with root package name */
            public static final Scenario f187061c;

            /* renamed from: d, reason: collision with root package name */
            public static final Scenario f187062d;

            /* renamed from: e, reason: collision with root package name */
            public static final Scenario f187063e;

            /* renamed from: f, reason: collision with root package name */
            public static final Scenario f187064f;

            /* renamed from: g, reason: collision with root package name */
            public static final Scenario f187065g;

            /* renamed from: h, reason: collision with root package name */
            public static final Scenario f187066h;

            /* renamed from: i, reason: collision with root package name */
            public static final Scenario f187067i;

            /* renamed from: j, reason: collision with root package name */
            public static final /* synthetic */ Scenario[] f187068j;

            /* renamed from: k, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f187069k;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f187070b;

            static {
                Scenario scenario = new Scenario("MESSAGE_SEND", 0, "message_send");
                f187061c = scenario;
                Scenario scenario2 = new Scenario("CHANNEL_READ", 1, "channel_read");
                f187062d = scenario2;
                Scenario scenario3 = new Scenario("MESSAGE_SYNC", 2, "message_sync");
                f187063e = scenario3;
                Scenario scenario4 = new Scenario("CHANNEL_TYPING", 3, "channel_typing");
                f187064f = scenario4;
                Scenario scenario5 = new Scenario("FIRST_LOAD", 4, "load");
                f187065g = scenario5;
                Scenario scenario6 = new Scenario("CHANNEL_CREATE", 5, "create");
                f187066h = scenario6;
                Scenario scenario7 = new Scenario("CHANNEL_CREATE_TO_DRAW", 6, "create_to_draw");
                f187067i = scenario7;
                Scenario[] scenarioArr = {scenario, scenario2, scenario3, scenario4, scenario5, scenario6, scenario7};
                f187068j = scenarioArr;
                f187069k = kotlin.enums.c.a(scenarioArr);
            }

            public Scenario(String str, int i12, String str2) {
                this.f187070b = str2;
            }

            public static Scenario valueOf(String str) {
                return (Scenario) Enum.valueOf(Scenario.class, str);
            }

            public static Scenario[] values() {
                return (Scenario[]) f187068j.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MessengerStatsdEventFactory.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/analytics/MessengerStatsdEventFactory$Companion$Screen;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Screen {

            /* renamed from: c, reason: collision with root package name */
            public static final Screen f187071c;

            /* renamed from: d, reason: collision with root package name */
            public static final Screen f187072d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ Screen[] f187073e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f187074f;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f187075b;

            static {
                Screen screen = new Screen("CHANNELS", 0, "channels");
                f187071c = screen;
                Screen screen2 = new Screen("CHANNEL", 1, "channel");
                f187072d = screen2;
                Screen[] screenArr = {screen, screen2};
                f187073e = screenArr;
                f187074f = kotlin.enums.c.a(screenArr);
            }

            public Screen(String str, int i12, String str2) {
                this.f187075b = str2;
            }

            public static Screen valueOf(String str) {
                return (Screen) Enum.valueOf(Screen.class, str);
            }

            public static Screen[] values() {
                return (Screen[]) f187073e.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MessengerStatsdEventFactory.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/analytics/MessengerStatsdEventFactory$Companion$Step;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Step {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Step[] f187076b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f187077c;

            static {
                Step[] stepArr = {new Step("INIT_TO_REQUEST", 0), new Step("RESPONSE_TO_PROCESS", 1)};
                f187076b = stepArr;
                f187077c = kotlin.enums.c.a(stepArr);
            }

            public static Step valueOf(String str) {
                return (Step) Enum.valueOf(Step.class, str);
            }

            public static Step[] values() {
                return (Step[]) f187076b.clone();
            }
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public Companion() {
        }
    }

    static {
        new Companion(null);
    }

    public MessengerStatsdEventFactory(@Y61.k C c12, @Y61.k InterfaceC32900o interfaceC32900o, @Y61.k H h12) {
        this.f187052a = c12;
        this.f187053b = interfaceC32900o;
        this.f187054c = h12;
    }

    public static y.a a(MessengerStatsdEventFactory messengerStatsdEventFactory, String[] strArr) {
        messengerStatsdEventFactory.getClass();
        return new y.a(messengerStatsdEventFactory.e((String[]) Arrays.copyOf(strArr, strArr.length), false), 1L);
    }

    public static y.a b(MessengerStatsdEventFactory messengerStatsdEventFactory, String[] strArr) {
        messengerStatsdEventFactory.getClass();
        return new y.a(messengerStatsdEventFactory.e((String[]) Arrays.copyOf(strArr, strArr.length), true), 1L);
    }

    @Y61.k
    public final List<y> c(@Y61.k Companion.Scenario scenario, @Y61.k Companion.ChannelType channelType, long j12) {
        long j13 = 100;
        if (j12 >= 100) {
            j13 = 10000;
            if (j12 < 10000) {
                long j14 = 100;
                j13 = ((j12 + 99) / j14) * j14;
            }
        }
        Companion.Screen screen = Companion.Screen.f187071c;
        String strValueOf = String.valueOf(j13);
        String str = scenario.f187070b;
        return C42745f0.U(new y.c(e(new String[]{"performance", "channel", "scenario", str, channelType.f187060b, strValueOf, "app_version_placeholder", "network_type_placeholder"}, false), Long.valueOf(j12), null), new y.c(e(new String[]{"performance", "channel", "scenario", str, channelType.f187060b, "app_version_placeholder", "network_type_placeholder"}, false), Long.valueOf(j12), null));
    }

    @Y61.k
    public final List<y> d(@Y61.k Companion.Screen screen, @Y61.k Companion.Scenario scenario, long j12) {
        long j13 = 100;
        if (j12 >= 100) {
            j13 = 10000;
            if (j12 < 10000) {
                long j14 = 100;
                j13 = ((j12 + 99) / j14) * j14;
            }
        }
        String strValueOf = String.valueOf(j13);
        String str = screen.f187075b;
        String str2 = scenario.f187070b;
        return C42745f0.U(new y.c(e(new String[]{"performance", str, "scenario", str2, strValueOf, "app_version_placeholder", "network_type_placeholder"}, false), Long.valueOf(j12), null), new y.c(e(new String[]{"performance", str, "scenario", str2, "app_version_placeholder", "network_type_placeholder"}, false), Long.valueOf(j12), null));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final String e(String[] strArr, boolean z12) {
        StringBuilder sb2;
        InterfaceC32900o interfaceC32900o = this.f187053b;
        if (z12) {
            sb2 = new StringBuilder(D.a(interfaceC32900o.f().getValue()));
            sb2.append(".messenger");
        } else {
            sb2 = new StringBuilder(NotificationsSettings.Section.SECTION_MESSENGER);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!C43066x.K(str)) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String strE = (String) it.next();
            sb2.append(".");
            int iHashCode = strE.hashCode();
            C c12 = this.f187052a;
            switch (iHashCode) {
                case -2027698252:
                    if (strE.equals("device_model_placeholder")) {
                        strE = c12.e();
                        break;
                    } else {
                        break;
                    }
                case -1674950267:
                    if (strE.equals("device_vendor_placeholder")) {
                        strE = c12.S();
                        break;
                    } else {
                        break;
                    }
                case -120625913:
                    if (strE.equals("sdk_version_placeholder")) {
                        strE = String.valueOf(c12.j());
                        break;
                    } else {
                        break;
                    }
                case 320493023:
                    if (strE.equals("network_type_placeholder")) {
                        strE = this.f187054c.a();
                        break;
                    } else {
                        break;
                    }
                case 1318332782:
                    if (strE.equals("app_version_placeholder")) {
                        strE = interfaceC32900o.f().getValue();
                        break;
                    } else {
                        break;
                    }
            }
            sb2.append(D.a(strE));
        }
        return sb2.toString();
    }
}
