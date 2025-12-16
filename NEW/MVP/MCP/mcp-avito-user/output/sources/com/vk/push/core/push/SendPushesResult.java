package com.vk.push.core.push;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SendPushesResult.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0001\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/vk/push/core/push/SendPushesResult;", "", "Landroid/os/Parcelable;", "CREATOR", "a", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SendPushesResult implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE;

    /* renamed from: b, reason: collision with root package name */
    public static final SendPushesResult f367140b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ SendPushesResult[] f367141c;

    /* compiled from: SendPushesResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/vk/push/core/push/SendPushesResult$a;", "Landroid/os/Parcelable$Creator;", "Lcom/vk/push/core/push/SendPushesResult;", "<init>", "()V", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    /* renamed from: com.vk.push.core.push.SendPushesResult$a, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<SendPushesResult> {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final SendPushesResult createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            Enum enumValueOf = SendPushesResult.f367140b;
            if (string != null) {
                try {
                    enumValueOf = Enum.valueOf(SendPushesResult.class, string.toUpperCase(Locale.ROOT));
                } catch (IllegalArgumentException unused) {
                }
            }
            return (SendPushesResult) enumValueOf;
        }

        @Override // android.os.Parcelable.Creator
        public final SendPushesResult[] newArray(int i12) {
            return new SendPushesResult[i12];
        }

        public Companion() {
        }
    }

    static {
        SendPushesResult sendPushesResult = new SendPushesResult("OK", 0);
        f367140b = sendPushesResult;
        f367141c = new SendPushesResult[]{sendPushesResult};
        INSTANCE = new Companion(null);
    }

    public SendPushesResult() {
        throw null;
    }

    public static SendPushesResult valueOf(String str) {
        return (SendPushesResult) Enum.valueOf(SendPushesResult.class, str);
    }

    public static SendPushesResult[] values() {
        return (SendPushesResult[]) f367141c.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
