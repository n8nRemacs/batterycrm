package com.vk.push.common.messaging;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NotificationParams.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/vk/push/common/messaging/NotificationParams;", "Landroid/os/Parcelable;", "CREATOR", "a", "b", "sdk-public-push-common_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NotificationParams implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f366980b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f366981c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f366982d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f366983e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f366984f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f366985g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f366986h;

    /* compiled from: NotificationParams.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/push/common/messaging/NotificationParams$a;", "", "<init>", "()V", "sdk-public-push-common_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: NotificationParams.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/vk/push/common/messaging/NotificationParams$b;", "Landroid/os/Parcelable$Creator;", "Lcom/vk/push/common/messaging/NotificationParams;", "<init>", "()V", "sdk-public-push-common_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    /* renamed from: com.vk.push.common.messaging.NotificationParams$b, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<NotificationParams> {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationParams createFromParcel(Parcel parcel) {
            return new NotificationParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationParams[] newArray(int i12) {
            return new NotificationParams[i12];
        }

        public Companion() {
        }
    }

    public /* synthetic */ NotificationParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, C42822w c42822w) {
        this(str, str2, str3, str4, str5, str6, str7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f366980b);
        parcel.writeString(this.f366981c);
        parcel.writeString(this.f366982d);
        parcel.writeString(this.f366983e);
        parcel.writeString(this.f366984f);
        parcel.writeString(this.f366985g);
        parcel.writeString(this.f366986h);
    }

    public NotificationParams(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f366980b = str;
        this.f366981c = str2;
        this.f366982d = str3;
        this.f366983e = str4;
        this.f366984f = str5;
        this.f366985g = str6;
        this.f366986h = str7;
    }
}
