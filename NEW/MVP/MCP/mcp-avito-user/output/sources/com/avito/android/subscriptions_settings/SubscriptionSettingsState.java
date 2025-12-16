package com.avito.android.subscriptions_settings;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SubscriptionSettingsState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/subscriptions_settings/SubscriptionSettingsState;", "", "a", "EnabledState", "NotificationState", "SubscriptionState", "_avito-discouraged_avito-libs_favorite-sellers-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SubscriptionSettingsState {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f291480d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final NotificationState f291481a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SubscriptionState f291482b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final EnabledState f291483c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SubscriptionSettingsState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/subscriptions_settings/SubscriptionSettingsState$EnabledState;", "", "_avito-discouraged_avito-libs_favorite-sellers-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EnabledState {

        /* renamed from: b, reason: collision with root package name */
        public static final EnabledState f291484b;

        /* renamed from: c, reason: collision with root package name */
        public static final EnabledState f291485c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ EnabledState[] f291486d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f291487e;

        static {
            EnabledState enabledState = new EnabledState("ENABLED", 0);
            f291484b = enabledState;
            EnabledState enabledState2 = new EnabledState("DISABLED", 1);
            f291485c = enabledState2;
            EnabledState[] enabledStateArr = {enabledState, enabledState2};
            f291486d = enabledStateArr;
            f291487e = kotlin.enums.c.a(enabledStateArr);
        }

        public EnabledState() {
            throw null;
        }

        public static EnabledState valueOf(String str) {
            return (EnabledState) Enum.valueOf(EnabledState.class, str);
        }

        public static EnabledState[] values() {
            return (EnabledState[]) f291486d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SubscriptionSettingsState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/subscriptions_settings/SubscriptionSettingsState$NotificationState;", "", "_avito-discouraged_avito-libs_favorite-sellers-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NotificationState {

        /* renamed from: b, reason: collision with root package name */
        public static final NotificationState f291488b;

        /* renamed from: c, reason: collision with root package name */
        public static final NotificationState f291489c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ NotificationState[] f291490d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f291491e;

        static {
            NotificationState notificationState = new NotificationState("ON", 0);
            f291488b = notificationState;
            NotificationState notificationState2 = new NotificationState("OFF", 1);
            f291489c = notificationState2;
            NotificationState[] notificationStateArr = {notificationState, notificationState2};
            f291490d = notificationStateArr;
            f291491e = kotlin.enums.c.a(notificationStateArr);
        }

        public NotificationState() {
            throw null;
        }

        public static NotificationState valueOf(String str) {
            return (NotificationState) Enum.valueOf(NotificationState.class, str);
        }

        public static NotificationState[] values() {
            return (NotificationState[]) f291490d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SubscriptionSettingsState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/subscriptions_settings/SubscriptionSettingsState$SubscriptionState;", "", "_avito-discouraged_avito-libs_favorite-sellers-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SubscriptionState {

        /* renamed from: b, reason: collision with root package name */
        public static final SubscriptionState f291492b;

        /* renamed from: c, reason: collision with root package name */
        public static final SubscriptionState f291493c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ SubscriptionState[] f291494d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f291495e;

        static {
            SubscriptionState subscriptionState = new SubscriptionState("SUBSCRIBED", 0);
            f291492b = subscriptionState;
            SubscriptionState subscriptionState2 = new SubscriptionState("NOT_SUBSCRIBED", 1);
            f291493c = subscriptionState2;
            SubscriptionState[] subscriptionStateArr = {subscriptionState, subscriptionState2};
            f291494d = subscriptionStateArr;
            f291495e = kotlin.enums.c.a(subscriptionStateArr);
        }

        public SubscriptionState() {
            throw null;
        }

        public static SubscriptionState valueOf(String str) {
            return (SubscriptionState) Enum.valueOf(SubscriptionState.class, str);
        }

        public static SubscriptionState[] values() {
            return (SubscriptionState[]) f291494d.clone();
        }
    }

    /* compiled from: SubscriptionSettingsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/subscriptions_settings/SubscriptionSettingsState$a;", "", "<init>", "()V", "_avito-discouraged_avito-libs_favorite-sellers-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static SubscriptionSettingsState a(boolean z12, boolean z13, boolean z14) {
            return new SubscriptionSettingsState(z14 ? NotificationState.f291488b : NotificationState.f291489c, z12 ? SubscriptionState.f291492b : SubscriptionState.f291493c, z13 ? EnabledState.f291484b : EnabledState.f291485c);
        }

        public a() {
        }
    }

    public SubscriptionSettingsState(@k NotificationState notificationState, @k SubscriptionState subscriptionState, @k EnabledState enabledState) {
        this.f291481a = notificationState;
        this.f291482b = subscriptionState;
        this.f291483c = enabledState;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionSettingsState)) {
            return false;
        }
        SubscriptionSettingsState subscriptionSettingsState = (SubscriptionSettingsState) obj;
        return this.f291481a == subscriptionSettingsState.f291481a && this.f291482b == subscriptionSettingsState.f291482b && this.f291483c == subscriptionSettingsState.f291483c;
    }

    public final int hashCode() {
        return this.f291483c.hashCode() + ((this.f291482b.hashCode() + (this.f291481a.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        return "SubscriptionSettingsState(notificationState=" + this.f291481a + ", subscriptionState=" + this.f291482b + ", enabledState=" + this.f291483c + ')';
    }
}
