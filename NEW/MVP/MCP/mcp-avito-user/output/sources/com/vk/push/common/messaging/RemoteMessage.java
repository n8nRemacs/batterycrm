package com.vk.push.common.messaging;

import Y61.k;
import Y61.l;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.C22777e;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: RemoteMessage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/vk/push/common/messaging/RemoteMessage;", "Landroid/os/Parcelable;", "CREATOR", "a", "b", "c", "sdk-public-push-common_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RemoteMessage implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Bundle f366991b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC42726C f366992c;

    /* compiled from: RemoteMessage.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/push/common/messaging/RemoteMessage$a;", "", "<init>", "()V", "sdk-public-push-common_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class a {
        public a() {
            new LinkedHashMap();
        }
    }

    /* compiled from: RemoteMessage.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/vk/push/common/messaging/RemoteMessage$b;", "Landroid/os/Parcelable$Creator;", "Lcom/vk/push/common/messaging/RemoteMessage;", "<init>", "()V", "", "CLICK_ACTION_TYPE", "Ljava/lang/String;", "COLLAPSE_KEY", "DATA_KEY", "DATA_RAW", "DATA_VALUE", "FROM", "MESSAGE_ID", "NOTIFICATION_PARAMS", "PRIORITY", "PUSH_MESSAGE_SERVER_RECEIVED_AT", "TOKEN", "TTL", "sdk-public-push-common_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    /* renamed from: com.vk.push.common.messaging.RemoteMessage$b, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<RemoteMessage> {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final RemoteMessage createFromParcel(Parcel parcel) {
            Bundle bundle = parcel.readBundle(RemoteMessage.class.getClassLoader());
            if (bundle == null) {
                bundle = C22777e.a();
            }
            return new RemoteMessage(bundle);
        }

        @Override // android.os.Parcelable.Creator
        public final RemoteMessage[] newArray(int i12) {
            return new RemoteMessage[i12];
        }

        public Companion() {
        }
    }

    /* compiled from: RemoteMessage.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/vk/push/common/messaging/RemoteMessage$c;", "", "sdk-public-push-common_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final NotificationParams f366993a;

        public c(@k NotificationParams notificationParams) {
            this.f366993a = notificationParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f366993a, ((c) obj).f366993a);
        }

        public final int hashCode() {
            return this.f366993a.hashCode();
        }

        @k
        public final String toString() {
            return "Notification(notificationParams=" + this.f366993a + ')';
        }
    }

    /* compiled from: RemoteMessage.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u001e\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class d extends N implements Y41.a<Map<String, ? extends String>> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Map<String, ? extends String> invoke() {
            RemoteMessage remoteMessage = RemoteMessage.this;
            Iterable stringArrayList = remoteMessage.f366991b.getStringArrayList("vk.data_key");
            if (stringArrayList == null) {
                stringArrayList = C42784z0.f406748b;
            }
            Iterable stringArrayList2 = remoteMessage.f366991b.getStringArrayList("vk.data_value");
            if (stringArrayList2 == null) {
                stringArrayList2 = C42784z0.f406748b;
            }
            return P0.p(C42745f0.T0(stringArrayList, stringArrayList2));
        }
    }

    public /* synthetic */ RemoteMessage(Bundle bundle, C42822w c42822w) {
        this(bundle);
    }

    @l
    public final ClickActionType c() {
        String string = this.f366991b.getString("vkpns.click_action_type");
        if (string == null) {
            return null;
        }
        Enum enumValueOf = ClickActionType.f366977b;
        try {
            enumValueOf = Enum.valueOf(ClickActionType.class, string.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException unused) {
        }
        return (ClickActionType) enumValueOf;
    }

    @l
    public final c d() {
        int i12 = Build.VERSION.SDK_INT;
        Bundle bundle = this.f366991b;
        NotificationParams notificationParams = (NotificationParams) (i12 >= 33 ? bundle.getParcelable("vk.notification_params", NotificationParams.class) : bundle.getParcelable("vk.notification_params"));
        if (notificationParams == null) {
            return null;
        }
        return new c(notificationParams);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeBundle(this.f366991b);
    }

    public RemoteMessage(Bundle bundle) {
        this.f366991b = bundle;
        this.f366992c = C42727D.c(new d());
    }
}
