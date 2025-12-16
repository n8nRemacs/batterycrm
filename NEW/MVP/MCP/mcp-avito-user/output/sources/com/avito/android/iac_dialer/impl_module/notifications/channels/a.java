package com.avito.android.iac_dialer.impl_module.notifications.channels;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: IacNotificationChannelManagerImpl.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/notifications/channels/a;", "", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C4922a f166084d = new C4922a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f166085e = new a("com.avito.android.notification.iac.sort_10.INCOMING_CALLS.v4_", R.string.iac_dialer_impl_notification_channel_incoming_name, 5);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f166086f = new a("com.avito.android.notification.iac.sort_20.ACTIVE_CALLS.v4_", R.string.iac_dialer_impl_notification_channel_ongoing_name, 3);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f166087a;

    /* renamed from: b, reason: collision with root package name */
    public final int f166088b;

    /* renamed from: c, reason: collision with root package name */
    public final int f166089c;

    /* compiled from: IacNotificationChannelManagerImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/notifications/channels/a$a;", "", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_dialer.impl_module.notifications.channels.a$a, reason: collision with other inner class name */
    public static final class C4922a {
        public /* synthetic */ C4922a(C42822w c42822w) {
            this();
        }

        public C4922a() {
        }
    }

    public a(@k String str, int i12, int i13) {
        this.f166087a = str;
        this.f166088b = i12;
        this.f166089c = i13;
    }

    @k
    public final String a(int i12) {
        return this.f166087a + i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f166087a.equals(aVar.f166087a) && this.f166088b == aVar.f166088b && this.f166089c == aVar.f166089c;
    }

    public final int hashCode() {
        return ((Integer.hashCode(this.f166089c) + r.e(this.f166088b, this.f166087a.hashCode() * 31, 31)) * 31) - 1748385378;
    }

    @k
    public final String toString() {
        return "OngoingCallsDynamicChannel";
    }
}
