package com.avito.android.messenger.analytics;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: MessengerMoveToFolderEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/analytics/MessengerMoveToFolderEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "MovedFrom", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MessengerMoveToFolderEvent implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f186235b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessengerMoveToFolderEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/analytics/MessengerMoveToFolderEvent$MovedFrom;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MovedFrom {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ MovedFrom[] f186236b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f186237c;

        static {
            MovedFrom[] movedFromArr = {new MovedFrom("CHANNEL_LIST", 0, "chl"), new MovedFrom("CHAT", 1, "c"), new MovedFrom("BULK", 2, "gt")};
            f186236b = movedFromArr;
            f186237c = kotlin.enums.c.a(movedFromArr);
        }

        public MovedFrom(String str, int i12, String str2) {
        }

        public static MovedFrom valueOf(String str) {
            return (MovedFrom) Enum.valueOf(MovedFrom.class, str);
        }

        public static MovedFrom[] values() {
            return (MovedFrom[]) f186236b.clone();
        }
    }

    public MessengerMoveToFolderEvent(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        MovedFrom[] movedFromArr = MovedFrom.f186236b;
        this.f186235b = new ParametrizedClickStreamEvent(4285, 1, P0.g(new kotlin.Q("chatid", str), new kotlin.Q("folder_name", str2), new kotlin.Q("tag_name", str3), new kotlin.Q("msg_move_to_folder_from", "c")), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f186235b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f186235b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f186235b.f90248c;
    }
}
