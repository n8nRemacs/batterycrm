package com.avito.android.messenger.analytics;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: MessengerMarkChatAsUnreadEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/analytics/MessengerMarkChatAsUnreadEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "Screen", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MessengerMarkChatAsUnreadEvent implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f186229b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessengerMarkChatAsUnreadEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/analytics/MessengerMarkChatAsUnreadEvent$Screen;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Screen {

        /* renamed from: c, reason: collision with root package name */
        public static final Screen f186230c;

        /* renamed from: d, reason: collision with root package name */
        public static final Screen f186231d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Screen[] f186232e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f186233f;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f186234b;

        static {
            Screen screen = new Screen("CHAT", 0, "chat");
            f186230c = screen;
            Screen screen2 = new Screen("CHAT_LIST", 1, "chatlist");
            f186231d = screen2;
            Screen[] screenArr = {screen, screen2};
            f186232e = screenArr;
            f186233f = kotlin.enums.c.a(screenArr);
        }

        public Screen(String str, int i12, String str2) {
            this.f186234b = str2;
        }

        public static Screen valueOf(String str) {
            return (Screen) Enum.valueOf(Screen.class, str);
        }

        public static Screen[] values() {
            return (Screen[]) f186232e.clone();
        }
    }

    public MessengerMarkChatAsUnreadEvent(@Y61.k String str, @Y61.k Screen screen) {
        this.f186229b = new ParametrizedClickStreamEvent(5139, 1, P0.g(new kotlin.Q("chatid", str), new kotlin.Q("s", screen.f186234b)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f186229b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f186229b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f186229b.f90248c;
    }
}
