package com.avito.android.messenger.analytics;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: MessengerChatListItemSwipeEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/analytics/MessengerChatListItemSwipeEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "Direction", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MessengerChatListItemSwipeEvent implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f186211b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MessengerChatListItemSwipeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/analytics/MessengerChatListItemSwipeEvent$Direction;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Direction {

        /* renamed from: c, reason: collision with root package name */
        public static final Direction f186212c;

        /* renamed from: d, reason: collision with root package name */
        public static final Direction f186213d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Direction[] f186214e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f186215f;

        /* renamed from: b, reason: collision with root package name */
        public final int f186216b;

        static {
            Direction direction = new Direction("RIGHT_TO_LEFT", 0, 1);
            f186212c = direction;
            Direction direction2 = new Direction("LEFT_TO_RIGHT", 1, 2);
            f186213d = direction2;
            Direction[] directionArr = {direction, direction2, new Direction("BOTTOM_TO_TOP", 2, 3), new Direction("TOP_TO_BOTTOM", 3, 4)};
            f186214e = directionArr;
            f186215f = kotlin.enums.c.a(directionArr);
        }

        public Direction(String str, int i12, int i13) {
            this.f186216b = i13;
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) f186214e.clone();
        }
    }

    public MessengerChatListItemSwipeEvent(@Y61.k String str, @Y61.k Direction direction) {
        this.f186211b = new ParametrizedClickStreamEvent(5138, 0, P0.g(new kotlin.Q("chatid", str), new kotlin.Q("swipe_direction", Integer.valueOf(direction.f186216b))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f186211b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f186211b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f186211b.f90248c;
    }
}
