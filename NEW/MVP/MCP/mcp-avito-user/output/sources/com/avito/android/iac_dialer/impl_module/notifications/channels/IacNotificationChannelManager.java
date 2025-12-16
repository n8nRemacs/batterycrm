package com.avito.android.iac_dialer.impl_module.notifications.channels;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.core.app.E;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacNotificationChannelManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/notifications/channels/IacNotificationChannelManager;", "LQK/a;", "a", "RecreatingAnalyticsResult", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface IacNotificationChannelManager extends QK.a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IacNotificationChannelManager.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/notifications/channels/IacNotificationChannelManager$RecreatingAnalyticsResult;", "", "LdL/d;", "<init>", "(Ljava/lang/String;I)V", "ALREADY_BROKEN", "ALREADY_OK", "FIRST_TIME_CREATED", "RECREATED", "BECAME_BROKEN", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RecreatingAnalyticsResult implements dL.d {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ RecreatingAnalyticsResult[] $VALUES;
        public static final RecreatingAnalyticsResult ALREADY_BROKEN = new RecreatingAnalyticsResult("ALREADY_BROKEN", 0);
        public static final RecreatingAnalyticsResult ALREADY_OK = new RecreatingAnalyticsResult("ALREADY_OK", 1);
        public static final RecreatingAnalyticsResult FIRST_TIME_CREATED = new RecreatingAnalyticsResult("FIRST_TIME_CREATED", 2);
        public static final RecreatingAnalyticsResult RECREATED = new RecreatingAnalyticsResult("RECREATED", 3);
        public static final RecreatingAnalyticsResult BECAME_BROKEN = new RecreatingAnalyticsResult("BECAME_BROKEN", 4);

        private static final /* synthetic */ RecreatingAnalyticsResult[] $values() {
            return new RecreatingAnalyticsResult[]{ALREADY_BROKEN, ALREADY_OK, FIRST_TIME_CREATED, RECREATED, BECAME_BROKEN};
        }

        static {
            RecreatingAnalyticsResult[] recreatingAnalyticsResultArr$values = $values();
            $VALUES = recreatingAnalyticsResultArr$values;
            $ENTRIES = kotlin.enums.c.a(recreatingAnalyticsResultArr$values);
        }

        private RecreatingAnalyticsResult(String str, int i12) {
        }

        @k
        public static kotlin.enums.a<RecreatingAnalyticsResult> getEntries() {
            return $ENTRIES;
        }

        public static RecreatingAnalyticsResult valueOf(String str) {
            return (RecreatingAnalyticsResult) Enum.valueOf(RecreatingAnalyticsResult.class, str);
        }

        public static RecreatingAnalyticsResult[] values() {
            return (RecreatingAnalyticsResult[]) $VALUES.clone();
        }
    }

    /* compiled from: IacNotificationChannelManager.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/notifications/channels/IacNotificationChannelManager$a;", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f166046a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f166047b;

        public a(@k String str, @k String str2) {
            this.f166046a = str;
            this.f166047b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f166046a, aVar.f166046a) && L.f(this.f166047b, aVar.f166047b);
        }

        public final int hashCode() {
            return this.f166047b.hashCode() + (this.f166046a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Channels(incomingCallChannelId=");
            sb2.append(this.f166046a);
            sb2.append(", ongoingCallChannelId=");
            return C22026a.c(sb2, this.f166047b, ')');
        }
    }

    void a(@k E e12);

    @k
    a b();

    @k
    RecreatingAnalyticsResult c();
}
