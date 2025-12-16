package com.avito.android.messenger.analytics;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: SendMessageEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/analytics/d0;", "Lcom/avito/android/analytics/provider/clickstream/a;", "<init>", "()V", "a", "b", "Lcom/avito/android/messenger/analytics/d0$a;", "Lcom/avito/android/messenger/analytics/d0$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class d0 implements com.avito.android.analytics.provider.clickstream.a {

    /* compiled from: SendMessageEvent.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/analytics/d0$a;", "Lcom/avito/android/messenger/analytics/d0;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends d0 implements com.avito.android.analytics.provider.clickstream.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ParametrizedClickStreamEvent f186266b;

        public a(@Y61.k String str, @Y61.k MessageType messageType, @Y61.k String str2, boolean z12) {
            super(null);
            this.f186266b = new ParametrizedClickStreamEvent(3177, 1, P0.g(new kotlin.Q("chatid", str), new kotlin.Q("message_type", messageType.f186210b), new kotlin.Q("msg_random_id", str2), new kotlin.Q("msg_is_push", Boolean.valueOf(z12))), null, 8, null);
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getEventId */
        public final int getF328428b() {
            return this.f186266b.f90247b;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        @Y61.k
        public final Map<String, Object> getParams() {
            return this.f186266b.f90249d;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getVersion */
        public final int getF328429c() {
            return this.f186266b.f90248c;
        }
    }

    /* compiled from: SendMessageEvent.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/analytics/d0$b;", "Lcom/avito/android/messenger/analytics/d0;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends d0 implements com.avito.android.analytics.provider.clickstream.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ParametrizedClickStreamEvent f186267b;

        public b(@Y61.k String str, @Y61.k MessageType messageType, boolean z12) {
            super(null);
            this.f186267b = new ParametrizedClickStreamEvent(3176, 3, P0.g(new kotlin.Q("chatid", str), new kotlin.Q("message_type", messageType.f186210b), new kotlin.Q("msg_is_push", Boolean.valueOf(z12))), null, 8, null);
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getEventId */
        public final int getF328428b() {
            return this.f186267b.f90247b;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        @Y61.k
        public final Map<String, Object> getParams() {
            return this.f186267b.f90249d;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getVersion */
        public final int getF328429c() {
            return this.f186267b.f90248c;
        }
    }

    public /* synthetic */ d0(C42822w c42822w) {
        this();
    }

    public d0() {
    }
}
