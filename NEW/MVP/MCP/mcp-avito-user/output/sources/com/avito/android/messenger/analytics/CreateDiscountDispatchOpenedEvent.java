package com.avito.android.messenger.analytics;

import java.util.Map;
import kotlin.Metadata;

/* compiled from: CreateDiscountDispatchOpenedEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/analytics/CreateDiscountDispatchOpenedEvent;", "Lcom/avito/android/analytics/provider/clickstream/a;", "From", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CreateDiscountDispatchOpenedEvent implements com.avito.android.analytics.provider.clickstream.a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CreateDiscountDispatchOpenedEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/analytics/CreateDiscountDispatchOpenedEvent$From;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class From {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ From[] f186187b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f186188c;

        static {
            From[] fromArr = {new From("PROFILE_ADVERTISEMENT", 0)};
            f186187b = fromArr;
            f186188c = kotlin.enums.c.a(fromArr);
        }

        public From() {
            throw null;
        }

        public static From valueOf(String str) {
            return (From) Enum.valueOf(From.class, str);
        }

        public static From[] values() {
            return (From[]) f186187b.clone();
        }
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19127b() {
        throw null;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        throw null;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF11770c() {
        throw null;
    }
}
